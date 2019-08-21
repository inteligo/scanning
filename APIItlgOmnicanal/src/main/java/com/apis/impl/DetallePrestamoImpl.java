package com.apis.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import static com.java.Convierte.DatetoStr;
import com.java.Formatea;
import com.java.GeneraUUID;
import com.java.LeerDataProperties;
import static com.java.OperacionesFecha.intFechaHoy;
import com.t24.services.FC49Tipo2;
import com.t24.services.FC47Tipo2;
import com.t24.services.impl.CWServiceListaMonedasHiloImpl;
import com.t24.services.impl.CWServiceTWS_Tipo2HiloImpl;
import com.t24.services.impl.FC49Tipo2Impl;
import com.t24.services.impl.FC47Tipo2Impl;
import com.t24.services.impl.InputCollectionTipo2Impl;
import com.t24.services.input.Body;
import com.t24.services.input.Head;
import com.t24.services.input.IbaQuery;
import com.t24.services.input.InputCollection;
import dto.t24.services.FC49_LOANSIGN;
import dto.t24.services.FC47_AASCH;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class DetallePrestamoImpl {
    
    private static final Logger LOG = LogManager.getLogger(DetallePrestamoImpl.class);
    
        public String ConsultaDetallePrestamo (String CustomerNo,String PrestamoNo,String PestamoId) {
            com.tws.wsdl.EnquiryInput enquiryInput49=new com.tws.wsdl.EnquiryInput();
            com.tws.wsdl.EnquiryInput enquiryInput47=new com.tws.wsdl.EnquiryInput();
         
        FC49Tipo2 fc49= new FC49Tipo2Impl();        
        FC47Tipo2 fc47= new FC47Tipo2Impl();
        
        String json="";        
        

        List<dto.sql.Moneda> listMonedas =null;   
        
        Gson gson =new GsonBuilder().serializeNulls().create();      
        int cantidadDatosLista=0;
        
        String errcod="";
        String detcod="";
        String defcod="";
        
        JSONObject JOTotalPrestamo =new JSONObject();
        JSONObject JOTotalError =new JSONObject();
        JSONObject JODetPresta =new JSONObject();        
        JSONArray JADetCalendaPago =new JSONArray(); 
        
        JSONObject JORaiz =new JSONObject();
   
        //  ------ HILOS
        
//        IbaQuery cabecera=null,cabecera2=null;
//        Ibaguid ibaguid=new Ibaguid();
//        cabecera=ibaguid.Encabezado("FC-13-20180902-TC01", "13", CustomerNo,"");           
//        cabecera2=ibaguid.Encabezado("FC-43-20180902-TC01", "43", CustomerNo,"" );  
        
        IbaQuery ibaguid1 = new IbaQuery();
        IbaQuery ibaguid2 = new IbaQuery();
        Head hd1 = new Head();
        Body bd1 = new Body();
        Head hd2 = new Head();
        Body bd2 = new Body();
        
        try
        {  
                        
           
            
            hd1.setIbaguid(GeneraUUID.CodigoUUID());
//            hd1.setFunctioncode("49");
//            hd1.setChannel("BZG");            
            hd1.setFunctioncode(Constantes.INTEGRADOR_FC49);
            hd1.setChannel(Constantes.INTEGRADOR_CHANNEL);
            hd1.setAgentId(Constantes.INTEGRADOR_AGENTID);  
            
            hd1.setCustomerNo(CustomerNo);
            ibaguid1.setHead(hd1);
            bd1.setCustomerNo(CustomerNo);        
            ibaguid1.setBody(bd1);

            hd2.setIbaguid(GeneraUUID.CodigoUUID());
            hd2.setFunctioncode(Constantes.INTEGRADOR_FC47);
            hd2.setChannel(Constantes.INTEGRADOR_CHANNEL);
            hd2.setAgentId(Constantes.INTEGRADOR_AGENTID);  
            hd2.setCustomerNo(CustomerNo); 
            ibaguid2.setHead(hd2);

            bd2.setID(PestamoId);
            ibaguid2.setBody(bd2);

            String strFC_return1=null;
            String strFC_return2=null;      

            InputCollection ictipo1 =new InputCollection();
            InputCollectionTipo2Impl ictipo1impl=new InputCollectionTipo2Impl();

            ictipo1.setCUSTOMERID(CustomerNo);            
            enquiryInput49=ictipo1impl.Input(ictipo1);
            
            InputCollection ictipo2 =new InputCollection();
            InputCollectionTipo2Impl ictipo2impl=new InputCollectionTipo2Impl();

            ictipo2.setARRANGEMENTID(PestamoId);
            enquiryInput47=ictipo2impl.Input(ictipo2);
        
                                  
                 

            CWServiceTWS_Tipo2HiloImpl servicio1= new CWServiceTWS_Tipo2HiloImpl(Constantes.INTEGRADOR_FC49,enquiryInput49);    
            CWServiceTWS_Tipo2HiloImpl servicio2= new CWServiceTWS_Tipo2HiloImpl(Constantes.INTEGRADOR_FC47,enquiryInput47);    
            CWServiceListaMonedasHiloImpl servicio4 = new CWServiceListaMonedasHiloImpl();

            Thread hilo4 = servicio4;
            hilo4.start();

            Thread hilo1 = servicio1;
            hilo1.start();

            Thread hilo2 = servicio2;
            hilo2.start();

             while (hilo1.isAlive() || hilo2.isAlive() || hilo4.isAlive())
               {
                   listMonedas=servicio4.getResult();
                   strFC_return1=servicio1.getResult();
                   strFC_return2=servicio2.getResult();      
               }  
                


            // FIN NUEVO ------ HILOS   


            List<FC49_LOANSIGN> listDetPresta =null;

           
            listDetPresta =fc49.LOANSIGN(strFC_return1, CustomerNo,listMonedas);  
                 
            
            for (FC49_LOANSIGN lpf : listDetPresta) 
            {
                errcod= lpf.getErrcod();
                detcod=lpf.getDetcod();
                defcod=lpf.getDefcod();   
            }  
            
          
              
            if (errcod.equals("0"))
            {
                List<FC49_LOANSIGN> listDetPrestaFiltrado = null;
                listDetPrestaFiltrado= new ArrayList<>();   
                listDetPrestaFiltrado = listDetPresta.stream().filter(x -> x.getLoanNumber().trim().equals(PrestamoNo.trim())).collect(Collectors.toList());

                cantidadDatosLista= listDetPrestaFiltrado.size();
                
                 if (cantidadDatosLista>0 )
                   {
                            for (FC49_LOANSIGN lpf:listDetPrestaFiltrado)
                            {    
//                                if (lpf.getLoanNumber().toString().trim().equals(PrestamoNo.trim()))
//                                {                
                                    JODetPresta.put("tippre", Convierte.NullaVacio(lpf.getLoanType()));
                                    JODetPresta.put("despre", Convierte.NullaVacio(lpf.getID()));
                                    JODetPresta.put("desmon", Convierte.NullaVacio(lpf.getNombreMoneda()));
                                    JODetPresta.put("acrmon", Convierte.NullaVacio(lpf.getCurrency()));
                                    JODetPresta.put("simbol",Convierte.NullaVacio(lpf.getSimboloMoneda()));
                                    JODetPresta.put("salcap", Formatea.Redondear(lpf.getBalance(),2));
                                    JODetPresta.put("tasint", Formatea.Redondear(lpf.getRate(),2));
                                    JODetPresta.put("fecpro", DatetoStr(lpf.getNextPaymentDate()));
                                    JODetPresta.put("monpre", Formatea.Redondear(lpf.getCreditAmount(),2));
                                    JODetPresta.put("fecdes",DatetoStr( lpf.getDisbursementDate()));
                                    JODetPresta.put("fecven", DatetoStr(lpf.getMaturityDate()));
                                    JODetPresta.put("feccai", Convierte.NullaVacio(lpf.getFrequencyCapitalInterests()));
                                    JODetPresta.put("intacu", Formatea.Redondear(lpf.getAccruedInterests(),2));

//                                }                
                                     JOTotalError.put("errcod",Integer.parseInt(lpf.getErrcod()));
                                    JOTotalError.put("detcod", lpf.getDetcod());
                                    JOTotalError.put("defcod", lpf.getDefcod());

                            }  
                            
                            List<FC47_AASCH> listCalendPresta =null;
                             
                             
                            listCalendPresta =fc47.AASCH(strFC_return2, CustomerNo);   
                                
                                    

                            Integer numcuo=0;
                            Integer totcuo=0;

                            totcuo=listCalendPresta.size();
                            numcuo=totcuo+1;  

                            Integer estado=0;
                            Integer intFecHoy=intFechaHoy();

               

//                            json= gson.toJson(listCalendPresta); 
//                            System.out.println(json); 

                            for (FC47_AASCH lpf:listCalendPresta)
                            {    
                                if (lpf.getErrcod().equals("0"))
                                {    
                                    JSONObject JOCalendPresta =new JSONObject(); 
                                    numcuo=numcuo-1;                
                                    JOCalendPresta.put("numcuo", numcuo);
                                    JOCalendPresta.put("cappre", Formatea.Redondear(lpf.getPrincipal(),2));
                                    JOCalendPresta.put("intpre", Formatea.Redondear(lpf.getInterest(),2));
                                    JOCalendPresta.put("monto", Formatea.Redondear(lpf.getPrincipalInterest(),2));
                                    JOCalendPresta.put("fecpag",DatetoStr(lpf.getFecha()));                
                                    if (intFecHoy>lpf.getIntFecha())
                                        {
                                            estado=0;
                                        }
                                    else
                                        {
                                            estado=1;
                                        }

                                    JOCalendPresta.put("estpag", estado);                 
                                    JOCalendPresta.put("totcuo", totcuo);          
                                    JADetCalendaPago.add(JOCalendPresta);
                                }  
                            }
                   }
                 else
                    {
                          JOTotalError.put("errcod", Integer.parseInt(Constantes.RETORNO_NODATASQL.toString()));
                           JOTotalError.put("detcod", Constantes.MENSAJE_NODATASQL_DET);
                           JOTotalError.put("defcod", Constantes.MENSAJE_NODATASQL_DEF);       
                    }
             }
             else
            {
                
                JOTotalError.put("errcod", Integer.parseInt(errcod));
                JOTotalError.put("detcod", detcod);
                JOTotalError.put("defcod", defcod);
            }
        }     
       catch (NumberFormatException e) {
            JOTotalError.put("errcod", Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage());   
            LOG.error( "ERROR: " + e.getMessage());
        }     
       catch (Exception e){
            JOTotalError.put("errcod",Integer.parseInt( Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage());    
            LOG.error( "ERROR: " + e.getMessage());
        }
        
            JOTotalPrestamo.put("detallecalendariopago",JADetCalendaPago); 
            JOTotalPrestamo.put("detalleprestamo",JODetPresta); 
        
        JORaiz.put("datos",JOTotalPrestamo); 
        JORaiz.put("error",JOTotalError); 

        return JORaiz.toString();
     }
    
}
