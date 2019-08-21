package com.apis.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import com.java.Formatea;
import com.java.GeneraUUID;
import com.java.LeerDataProperties;
import com.t24.services.FC12Tipo2;
import com.t24.services.impl.CWServiceListaMonedasHiloImpl;
import com.t24.services.impl.CWServiceTWS_Tipo2HiloImpl;
import com.t24.services.impl.FC12Tipo2Impl;
import com.t24.services.impl.Ibaguid;
import com.t24.services.impl.InputCollectionTipo2Impl;
import com.t24.services.input.IbaQuery;
import com.t24.services.input.InputCollection;
import dto.t24.services.FC12_PORTFOLIODETAILS;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class DetallePortafolioImpl {
    
    private static final Logger LOG = LogManager.getLogger(DetallePortafolioImpl.class);
    
    public  String ConsultaDetallePortafolio (String CustomerNo,String PortafolioNo) 
    {
        com.tws.wsdl.EnquiryInput enquiryInput12=new com.tws.wsdl.EnquiryInput();
        Gson gson =new GsonBuilder().serializeNulls().create();
        String json="";       
        FC12Tipo2 fc12=new FC12Tipo2Impl(); 
           
        

        List<dto.sql.Moneda> listMonedas =null;   

        int cantidadDatosLista=0;
        
        String errcod="";
        String detcod="";
        String defcod="";
        
        JSONObject JOTotalPortafolio =new JSONObject();   
        JSONObject JOTotalError =new JSONObject();
        JSONArray JADetPorta =new JSONArray(); 
        JSONObject JOListPorta =new JSONObject(); 
        
        JSONObject JORaiz =new JSONObject();
        
        try
        {    
            
           
            //  ------ HILOS
            
            InputCollection ictipo2 =new InputCollection();
            InputCollectionTipo2Impl ictipo2impl=new InputCollectionTipo2Impl();

            ictipo2.setCUSTOMERID(CustomerNo);
            ictipo2.setPORTFOLIOID(PortafolioNo);
            enquiryInput12=ictipo2impl.Input(ictipo2);

            IbaQuery cabecera1=null;
            Ibaguid ibaguid1=new Ibaguid();
            cabecera1=ibaguid1.Encabezado(GeneraUUID.CodigoUUID(), Constantes.INTEGRADOR_FC12, CustomerNo,PortafolioNo );  
            String strFC_return1="";
             
                                 
            CWServiceTWS_Tipo2HiloImpl servicio1= new CWServiceTWS_Tipo2HiloImpl(Constantes.INTEGRADOR_FC12,enquiryInput12);               
            CWServiceListaMonedasHiloImpl servicio4 = new CWServiceListaMonedasHiloImpl();

            Thread hilo1 = servicio1;
            hilo1.start();

            Thread hilo4 = servicio4;
            hilo4.start();  

            while (hilo1.isAlive() || hilo4.isAlive() )
            {
                strFC_return1=servicio1.getResult(); 
                listMonedas=servicio4.getResult();

            }   
                 
            // FIN  ------ HILOS                


            List<FC12_PORTFOLIODETAILS> listDetPortafolioValores = null;
            List<FC12_PORTFOLIODETAILS> listDetPorta =null;
  
           
            listDetPorta =fc12.PORTFOLIODETAILS(strFC_return1, CustomerNo,PortafolioNo,listMonedas);        
                 

            for (FC12_PORTFOLIODETAILS lpf : listDetPorta) 
            {
                errcod= lpf.getErrcod();
                detcod=lpf.getDetcod();
                defcod=lpf.getDefcod();   
            }             

//            json= gson.toJson(listDetPorta); 
//            System.out.println(json); 

            if (errcod.equals("0"))
            {
                    List<FC12_PORTFOLIODETAILS> listDetPortaFiltrado = null;
                    listDetPortaFiltrado= new ArrayList<>();   
                    
                 
                    
                    if (!listDetPorta.get(0).getSecurityID().trim().equals(""))
                    {
                        listDetPortaFiltrado = listDetPorta.stream().filter(x -> !x.getGroup().trim().equals("CASH")).collect(Collectors.toList());
                    }

                     json= gson.toJson(listDetPortaFiltrado); 
//                    System.out.println(json); 

                    cantidadDatosLista= listDetPortaFiltrado.size();

                    if (cantidadDatosLista>0 )
                            {
                                    for (FC12_PORTFOLIODETAILS lpf:listDetPortaFiltrado)
                                    {   
                                        
                                            JSONObject JOTmpDetPorta =new JSONObject();  
                                            JOTmpDetPorta.put("codpro", Convierte.NullaVacio(lpf.getSecurityID()));
//                                            if (lpf.getProductType().equals("PRODUCTOS ESTRUCTURADOS"))
//                                            {
//                                                JOTmpDetPorta.put("tipgru","NOTAS ESTRUCTURADAS");
//                                                JOTmpDetPorta.put("tipoprod", "NOTAS ESTRUCTURADAS");
//                                            }
//                                            else{
                                                JOTmpDetPorta.put("tipoprod", Convierte.NullaVacio(lpf.getProductType()));
                                                JOTmpDetPorta.put("tipgru", Convierte.NullaVacio(lpf.getGroup()));
//                                            }     
                                            
                                            JOTmpDetPorta.put("tipoclas", Convierte.NullaVacio(lpf.getAssetClass()));
                                            JOTmpDetPorta.put("descrip", Convierte.NullaVacio(lpf.getProductName()));
                                            JOTmpDetPorta.put("saldo", Formatea.Redondear(lpf.getCurrentBalance(),2));
                                            
                                             JOTmpDetPorta.put("desmon", Convierte.NullaVacio(lpf.getNombreMoneda()));                                                           
                                            JOTmpDetPorta.put("acrmon", Convierte.NullaVacio(lpf.getCurrency()));
                                            JOTmpDetPorta.put("simbol", Convierte.NullaVacio(lpf.getSimboloMoneda().trim()));
                                            JADetPorta.add(JOTmpDetPorta); 

                                            JOTotalError.put("errcod", Integer.parseInt(lpf.getErrcod()));
                                            JOTotalError.put("detcod", lpf.getDetcod());
                                            JOTotalError.put("defcod", lpf.getDefcod());            
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
    catch (Exception e) {
        JOTotalError.put("errcod", Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
        JOTotalError.put("detcod", e.getCause());
        JOTotalError.put("defcod", e.getMessage());   
        LOG.error( "ERROR: " + e.getMessage());
    }     
        
    JOListPorta.put("data",JADetPorta);         
    JOTotalPortafolio.put("portafolio",JOListPorta);
    
    JORaiz.put("datos",JOTotalPortafolio);
    JORaiz.put("error",JOTotalError); 
        
    return JORaiz.toString();// jsonEjemplo;  
    }
}
