
package com.test;

import com.apis.impl.MovimientoCashImpl;
import java.io.IOException;
import org.jdom2.JDOMException;


public class pruebaMovimientoCashJson {

    public static void main(String[] args) throws IOException, JDOMException  {
         // TODO code application logic here
        

//        String cadena=null;
       
        
        MovimientoCashImpl movimientocash = new MovimientoCashImpl();
        String CustomerNo="10626";
        String CashNo="1000106883";
        Integer numdias=300;
        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
        String cadena=movimientocash.ConsultaMovimientoCash(CustomerNo, CashNo,numdias);
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
// System.out.println("acá terminan la prueba : " + new Date());
            System.out.println(cadena);
       

        
        
    }
    
}
