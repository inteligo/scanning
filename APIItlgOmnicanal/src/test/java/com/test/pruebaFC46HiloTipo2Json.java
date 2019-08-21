
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.t24.services.FC46Tipo2;
import com.t24.services.impl.CWServiceTWS_Tipo2HiloImpl;
import com.t24.services.impl.FC46Tipo2Impl;
import com.t24.services.impl.InputCollectionTipo2Impl;
import com.t24.services.input.InputCollection;
import dto.t24.services.FC46_PPRDETS;
import java.util.ArrayList;
import java.util.List;

public class pruebaFC46HiloTipo2Json {

    public static void main(String[] args)    {

//            System.err.println("inihora: " + new Date());
            Gson gson =new GsonBuilder().serializeNulls().create();
            FC46Tipo2 fc46= new FC46Tipo2Impl();

            com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();  
            com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
            List  Lista= new ArrayList<String>();         
            List  ListaResult= new ArrayList<String>();   
            String json="";
            String resultado="";
          
            String CustomerNo="10361";   
            String PortfolioNo="10361-1";   

//            List<dto.sql.Moneda> listMonedas =null;
            List<FC46_PPRDETS> list = null;
            list = new ArrayList<>();

//            enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();        
//            enquiryInputCollection.setColumnName("CUSTOMER.ID");             
//            enquiryInputCollection.setCriteriaValue(CustomerNo);
//            enquiryInputCollection.setOperand(Constantes.TWS_OPERAND);        
//            Lista.add( enquiryInputCollection);         

//            enquiryInput.getEnquiryInputCollection().addAll(Lista);  
            
            InputCollection ic =new InputCollection();
            InputCollectionTipo2Impl icimpl=new InputCollectionTipo2Impl();

            ic.setSAMNO(PortfolioNo);
            enquiryInput=icimpl.Input(ic);

                                             
//            CWServiceListaMonedasHiloImpl servicio1 = new CWServiceListaMonedasHiloImpl();
            CWServiceTWS_Tipo2HiloImpl servicio2 = new CWServiceTWS_Tipo2HiloImpl(Constantes.INTEGRADOR_FC46,enquiryInput); 
                         
//            Thread hilo1 = servicio1;
//            hilo1.start();

             Thread hilo2 = servicio2;
            hilo2.start();

             while (hilo2.isAlive() )
                {
                     resultado=servicio2.getResult();             
//                      listMonedas=servicio1.getResult();                                                            
                }             
          
          
            List<FC46_PPRDETS> DepositosList=null;               
            DepositosList =fc46.PPRDETS(resultado,CustomerNo,PortfolioNo);  
                        
            json= gson.toJson(DepositosList);
            System.out.println("DepositosList");   
            System.out.println(json); 

        
        
//            System.err.println("finhora: " + new Date());                     
                
    }
    
}
