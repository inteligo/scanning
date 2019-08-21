package com.test;

import java.io.BufferedInputStream;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class pruebaServletCalculaEncuestaJson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
////        String line;
////        try 
////        { 
////
////            URL url = new URL("http://localhost:8084/Laboratorio30_profe/Listado?Tipo=1");
////            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream())); 
////            line = in.readLine(); 
////            System.out.println( line ); 
////            in.close(); 
////        }
////        catch (Exception e)
////        { 
////            System.out.println("Hello Project::"+e.getMessage());
////        } 


sendReq();

    }

    public static void sendReq() {
        String urlString = "http://localhost:8084/PerfiladorSAB/CalculaEncuestaJson?idencuesta=9";

        String respXml = "";

        URL url = null;

        HttpURLConnection urlConnection = null;
        OutputStreamWriter out = null;
        BufferedInputStream inputStream = null;
        try {
//            System.out.println("URL:"+urlString);
            url = new URL(urlString);
            urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.setDoInput(true);
            urlConnection.setDoOutput(true);
            urlConnection.setRequestMethod("POST");
//            System.out.println("SendindData");
            out = new OutputStreamWriter(urlConnection.getOutputStream());
//            System.out.println("Out:"+out);
            out.write(respXml);
            out.flush();
            inputStream = new BufferedInputStream(urlConnection.getInputStream());
            int character = -1;
            StringBuffer sb = new StringBuffer();
            while ((character = inputStream.read()) != -1) {
                sb.append((char) character);
            }
            System.out.println("Resp:"+sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }




    } 
        
    
}
