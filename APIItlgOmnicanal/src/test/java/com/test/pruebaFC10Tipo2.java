package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.t24.services.FC10Tipo2;
import com.t24.services.impl.FC10Tipo2Impl;
import dto.t24.services.FC10_ASSETLIST;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.jdom2.JDOMException;
import org.json.simple.JSONObject;

public class pruebaFC10Tipo2 {

    public static void main(String[] args) throws IOException, JDOMException  {
        // TODO code application logic here
//         DaoListaMoneda lista= new DaoListaMonedaImpl();
//        List<dto.sql.Moneda> listMonedas =lista.listamonedaQry();   
        
        JSONObject jsonObjeto =new JSONObject();
        String cadena=null;
          String json="";
       
        
        FC10Tipo2 fc10 = new FC10Tipo2Impl();
        String CustomerNo="10606";      
        
        cadena= fc10.FC10Str(CustomerNo);

        
        Gson gson =new GsonBuilder().serializeNulls().create();
        
        List<FC10_ASSETLIST> list = null;
        
        list=fc10.FC10ASSETList(cadena,CustomerNo);
        
 
        System.out.println(cadena); 
        
          json= gson.toJson(list);
            System.out.println("list");   
            System.out.println(json); 
        
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
 System.out.println("acá terminan la prueba : " + new Date());
//            System.out.println(cadena);
       

        
    }
    
}
