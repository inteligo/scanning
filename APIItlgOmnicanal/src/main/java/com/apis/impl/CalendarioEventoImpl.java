
package com.apis.impl;

import com.java.Constantes;
import com.java.Convierte;
import static com.java.Convierte.DatetoStr;
import com.java.Formatea;
import dao.sql.DaoCalendarioEvento;
import dao.sql.impl.DaoCalendarioEventoImpl;
import dto.sql.CalendarioEvento;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CalendarioEventoImpl {
    private static final Logger LOG = LogManager.getLogger(CalendarioEventoImpl.class);
    
       public  String ConsultaCalendarioEvento (String idclie,String tipomov)   {             
            DaoCalendarioEvento calendarioevento= new DaoCalendarioEventoImpl(); 
            int cantidadDatosLista=0;

            JSONObject JOTotalBono =new JSONObject();
            JSONObject JOTotalError =new JSONObject();
            JSONArray JADetCalendaPago =new JSONArray();       
            JSONObject JORaiz =new JSONObject();
        
        try
        {              
            List<CalendarioEvento> listCalendarioEvento =calendarioevento.calendarioeventoQry(idclie,tipomov);  
            
            cantidadDatosLista= listCalendarioEvento.size();

            if (cantidadDatosLista>0 )
                {
                    for (CalendarioEvento lpf:listCalendarioEvento)
                    {               
                        JSONObject JOCalendBono =new JSONObject();               
                        JOCalendBono.put("evento", Convierte.NullaVacio(lpf.getEvento()));
                        JOCalendBono.put("descri",Convierte.NullaVacio(lpf.getDescri()));
                        JOCalendBono.put("produc", Convierte.NullaVacio(lpf.getProducto()));
                        JOCalendBono.put("fecha",  DatetoStr(lpf.getFecpag()));
                        JOCalendBono.put("monto",Formatea.Redondear(lpf.getMonto(),2));
                        JOCalendBono.put("carabo", Convierte.NullaVacio(lpf.getCarabo()));                
                        JOCalendBono.put("saldo", Formatea.Redondear(lpf.getSaldo(),2));
                        JOCalendBono.put("idclie", Convierte.NullaVacio(lpf.getIdclie()));   
                         JOCalendBono.put("owner", Convierte.NullaVacio(lpf.getOwner()));   
                        JOCalendBono.put("codpor", Convierte.NullaVacio(lpf.getCodpor()));   
                        JOCalendBono.put("codpro", Convierte.NullaVacio(lpf.getCodpro()));   
                        JOCalendBono.put("idpre", Convierte.NullaVacio(lpf.getIdpre())); 
                        JOCalendBono.put("tippro", Convierte.NullaVacio(lpf.getTippro())); 

                        JOTotalError.put("errcod", Integer.parseInt(lpf.getErrcod()));
                        JOTotalError.put("detcod", lpf.getDetcod());
                        JOTotalError.put("defcod", lpf.getDefcod());
                        JOCalendBono.put("monpro",Formatea.Redondear(lpf.getMonpro(),2));
                        JOCalendBono.put("monpor",Formatea.Redondear(lpf.getMonpor(),2));
                        JOCalendBono.put("estitu", Convierte.NullaVacio(lpf.getEstitu())); 
                        JOCalendBono.put("estpag", lpf.getEstpag()); 
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
        catch (Exception e){
            JOTotalError.put("errcod",Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage());   
            LOG.error( "ERROR: " + e.getMessage());
        }
        
        JOTotalBono.put("cronograma",JADetCalendaPago);
        
        JORaiz.put("datos",JOTotalBono); 
        JORaiz.put("error",JOTotalError); 
        
        return  JORaiz.toString();
     }
    
}
