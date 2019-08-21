
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.t24.services.AccountDetails360;
import com.t24.services.impl.CWServiceListaMonedasHiloImpl;
import com.t24.services.impl.AccountDetails360Impl;
import com.t24.services.impl.CWServiceTWS360HiloImpl;
import com.t24.services.impl.InputCollection360Impl;
import com.t24.services.input.InputCollection;
import dto.t24.services.ACCOUNTDETAILS;
import java.util.ArrayList;
import java.util.List;


public class pruebaAccountDetails360Json {

    public static void main(String[] args)    {

//            System.err.println("inihora: " + new Date());
            Gson gson =new GsonBuilder().serializeNulls().create();
            AccountDetails360 fc48= new AccountDetails360Impl();

            com.tws360.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws360.wsdl.EnquiryInputCollection();  
            com.tws360.wsdl.EnquiryInput enquiryInput=new com.tws360.wsdl.EnquiryInput();
            List  Lista= new ArrayList<String>();         
            List  ListaResult= new ArrayList<String>();   
            String json="";
            String resultado="";

           String CustomerNo="101731";
     

            List<dto.sql.Moneda> listMonedas =null;
            List<ACCOUNTDETAILS> list = null;
            list = new ArrayList<>();

//            enquiryInputCollection=new com.tws360.wsdl.EnquiryInputCollection();        
//            enquiryInputCollection.setColumnName("CUSTOMER.ID");             
//            enquiryInputCollection.setCriteriaValue(CustomerNo);
//            enquiryInputCollection.setOperand(Constantes.TWS_OPERAND);        
//            Lista.add( enquiryInputCollection);         

//            enquiryInput.getEnquiryInputCollection().addAll(Lista);  
            
            InputCollection ic =new InputCollection();
            InputCollection360Impl icimpl=new InputCollection360Impl();

            ic.setCUSTOMERID(CustomerNo);
            enquiryInput=icimpl.Input(ic);
         
                     
            CWServiceListaMonedasHiloImpl servicio1 = new CWServiceListaMonedasHiloImpl();
            CWServiceTWS360HiloImpl servicio2 = new CWServiceTWS360HiloImpl(Constantes.TMNV360ACCOUNTDETAILS,enquiryInput); 
            
              json= gson.toJson(enquiryInput);
            System.out.println("enquiryInput");   
            System.out.println(json); 
                         
            Thread hilo1 = servicio1;
            hilo1.start();

             Thread hilo2 = servicio2;
            hilo2.start();

             while (hilo1.isAlive() || hilo2.isAlive() )
                {
                     resultado=servicio2.getResult();             
                      listMonedas=servicio1.getResult();                                                            
                }             
          
          
            List<ACCOUNTDETAILS> AccountDetailsList=null;               
            AccountDetailsList =fc48.ACCOUNTDETAILS(resultado,CustomerNo,listMonedas);  
                        
            json= gson.toJson(AccountDetailsList);
            System.out.println("AccountDetailsList");   
            System.out.println(json); 

//            json= gson.toJson(listMonedas);
//            System.out.println("listMonedas");   
//            System.out.println(json);   
        
//            System.err.println("finhora: " + new Date());                     
                
    }
    
}
