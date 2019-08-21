package com.sql.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dao.sql.DaoBonoPeruano;
import dao.sql.impl.DaoBonoPeruanoImpl;

import java.util.Date;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class CWServiceListaBonoPeruanoHiloImpl extends Thread  {      
        private  List<dto.sql.BonoPeruano> result=null; 
      
        private DaoBonoPeruano lista= new DaoBonoPeruanoImpl(); 
        private static final Logger LOG = LogManager.getLogger(CWServiceListaBonoPeruanoHiloImpl.class);
        
         Gson gson =new GsonBuilder().serializeNulls().create();
         String json="";

        
	
        public CWServiceListaBonoPeruanoHiloImpl()  {            
                List<dto.sql.BonoPeruano> result=null;                 
	}
        
        @Override
        public void run()
                {        
                        try 
                        {         

                                List<dto.sql.BonoPeruano> listBonoPeruano =lista.bonoperuanoQry();                             
                                result=listBonoPeruano;

                                System.err.println("###########Calling Servicio CWServiceBonoPeruanoHiloImpl  ##################  hora: " + new Date() );          
                        } catch (Exception  e) 
                           {
                                LOG.error( "ERROR: " + e.getMessage()); 
                                System.out.println("Error CWServiceBonoPeruanoHiloImpl: " + e.getMessage());    

                            }
                }
        
        public List getResult()
            {
                    List<dto.sql.BonoPeruano> resultado=null; 
                    
                    try {
                            resultado= result;
                         } catch (NullPointerException e)
                        {
                            LOG.error( "ERROR: " + e.getMessage()); 
                            System.out.println("resultado CWServiceBonoPeruanoHiloImpl: " + e.getMessage());
//                            e.printStackTrace();


                        } catch (Exception  e) {
                            LOG.error( "ERROR: " + e.getMessage()); 
                            System.out.println("resultado CWServiceBonoPeruanoHiloImpl: " + e.getMessage());
//                            e.printStackTrace();

                        }
                    return resultado;
             } 
}