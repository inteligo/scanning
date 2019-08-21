
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.t24.services.FC48Tipo2;
import com.t24.services.impl.CWServiceListaMonedasHiloImpl;
import com.t24.services.impl.CWServiceTWS_Tipo2HiloImpl;
import com.t24.services.impl.FC48Tipo2Impl;
import com.t24.services.impl.InputCollectionTipo2Impl;
import com.t24.services.input.InputCollection;
import dto.t24.services.FC48_STMTDETS;
import java.util.ArrayList;
import java.util.List;


public class pruebaFC48HiloTipo2Json {

    public static void main(String[] args)    {

//            System.err.println("inihora: " + new Date());
            Gson gson =new GsonBuilder().serializeNulls().create();
            FC48Tipo2 fc48= new FC48Tipo2Impl();

            com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();  
            com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
            List  Lista= new ArrayList<String>();         
            List  ListaResult= new ArrayList<String>();   
            String json="";
            String resultado="";

           String CustomerNo="10626";
            String Cuenta="1000106883 ";
            String Fecha="20180901 20180928";

            List<dto.sql.Moneda> listMonedas =null;
            List<FC48_STMTDETS> list = null;
            list = new ArrayList<>();

//            enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();        
//            enquiryInputCollection.setColumnName("CUSTOMER.ID");             
//            enquiryInputCollection.setCriteriaValue(CustomerNo);
//            enquiryInputCollection.setOperand(Constantes.TWS_OPERAND);        
//            Lista.add( enquiryInputCollection);         

//            enquiryInput.getEnquiryInputCollection().addAll(Lista);  
            
            InputCollection ic =new InputCollection();
            InputCollectionTipo2Impl icimpl=new InputCollectionTipo2Impl();

            ic.setACCOUNT(Cuenta);
            enquiryInput=icimpl.Input(ic);

            InputCollection ic1 =new InputCollection();             
            ic1.setBOOKINGDATE(Fecha);

            enquiryInput=icimpl.Input(ic1);

                                             
            CWServiceListaMonedasHiloImpl servicio1 = new CWServiceListaMonedasHiloImpl();
            CWServiceTWS_Tipo2HiloImpl servicio2 = new CWServiceTWS_Tipo2HiloImpl(Constantes.INTEGRADOR_FC48,enquiryInput); 
            
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
          
          
            List<FC48_STMTDETS> DepositosList=null;               
            DepositosList =fc48.STMTDETS(resultado,CustomerNo,listMonedas);  
                        
            json= gson.toJson(DepositosList);
            System.out.println("DepositosList");   
            System.out.println(json); 

//            json= gson.toJson(listMonedas);
//            System.out.println("listMonedas");   
//            System.out.println(json);   
        
//            System.err.println("finhora: " + new Date());                     
                
    }
    
}
