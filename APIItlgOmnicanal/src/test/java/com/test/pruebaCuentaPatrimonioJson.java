package com.test;

import com.apis.impl.CuentaPatrimonioImpl;
import java.util.Date;


public class pruebaCuentaPatrimonioJson {

    public static void main(String[] args)  {
        // TODO code application logic here
        
      
        CuentaPatrimonioImpl cuentapatrimonio = new CuentaPatrimonioImpl();
        String CustomerNo="10124";
        //11337
        //14086
        //10032
        //11337
        

        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
        String cadena=cuentapatrimonio.ConsultaCuentasPatrimonio(CustomerNo);
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
 System.out.println("acá terminan la prueba : " + new Date());
            System.out.println(cadena);
       
        
        
    }
    
}
