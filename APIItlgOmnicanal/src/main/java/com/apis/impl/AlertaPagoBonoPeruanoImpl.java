package com.apis.impl;

import com.java.Constantes;
import com.java.Convierte;
import static com.java.Convierte.DatetoStr;
import com.java.Formatea;
import dao.sql.DaoBonoPeruano;
import dao.sql.impl.DaoBonoPeruanoImpl;
import dto.sql.PagoBonoPeruano;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



public class AlertaPagoBonoPeruanoImpl {
     private static final Logger LOG = LogManager.getLogger(AlertaPagoBonoPeruanoImpl.class);
    
    public  String ConsultaPagoBonoPeruanoAlerta (Integer anio, Integer mes) {
        DaoBonoPeruano pagobonoperuano= new DaoBonoPeruanoImpl(); 
        
        JSONObject JOTotalBono =new JSONObject();
        JSONObject JOTotalError =new JSONObject();        
        JSONArray JADetPago =new JSONArray();      
        
        JSONObject JORaiz =new JSONObject();
        int cantidadDatosLista=0;    
        
        try
        {  
            List<PagoBonoPeruano> listPagoBonoPeruano =pagobonoperuano.pagobonoperuanoQry(anio,mes);     
            
            cantidadDatosLista= listPagoBonoPeruano.size();

            if (cantidadDatosLista>0 )
                    {            
                        for (PagoBonoPeruano lpf:listPagoBonoPeruano)
                        {    
                            JSONObject JOCalendBono =new JSONObject();
                            JOCalendBono.put("idclie", Convierte.NullaVacio(lpf.getCustomer()));  
                            JOCalendBono.put("asesor", Convierte.NullaVacio(lpf.getSector()));  
                            JOCalendBono.put("codpor", Convierte.NullaVacio(lpf.getPortafolio()));
                            JOCalendBono.put("codpro", Convierte.NullaVacio(lpf.getIdactivo()));  
                            JOCalendBono.put("isin", Convierte.NullaVacio(lpf.getIsin()));                              
                            JOCalendBono.put("nombon", Convierte.NullaVacio(lpf.getNombreactivo())); 
                            JOCalendBono.put("moneda", Convierte.NullaVacio(lpf.getMoneda()));
                            JOCalendBono.put("nominal", Formatea.Redondear(lpf.getNominal(),2));
                            JOCalendBono.put("monpago", Formatea.Redondear(lpf.getMontopago(),2));
                            JOCalendBono.put("fecpago", DatetoStr(lpf.getFechapago())); 

                            JOTotalError.put("errcod",Integer.parseInt(lpf.getErrcod()));
                            JOTotalError.put("detcod", lpf.getDetcod());
                            JOTotalError.put("defcod", lpf.getDefcod());

                            JADetPago.add(JOCalendBono);
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
       
        JOTotalBono.put("alertas",JADetPago);
        
        
        JORaiz.put("datos",JOTotalBono); 
        JORaiz.put("error",JOTotalError);         

        return JORaiz.toString();
     }
    
}
