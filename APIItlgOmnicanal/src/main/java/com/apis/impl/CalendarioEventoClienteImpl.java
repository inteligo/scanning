
package com.apis.impl;

import com.java.Constantes;
import com.java.Formatea;
import dao.sql.DaoCalendarioEventoCliente;
import dao.sql.impl.DaoCalendarioEventoClienteImpl;
import dto.sql.CalendarioEventoCliente;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CalendarioEventoClienteImpl {
    private static final Logger LOG = LogManager.getLogger(CalendarioEventoClienteImpl.class);
    
       public  String ConsultaCalendarioEventoCliente (String idclie, String tipomov,Integer anio, Integer mes,String estitu)   {             
            DaoCalendarioEventoCliente calendarioeventocliente= new DaoCalendarioEventoClienteImpl(); 
            int cantidadDatosLista=0;

            JSONObject JOTotalBono =new JSONObject();
            JSONObject JOTotalError =new JSONObject();
            JSONArray JADetCalendaPago =new JSONArray();
            JSONObject JORaiz =new JSONObject();
        
        try
        {              
            List<CalendarioEventoCliente> listCalendarioEventoCliente =calendarioeventocliente.calendarioeventoclienteQry(idclie,tipomov,anio,mes,estitu);  
            
            cantidadDatosLista= listCalendarioEventoCliente.size();

            if (cantidadDatosLista>0 )
                    {
                            for (CalendarioEventoCliente lpf:listCalendarioEventoCliente)
                            {               
                                JSONObject JOCalendBono =new JSONObject();      
                                JOCalendBono.put("idclie", lpf.getIdclie());                                 
                                JOCalendBono.put("monto",Formatea.Redondear(lpf.getMonto(),2));
                                JOTotalError.put("errcod", Integer.parseInt(lpf.getErrcod()));
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
            JOTotalError.put("errcod",Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage());    
            LOG.error( "ERROR: " + e.getMessage());
        }
         catch (NullPointerException e){
            JOTotalError.put("errcod",Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage());    
            LOG.error( "ERROR: " + e.getMessage());
        }
        catch (Exception   e){
            JOTotalError.put("errcod",Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage());    
            LOG.error( "ERROR: " + e.getMessage());
        }
        
        JOTotalBono.put("sumamonto",JADetCalendaPago);
        
        JORaiz.put("datos",JOTotalBono); 
        JORaiz.put("error",JOTotalError); 
        
        return  JORaiz.toString();
     }
    
}
