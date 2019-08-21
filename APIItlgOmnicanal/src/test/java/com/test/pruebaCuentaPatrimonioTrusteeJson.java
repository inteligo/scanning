package com.test;

import com.apis.impl.CuentaPatrimonioTrusteeImpl;
import java.util.Date;


public class pruebaCuentaPatrimonioTrusteeJson {

    public static void main(String[] args)  {
        // TODO code application logic here
        
      
        CuentaPatrimonioTrusteeImpl cuentapatrimonio = new CuentaPatrimonioTrusteeImpl();
        String CustomerNo="11403";
        //11403
        //100423
        
        
        

        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
        String cadena=cuentapatrimonio.ConsultaCuentasPatrimonio(CustomerNo);
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
 System.out.println("acá terminan la prueba : " + new Date());
            System.out.println(cadena);
       
        
        
    }
    
}
