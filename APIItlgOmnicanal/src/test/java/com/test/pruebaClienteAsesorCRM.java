
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.apis.impl.ClienteAsesorCRMImpl;
import com.t24.services.impl.CWServiceClienteCRMHiloImpl;

import dto.sql.ClienteCRM;
import java.io.IOException;
import java.util.List;
import org.jdom2.JDOMException;


public class pruebaClienteAsesorCRM {

    public static void main(String[] args) throws IOException, JDOMException  {
    
        String str=null;
        String idclie="10030";
        
        ClienteAsesorCRMImpl clienteasesorcrm= new ClienteAsesorCRMImpl();       
      
        Gson gson =new GsonBuilder().serializeNulls().create();

        String json="";
        String strRespuesta =clienteasesorcrm.ConsultaClienteAsesorCRM(idclie);  

//        json= gson.toJson(listClienteCRM);
//        System.out.println("listClienteCRM");   
        System.out.println(strRespuesta); 
   
    }    
}
