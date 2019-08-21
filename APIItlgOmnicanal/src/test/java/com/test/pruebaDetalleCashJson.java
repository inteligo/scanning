
package com.test;

import com.apis.impl.DetalleCashImpl;

public class pruebaDetalleCashJson {

    public static void main(String[] args)   {
        // TODO code application logic here

//        String cadena=null;
       
        
        DetalleCashImpl detalledeposito = new DetalleCashImpl();
        String CustomerNo="11749";
        String CashNo="1000016442";
        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
        String cadena=detalledeposito.ConsultaDetalleCash(CustomerNo, CashNo);
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
// System.out.println("acá terminan la prueba : " + new Date());
            System.out.println(cadena);
       

        
        
    }
    
}
