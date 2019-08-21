
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.t24.services.impl.CWServiceClienteCRMHiloImpl;

import dto.sql.ClienteCRM;
import java.io.IOException;
import java.util.List;
import org.jdom2.JDOMException;


public class pruebaClienteCRM {

    public static void main(String[] args) throws IOException, JDOMException  {
    
        String str=null;
        String idclie="10030";
      
        Gson gson =new GsonBuilder().serializeNulls().create();

        String json="";

        List<ClienteCRM> listClienteCRM = null; 
         
                CWServiceClienteCRMHiloImpl r = new CWServiceClienteCRMHiloImpl(idclie);
                Thread hilo1 = r;
                hilo1.start();

                while (hilo1.isAlive()  )
                {
                    listClienteCRM=r.getResult();     
                }   

        json= gson.toJson(listClienteCRM);
        System.out.println("listClienteCRM");   
        System.out.println(json); 
   
    }    
}
