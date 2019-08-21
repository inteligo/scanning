
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.t24.services.FC53Tipo1;
import com.t24.services.impl.CWServiceListaMonedasHiloImpl;
import com.t24.services.impl.CWServiceTWS_Tipo1HiloImpl;
import com.t24.services.impl.FC53Tipo1Impl;
import com.t24.services.impl.InputCollectionTipo1Impl;
import com.t24.services.input.InputCollection;
import dto.t24.services.FCCuentaFirma;
import dto.t24.services.FCTotalPortafolio;
import java.util.List;



public class pruebaFC53HiloTipo1Json {

    public static void main(String[] args)   {
            Gson gson =new GsonBuilder().serializeNulls().create();
            FC53Tipo1 fc53 = new FC53Tipo1Impl();
            com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();

            List<FCCuentaFirma> list = null;
            List<FCTotalPortafolio> lista = null;

            String json="";
            String resultado="";

            String CustomerNo="10152";

            List<dto.sql.Moneda> listMonedas =null;

            InputCollection ic =new InputCollection();
            InputCollectionTipo1Impl icimpl=new InputCollectionTipo1Impl();

            ic.setCUSTOMERID(CustomerNo);
            enquiryInput=icimpl.Input("functioncode;" +Constantes.INTEGRADOR_FC53 +"|CustomerNo;"+CustomerNo);

                                             
            CWServiceListaMonedasHiloImpl servicio1 = new CWServiceListaMonedasHiloImpl();
            CWServiceTWS_Tipo1HiloImpl servicio2 = new CWServiceTWS_Tipo1HiloImpl(enquiryInput); 
            
                         
            Thread hilo1 = servicio1;
            hilo1.start();

             Thread hilo2 = servicio2;
            hilo2.start();

             while (hilo1.isAlive() || hilo2.isAlive() )
                {
                     resultado=servicio2.getResult();             
                      listMonedas=servicio1.getResult();                                                            
                }             
          
              list= fc53.CuentayFirmaList(resultado, CustomerNo,listMonedas);
              
               lista= fc53.TotalPortafolio(resultado, CustomerNo,listMonedas);
          
                        
                json= gson.toJson(list);
                System.out.println("CuentayFirmaList");   
                System.out.println(json); 

                json= gson.toJson(lista);
                System.out.println("lista");   
                System.out.println(json);   

//            System.err.println("finhora: " + new Date());   
        
    }
    
}
