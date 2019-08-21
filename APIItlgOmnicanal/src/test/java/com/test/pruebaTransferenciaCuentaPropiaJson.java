
package com.test;

import com.java.GeneraUUID;
import com.apis.impl.TransferenciaCuentaPropiaImpl;
import java.io.IOException;
import org.xml.sax.SAXException;

public class pruebaTransferenciaCuentaPropiaJson {

    public static void main(String[] args) throws SAXException, IOException   {
        // TODO code application logic here
        
        String str= null;
        
        
        TransferenciaCuentaPropiaImpl  tcp = new TransferenciaCuentaPropiaImpl();
        String guid=GeneraUUID.CodigoUUID();
        String canal="OC";
        String idclie="10032";
        String tipotra="001";
        
        String ctaori="1000113553";
        String tictaori="1";
        String monori="USD";
        String ctades="1000102454";
        String tictades="1";
        
        String mondes="USD";
        String monto="30";
        String fectra="15-04-2019";
        String flgtit="0";
        String flgter="1";
        
        str=tcp.TransferenciaCuentaPropia(guid, canal,idclie, tipotra, ctaori, tictaori, monori, ctades, tictades, mondes, monto, fectra, flgtit, flgter);
       
        
//        Gson gson =new GsonBuilder().serializeNulls().create();
//               
//        String json="";
//        json= gson.toJson(str);
        System.out.println("rpta");   
        System.out.println(str); 

        
    }
    
}
