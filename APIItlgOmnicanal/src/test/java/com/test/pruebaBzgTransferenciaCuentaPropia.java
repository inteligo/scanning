
package com.test;

import com.bzg.services.impl.BzgRespuestaTransferenciaImpl;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.GeneraUUID;
import dto.bzg.services.TransferenciaOC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;

public class pruebaBzgTransferenciaCuentaPropia {

    public static void main(String[] args) throws SAXException, IOException   {
        // TODO code application logic here
        
        String str= null;
        
        
        BzgRespuestaTransferenciaImpl  tcp = new BzgRespuestaTransferenciaImpl();
        String guid=GeneraUUID.CodigoUUID();
        String canal="";
        String idclie="13604";
        String tipotra="001";
        
        String ctaori="1000021004";
        String tictaori="2";
        String monori="USD";
        String ctades="1000020997";
        String tictades="1";
        
        String mondes="USD";
        String monto="15.00";
        String fectra="20-04-2018";
        String flgtit="1";
        String flgter="0";
        
        str=tcp.BzgTransferenciaCuentaPropia(guid, canal,idclie, tipotra, ctaori, tictaori, monori, ctades, tictades, mondes, monto, fectra, flgtit, flgter);
         System.out.println(guid);
        System.out.println(str);     
        
        Gson gson =new GsonBuilder().serializeNulls().create();
        
//         BzgRespuestaTransferenciaImpl transferenciacuentasinteligo = new BzgRespuestaTransferenciaImpl();
        
        List<TransferenciaOC> list = null;
        list = new ArrayList<>();
        
        list=tcp.tblTransferenciaOCList(str);
        
        String json="";
        json= gson.toJson(list);
        System.out.println("list");   
        System.out.println(json); 

        
    }
    
}
