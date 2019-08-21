
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.t24.services.impl.FC49Tipo2Impl;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;
import dto.t24.services.FC49_LOANSIGN;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jdom2.JDOMException;
import org.json.simple.JSONObject;
import com.t24.services.FC49Tipo2;

public class pruebaFC49Json {

    public static void main(String[] args) throws IOException, JDOMException  {
        // TODO code application logic here
         DaoListaMoneda lista= new DaoListaMonedaImpl();
        List<dto.sql.Moneda> listMonedas =lista.listamonedaQry();   
        
        JSONObject jsonObjeto =new JSONObject();
//        String cadena=null;       
        
        FC49Tipo2 fc49 = new FC49Tipo2Impl();
        String CustomerNo="12246";
       
        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
        String str49=null;
        str49= fc49.FC49Str(CustomerNo);     
        
        System.out.println("str49: "+ str49);   
        
        Gson gson =new GsonBuilder().serializeNulls().create();
        
        List<FC49_LOANSIGN> list = null;
        list = new ArrayList<>();
        
        list=fc49.LOANSIGN(str49,CustomerNo,listMonedas);
        
        String json="";
        json= gson.toJson(list);
        System.out.println("list");   
        System.out.println(json); 
        
//        System.out.println(str);        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);
        

//        System.out.println(cadena);
        
    }
    
}
