
package com.test;

import com.apis.impl.CuentaNombreClienteImpl;



public class pruebaCuentaNombreClienteJson {

    public static void main(String[] args)   {
        // TODO code application logic here

//        String cadena=null;
       
        
        CuentaNombreClienteImpl CuentaNombreCliente = new CuentaNombreClienteImpl();
        
        String AccountNo="1000119195";
       
        
//        jsonObjeto=fc01.FC01List2(AccountNo);
        String cadena=CuentaNombreCliente.DetalleCuenta(AccountNo);
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
// System.out.println("acá terminan la prueba : " + new Date());
            System.out.println(cadena);
       

        
        
    }
    
}
