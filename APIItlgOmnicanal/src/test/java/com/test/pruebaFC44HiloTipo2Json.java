
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.t24.services.FC44Tipo2;
import com.t24.services.impl.CWServiceListaMonedasHiloImpl;
import com.t24.services.impl.CWServiceTWS_Tipo2HiloImpl;
import com.t24.services.impl.FC44Tipo2Impl;
import com.t24.services.impl.InputCollectionTipo2Impl;
import com.t24.services.input.InputCollection;
import dto.t24.services.FC44_DEPODETS;
import java.util.ArrayList;
import java.util.List;


public class pruebaFC44HiloTipo2Json {

    public static void main(String[] args)    {

//            System.err.println("inihora: " + new Date());
            Gson gson =new GsonBuilder().serializeNulls().create();
            FC44Tipo2 fc44= new FC44Tipo2Impl();

            com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();  
            com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
            List  Lista= new ArrayList<>();         
            List  ListaResult= new ArrayList<>();   
            String json="";
            String resultado="";

            String CustomerNo="11749";
            //           String PortfolioNo="10606-1";   

            List<dto.sql.Moneda> listMonedas =null;
            List<FC44_DEPODETS> list = null;
            list = new ArrayList<>();

            
            InputCollection ic =new InputCollection();
            InputCollectionTipo2Impl icimpl=new InputCollectionTipo2Impl();

            ic.setCUSTOMERID(CustomerNo);
            enquiryInput=icimpl.Input(ic);

                                             
            CWServiceListaMonedasHiloImpl servicio1 = new CWServiceListaMonedasHiloImpl();
            CWServiceTWS_Tipo2HiloImpl servicio2 = new CWServiceTWS_Tipo2HiloImpl(Constantes.INTEGRADOR_FC44,enquiryInput); 
                         
            Thread hilo1 = servicio1;
            hilo1.start();

             Thread hilo2 = servicio2;
            hilo2.start();

             while (hilo1.isAlive() || hilo2.isAlive() )
                {
                     resultado=servicio2.getResult();             
                      listMonedas=servicio1.getResult();                                                            
                }             
          
          
            List<FC44_DEPODETS> DepositosList=null;               
            DepositosList =fc44.DEPODETS(resultado,CustomerNo,listMonedas);  
                        
            json= gson.toJson(DepositosList);
            System.out.println("DepositosList");   
            System.out.println(json); 

            json= gson.toJson(listMonedas);
            System.out.println("listMonedas");   
            System.out.println(json);   
        
//            System.err.println("finhora: " + new Date());                     
                
    }
    
}
