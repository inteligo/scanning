package com.test;

import com.apis.impl.CalendarioEventoImpl;

public class pruebaCalendarioEventoJson {

    public static void main(String[] args)  {
        
        CalendarioEventoImpl calendarioevento = new CalendarioEventoImpl();
        String CustomerNo="102160";
        String TipoMov=null;        

        String cadena=calendarioevento.ConsultaCalendarioEvento(CustomerNo,TipoMov);

        System.out.println(cadena);        
    }    
}
