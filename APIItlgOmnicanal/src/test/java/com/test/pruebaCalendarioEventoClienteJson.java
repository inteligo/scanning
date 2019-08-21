package com.test;
import com.apis.impl.CalendarioEventoClienteImpl;

public class pruebaCalendarioEventoClienteJson {
    public static void main(String[] args)  {
        
        CalendarioEventoClienteImpl calendarioeventocliente = new CalendarioEventoClienteImpl();
        String CustomerNo="10360";
        String TipoMov="A";    
        Integer Anio=null;
        Integer Mes=null;        
        String Estitu="T";      

        String cadena=calendarioeventocliente.ConsultaCalendarioEventoCliente(CustomerNo,TipoMov, Anio, Mes, Estitu);

        System.out.println(cadena);        
    }    
}
