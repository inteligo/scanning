package com.apis.impl;

import com.java.Constantes;
import com.java.Convierte;
import static com.java.Convierte.DatetoStr;
import com.java.Formatea;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;
import dto.sql.Moneda;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ListaMonedaImpl {
    
    private static final Logger LOG = LogManager.getLogger(ListaMonedaImpl.class);
    
    public  String ListaMoneda () {
        DaoListaMoneda listamoneda= new DaoListaMonedaImpl(); 
        
        JSONObject JOTotalError =new JSONObject();        
        JSONArray JAListaMoneda =new JSONArray();
        JSONObject JOTotalListaMoneda =new JSONObject();
        
        JSONObject JORaiz =new JSONObject();
        int cantidadDatosLista=0;
        
        try
        {  
            List<Moneda> listListaMoneda =listamoneda.listamonedaQry();               
            
            cantidadDatosLista= listListaMoneda.size();

            if (cantidadDatosLista>0 )
                    {            
                        for (Moneda lpf:listListaMoneda)
                        {    
                            JSONObject JOListaMoneda =new JSONObject();
                            JOListaMoneda.put("id", Convierte.NullaVacio(lpf.getId()));  
                            JOListaMoneda.put("moneda", Convierte.NullaVacio(lpf.getMoneda()));  
                            JOListaMoneda.put("simbolo", Convierte.NullaVacio(lpf.getSimbolo()));  
                            JOListaMoneda.put("tipocambio", Formatea.Redondear(lpf.getTipocambio(),4));
                            JOListaMoneda.put("fecha",DatetoStr(lpf.getFecha()));
                   

                            JOTotalError.put("errcod",Integer.parseInt(lpf.getErrcod()));
                            JOTotalError.put("detcod", lpf.getDetcod());
                            JOTotalError.put("defcod", lpf.getDefcod());

                            JAListaMoneda.add(JOListaMoneda);
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
       
        JOTotalListaMoneda.put("moneda",JAListaMoneda);
        
        
        JORaiz.put("datos",JOTotalListaMoneda); 
        JORaiz.put("error",JOTotalError);         

        return JORaiz.toString();
     }
    
}
