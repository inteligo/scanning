
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.t24.services.impl.CWServiceSQLHiloImpl;
import dao.sql.DaoBonoPeruano;
import dao.sql.impl.DaoBonoPeruanoImpl;
import dto.sql.BonoPeruano;
import java.io.IOException;
import java.util.List;
import org.jdom2.JDOMException;


public class pruebaBonoPeruanoJson {

    public static void main(String[] args) throws IOException, JDOMException  { 
        
        DaoBonoPeruano lista= new DaoBonoPeruanoImpl();
        List<BonoPeruano> listBonoPeruano =lista.bonoperuanoQry(); 
        Gson gson =new GsonBuilder().serializeNulls().create();        
        String json="";        
        
        json= gson.toJson(listBonoPeruano);
        System.out.println("listBonoPeruano");   
        System.out.println(json); 

       

        
        
    }
    
}
