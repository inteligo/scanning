
package com.test;

import com.apis.impl.CuentaClienteNuevoImpl;

public class pruebaCuentaClienteNuevoJson {

    public static void main(String[] args)   {
        // TODO code application logic here

//        String cadena=null;
       
        
        CuentaClienteNuevoImpl cuentacliente = new CuentaClienteNuevoImpl();
        String CustomerNo="12038";
        String Perfil="1";
        String TipoTransferencia="005";
        
//        jsonObjeto=fc01.FC01List2(CustomerNo);
        String cadena=cuentacliente.ConsultaCuentaCliente(CustomerNo,Perfil,TipoTransferencia);
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
// System.out.println("acá terminan la prueba : " + new Date());
            System.out.println(cadena);
       

        
        
    }
    
}
