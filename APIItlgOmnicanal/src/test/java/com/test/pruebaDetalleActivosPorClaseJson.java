
package com.test;


import com.apis.impl.DetalleActivosPorClaseImpl;
import com.apis.impl.ProductoPortafolioImpl;
import java.io.IOException;
import java.util.Date;
import org.jdom2.JDOMException;


public class pruebaDetalleActivosPorClaseJson {

    public static void main(String[] args) throws IOException, JDOMException  {
        // TODO code application logic here
              
        DetalleActivosPorClaseImpl detalleactivosporclase = new DetalleActivosPorClaseImpl();
        String CustomerNo="10026";
        String PortfolioNo="10026-1";
       
                

        System.out.println("acá inician la prueba : " + new Date());        

        String cadena=detalleactivosporclase.ConsultaDetalleActivosPorClase(CustomerNo,PortfolioNo);

        System.out.println(cadena);
        System.out.println("acá terminan la prueba : " + new Date());

        
        
    }
    
}
