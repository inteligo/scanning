
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.t24.services.FC14Tipo2;
import com.t24.services.impl.FC14Tipo2Impl;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;
import dto.t24.services.FC14_PORTFOLIOLIST;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.simple.JSONObject;
import javax.xml.parsers.*;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.jdom2.JDOMException;
import org.xml.sax.SAXException;


public class pruebaFC14Tipo2Json {

    public static void main(String[] args) throws IOException, JDOMException, TransformerConfigurationException, TransformerException, SAXException, ParserConfigurationException  {
        // TODO code application logic here
        Gson gson =new GsonBuilder().serializeNulls().create();
        String json="";
        String cadena="";
         DaoListaMoneda lista= new DaoListaMonedaImpl();
        List<dto.sql.Moneda> listMonedas =lista.listamonedaQry();   
        
        JSONObject jsonObjeto =new JSONObject();
       
       
        
        FC14Tipo2 fc14 = new FC14Tipo2Impl();
        String CustomerNo="10124";
    
        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
//        List  Lista= new ArrayList<String>();         
//        Lista= fc14.FC14Tipo2List(CustomerNo);
        
    
           List<FC14_PORTFOLIOLIST> Listado = null;
            List<FC14_PORTFOLIOLIST> ListaActivos = null;


         cadena= fc14.FC14Str(CustomerNo);
         

        
        Listado=fc14.PORTFOLIOLIST(cadena,CustomerNo);
        
        ListaActivos=fc14.PORTFOLIOLISTACTIVOS(cadena, CustomerNo);
         
    
        json= gson.toJson(Listado);
        System.out.println("Listado");   
        System.out.println(json); 
        
         json= gson.toJson(ListaActivos);
        System.out.println("ListaActivos");   
        System.out.println(json); 
        
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
 System.out.println("acá terminan la prueba : " + new Date());
//            System.out.println(cadena);
       

        
        
    }
    
}
