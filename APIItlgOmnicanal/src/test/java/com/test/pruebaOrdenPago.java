
package com.test;

import com.java.GeneraUUID;
import com.apis.impl.OrdenPagoInterbankImpl;
import java.io.IOException;
import org.xml.sax.SAXException;

public class pruebaOrdenPago {

    public static void main(String[] args) throws SAXException, IOException   {
        // TODO code application logic here
        
        String str= null;
        
        
        OrdenPagoInterbankImpl  tcp = new OrdenPagoInterbankImpl();
        String guid=GeneraUUID.CodigoUUID();
        String canal="OC";
        String idclie="13604";
        String tipodoc="DNI";      
        String nrodoc="10266083";
        String ctaori="1000020997";
        String monori="USD";                   
        String monto="30.28";
        String fectra="02-03-2018";
        String flgtit="1";
        String flgter="0";        
        String nomben="GIANINA";
        String apeben="GOTUZZO OLIVA";
        String refer="";        
        String tipotra="005";
        
      
        
     
        
        str=tcp.OrdenPagoInterbank(guid, canal,idclie, tipodoc,nrodoc,ctaori,monori,monto,fectra,flgtit,flgter,nomben,apeben,refer,tipotra);
       
        
//        Gson gson =new GsonBuilder().serializeNulls().create();
//               
//        String json="";
//        json= gson.toJson(str);
        System.out.println("rpta");   
        System.out.println(str); 

        
    }
    
}
