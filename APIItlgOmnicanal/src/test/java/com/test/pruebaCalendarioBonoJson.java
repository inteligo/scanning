package com.test;

import com.apis.impl.CalendarioBonoImpl;


public class pruebaCalendarioBonoJson {

    public static void main(String[] args)  {
        
        CalendarioBonoImpl calendariobono = new CalendarioBonoImpl();
        String CustomerNo="12246";
        String codpor="12246-1";
        String codpro="000400-0070";
        Double monto=862.5;
        
        String cadena=calendariobono.ConsultaCalendarioBono(CustomerNo, codpor,codpro,monto);

        System.out.println(cadena);
    }
    
}
