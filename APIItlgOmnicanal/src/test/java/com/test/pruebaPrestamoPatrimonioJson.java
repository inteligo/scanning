
package com.test;

import com.apis.impl.PrestamoPatrimonio52Impl;
import com.apis.impl.PrestamoPatrimonioImpl;
import java.io.IOException;
import java.util.Date;

import org.jdom2.JDOMException;


public class pruebaPrestamoPatrimonioJson {

    public static void main(String[] args) throws IOException, JDOMException  {
        // TODO code application logic here
        
      
        PrestamoPatrimonioImpl prestamopatrimonio = new PrestamoPatrimonioImpl();
        String CustomerNo="10125";   
        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
        String cadena=prestamopatrimonio.ConsultaPrestamoPatrimonio(CustomerNo);
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
        System.out.println("acá terminan la prueba : " + new Date());
        System.out.println(cadena);
       
        
        
    }
    
}
