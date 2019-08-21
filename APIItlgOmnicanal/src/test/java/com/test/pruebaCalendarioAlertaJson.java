package com.test;

import com.apis.impl.AlertaCalendarioImpl;


public class pruebaCalendarioAlertaJson {

    public static void main(String[] args)  {
        
        AlertaCalendarioImpl calendarioalerta = new AlertaCalendarioImpl();
        String fecpro="20180417";
        String tipoale="1";
        String numdias="60";
       
        
        String cadena=calendarioalerta.ConsultaCalendarioAlerta(fecpro,tipoale, numdias);

        System.out.println(cadena);
    }
    
}
