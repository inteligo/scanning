package com.apis.impl;

import com.java.Constantes;
import com.java.Convierte;
import dao.sql.DaoClienteFirmante;
import dao.sql.impl.DaoClienteFirmanteImpl;
import dto.sql.ClienteFirmante;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClienteFirmanteImpl {
    private static final Logger LOG = LogManager.getLogger(AlertaCalendarioImpl.class);
    
    public  String ConsultaClienteFirmante (String cliente) {
        DaoClienteFirmante clientefirmante= new DaoClienteFirmanteImpl(); 
        
        JSONObject JOTotalData =new JSONObject();
        JSONObject JOTotalError =new JSONObject();        
        JSONArray JADetData =new JSONArray();     
        
        JSONObject JORaiz =new JSONObject();
        int cantidadDatosLista=0;
             
        
        try
        {  
            List<ClienteFirmante> listClienteFirmante =clientefirmante.clientefirmanteQry(cliente);     
            
            cantidadDatosLista= listClienteFirmante.size();

            if (cantidadDatosLista>0 )
                    {            
                        for (ClienteFirmante lpf:listClienteFirmante)
                        {    
                            JSONObject JODetData =new JSONObject();
                            JODetData.put("cliente", Convierte.NullaVacio(lpf.getIdclie()));  
                            JODetData.put("tipocli", Convierte.NullaVacio(lpf.getTipocli()));  
                            JODetData.put("firmante", Convierte.NullaVacio(lpf.getFirmante()));                            

                            JOTotalError.put("errcod",Integer.parseInt(lpf.getErrcod()));
                            JOTotalError.put("detcod", lpf.getDetcod());
                            JOTotalError.put("defcod", lpf.getDefcod());

                            JADetData.add(JODetData);
                        }  
                    }
            else
                {
                      JOTotalError.put("errcod", Integer.parseInt(Constantes.RETORNO_NODATASQL.toString()));
                       JOTotalError.put("detcod", Constantes.MENSAJE_NODATASQL_DET);
                       JOTotalError.put("defcod", Constantes.MENSAJE_NODATASQL_DEF);       
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
       
        JOTotalData.put("firmante",JADetData);        
        
        JORaiz.put("datos",JOTotalData); 
        JORaiz.put("error",JOTotalError);         

        return JORaiz.toString();
     }
      
     
    
}
