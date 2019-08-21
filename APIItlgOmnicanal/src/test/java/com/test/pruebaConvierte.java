
package com.test;

import com.java.Convierte;
import com.java.Formatea;
import com.java.OperacionesFecha;
import java.text.SimpleDateFormat;
import java.util.Date;


public class pruebaConvierte {

    public static void main(String[] args) throws NullPointerException  {

        String numero=null;
        Double numerodou =null;
        
        String fechastr=null;
        String datefechastr=null;
        
        numero="-123,34.5645478";
        fechastr="20181107";
        
        numerodou=2.56;
        System.out.println(Formatea.Redondear(numerodou,2));
        
        numerodou=((Double) Convierte.NumStringaDouble(numero));
        System.out.println(Formatea.Redondear(numerodou,3));
        numerodou=((Double) Convierte.absDouble(numerodou));
        System.out.println(Formatea.Redondear(numerodou,4));
        datefechastr=(Convierte.FecStraDateStr("" ));
        

        Date ahora = new Date();
        Integer numdias = 1;
        
          
        System.out.println("ultpag: "+Convierte.DatetoStr(fechastr));  
        
        SimpleDateFormat formateador = new SimpleDateFormat("hhmmssSSS");
        
        System.out.println(Formatea.Redondear(numerodou,5));

        System.out.println( formateador.format(ahora));
        
        System.out.println( OperacionesFecha.RestarDias(ahora, numdias));
        
 
        System.out.println(numerodou);
        System.out.println(datefechastr);
        
         System.out.println("FechaHoy: " +  OperacionesFecha.intFechaHoy());
         
         System.out.println("signcondition: " +  Convierte.CondicionFirma("grupo b","1A@***PARA CIERRE DE CTA.COORDINARýCON LEGAL@2B"));
         
         System.out.println("Enmascara: " +  ("VICTOR MANUEL ROJAS FERNANDEZ"));
         System.out.println("Enmascara: " +  Convierte.EnmascaraNombreTodo("VICTOR MANUEL ROJAS FERNANDEZ",1,3));
          System.out.println("Enmascara: " +  Convierte.EnmascaraNombre("VICTOR MANUEL ROJAS FERNANDEZ",1,3));
         
         
         
       

        
        
        
        
    }
    
}
