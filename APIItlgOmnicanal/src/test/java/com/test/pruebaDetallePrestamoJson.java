
package com.test;

import com.apis.impl.DetallePrestamoImpl;
import java.io.IOException;
import org.jdom2.JDOMException;

public class pruebaDetallePrestamoJson {

    public static void main(String[] args) throws IOException, JDOMException  {
        // TODO code application logic here
        

//        String cadena=null;
       
        
        DetallePrestamoImpl detalleprestamo = new DetallePrestamoImpl();
        String CustomerNo="10124";
        String PrestamoNo="1000071893 ";
        String IdPrestamo="AA180152HVKG";
        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
        String cadena=detalleprestamo.ConsultaDetallePrestamo(CustomerNo, PrestamoNo,IdPrestamo);
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
// System.out.println("acá terminan la prueba : " + new Date());
            System.out.println(cadena);
       

        
        
    }
    
}
