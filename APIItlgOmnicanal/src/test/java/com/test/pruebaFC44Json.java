
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.t24.services.impl.FC44Tipo2Impl;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;
import dto.t24.services.FC44_DEPODETS;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.jdom2.JDOMException;
import org.json.simple.JSONObject;
import com.t24.services.FC44Tipo2;

public class pruebaFC44Json {

    public static void main(String[] args) throws IOException, JDOMException  {
        // TODO code application logic here
         DaoListaMoneda lista= new DaoListaMonedaImpl();
        List<dto.sql.Moneda> listMonedas =lista.listamonedaQry();   
        
        JSONObject jsonObjeto =new JSONObject();
//        String cadena=null;
       
        
        FC44Tipo2 fc44 = new FC44Tipo2Impl();
        String CustomerNo="10304";
        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
        String str44=null;
        str44= fc44.FC44Str(CustomerNo);

        
        Gson gson =new GsonBuilder().serializeNulls().create();
        
        List<FC44_DEPODETS> list = null;
        list = new ArrayList<>();
        
        list=fc44.DEPODETS(str44,CustomerNo,listMonedas);
        
        String json="";
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
