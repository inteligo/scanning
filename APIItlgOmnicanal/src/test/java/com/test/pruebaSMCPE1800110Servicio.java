
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.apis.impl.ClienteAsesorCRMImpl;
import com.t24.services.impl.CWServiceClienteCRMHiloImpl;

import dto.sql.ClienteCRM;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.jdom2.JDOMException;


public class pruebaSMCPE1800110Servicio {

    public static void main(String[] args) throws IOException, JDOMException  {
      
        
        
        URL urlForGetRequest = new URL("http://localhost:8084/APIItlgOmnicanal/api/SMCPE1800430");
        String readLine = null;
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        conection.setRequestProperty("idclie", "10032"); // set userId its a sample here
        conection.setRequestProperty("ctaori", "1000139846"); // set userId its a sample here
        conection.setRequestProperty("ctades", "1000113553"); // set userId its a sample here
        int responseCode = conection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(conection.getInputStream()));
        StringBuffer response = new StringBuffer();
        while ((readLine = in .readLine()) != null) {
            response.append(readLine);
        } in .close();
        // print result
        System.out.println("JSON String Result " + response.toString());
        //GetAndPost.POSTRequest(response.toString());
        } else {
        System.out.println("GET NOT WORKED");
        }

    }    
}
