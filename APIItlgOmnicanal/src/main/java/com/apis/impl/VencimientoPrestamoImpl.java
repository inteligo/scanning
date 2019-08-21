package com.apis.impl;

import com.java.Constantes;
import com.java.Convierte;
import com.java.Formatea;
import dao.sql.DaoVencimientoPrestamo;
import dao.sql.impl.DaoVencimientoPrestamoImpl;
import dto.sql.VencimientoPrestamo;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



public class VencimientoPrestamoImpl {
     private static final Logger LOG = LogManager.getLogger(VencimientoPrestamoImpl.class);
    
    public  String ConsultaVencimientoPrestamo (String fecpro,String numdias) {
        DaoVencimientoPrestamo VencPrestamo= new DaoVencimientoPrestamoImpl(); 
        
        JSONObject JOTotalPrestamo =new JSONObject();
        JSONObject JOTotalError =new JSONObject();        
        JSONArray JADetVencPrestamo =new JSONArray();      
        
        JSONObject JORaiz =new JSONObject();
        int cantidadDatosLista=0;    
        
        try
        {  
            List<VencimientoPrestamo> listVencimientoPrestamo =VencPrestamo.VencPrestamoQry(fecpro,numdias);     
            
            cantidadDatosLista= listVencimientoPrestamo.size();

            if (cantidadDatosLista>0 )
                    {            
                        for (VencimientoPrestamo lpf:listVencimientoPrestamo)
                        {    
                            JSONObject JOVencPrestamo =new JSONObject();
                            JOVencPrestamo.put("idclie", Convierte.NullaVacio(lpf.getIdclie()));  
                            JOVencPrestamo.put("estitu", Convierte.NullaVacio(lpf.getEstitu()));  
                            JOVencPrestamo.put("codpre", Convierte.NullaVacio(lpf.getCodpro()));  
                            JOVencPrestamo.put("fecini", Convierte.DatetoStr(lpf.getStartdate()));  
                            JOVencPrestamo.put("fecven", Convierte.DatetoStr(lpf.getMaturitydate()));  
                            JOVencPrestamo.put("diasres", lpf.getDiasres());  
                            JOVencPrestamo.put("cuenta", Convierte.NullaVacio(lpf.getCuenta()));
                            JOVencPrestamo.put("tipopre", Convierte.NullaVacio(lpf.getLoantype()));
                            JOVencPrestamo.put("monto", Formatea.Redondear(lpf.getMonto(),2));
                            JOVencPrestamo.put("moneda", Convierte.NullaVacio(lpf.getMoneda()));
                            JOVencPrestamo.put("tipocli", Convierte.NullaVacio(lpf.getTipocliente()));

                            JOTotalError.put("errcod",Integer.parseInt(lpf.getErrcod()));
                            JOTotalError.put("detcod", lpf.getDetcod());
                            JOTotalError.put("defcod", lpf.getDefcod());

                            JADetVencPrestamo.add(JOVencPrestamo);
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
       
        JOTotalPrestamo.put("alertas",JADetVencPrestamo);
        
        
        JORaiz.put("datos",JOTotalPrestamo); 
        JORaiz.put("error",JOTotalError);         

        return JORaiz.toString();
     }
    
}
