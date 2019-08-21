
package com.test;

import com.apis.impl.TarjetaCreditoImpl;
import java.io.IOException;
import org.jdom2.JDOMException;


public class pruebaMovimientoTarjetaCreditoPorCantidadJson {

    public static void main(String[] args) throws IOException, JDOMException  {
        // TODO code application logic here
        

//        String cadena=null;
       
        
        TarjetaCreditoImpl tarjetacredito = new TarjetaCreditoImpl();
        String CustomerNo="12390";
        String fecpro="20190724";
        String verbloq="S";
        Integer numcant=100;
        
       
        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
        String cadena=tarjetacredito.ConsultaDetyMovTrajetaCreditoPorCantidad(CustomerNo, fecpro,verbloq, numcant);
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
// System.out.println("acá terminan la prueba : " + new Date());
            System.out.println(cadena);
       

        
        
    }
    
}
