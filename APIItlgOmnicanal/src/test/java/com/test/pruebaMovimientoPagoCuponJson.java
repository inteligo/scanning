
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.apis.impl.MovimientoPagoCuponImpl;
import dao.sql.DaoPagoCupon;
import dao.sql.impl.DaoPagoCuponImpl;
import dto.sql.PagoCupon;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jdom2.JDOMException;


public class pruebaMovimientoPagoCuponJson {

    public static void main(String[] args) throws IOException, JDOMException  {
        // TODO code application logic here
        
        Gson gson =new GsonBuilder().serializeNulls().create();     
        String json="";
       
        
        DaoPagoCupon pagocupon = new DaoPagoCuponImpl();
        String fechaini="20190101";
        String fechafin="20190112";
        
            MovimientoPagoCuponImpl movimientopagocupon = new MovimientoPagoCuponImpl();
    
        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
        String cadena=movimientopagocupon.ConsultaPagoCupon(fechaini, fechafin);
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
        System.out.println("acá terminan la prueba : " );
        System.out.println(cadena);
       

        
        
    }
    
}
