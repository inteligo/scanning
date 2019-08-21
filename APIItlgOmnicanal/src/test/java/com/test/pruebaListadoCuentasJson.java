
package com.test;

import com.apis.impl.ListadoCuentasImpl;


public class pruebaListadoCuentasJson {

    public static void main(String[] args)   {
        // TODO code application logic here

//        String cadena=null;
       
        
        ListadoCuentasImpl listadocuentas = new ListadoCuentasImpl();
        
        String CustomerNo="10891";
       
        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
        String cadena=listadocuentas.ListadoCuentas(CustomerNo);
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
// System.out.println("acá terminan la prueba : " + new Date());
            System.out.println(cadena);
       

        
        
    }
    
}
