package com.apis.impl;

import com.java.Constantes;
import com.java.Convierte;
import dao.sql.DaoCalendarioAlerta;
import dao.sql.impl.DaoCalendarioAlertaImpl;
import dto.sql.CalendarioAlerta;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



public class AlertaCalendarioImpl {
     private static final Logger LOG = LogManager.getLogger(AlertaCalendarioImpl.class);
    
    public  String ConsultaCalendarioAlerta (String fecpro,String tipale,String numdias) {
        DaoCalendarioAlerta calendarioalerta= new DaoCalendarioAlertaImpl(); 
        
        JSONObject JOTotalBono =new JSONObject();
        JSONObject JOTotalError =new JSONObject();        
        JSONArray JADetCalendaPago =new JSONArray();      
        
        JSONObject JORaiz =new JSONObject();
        int cantidadDatosLista=0;    
        
        try
        {  
            List<CalendarioAlerta> listCalendarioAlerta =calendarioalerta.calendarioalertaQry(fecpro,tipale,numdias);     
            
            cantidadDatosLista= listCalendarioAlerta.size();

            if (cantidadDatosLista>0 )
                    {            
                        for (CalendarioAlerta lpf:listCalendarioAlerta)
                        {    
                            JSONObject JOCalendBono =new JSONObject();
                            JOCalendBono.put("idclie", Convierte.NullaVacio(lpf.getIdclie()));  
                            JOCalendBono.put("codpro", Convierte.NullaVacio(lpf.getCodpro()));  
                            JOCalendBono.put("diasres", lpf.getDiasres());  
                            JOCalendBono.put("nombon", Convierte.NullaVacio(lpf.getNombre()));
                            JOCalendBono.put("codpor", Convierte.NullaVacio(lpf.getCodpor()));

                            JOTotalError.put("errcod",Integer.parseInt(lpf.getErrcod()));
                            JOTotalError.put("detcod", lpf.getDetcod());
                            JOTotalError.put("defcod", lpf.getDefcod());

                            JADetCalendaPago.add(JOCalendBono);
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
       
        JOTotalBono.put("alertas",JADetCalendaPago);
        
        
        JORaiz.put("datos",JOTotalBono); 
        JORaiz.put("error",JOTotalError);         

        return JORaiz.toString();
     }
    
}
