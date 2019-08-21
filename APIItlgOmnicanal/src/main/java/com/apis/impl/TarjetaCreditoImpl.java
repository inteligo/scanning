package com.apis.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import static com.java.Convierte.*;
import com.java.Formatea;
import dao.sql.DaoTarjetaCredito;
import dao.sql.impl.DaoTarjetaCreditoImpl;
import dto.sql.DetalleTarjetaCredito;
import dto.sql.MovimientoTarjetaCredito;
import dto.sql.TarjetaCredito;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TarjetaCreditoImpl {
    private static final Logger LOG = LogManager.getLogger(TarjetaCreditoImpl.class);
    DaoTarjetaCredito tarjetacredito= new DaoTarjetaCreditoImpl();
    
    public String ConsultaDetalleTarjetaCredito (String CustomerNo,String fecpro, String verbloq) { 
        String json=""; 
        Gson gson =new GsonBuilder().serializeNulls().create();        
        int cantidadDatosLista=0;
       
       
        List<DetalleTarjetaCredito> listDetalleTarjetaCredito =tarjetacredito.detalletarjetacreditoQry(CustomerNo,fecpro,verbloq);  
                        
        JSONObject JOTotalTarjetaCredito =new JSONObject();         
        JSONArray JADetTarjetaCredito =new JSONArray();       
        JSONObject JOTotalError =new JSONObject();       
        
        JSONObject JORaiz =new JSONObject();

        try
        { 
            cantidadDatosLista= listDetalleTarjetaCredito.size();

            if (cantidadDatosLista>0 )
                {             
                    for (DetalleTarjetaCredito lpf:listDetalleTarjetaCredito)
                    {     
                        JSONObject JODetTarjetaCredito =new JSONObject(); 
                        JODetTarjetaCredito.put("numtar", Convierte.NullaVacio(lpf.getNumtar()));
                        JODetTarjetaCredito.put("fectra", DatetoStr(lpf.getFectra()));            
                        JODetTarjetaCredito.put("fecpro",DatetoStr(lpf.getStrfecpro()));           
                        JODetTarjetaCredito.put("saltar", Formatea.Redondear(lpf.getSaltar(),2));    
                        JODetTarjetaCredito.put("salcon", Formatea.Redondear(lpf.getSalcon(),2));       
                        JODetTarjetaCredito.put("saldis", Formatea.Redondear(lpf.getSaldis(),2)); 
                        JODetTarjetaCredito.put("pagmes", Formatea.Redondear(lpf.getPagmes(),2)); 
                        JODetTarjetaCredito.put("pagmin", Formatea.Redondear(lpf.getPagmin(),2));     
                        JODetTarjetaCredito.put("ultpag",DatetoStr(lpf.getUltpag()));  
                        JODetTarjetaCredito.put("cierre",DatetoStr(lpf.getCierre()));  
                        JODetTarjetaCredito.put("esttit",Convierte.NullaVacio(lpf.getEsttit())); 
                        JODetTarjetaCredito.put("esttar",Convierte.NullaVacio(lpf.getEsttar()));  
                        JODetTarjetaCredito.put("punint",lpf.getPunint());  
                        JODetTarjetaCredito.put("lintot",Formatea.Redondear(lpf.getLintot(),2));  
                        JODetTarjetaCredito.put("tiptar", Convierte.NullaVacio(lpf.getTiptar()));
                        JODetTarjetaCredito.put("tippago", Convierte.NullaVacio(lpf.getTippago()));
                        JODetTarjetaCredito.put("estitu", "T");  

                        JODetTarjetaCredito.put("codbloque", Convierte.NullaVacio(lpf.getCodbloque()));
                        JODetTarjetaCredito.put("desbloque", Convierte.NullaVacio(lpf.getDescbloque()));
                        JODetTarjetaCredito.put("fecbloque", Convierte.NullaVacio(lpf.getFecbloque()));
                        JODetTarjetaCredito.put("fecexpira", Convierte.NullaVacio(lpf.getFecexpira()));


                        JADetTarjetaCredito.add(JODetTarjetaCredito);

                        JOTotalError.put("errcod", Integer.parseInt(lpf.getErrcod()));
                        JOTotalError.put("detcod", lpf.getDetcod());
                        JOTotalError.put("defcod", lpf.getDefcod());
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
                
        JOTotalTarjetaCredito.put("detalle",JADetTarjetaCredito);  
        
        JORaiz.put("datos",JOTotalTarjetaCredito); 
        JORaiz.put("error",JOTotalError); 
          
        return JORaiz.toString();
     }
    
     public String ConsultaDetyMovTrajetaCredito (String CustomerNo,String fecpro, String verbloq) {         
        String json="";  
        Gson gson =new GsonBuilder().serializeNulls().create(); 
        int cantidadDatosLista=0;
        
        JSONObject JOTotalTarjetaCredito =new JSONObject(); 
        JSONObject JOTotalError =new JSONObject();
        JSONArray JADetTarjetaCredito =new JSONArray(); 
        JSONArray JAMovTarjetaCredito =new JSONArray(); 
        
        JSONObject JORaiz =new JSONObject();
        
        try
        {         
            List<TarjetaCredito> list = null;
            list = new ArrayList<>();            

            List<DetalleTarjetaCredito> listDetalleTarjetaCredito =tarjetacredito.detalletarjetacreditoQry(CustomerNo,fecpro,verbloq);           
            List<MovimientoTarjetaCredito> listMovimientoTarjetaCredito =tarjetacredito.movimientotarjetacreditoQry(CustomerNo,fecpro);  
            
            cantidadDatosLista= listDetalleTarjetaCredito.size();

            if (cantidadDatosLista>0 )
                { 
                    for (DetalleTarjetaCredito lpf:listDetalleTarjetaCredito)
                    {     
                        JSONObject JODetTarjetaCredito =new JSONObject(); 
                        JODetTarjetaCredito.put("numtar", lpf.getNumtar());
                        if (lpf.getEsttit().trim().equals("T"))
                                {
                                    JODetTarjetaCredito.put("descri", "Titular"); 
                                }
                        else if (lpf.getEsttit().trim().equals("A"))
                                {
                                    JODetTarjetaCredito.put("descri", "Adicional"); 
                                }
                        else 
                                {
                                    JODetTarjetaCredito.put("descri", ""); 
                                }
                        JODetTarjetaCredito.put("esttar",Convierte.NullaVacio(lpf.getEsttar())); 
                        JODetTarjetaCredito.put("codbloque", Convierte.NullaVacio(lpf.getCodbloque()));
                        JODetTarjetaCredito.put("desbloque", Convierte.NullaVacio(lpf.getDescbloque()));
                        JODetTarjetaCredito.put("fecbloque", Convierte.NullaVacio(lpf.getFecbloque()));
                        JODetTarjetaCredito.put("fecexpira", Convierte.NullaVacio(lpf.getFecexpira()));
                        JADetTarjetaCredito.add(JODetTarjetaCredito);
                    }                           
                } 
            
            cantidadDatosLista= listMovimientoTarjetaCredito.size();

            if (cantidadDatosLista>0 )
                {   
                    for (MovimientoTarjetaCredito lpf:listMovimientoTarjetaCredito)
                    {     
                        JSONObject JODetTarjetaCredito =new JSONObject(); 
                        JODetTarjetaCredito.put("fecmov",Convierte.DatetoStr( lpf.getFecmov()));
                        JODetTarjetaCredito.put("descri", Convierte.NullaVacio(lpf.getDescrip()));            
                        JODetTarjetaCredito.put("carabo",Convierte.NullaVacio(lpf.getCarabo()));           
                        JODetTarjetaCredito.put("monto", Formatea.Redondear(lpf.getMonto(),2));    
                        JODetTarjetaCredito.put("numtar", Convierte.NullaVacio(lpf.getNumtar()));            
                        JAMovTarjetaCredito.add(JODetTarjetaCredito);

                        JOTotalError.put("errcod",Integer.parseInt(lpf.getErrcod()));
                        JOTotalError.put("detcod", lpf.getDetcod());
                        JOTotalError.put("defcod", lpf.getDefcod());
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
                
        JOTotalTarjetaCredito.put("tarjetas",JADetTarjetaCredito);     
        JOTotalTarjetaCredito.put("movimientos",JAMovTarjetaCredito);         
        
        JORaiz.put("datos",JOTotalTarjetaCredito);         
        JORaiz.put("error",JOTotalError);
          
        return JORaiz.toString();
     }
     
      public String ConsultaDetyMovTrajetaCreditoPorCantidad (String CustomerNo,String fecpro, String verbloq, Integer numcant) {         
        String json="";  
        Gson gson =new GsonBuilder().serializeNulls().create(); 
        int cantidadDatosLista=0;
        
        JSONObject JOTotalTarjetaCredito =new JSONObject(); 
        JSONObject JOTotalError =new JSONObject();
        JSONArray JADetTarjetaCredito =new JSONArray(); 
        JSONArray JAMovTarjetaCredito =new JSONArray(); 
        
        JSONObject JORaiz =new JSONObject();
        
        try
        {         
            List<TarjetaCredito> list = null;
            list = new ArrayList<>();            

            List<DetalleTarjetaCredito> listDetalleTarjetaCredito =tarjetacredito.detalletarjetacreditoQry(CustomerNo,fecpro,verbloq);           
            List<MovimientoTarjetaCredito> listMovimientoTarjetaCredito =tarjetacredito.movimientotarjetacreditoporcantidadQry(CustomerNo,fecpro,numcant);  
            
            cantidadDatosLista= listDetalleTarjetaCredito.size();

            if (cantidadDatosLista>0 )
                { 
                    for (DetalleTarjetaCredito lpf:listDetalleTarjetaCredito)
                    {     
                        JSONObject JODetTarjetaCredito =new JSONObject(); 
                        JODetTarjetaCredito.put("numtar", lpf.getNumtar());
                        if (lpf.getEsttit().trim().equals("T"))
                                {
                                    JODetTarjetaCredito.put("descri", "Titular"); 
                                }
                        else if (lpf.getEsttit().trim().equals("A"))
                                {
                                    JODetTarjetaCredito.put("descri", "Adicional"); 
                                }
                        else 
                                {
                                    JODetTarjetaCredito.put("descri", ""); 
                                }
                        JODetTarjetaCredito.put("esttar",Convierte.NullaVacio(lpf.getEsttar())); 
                        JODetTarjetaCredito.put("codbloque", Convierte.NullaVacio(lpf.getCodbloque()));
                        JODetTarjetaCredito.put("desbloque", Convierte.NullaVacio(lpf.getDescbloque()));
                        JODetTarjetaCredito.put("fecbloque", Convierte.NullaVacio(lpf.getFecbloque()));
                        JODetTarjetaCredito.put("fecexpira", Convierte.NullaVacio(lpf.getFecexpira()));
                        JADetTarjetaCredito.add(JODetTarjetaCredito);
                    }                           
                } 
            
            cantidadDatosLista= listMovimientoTarjetaCredito.size();

            if (cantidadDatosLista>0 )
                {   
                    for (MovimientoTarjetaCredito lpf:listMovimientoTarjetaCredito)
                    {     
                        JSONObject JODetTarjetaCredito =new JSONObject(); 
                        JODetTarjetaCredito.put("fecmov",Convierte.DatetoStr( lpf.getFecmov()));
                        JODetTarjetaCredito.put("descri", Convierte.NullaVacio(lpf.getDescrip()));            
                        JODetTarjetaCredito.put("carabo",Convierte.NullaVacio(lpf.getCarabo()));           
                        JODetTarjetaCredito.put("monto", Formatea.Redondear(lpf.getMonto(),2));    
                        JODetTarjetaCredito.put("numtar", Convierte.NullaVacio(lpf.getNumtar()));            
                        JAMovTarjetaCredito.add(JODetTarjetaCredito);

                        JOTotalError.put("errcod",Integer.parseInt(lpf.getErrcod()));
                        JOTotalError.put("detcod", lpf.getDetcod());
                        JOTotalError.put("defcod", lpf.getDefcod());
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
                
        JOTotalTarjetaCredito.put("tarjetas",JADetTarjetaCredito);     
        JOTotalTarjetaCredito.put("movimientos",JAMovTarjetaCredito);         
        
        JORaiz.put("datos",JOTotalTarjetaCredito);         
        JORaiz.put("error",JOTotalError);
          
        return JORaiz.toString();
     }
      
      
      public String ConsultaTarjetaCreditoBloquedas (String fecpro) { 
        String json=""; 
        Gson gson =new GsonBuilder().serializeNulls().create();        
        int cantidadDatosLista=0;
       
       
        List<DetalleTarjetaCredito> listTarjetaCreditoBloquedas =tarjetacredito.tarjetacreditobloquedasQry(fecpro);  
                        
        JSONObject JOTotalTarjetaCredito =new JSONObject();         
        JSONArray JADetTarjetaCredito =new JSONArray();       
        JSONObject JOTotalError =new JSONObject();       
        
        JSONObject JORaiz =new JSONObject();

        try
        { 
            cantidadDatosLista= listTarjetaCreditoBloquedas.size();

            if (cantidadDatosLista>0 )
                {             
                    for (DetalleTarjetaCredito lpf:listTarjetaCreditoBloquedas)
                    {     
                        JSONObject JODetTarjetaCredito =new JSONObject(); 
                        JODetTarjetaCredito.put("cliente", Convierte.NullaVacio(lpf.getIdclie()));
                        JODetTarjetaCredito.put("numtar", Convierte.NullaVacio(lpf.getNumtar()));                        
                        JODetTarjetaCredito.put("esttit",Convierte.NullaVacio(lpf.getEsttit())); 
                        JODetTarjetaCredito.put("esttar",Convierte.NullaVacio(lpf.getEsttar()));                         
                        JODetTarjetaCredito.put("tiptar", Convierte.NullaVacio(lpf.getTiptar()));                        
                        JODetTarjetaCredito.put("estitu", "T");  
                        JODetTarjetaCredito.put("codbloque", Convierte.NullaVacio(lpf.getCodbloque()));
                        JODetTarjetaCredito.put("desbloque", Convierte.NullaVacio(lpf.getDescbloque()));
                        JODetTarjetaCredito.put("fecbloque", Convierte.NullaVacio(lpf.getFecbloque()));                        

                        JADetTarjetaCredito.add(JODetTarjetaCredito);

                        JOTotalError.put("errcod", Integer.parseInt(lpf.getErrcod()));
                        JOTotalError.put("detcod", lpf.getDetcod());
                        JOTotalError.put("defcod", lpf.getDefcod());
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
                
        JOTotalTarjetaCredito.put("detalle",JADetTarjetaCredito);  
        
        JORaiz.put("datos",JOTotalTarjetaCredito); 
        JORaiz.put("error",JOTotalError); 
          
        return JORaiz.toString();
     }
    
}

