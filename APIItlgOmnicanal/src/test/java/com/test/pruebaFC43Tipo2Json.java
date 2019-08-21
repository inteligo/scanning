
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.t24.services.FC43Tipo2;
import com.t24.services.impl.FC43Tipo2Impl;
import dto.t24.services.FC43_MASTERLIST;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.jdom2.JDOMException;
import org.json.simple.JSONObject;

public class pruebaFC43Tipo2Json {

    public static void main(String[] args) throws IOException, JDOMException  {
        // TODO code application logic here
//        DaoListaMoneda lista= new DaoListaMonedaImpl();
//             List<dto.sql.Moneda> listMonedas =lista.listamonedaQry();   

            JSONObject jsonObjeto =new JSONObject();
            String cadena=null;
            String json="";


            FC43Tipo2 fc43 = new FC43Tipo2Impl();
           
            String Product="000400-508";

            cadena= fc43.FC43Str(Product);


            Gson gson =new GsonBuilder().serializeNulls().create();

            List<FC43_MASTERLIST> list = null;


            list=fc43.MASTERLIST(cadena,Product);


            System.out.println(cadena); 

            json= gson.toJson(list);
            System.out.println("list");   
            System.out.println(json); 

            System.out.println("acá terminan la prueba : " + new Date());   
    }
    
}
