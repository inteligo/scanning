
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.t24.services.FC12Tipo2;
import com.t24.services.impl.FC12Tipo2Impl;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;
import dto.t24.services.FC12_PORTFOLIODETAILS;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.jdom2.JDOMException;
import org.json.simple.JSONObject;

public class pruebaFC12Tipo2 {

    public static void main(String[] args) throws IOException, JDOMException  {
      DaoListaMoneda lista= new DaoListaMonedaImpl();
            List<dto.sql.Moneda> listMonedas =lista.listamonedaQry();   

            JSONObject jsonObjeto =new JSONObject();
            String cadena=null;
            String json="";


            FC12Tipo2 fc12 = new FC12Tipo2Impl();
            String CustomerNo="10032";
            String Portfolio="10032-9";
            String Product="000400-574";

            cadena= fc12.FC12Str(CustomerNo,Portfolio);


            Gson gson =new GsonBuilder().serializeNulls().create();

            List<FC12_PORTFOLIODETAILS> list = null;
            list = new ArrayList<>();

            list=fc12.PORTFOLIODETAILS(cadena,CustomerNo,Product,listMonedas);


            System.out.println(cadena); 

            json= gson.toJson(list);
            System.out.println("list");   
            System.out.println(json); 

            System.out.println("acá terminan la prueba : " + new Date());   
        
    }
    
}
