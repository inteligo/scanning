
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.t24.services.FC13Tipo2;
import com.t24.services.impl.FC13Tipo2Impl;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;
import dto.t24.services.FC13_INVTASSETDETS;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.jdom2.JDOMException;
import org.json.simple.JSONObject;

public class pruebaFC13Tipo2Json {

    public static void main(String[] args) throws IOException, JDOMException  {
        // TODO code application logic here
            DaoListaMoneda lista= new DaoListaMonedaImpl();
            List<dto.sql.Moneda> listMonedas =lista.listamonedaQry();   

            JSONObject jsonObjeto =new JSONObject();
            String cadena=null;
            String json="";


            FC13Tipo2 fc13 = new FC13Tipo2Impl();
            String CustomerNo="101731";
            String Portfolio="101731-1";
            String Product="";

            cadena= fc13.FC13Str(CustomerNo,Portfolio,Product);


            Gson gson =new GsonBuilder().serializeNulls().create();

            List<FC13_INVTASSETDETS> list = null;
            list = new ArrayList<>();

            list=fc13.INVTASSETDETS(cadena,CustomerNo,Product,listMonedas);


            System.out.println(cadena); 

            json= gson.toJson(list);
            System.out.println("list");   
            System.out.println(json); 

            System.out.println("acá terminan la prueba : " + new Date());   
 
        
    }
    
}
