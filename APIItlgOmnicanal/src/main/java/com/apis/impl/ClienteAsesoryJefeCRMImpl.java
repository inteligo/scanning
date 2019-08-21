package com.apis.impl;

import com.java.Constantes;
import com.java.Convierte;
import dao.sql.DaoClienteAsesoryJefeCRM;
import dao.sql.impl.DaoClienteAsesoryJefeCRMImpl;
import dto.sql.ClienteCRM;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClienteAsesoryJefeCRMImpl {
    private static final Logger LOG = LogManager.getLogger(ClienteAsesoryJefeCRMImpl.class);
    
    public  String ConsultaClienteAsesoryJefeCRM (String cliente, String asesor) {
         DaoClienteAsesoryJefeCRM clienteasesoryjefecrm= new DaoClienteAsesoryJefeCRMImpl(); 
        
        JSONObject JOTotalData =new JSONObject();
        JSONObject JOTotalError =new JSONObject();        
        JSONArray JADetData =new JSONArray();     
        
        JSONObject JORaiz =new JSONObject();
        int cantidadDatosLista=0;
        
        try
        {  
            List<ClienteCRM> listClienteCRM =clienteasesoryjefecrm.clienteasesoryjefecrmQry(cliente,asesor);     
            
            cantidadDatosLista= listClienteCRM.size();

            if (cantidadDatosLista>0 )
                    {            
                        for (ClienteCRM lpf:listClienteCRM)
                        {    
                            JSONObject JODetData =new JSONObject();
                            JODetData.put("idclie", Convierte.NullaVacio(lpf.getCodigo()));  
                            JODetData.put("sector", Convierte.NullaVacio(lpf.getSector()));  
                            JODetData.put("nomsector", Convierte.NullaVacio(lpf.getNomsector()));  
                            JODetData.put("apesector", Convierte.NullaVacio(lpf.getApesector()));
                            JODetData.put("fonosector", Convierte.NullaVacio(lpf.getFonosector()));
                            JODetData.put("anexosector", Convierte.NullaVacio(lpf.getAnexosector()));
                            JODetData.put("emailsector", Convierte.NullaVacio(lpf.getEmailsector()));        
                            JODetData.put("apepaterno", Convierte.NullaVacio(lpf.getApepaterno()));      
                            JODetData.put("apematerno", Convierte.NullaVacio(lpf.getApematerno()));       
                            JODetData.put("nomclie", Convierte.NullaVacio(lpf.getNombre()));     
                            JODetData.put("permiso", lpf.getPermiso());     

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
       
        JOTotalData.put("asesor",JADetData);        
        
        JORaiz.put("datos",JOTotalData); 
        JORaiz.put("error",JOTotalError);         

        return JORaiz.toString();
     }
    
}
