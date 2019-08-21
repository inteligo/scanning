
package com.test;


import com.bzgws.services.impl.ConsumingServiceBzgWSImpl;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import org.xml.sax.SAXException;

public class pruebaBzgWSRespuesta {

    public static void main(String[] args) throws SAXException, IOException   {
        // TODO code application logic here
        
        String str= null;
        
        
        ConsumingServiceBzgWSImpl  tcp = new ConsumingServiceBzgWSImpl();
//        String guid=GeneraUUID.CodigoUUID();
//        String canal="";
//        String idclie="13604";
//        String tipotra="001";
//        
//        String ctaori="1000021004";
//        String tictaori="2";
//        String monori="USD";
//        String ctades="1000020997";
//        String tictades="1";
//        
//        String mondes="USD";
//        String monto="15.00";
//        String fectra="20-04-2018";
//        String flgtit="1";
//        String flgter="0";

//String guid=GeneraUUID.CodigoUUID();
String guid="7699511c-1224-4b0d-b3ea-7647faa33c11";
        
//   str=tcp.BzgRespuesta("Respuesta: ");
        str=tcp.getEntitiesUsingSchemaAsString(guid);
         System.out.println("Respuesta: ");     
        System.out.println(str);     
        
        Gson gson =new GsonBuilder().serializeNulls().create();
        
//         BzgRespuestaTransferenciaImpl transferenciacuentasinteligo = new BzgRespuestaTransferenciaImpl();
        
//        List<TransferenciaOC> list = null;
//        list = new ArrayList<>();
//        
//        list=tcp.tblTransferenciaOCList(str);
//        
//        String json="";
//        json= gson.toJson(list);
//        System.out.println("list");   
//        System.out.println(json); 

        
    }
    
}
