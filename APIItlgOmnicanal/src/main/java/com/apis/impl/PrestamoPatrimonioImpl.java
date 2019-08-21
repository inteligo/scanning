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
import com.t24.services.impl.FC49Tipo2Impl;
import dto.t24.services.FC49_LOANSIGN;
import java.util.List;
import com.t24.services.FC49Tipo2;
import com.t24.services.impl.CWServiceListaMonedasHiloImpl;
import com.t24.services.impl.CWServiceTWS_Tipo2HiloImpl;
import com.t24.services.impl.InputCollectionTipo2Impl;
import com.t24.services.input.InputCollection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class PrestamoPatrimonioImpl {
    
    private static final Logger LOG = LogManager.getLogger(PrestamoPatrimonioImpl.class);
    
    public String ConsultaPrestamoPatrimonio (String CustomerNo) {
        com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();  
        com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
      
        Gson gson =new GsonBuilder().serializeNulls().create();
        int cantidadDatosLista=0;
        FC49Tipo2 fc49=new FC49Tipo2Impl();      
        

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

            cabecera1=ibaguid1.Encabezado(GeneraUUID.CodigoUUID(), Constantes.INTEGRADOR_FC49, CustomerNo,null );  
                       
            String respuesta="";

            InputCollection ic =new InputCollection();
            InputCollectionTipo2Impl icimpl=new InputCollectionTipo2Impl();

            ic.setCUSTOMERID(CustomerNo);
            enquiryInput=icimpl.Input(ic);
            

            String strFC_return1=null;  
           
             
           
                       
            CWServiceTWS_Tipo2HiloImpl servicio1 = new CWServiceTWS_Tipo2HiloImpl(Constantes.INTEGRADOR_FC49,enquiryInput); 
            CWServiceListaMonedasHiloImpl servicio4 = new CWServiceListaMonedasHiloImpl();

            Thread hilo4 = servicio4;
            hilo4.start();

            Thread hilo1 = servicio1;
            hilo1.start();                        


            while (hilo1.isAlive() ||  hilo4.isAlive())
            {                           
                 listMonedas=servicio4.getResult();
                 strFC_return1=servicio1.getResult();                          
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
                    cantidadDatosLista= listDetPresta.size();

                    if (cantidadDatosLista>0 )
                            {
                                    Double sumaPrestamo =0.00;
                                    for (FC49_LOANSIGN dp1 : listDetPresta) 
                                    {  
                                         if  (!dp1.getID().trim().equals(""))
                                                    {
                                                        sumaPrestamo=sumaPrestamo+dp1.getBalance();          
                                                    }
                                    }

                                    JOListPatri.put("totpres",Formatea.Redondear(sumaPrestamo,2));
                                    
                                    for (FC49_LOANSIGN lpf:listDetPresta)
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
                                                    JOTmpListPatri.put("salcta", Formatea.Redondear(lpf.getBalance(),2));
                                                    JOTmpListPatri.put("monpre", Formatea.Redondear(lpf.getCreditAmount(),2));
                                                    JOTmpListPatri.put("id", Convierte.NullaVacio(lpf.getID()));
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
