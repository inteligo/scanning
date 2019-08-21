package com.test;

import com.apis.impl.CalendarioPrestamoImpl;



public class pruebaCalendarioPrestamoJson {

    public static void main(String[] args)  {
       
        
        CalendarioPrestamoImpl calendarioprestamo = new CalendarioPrestamoImpl();
        String CustomerNo="12246";
        String ID="AA16298SS1XS";
        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
        String cadena=calendarioprestamo.ConsultaCalendarioPrestamo(CustomerNo, ID);
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
// System.out.println("acá terminan la prueba : " + new Date());
            System.out.println(cadena);
       

        
        
    }
    
}
