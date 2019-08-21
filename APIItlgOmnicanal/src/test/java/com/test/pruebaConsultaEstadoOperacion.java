
package com.test;


import com.apis.impl.EstadoOperacionImpl;
import java.io.IOException;
import org.xml.sax.SAXException;

public class pruebaConsultaEstadoOperacion {

    public static void main(String[] args) throws SAXException, IOException   {
        // TODO code application logic here
        
        String str= null;
        
        EstadoOperacionImpl consultaestadooperacion= new EstadoOperacionImpl();   
        
        
   
String guid="7699511c-1224-4b0d-b3ea-7647faa33c11";

String strRespuesta =consultaestadooperacion.EstadoOperacion( guid);            
        

         System.out.println("strRespuesta: ");     
        System.out.println(strRespuesta);     
        

        


        
    }
    
}
