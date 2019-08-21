
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.apis.impl.ClienteAsesoryJefeCRMImpl;
import dao.sql.DaoClienteAsesoryJefeCRM;
import dao.sql.impl.DaoClienteAsesoryJefeCRMImpl;

import dto.sql.ClienteCRM;
import java.io.IOException;
import java.util.List;
import org.jdom2.JDOMException;


public class pruebaClienteAsesoryJefeCRM {

    public static void main(String[] args) throws IOException, JDOMException  {
    
        String str=null;
        String idclie="10030";
        String asesor="5051";
      
        Gson gson =new GsonBuilder().serializeNulls().create();

        String json="";

      
           DaoClienteAsesoryJefeCRM clienteasesoryjefecrm= new DaoClienteAsesoryJefeCRMImpl(); 
              
                
                 List<ClienteCRM> listClienteCRM =clienteasesoryjefecrm.clienteasesoryjefecrmQry(idclie,asesor);     
                
                 
              

        json= gson.toJson(listClienteCRM);
        System.out.println("listClienteCRM");   
        System.out.println(json); 
   
    }    
}
