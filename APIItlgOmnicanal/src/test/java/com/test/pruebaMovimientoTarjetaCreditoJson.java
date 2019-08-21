
package com.test;

import com.apis.impl.TarjetaCreditoImpl;
import java.io.IOException;
import org.jdom2.JDOMException;


public class pruebaMovimientoTarjetaCreditoJson {

    public static void main(String[] args) throws IOException, JDOMException  {
        // TODO code application logic here
        

//        String cadena=null;
       
        
        TarjetaCreditoImpl movimientotarjetacredito = new TarjetaCreditoImpl();
        String CustomerNo="10124";
        String fecpro="20190515";
        String verbloq="S";
        
       
        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
        String cadena=movimientotarjetacredito.ConsultaDetyMovTrajetaCredito(CustomerNo, fecpro,verbloq);
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
// System.out.println("acá terminan la prueba : " + new Date());
            System.out.println(cadena);
       

        
        
    }
    
}
