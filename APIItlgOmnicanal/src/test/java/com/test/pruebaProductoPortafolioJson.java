
package com.test;


import com.apis.impl.ProductoPortafolioImpl;
import java.io.IOException;
import java.util.Date;
import org.jdom2.JDOMException;


public class pruebaProductoPortafolioJson {

    public static void main(String[] args) throws IOException, JDOMException  {
        // TODO code application logic here
              
        ProductoPortafolioImpl productoportafolio = new ProductoPortafolioImpl();
        String CustomerNo="10153";
        String PortfolioNo="10153-1";
        String Product="000600-8780";
                

        System.out.println("acá inician la prueba : " + new Date());        

        String cadena=productoportafolio.ConsultaProductoPortafolio(CustomerNo,PortfolioNo,Product);

        System.out.println(cadena);
        System.out.println("acá terminan la prueba : " + new Date());

        
        
    }
    
}
