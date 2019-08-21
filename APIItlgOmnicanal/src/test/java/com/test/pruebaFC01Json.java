package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.t24.services.FC01Tipo1;
import com.t24.services.impl.FC01Tipo1Impl;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;
import dto.t24.services.FCCuenta;
import java.util.List;



public class pruebaFC01Json {

    public static void main(String[] args) {
         Gson gson =new GsonBuilder().serializeNulls().create();
         DaoListaMoneda lista= new DaoListaMonedaImpl();
        List<dto.sql.Moneda> listMonedas =lista.listamonedaQry();   

        String str=null;
       
        
        FC01Tipo1 fc01 = new FC01Tipo1Impl();
        String CustomerNo="10891";
           
        str= fc01.FC01Str(CustomerNo);
        
        List<FCCuenta> list = null;   
        
        list= fc01.CuentayFirmaList(str, CustomerNo,listMonedas);
       
       
        
        String json="";
        json= gson.toJson(list);
        System.out.println("list");   
        System.out.println(json); 

        
// System.out.println("acá terminan la prueba : " + new Date());
//            System.out.println(cadena);
       

        
        
    }
    
}
