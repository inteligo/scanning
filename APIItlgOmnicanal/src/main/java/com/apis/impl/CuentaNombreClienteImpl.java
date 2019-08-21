package com.apis.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import com.java.Formatea;
import com.java.GeneraUUID;
import com.java.LeerDataProperties;

import com.t24.services.FC02Tipo1;
import com.t24.services.impl.CWServiceTWS_Tipo1HiloImpl;
import com.t24.services.impl.FC02Tipo1Impl;
import com.t24.services.impl.InputCollectionTipo1Impl;
import com.t24.services.input.Body;
import com.t24.services.input.Head;
import com.t24.services.input.IbaQuery;
import dto.t24.services.FC02_ACCCUST;
import java.util.List;

import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class CuentaNombreClienteImpl {
    
    private static final Logger LOG = LogManager.getLogger(AlertaCalendarioImpl.class);
    
    public String DetalleCuenta (String AccountNo) {        
        com.tws.wsdl.EnquiryInput enquiryInput02=new com.tws.wsdl.EnquiryInput();
        FC02Tipo1 fc02= new FC02Tipo1Impl();
       
        
        Gson gson =new GsonBuilder().serializeNulls().create();    
        String json="";  
                
        
        int cantidadDatosLista=0;
        
            
        String errcod="";
        String detcod="";
        String defcod="";        
        
        
        JSONObject JOCuentas =new JSONObject(); 
        JSONObject JOListaDatos =new JSONObject();  
                JSONObject JODatosCuenta =new JSONObject();  
        
        JSONObject JOTotalError =new JSONObject();        
        JSONObject JORaiz =new JSONObject();        
        IbaQuery ibaguid1 = new IbaQuery();
        Head hd1 = new Head();
        Body bd1 = new Body();

        try
        {  
                        
           
            
            hd1.setIbaguid(GeneraUUID.CodigoUUID());       
            hd1.setFunctioncode(Constantes.INTEGRADOR_FC02);
            hd1.setChannel(Constantes.INTEGRADOR_CHANNEL);
            hd1.setAgentId(Constantes.INTEGRADOR_AGENTID);
           
            
            InputCollectionTipo1Impl ictipo1impl=new InputCollectionTipo1Impl();
            enquiryInput02=ictipo1impl.Input("functioncode;" +Constantes.INTEGRADOR_FC02 +"|AccountNo;"+AccountNo);
                          

            String strFC_return1=null;           

           
            CWServiceTWS_Tipo1HiloImpl servicio1 = new CWServiceTWS_Tipo1HiloImpl(enquiryInput02);  

            Thread hilo1 = servicio1;
            hilo1.start();


            while (hilo1.isAlive() )
            {                           
                strFC_return1=servicio1.getResult(); 
            }   
                  
            
            List<FC02_ACCCUST> listDatCuenta =null;                 
            
            
            listDatCuenta =fc02.FC02ACCCUST(strFC_return1, AccountNo);
                     
                 
            
             for (FC02_ACCCUST lpf : listDatCuenta) 
            {
                errcod= lpf.getErrcod();
                detcod=lpf.getDetcod();
                defcod=lpf.getDefcod();   
                break;
            }               
                         
            if (errcod.equals("0"))
            {
                cantidadDatosLista= listDatCuenta.size();     
                if (cantidadDatosLista>0 )
                   {                
                        for (FC02_ACCCUST lpf:listDatCuenta)
                        {                              
                            JODatosCuenta.put("numcta",Convierte.NullaVacio(lpf.getAccCustomer())); 
                            JODatosCuenta.put("nomcliemask", Convierte.NullaVacio(lpf.getCustomerNameMask()));                             
                            JODatosCuenta.put("doctype",Convierte.NullaVacio(lpf.getDocumentType()));   
                            JODatosCuenta.put("docnro",Convierte.NullaVacio(lpf.getDocumentNo()));
                            JODatosCuenta.put("salcta",Formatea.Redondear(lpf.getAvailBal(),2));
                            JODatosCuenta.put("estcta",Convierte.NullaVacio(lpf.getAccountActive()));                                                                
                            JODatosCuenta.put("tipcta", Convierte.NullaVacio(lpf.getAccType()));   
                            JODatosCuenta.put("moncta", Formatea.FormatearCuenta(lpf.getCurrency()));                             
                         
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
          
        JORaiz.put("datos",JODatosCuenta);
        JORaiz.put("error",JOTotalError); 
       
        return JORaiz.toString();
     }
    
}
