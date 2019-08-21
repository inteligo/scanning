package com.apis.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import dao.sql.DaoMovimientoDeposito;
import dao.sql.impl.DaoMovimientoDepositoImpl;
import dto.sql.MovimientoDeposito;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MovimientoDepositoImpl {
    
    private static final Logger LOG = LogManager.getLogger(MovimientoDepositoImpl.class);
    
    public String ConsultaMovimientoDeposito (String id) {
        JSONObject JOTotalPrestamo =new JSONObject();
        JSONObject JOCalendPresta =new JSONObject(); 
        JSONArray JADetCalendaPago =new JSONArray(); 
        try
        {
         
        String json="";           
        DaoMovimientoDeposito movimientodeposito= new DaoMovimientoDepositoImpl();    
        int cantidadDatosLista=0;
        Gson gson =new GsonBuilder().serializeNulls().create();     
              
        List<MovimientoDeposito> listMovimientoDeposito =movimientodeposito.movimientodepositoQry(id);           
          
        json= gson.toJson(listMovimientoDeposito); 
        System.out.println(json);  
        
        }
         catch (NumberFormatException e){             
            LOG.error( "ERROR: " + e.getMessage());
        }
        catch (Exception e){          
           
            LOG.error( "ERROR: " + e.getMessage());
        }

        return JOTotalPrestamo.toString();
     }
    
}
