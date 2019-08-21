package com.test;

import com.apis.impl.TarjetaCreditoImpl;
import java.io.IOException;
import org.jdom2.JDOMException;


public class pruebaDetalleTarjetaCreditoJson {

    public static void main(String[] args) throws IOException, JDOMException  {
        // TODO code application logic here
        
        TarjetaCreditoImpl detalletarjetacredito = new TarjetaCreditoImpl();
        String CustomerNo="10360";
        String fecpro="20190516";
        String verbloq="S";             

        String cadena=detalletarjetacredito.ConsultaDetalleTarjetaCredito(CustomerNo, fecpro,verbloq);

        System.out.println(cadena);           
        
    }
    
}
