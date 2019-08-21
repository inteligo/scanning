
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.t24.services.FC53Tipo1;
import com.t24.services.impl.FC53Tipo1Impl;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;
import dto.t24.services.FCCuentaFirma;
import dto.t24.services.FCTotalPortafolio;
import java.util.ArrayList;
import java.util.List;


public class pruebaFC53Json {

    public static void main(String[] args)   {

            DaoListaMoneda listam= new DaoListaMonedaImpl();
            List<dto.sql.Moneda> listMonedas =listam.listamonedaQry();           

            String str=null;       

            FC53Tipo1 fc53 = new FC53Tipo1Impl();
            String CustomerNo="10124"; 

            str= fc53.FC53Str(CustomerNo);

            List<FCCuentaFirma> list = null;
            list = new ArrayList<>();

            List<FCTotalPortafolio> lista = null;
            lista = new ArrayList<>();

//            list= fc53.CuentayFirmaList(str, CustomerNo,listMonedas);

            Gson gson =new GsonBuilder().serializeNulls().create();

            String json="";


            lista= fc53.TotalPortafolio(str, CustomerNo,listMonedas);
            json="";
            json= gson.toJson(lista);
            System.out.println("TotalPortafolio");   
            System.out.println(json); 

        
// System.out.println("acá terminan la prueba : " + new Date());
//            System.out.println(cadena);
       

        
        
    }
    
}
