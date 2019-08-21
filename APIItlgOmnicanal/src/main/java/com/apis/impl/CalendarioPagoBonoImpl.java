package com.apis.impl;

import com.java.Constantes;
import com.java.Convierte;
import dao.sql.DaoCalendarioPagoBono;
import dao.sql.impl.DaoCalendarioPagoBonoImpl;
import dto.sql.CalendarioBono;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CalendarioPagoBonoImpl {
    private static final Logger LOG = LogManager.getLogger(CalendarioPagoBonoImpl.class);
    
    public  String ConsultaCalendarioPagoBono (String codpro) 
    {       
        DaoCalendarioPagoBono calendariobono= new DaoCalendarioPagoBonoImpl();  
        
               
        JSONObject JOTotalCalendario =new JSONObject();
        JSONArray JADetCalendaPago =new JSONArray();
        JSONObject JOTotalError =new JSONObject();     
        
        JSONObject JORaiz =new JSONObject();
        int cantidadDatosLista=0;
        
        List<CalendarioBono> listCalendarioPagoBono =calendariobono.calendariopagobonoQry(codpro);  
         
        try
        {  
           cantidadDatosLista= listCalendarioPagoBono.size();

            if (cantidadDatosLista>0 )
                    { 
                        for (CalendarioBono lpf:listCalendarioPagoBono)
                        {              
                            JSONObject JOCalendPagoBono =new JSONObject();        
                            JOCalendPagoBono.put("codpro", Convierte.NullaVacio(lpf.getCodpro()));
                            JOCalendPagoBono.put("totpag",lpf.getTotpag());
                            JOCalendPagoBono.put("numpag", lpf.getNumpag());        
                            JOCalendPagoBono.put("fecpag",Convierte.DatetoStr(lpf.getFecpag()));
                            JOCalendPagoBono.put("estpag", lpf.getEstpag());                


                            JOTotalError.put("errcod", Integer.parseInt(lpf.getErrcod()));
                            JOTotalError.put("detcod", lpf.getDetcod());
                            JOTotalError.put("defcod", lpf.getDefcod()); 

                            JADetCalendaPago.add(JOCalendPagoBono);
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
