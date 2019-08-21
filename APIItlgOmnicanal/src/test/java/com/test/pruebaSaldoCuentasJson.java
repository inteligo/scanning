
package com.test;

import com.apis.impl.SaldoCuentasImpl;


public class pruebaSaldoCuentasJson {

    public static void main(String[] args)   {
        // TODO code application logic here

//        String cadena=null;
       
        
        SaldoCuentasImpl saldocuentas = new SaldoCuentasImpl();
        
        String CustomerNo="101290";
        String ctaori="1000044632";
        String ctades="1000064517";
        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
        String cadena=saldocuentas.ConsultaSaldoCuentas(CustomerNo,ctaori,ctades);
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
// System.out.println("acá terminan la prueba : " + new Date());
            System.out.println(cadena);
       

        
        
    }
    
}
