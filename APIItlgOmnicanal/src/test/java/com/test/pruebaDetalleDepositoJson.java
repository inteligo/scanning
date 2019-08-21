
package com.test;

import com.apis.impl.DetalleDepositoImpl;
import java.io.IOException;
import org.jdom2.JDOMException;


public class pruebaDetalleDepositoJson {

    public static void main(String[] args) throws IOException, JDOMException  {
        // TODO code application logic here
        

//        String cadena=null;
       
        
        DetalleDepositoImpl detalledeposito = new DetalleDepositoImpl();
        String CustomerNo="11531";
        String DepositoNo="MM1827500001";
        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
        String cadena=detalledeposito.ConsultaDetalleDeposito(CustomerNo, DepositoNo);
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
// System.out.println("acá terminan la prueba : " + new Date());
            System.out.println(cadena);
       

        
        
    }
    
}
