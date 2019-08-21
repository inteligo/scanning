package com.apis.impl;

import com.java.Constantes;
import com.java.Convierte;
import com.java.Formatea;
import dao.sql.DaoCalendarioBono;
import dao.sql.impl.DaoCalendarioBonoImpl;
import dto.sql.CalendarioEvento;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CalendarioBonoImpl {
    private static final Logger LOG = LogManager.getLogger(CalendarioBonoImpl.class);
    
    public  String ConsultaCalendarioBono (String idclie,String codpor, String codpro, Double couponamount) 
    {       
        DaoCalendarioBono calendariobono= new DaoCalendarioBonoImpl();  
        
               
        JSONObject JOTotalCalendario =new JSONObject();
        JSONArray JADetCalendaPago =new JSONArray();
        JSONObject JOTotalError =new JSONObject();     
        
        JSONObject JORaiz =new JSONObject();
        int cantidadDatosLista=0;
        
        List<CalendarioEvento> listCalendarioBono =calendariobono.calendariobonoQry(idclie,codpor,codpro,couponamount);  
         
        try
        {  
           cantidadDatosLista= listCalendarioBono.size();

            if (cantidadDatosLista>0 )
                    { 
                        for (CalendarioEvento lpf:listCalendarioBono)
                        {              
                            JSONObject JOCalendBono =new JSONObject();        
                            JOCalendBono.put("codpro", Convierte.NullaVacio(lpf.getCodpro()));
                            JOCalendBono.put("totpag",lpf.getTotpag());
                            JOCalendBono.put("numpag", lpf.getNumpag());
                            JOCalendBono.put("monbon",Formatea.Redondear(lpf.getMonto(),2));
                            JOCalendBono.put("fecpag",Convierte.DatetoStr(lpf.getFecpag()));
                            JOCalendBono.put("estpag", lpf.getEstpag());                


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
        
        JOTotalCalendario.put("calendariopago", JADetCalendaPago);
        
        
        JORaiz.put("datos",JOTotalCalendario); 
        JORaiz.put("error",JOTotalError); 
        
        return JORaiz.toString();
     }    
}
