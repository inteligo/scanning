package com.apis.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import com.java.Formatea;
import dao.sql.DaoPagoCupon;
import dao.sql.impl.DaoPagoCuponImpl;
import dto.sql.PagoCupon;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MovimientoPagoCuponImpl {
    
    private static final Logger LOG = LogManager.getLogger(MovimientoPagoCuponImpl.class);
    
    public String ConsultaPagoCupon (String fechaini, String fechafin) {
         
        String json="";           
        DaoPagoCupon pagocupon= new DaoPagoCuponImpl();    
        int cantidadDatosLista=0;
        Gson gson =new GsonBuilder().serializeNulls().create();                
              
        JSONObject JOTotalPagoCupon =new JSONObject(); 
        JSONObject JOTotalError =new JSONObject();
        JSONArray JAPagoCupon =new JSONArray(); 
  
        JSONObject JORaiz =new JSONObject();

        
        try
        { 
                                
            List<PagoCupon> listPagoCupon =pagocupon.pagocuponQry(fechaini,fechafin);  
            
            cantidadDatosLista= listPagoCupon.size();

            if (cantidadDatosLista>0 )
                { 
                    for (PagoCupon lpf:listPagoCupon)
                    {     
                        JSONObject JOPagoCupon =new JSONObject(); 
                        JOPagoCupon.put("tipocliente", Convierte.NullaVacio(lpf.getTipocliente()));
                        JOPagoCupon.put("cliente", Convierte.NullaVacio(lpf.getCliente()));
                        JOPagoCupon.put("currency", Convierte.NullaVacio(lpf.getCurrency()));
                        JOPagoCupon.put("cuenta", Convierte.NullaVacio(lpf.getCuenta()));
                        JOPagoCupon.put("fecha", Convierte.DatetoStr(lpf.getBookingdate()));
                        JOPagoCupon.put("descripcion", Convierte.NullaVacio(lpf.getDescripcion()));
//                        JOPagoCupon.put("reference", lpf.getReference());
//                        JOPagoCupon.put("postfecha", lpf.getPostfecha());
//                        JOPagoCupon.put("cargo", lpf.getCargo());
                        JOPagoCupon.put("monto", Formatea.Redondear(lpf.getAbono(),2));  
//                        JOPagoCupon.put("bookingdate", lpf.getBookingdate());
                        
                        JOTotalError.put("errcod", lpf.getErrcod());
                        JOTotalError.put("detcod", lpf.getDetcod());
                        JOTotalError.put("defcod", lpf.getDefcod());  
                       
                        JAPagoCupon.add(JOPagoCupon);
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
                
        JOTotalPagoCupon.put("pagocupon",JAPagoCupon);     
       
        
        JORaiz.put("datos",JOTotalPagoCupon);         
        JORaiz.put("error",JOTotalError);
          
        return JORaiz.toString();
     }
    
}
