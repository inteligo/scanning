
package com.test;

import com.apis.impl.DetallePortafolioImpl;
import org.json.simple.JSONObject;

public class pruebaDetallePortafolioJson {

    public static void main(String[] args)  {
        // TODO code application logic here
        
        JSONObject jsonObjeto =new JSONObject();
//        String cadena=null;
       
        
        DetallePortafolioImpl detalleportafolio = new DetallePortafolioImpl();
        String CustomerNo="100423";
        String PortafolioNo="100423-1";
        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
        String cadena=detalleportafolio.ConsultaDetallePortafolio(CustomerNo, PortafolioNo);
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
// System.out.println("acá terminan la prueba : " + new Date());
           System.out.println(cadena);
       

        
        
    }
    
}
