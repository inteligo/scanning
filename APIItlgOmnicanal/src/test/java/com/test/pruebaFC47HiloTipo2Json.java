
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.t24.services.FC47Tipo2;
import com.t24.services.impl.CWServiceTWS_Tipo2HiloImpl;
import com.t24.services.impl.FC47Tipo2Impl;
import com.t24.services.impl.InputCollectionTipo2Impl;
import com.t24.services.input.InputCollection;
import dto.t24.services.FC47_AASCH;
import java.util.ArrayList;
import java.util.List;


public class pruebaFC47HiloTipo2Json {

    public static void main(String[] args)    {

//            System.err.println("inihora: " + new Date());
            Gson gson =new GsonBuilder().serializeNulls().create();
            FC47Tipo2 fc47= new FC47Tipo2Impl();

            com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();  
            com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
            List  Lista= new ArrayList<String>();         
            List  ListaResult= new ArrayList<String>();   
            String json="";
            String resultado="";

            String CustomerNo="10124";
             String ArrangementId="AA180152HVKG";
            //           String PortfolioNo="10606-1";   

//            List<dto.sql.Moneda> listMonedas =null;
            List<FC47_AASCH> list = null;
            list = new ArrayList<>();

//            enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();        
//            enquiryInputCollection.setColumnName("CUSTOMER.ID");             
//            enquiryInputCollection.setCriteriaValue(CustomerNo);
//            enquiryInputCollection.setOperand(Constantes.TWS_OPERAND);        
//            Lista.add( enquiryInputCollection);         

//            enquiryInput.getEnquiryInputCollection().addAll(Lista);  
            
            InputCollection ic =new InputCollection();
            InputCollectionTipo2Impl icimpl=new InputCollectionTipo2Impl();

            ic.setARRANGEMENTID(ArrangementId);
            enquiryInput=icimpl.Input(ic);

                                             
//            CWServiceListaMonedasHiloImpl servicio1 = new CWServiceListaMonedasHiloImpl();
            CWServiceTWS_Tipo2HiloImpl servicio2 = new CWServiceTWS_Tipo2HiloImpl(Constantes.INTEGRADOR_FC47,enquiryInput); 
                         
//            Thread hilo1 = servicio1;
//            hilo1.start();

             Thread hilo2 = servicio2;
            hilo2.start();

             while (hilo2.isAlive() )
                {
                     resultado=servicio2.getResult();             
//                      listMonedas=servicio1.getResult();                                                            
                }             
          
          
            List<FC47_AASCH> DepositosList=null;               
            DepositosList =fc47.AASCH(resultado,CustomerNo);  
                        
            json= gson.toJson(DepositosList);
            System.out.println("DepositosList");   
            System.out.println(json); 

        
        
//            System.err.println("finhora: " + new Date());                     
                
    }
    
}
