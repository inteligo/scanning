
package com.test;

import com.apis.impl.ListaDepositoyMovimientoImpl;
import java.io.IOException;
import org.jdom2.JDOMException;


public class pruebaListaDepositoyMovimientoJson {

    public static void main(String[] args) throws IOException, JDOMException  {
        // TODO code application logic here
        

//        String cadena=null;
       
        
        ListaDepositoyMovimientoImpl listadepositoymovimiento = new ListaDepositoyMovimientoImpl();
        String CustomerNo="10125";
        String DepositoNo="MM1715700007";
        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
        String cadena=listadepositoymovimiento.ListaDepositoyMovimiento(CustomerNo, DepositoNo);
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
// System.out.println("acá terminan la prueba : " + new Date());
            System.out.println(cadena);
       

        
        
    }
    
}
