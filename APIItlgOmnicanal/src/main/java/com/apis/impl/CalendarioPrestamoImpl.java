package com.apis.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import static com.java.Convierte.DatetoStr;
import com.java.Formatea;
import com.java.GeneraUUID;
import static com.java.OperacionesFecha.intFechaHoy;
import com.t24.services.FC47Tipo2;
import com.t24.services.impl.CWServiceTWS_Tipo2HiloImpl;
import com.t24.services.impl.FC47Tipo2Impl;
import com.t24.services.impl.Ibaguid;
import com.t24.services.impl.InputCollectionTipo2Impl;
import com.t24.services.input.IbaQuery;
import com.t24.services.input.InputCollection;
import dto.t24.services.FC47_AASCH;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class CalendarioPrestamoImpl {
    
    private static final Logger LOG = LogManager.getLogger(CalendarioPrestamoImpl.class);
    
    public  String ConsultaCalendarioPrestamo (String CustomerNo,String PestamoId) {
        
        com.tws.wsdl.EnquiryInput enquiryInput47=new com.tws.wsdl.EnquiryInput();
        String json="";        
        FC47Tipo2 fc47= new FC47Tipo2Impl();        
       
        
        Gson gson =new GsonBuilder().serializeNulls().create();    
        int cantidadDatosLista=0;
        
        String errcod="";
        String detcod="";
        String defcod="";
        
        JSONObject JOTotalPrestamo =new JSONObject();
        JSONObject JOTotalError =new JSONObject();
        JSONObject JOCalendPresta =new JSONObject(); 
        JSONArray JADetCalendaPago =new JSONArray(); 
        
        JSONObject JORaiz =new JSONObject();
   
       
        try
        { 
            IbaQuery cabecera1=null;
            Ibaguid ibaguid=new Ibaguid();
             
            
            cabecera1=ibaguid.Encabezado(GeneraUUID.CodigoUUID(), Constantes.INTEGRADOR_FC01, CustomerNo,PestamoId );
            
            InputCollection ictipo2 =new InputCollection();
            InputCollectionTipo2Impl ictipo2impl=new InputCollectionTipo2Impl();

            ictipo2.setARRANGEMENTID(PestamoId);
            
            enquiryInput47=ictipo2impl.Input(ictipo2);        
            
            String strFC_return1=null;
            
              
            CWServiceTWS_Tipo2HiloImpl servicio1= new CWServiceTWS_Tipo2HiloImpl(Constantes.INTEGRADOR_FC47,enquiryInput47);     

            Thread hilo1 = servicio1;
            hilo1.start();    

            while ( hilo1.isAlive() )
            {
                strFC_return1=servicio1.getResult();
            } 
                 

            // FIN NUEVO ------ HILOS   

            List<FC47_AASCH> listCalendPrestamo = null;
            listCalendPrestamo = new ArrayList<>();     

            List<FC47_AASCH> listCalendPresta = null;



            listCalendPresta =fc47.AASCH(strFC_return1, CustomerNo);   



            for (FC47_AASCH lpf : listCalendPresta) 
            {
                errcod= lpf.getErrcod();
                detcod=lpf.getDetcod();
                defcod=lpf.getDefcod();   
            }   

            if (errcod.equals("0"))
            {

                    json= gson.toJson(listCalendPresta);        

                    Integer numcuo=0;
                    Integer totcuo=0;

                    Integer fecpag=0;
                    Integer fecactual=intFechaHoy();
                    String estpag="";

                    totcuo=listCalendPresta.size();

                    cantidadDatosLista= listCalendPresta.size();

//                    System.out.println("cantidadDatosLista " + cantidadDatosLista);

                    if (cantidadDatosLista>0 )
                                {

                                    for (FC47_AASCH lpf:listCalendPresta)
                                    {                
                                             if  (lpf.getFecha().trim().equals(""))
                                                        {
                                                            JOTotalError.put("errcod", Integer.parseInt(Constantes.RETORNO_NODATASQL.toString()));
                                                            JOTotalError.put("detcod", Constantes.MENSAJE_NODATASQL_DET);
                                                            JOTotalError.put("defcod", Constantes.MENSAJE_NODATASQL_DEF);       

                                                        }
                                                else
                                                    {     
                                                        numcuo=numcuo+1;                
                                                        JOCalendPresta.put("numcuo", numcuo);
                                                        JOCalendPresta.put("cappre", Formatea.Redondear(lpf.getTotalDue(),2));
                                                        JOCalendPresta.put("intpre", Formatea.Redondear(lpf.getTotalCap(),2));
                                                        JOCalendPresta.put("monto", Formatea.Redondear(lpf.getCharge(),2));
                                                        JOCalendPresta.put("fecpag", DatetoStr(lpf.getFecha()));
                                                        fecpag=Integer.parseInt(lpf.getFecha());
                                                        if (fecpag>fecactual)
                                                            {
                                                                estpag="1";
                                                            }
                                                        else
                                                            {
                                                                estpag="0";
                                                            }                        

                                                        JOCalendPresta.put("estpag", estpag);                
                                                        JOCalendPresta.put("totcuo", totcuo);  

                                                        JOTotalError.put("errcod", Integer.parseInt(lpf.getErrcod()));
                                                        JOTotalError.put("detcod", lpf.getDetcod());
                                                        JOTotalError.put("defcod", lpf.getDefcod());  
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
                        JOTotalError.put("errcod",Integer.parseInt( errcod));
                        JOTotalError.put("detcod", detcod);
                        JOTotalError.put("defcod", defcod);           
                }
            }
        catch (NumberFormatException e){
            JOTotalError.put("errcod", Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage());  
            LOG.error( "ERROR: " + e.getMessage());
        }
        catch (Exception e){
            JOTotalError.put("errcod", Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage());  
            LOG.error( "ERROR: " + e.getMessage());
        }
        
        
        JOTotalPrestamo.put("detalleprestamo",JOCalendPresta); 
        JOTotalPrestamo.put("detallecalendariopago",JADetCalendaPago); 
        
        JORaiz.put("datos", JOTotalPrestamo);
        JORaiz.put("error",JOTotalError);         
        
//        System.out.println("acá termina todo : " + new Date());
        return JORaiz.toString();// jsonEjemplo;  
     }
    
}
