
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.t24.services.FC14Tipo2;
import com.t24.services.impl.CWServiceListaMonedasHiloImpl;
import com.t24.services.impl.CWServiceTWS_Tipo2HiloImpl;
import com.t24.services.impl.FC14Tipo2Impl;
import com.t24.services.impl.InputCollectionTipo2Impl;
import com.t24.services.input.InputCollection;
import dto.t24.services.FC14_PORTFOLIOLIST;
import java.util.ArrayList;
import java.util.List;


public class pruebaFC14HiloTipo2Json {

    public static void main(String[] args)    {

//            System.err.println("inihora: " + new Date());
            Gson gson =new GsonBuilder().serializeNulls().create();
            FC14Tipo2 fc14= new FC14Tipo2Impl();

            com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();  
            com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
            List  Lista= new ArrayList<String>();         
            List  ListaResult= new ArrayList<String>();   
            String json="";
            String resultado="";

            String CustomerNo="100423";
            //           String PortfolioNo="10606-1";   

            List<dto.sql.Moneda> listMonedas =null;
            List<FC14_PORTFOLIOLIST> list = null;
            list = new ArrayList<>();

//            enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();        
//            enquiryInputCollection.setColumnName("CUSTOMER.ID");             
//            enquiryInputCollection.setCriteriaValue(CustomerNo);
//            enquiryInputCollection.setOperand(Constantes.TWS_OPERAND);        
//            Lista.add( enquiryInputCollection);         

//            enquiryInput.getEnquiryInputCollection().addAll(Lista);  
            
            InputCollection ic =new InputCollection();
            InputCollectionTipo2Impl icimpl=new InputCollectionTipo2Impl();

            ic.setCUSTOMERID(CustomerNo);
            enquiryInput=icimpl.Input(ic);

                                             
            CWServiceListaMonedasHiloImpl servicio1 = new CWServiceListaMonedasHiloImpl();
            CWServiceTWS_Tipo2HiloImpl servicio2 = new CWServiceTWS_Tipo2HiloImpl(Constantes.INTEGRADOR_FC14,enquiryInput); 
                         
            Thread hilo1 = servicio1;
            hilo1.start();

             Thread hilo2 = servicio2;
            hilo2.start();

             while (hilo1.isAlive() || hilo2.isAlive() )
                {
                     resultado=servicio2.getResult();             
                      listMonedas=servicio1.getResult();                                                            
                }             
          
          
            List<FC14_PORTFOLIOLIST> PortafolioList=null;               
            PortafolioList =fc14.PORTFOLIOLIST(resultado,CustomerNo);  
                        
            json= gson.toJson(PortafolioList);
            System.out.println("PortafolioList");   
            System.out.println(json); 

            json= gson.toJson(listMonedas);
            System.out.println("listMonedas");   
            System.out.println(json);   
        
//            System.err.println("finhora: " + new Date());                     
                
    }
    
}
