package com.sql.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dao.sql.DaoClienteCRM;
import dao.sql.impl.DaoClienteCRMImpl;
import dto.sql.ClienteCRM;
import java.util.Date;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class CWServiceClienteCRMHiloImpl extends Thread  {      
        private String idclie="";
        private  List<ClienteCRM> result = null; 
        private DaoClienteCRM clientecrm= new DaoClienteCRMImpl();  
        private static final Logger LOG = LogManager.getLogger(CWServiceClienteCRMHiloImpl.class);
        
        Gson gson =new GsonBuilder().serializeNulls().create();
        String json="";


	
        public CWServiceClienteCRMHiloImpl(String idclie)  {  
                this.idclie=idclie;         
                List<ClienteCRM> result = null; 
	}
        
        @Override
        public void run()
                {        
                        try 
                        {         
      
                                    List<ClienteCRM> listClienteCRM =clientecrm.clientecrmQry(idclie); 
                                    result=listClienteCRM;

                                    System.err.println("###########Calling Servicio CWServiceClienteCRMHiloImpl  ##################  hora: " + new Date() );          
                        } catch (Exception  e) 
                           {
                                    System.out.println("Error CWServiceClienteCRMHiloImpl: " + e.getMessage());  
                                    LOG.error("Error: " + e.getMessage() );

                            }
                }
        
        public List getResult()
            {               
                     List<ClienteCRM> resultado = null; 
                    
                    try {
                            resultado= result;
                         } catch (NullPointerException e)
                        {
                            System.out.println("resultado CWServiceClienteCRMHiloImpl: " + e.getMessage());
                            LOG.error("Error: " + e.getMessage() );


                        } catch (Exception  e) {
                            System.out.println("resultado CWServiceClienteCRMHiloImpl: " + e.getMessage());
                            LOG.error("Error: " + e.getMessage() );

                        }
                    return resultado;
             } 
}