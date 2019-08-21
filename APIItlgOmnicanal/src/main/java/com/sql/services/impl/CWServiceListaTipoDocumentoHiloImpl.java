package com.sql.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dao.sql.DaoTipoDocumentoBIZAGI;
import dao.sql.impl.DaoTipoDocumentoBIZAGIImpl;
import java.util.Date;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class CWServiceListaTipoDocumentoHiloImpl extends Thread  {      
        private  List<dto.sql.TipoDocumentoBIZAGI> result=null; 
        private static final Logger LOG = LogManager.getLogger(CWServiceListaTipoDocumentoHiloImpl.class);
      
        private DaoTipoDocumentoBIZAGI lista= new DaoTipoDocumentoBIZAGIImpl(); 
        
        
         Gson gson =new GsonBuilder().serializeNulls().create();
         String json="";

        
	
        public CWServiceListaTipoDocumentoHiloImpl()  {            
                List<dto.sql.TipoDocumentoBIZAGI> result=null;                 
	}
        
        @Override
        public void run()
                {        
                        try 
                        {         

                                    List<dto.sql.TipoDocumentoBIZAGI> listTipoDocumentoBIZAGI =lista.tipodocumentobizagiQry();                             
                                    result=listTipoDocumentoBIZAGI;

                                    System.err.println("###########Calling Servicio CWServiceListaTipoDocumentoHiloImpl  ##################  hora: " + new Date() );          
                        } catch (Exception  e) 
                           {
                                LOG.error( "ERROR: " + e.getMessage()); 
                                System.out.println("Error CWServiceListaTipoDocumentoHiloImpl: " + e.getMessage());    

                            }
                }
        
        public List getResult()
            {
                    List<dto.sql.TipoDocumentoBIZAGI> resultado=null; 
                    
                    try {
                            resultado= result;
                         } catch (NullPointerException e)
                        {
                            LOG.error( "ERROR: " + e.getMessage()); 
                            System.out.println("resultado CWServiceListaTipoDocumentoHiloImpl: " + e.getMessage());

                        } catch (Exception  e) {
                            LOG.error( "ERROR: " + e.getMessage()); 
                            System.out.println("resultado CWServiceListaTipoDocumentoHiloImpl: " + e.getMessage());
                        }
                    return resultado;
             } 
}