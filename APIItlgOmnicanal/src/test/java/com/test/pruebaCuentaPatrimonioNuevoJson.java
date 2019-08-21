package com.test;

import com.apis.impl.CuentaPatrimonioNuevoImpl;
import java.util.Date;


public class pruebaCuentaPatrimonioNuevoJson {

    public static void main(String[] args)  {
        // TODO code application logic here
        
      
        CuentaPatrimonioNuevoImpl cuentapatrimonio = new CuentaPatrimonioNuevoImpl();
        String CustomerNo="11403";
        //10054
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
