package com.t24.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class CWServiceSQLHiloImpl extends Thread  {  

        private List list = new ArrayList<>();           
//        private  List<dto.sql.Moneda> result=null; 
      
        private DaoListaMoneda lista= new DaoListaMonedaImpl(); 
        private static final Logger LOG = LogManager.getLogger(CWServiceListaMonedasHiloImpl.class);
        
         Gson gson =new GsonBuilder().serializeNulls().create();
         String json="";

        
	
        public CWServiceSQLHiloImpl()  {   
//             List list = new ArrayList<>();        
//                List<dto.sql.Moneda> result=null;                 
	}
        
        @Override
        public void run()
                {        
                        try 
                        {         

                                List<dto.sql.Moneda> listMoneda =lista.listamonedaQry();                             
                                list=listMoneda;

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