package com.apis.impl;

import com.google.gson.GsonBuilder;
import com.java.Formatea;

import com.t24.services.impl.Ibaguid;
import com.t24.services.input.IbaQuery;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.google.gson.Gson;
import com.java.Constantes;
import com.java.Convierte;
import com.java.GeneraUUID;
import com.java.LeerDataProperties;
import com.t24.services.impl.FC52Tipo1Impl;
import dto.t24.services.FC52_LOANDET;
import java.util.List;
import com.t24.services.FC52Tipo1;
import com.t24.services.impl.CWServiceTWS_Tipo1HiloImpl;
import com.t24.services.impl.InputCollectionTipo1Impl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class PrestamoPatrimonio52Impl {
    private static final Logger LOG = LogManager.getLogger(PrestamoPatrimonio52Impl.class);
    
    public String ConsultaPrestamoPatrimonio (String CustomerNo) {
        com.tws.wsdl.EnquiryInput enquiryInput52=new com.tws.wsdl.EnquiryInput();
        Gson gson =new GsonBuilder().serializeNulls().create();
        int cantidadDatosLista=0;
        FC52Tipo1 fc52=new FC52Tipo1Impl();         
        

        List<dto.sql.Moneda> listMonedas =null; 
        
        String errcod="";
        String detcod="";
        String defcod="";
        
        JSONArray JAListPatri =new JSONArray(); 
        JSONObject JOListPatri =new JSONObject();
        JSONObject JOTotalError =new JSONObject();
        
        JSONObject JORaiz =new JSONObject();
        
        try
        {
                        
           
            
        // ESTO ES NUEVO ------ HILOS
        
            IbaQuery cabecera1=null;
            Ibaguid ibaguid1=new Ibaguid();

            cabecera1=ibaguid1.Encabezado(GeneraUUID.CodigoUUID(), Constantes.INTEGRADOR_FC52, CustomerNo,null );  
            
            InputCollectionTipo1Impl ictipo1impl=new InputCollectionTipo1Impl();
            
            enquiryInput52=ictipo1impl.Input("functioncode;" +Constantes.INTEGRADOR_FC52 +"|CustomerNo;"+CustomerNo);

            String strFC_return1=null;  
           
             
          
            CWServiceTWS_Tipo1HiloImpl servicio1 = new CWServiceTWS_Tipo1HiloImpl(enquiryInput52);

            Thread hilo1 = servicio1;
            hilo1.start();

            while (hilo1.isAlive()  )
            {                           
                strFC_return1=servicio1.getResult();      
            }   



            // FIN NUEVO ------ HILOS     
            List<FC52_LOANDET> listDetPresta =null;
           
            listDetPresta =fc52.LOANDET(strFC_return1, CustomerNo);
                 
            
            for (FC52_LOANDET lpf : listDetPresta) 
            {
                errcod= lpf.getErrcod();
                detcod=lpf.getDetcod();
                defcod=lpf.getDefcod();   
            }      
             
           if (errcod.equals("0"))
            {                                
                    cantidadDatosLista= listDetPresta.size();

                    if (cantidadDatosLista>0 )
                            {
                                    Double sumaPrestamo =0.00;
                                    for (FC52_LOANDET dp1 : listDetPresta) 
                                    {  
                                         if  (!dp1.getID().trim().equals(""))
                                                    {
                                                        sumaPrestamo=sumaPrestamo+dp1.getCreditAmount();          
                                                    }
                                    }

                                    JOListPatri.put("totpres",Formatea.Redondear(sumaPrestamo,2));
                                    
                                    for (FC52_LOANDET lpf:listDetPresta)
                                    {                          
                                            if  (lpf.getID().trim().equals(""))
                                                    {
                                                        JOTotalError.put("errcod", Integer.parseInt(Constantes.RETORNO_NODATASQL.toString()));
                                                        JOTotalError.put("detcod", Constantes.MENSAJE_NODATASQL_DET);
                                                        JOTotalError.put("defcod", Constantes.MENSAJE_NODATASQL_DEF);       

                                                    }
                                            else
                                                {     
                                                    JSONObject JOTmpListPatri =new JSONObject();  
                                                    JOTmpListPatri.put("owner", Convierte.NullaVacio(lpf.getCliente()));
                                                    JOTmpListPatri.put("numcta", Convierte.NullaVacio(lpf.getLoanNumber()));
                                                    JOTmpListPatri.put("tippre", Convierte.NullaVacio(lpf.getLoanType()));            
                                                    JOTmpListPatri.put("salcta", Formatea.Redondear(lpf.getCreditAmount(),2));
//                                                    JOTmpListPatri.put("monpre", Formatea.Redondear(lpf.getCreditAmount(),2));
                                                    JOTmpListPatri.put("id", lpf.getID());
                                                    String estitu="";
                                                     if (lpf.getClientType().trim().equals("Principal"))
                                                        {  
                                                            estitu="T";                                       
                                                        }
                                                    else if (lpf.getClientType().trim().equals("Secundary"))
                                                        {                                  
                                                            estitu="F";                                        
                                                        }
                                                    else
                                                        {                                        
                                                            estitu="F";
                                                        }
                                                    JOTmpListPatri.put("estitu",estitu);                                                    
                                                    JAListPatri.add(JOTmpListPatri); 

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
                     JOTotalError.put("errcod", Integer.parseInt(errcod));
                     JOTotalError.put("detcod",detcod);
                     JOTotalError.put("defcod", defcod);                
            }
         }
         catch (  NumberFormatException e){
            JOTotalError.put("errcod", Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage()); 
            LOG.error( "ERROR: " + e.getMessage());
        }
        catch (  Exception e){
            JOTotalError.put("errcod", Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage()); 
            LOG.error( "ERROR: " + e.getMessage());
        }
        
        JOListPatri.put("prestamoDto",JAListPatri); 
        
        JORaiz.put("datos",JOListPatri); 
        JORaiz.put("error",JOTotalError); 

        return JORaiz.toString();
    
    }    
    
}
