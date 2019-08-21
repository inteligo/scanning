
package com.java;

import static com.java.Convierte.NullaVacio;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class LeerDataProperties {
     public Properties prop=null;
     
    
     public InputStream input =LeerDataProperties.class.getClassLoader().getResourceAsStream("resources/config/data.properties");
     
     
     
     public LeerDataProperties(){ 
         try{
                prop=new Properties();
                prop.load(input);      
         }
           catch(IOException  e){
             System.out.println(e.getMessage());            
         }
        
     }
     
        
       public String getInitialContextFactory(){
         String dato="";
         try {
             dato=NullaVacio(prop.getProperty("INITIAL_CONTEXT_FACTORY"));
         }
         catch(Exception  e){
             System.out.println(e.getMessage());
             dato="";
         }
         return dato;
     }
       
      public String getProviderUrl(){
         String dato="";
         try {
             dato=NullaVacio(prop.getProperty("PROVIDER_URL"));
         }
         catch(Exception  e){
             System.out.println(e.getMessage());
             dato="";
         }
         return dato;
     }
         
     public String getJndiLookupServiceItlgdwh(){
         String dato="";
         try {
             dato=NullaVacio(prop.getProperty("JNDI_LOOKUP_SERVICE_ITLGDWH"));
         }
         catch(Exception  e){
             System.out.println(e.getMessage());
             dato="";
         }
         return dato;
     }
     
     public String getJndiLookupServiceBizagi(){
         String dato="";
         try {
             dato=NullaVacio(prop.getProperty("JNDI_LOOKUP_SERVICE_BIZAGI"));
         }
         catch(Exception  e){
             System.out.println(e.getMessage());
             dato="";
         }
         return dato;
     }
           
     }
    

