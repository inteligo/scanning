
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.t24.services.impl.CWServiceListaMonedasHiloImpl;
import com.t24.services.impl.CWServiceSQLHiloImpl;
import java.io.IOException;
import java.util.List;
import org.jdom2.JDOMException;


public class pruebaListaMoneda {

    public static void main(String[] args) throws IOException, JDOMException  {
        // TODO code application logic here
        

        String str=null;
       
        
         int cantidadDatosLista=0;
       
//        DaoListaMoneda lista= new DaoListaMonedaImpl();
//        List<dto.sql.Moneda> listMoneda =lista.listamonedaQry();            
//                
//       
//       
        Gson gson =new GsonBuilder().serializeNulls().create();
        
        String json="";
//        json= gson.toJson(listMoneda);
//        System.out.println("list");   
//        System.out.println(json); 
        
        
         List<dto.sql.Moneda> listMonedas =null;
        
//        String strFC_return1=null;
            
//              listMonedas =lista.listamonedaQry();            
             
          
//                        CWServiceListaMonedasHiloImpl r = new CWServiceListaMonedasHiloImpl();
                        
                        CWServiceSQLHiloImpl r = new CWServiceSQLHiloImpl();
                        Thread hilo1 = r;
                        hilo1.start();

                        while (hilo1.isAlive()  )
                        {
                            listMonedas=r.getResult();     
                          
                        }   

//                          String json="";
        json= gson.toJson(listMonedas);
        System.out.println("listMonedas");   
        System.out.println(json); 
        
// System.out.println("acá terminan la prueba : " + new Date());
//            System.out.println(cadena);
       

        
        
    }
    
}
