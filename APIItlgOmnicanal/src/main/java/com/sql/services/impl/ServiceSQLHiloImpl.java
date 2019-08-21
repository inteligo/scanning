package com.sql.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class ServiceSQLHiloImpl extends Thread  {  
        private String SP="";
        private List result = new ArrayList<>();          
        private List list = new ArrayList<>();           
//        private  List<dto.sql.Moneda> result=null; 
      
        private DaoListaMoneda lista= new DaoListaMonedaImpl(); 
        private static final Logger LOG = LogManager.getLogger(ServiceSQLHiloImpl.class);
        
         Gson gson =new GsonBuilder().serializeNulls().create();
         String json="";

        
	
        public ServiceSQLHiloImpl(String SP)  {   
              this.SP=SP;
              result = new ArrayList<>();                             
	}
        
        @Override
        public void run()
                {        
                        try 
                        {    
                            
                            
                            switch (SP){ 

                            case Constantes.INTEGRADOR_FC10:

                                List<dto.sql.Moneda> listMoneda =lista.listamonedaQry();                             
                                list=listMoneda;
                                 break;
                             default:
                                     break;   
                        }    

                                 result=list;    
                                      

                                System.err.println("###########Calling Servicio CWServiceListaMonedasHiloImpl  ##################  hora: " + new Date() );          
                        } catch (Exception  e) 
                           {
                                LOG.error( "ERROR: " + e.getMessage()); 
                                System.out.println("Error CWServiceListaMonedasHiloImpl: " + e.getMessage());    

                            }
                }
        
        public List getResult()
            {
                List resultado = new ArrayList<>();        
//                    List<dto.sql.Moneda> resultado=null; 
                    
                    try {
                            resultado= list;
                         } catch (NullPointerException e)
                        {
                            LOG.error( "ERROR: " + e.getMessage()); 
                            System.out.println("resultado CWServiceListaMonedasHiloImpl: " + e.getMessage());
//                            e.printStackTrace();


                        } catch (Exception  e) {
                            LOG.error( "ERROR: " + e.getMessage()); 
                            System.out.println("resultado CWServiceListaMonedasHiloImpl: " + e.getMessage());
//                            e.printStackTrace();

                        }
                    return resultado;
             } 
}