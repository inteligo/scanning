package com.sql;

import com.java.LeerDataProperties;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.sql.DataSource;



public class JNDI_MSSqlConectaITLGDWH {
        private static DataSource dataSource;    
       
                
                static{
                            LeerDataProperties  data = new LeerDataProperties();            
                            DirContext context = null;
                         
                               try {
                                                               
                                        Hashtable env = new Hashtable();
                                        env.put(Context.INITIAL_CONTEXT_FACTORY,data.getInitialContextFactory());
                                        env.put(Context.PROVIDER_URL,data.getProviderUrl());
                                        context = new InitialDirContext(env);
         


                                        Object lookup = context.lookup(data.getJndiLookupServiceItlgdwh());

                                        if(lookup != null){
                                                        dataSource =(DataSource)lookup;
                                        }else{
                                                        new RuntimeException("DataSource not found!!!");
                                                        context.close();
                                        }
                                                       
                                    } catch (NamingException e) {
                                            System.out.println(e.getMessage());
                                            
                                    }
                                    finally {
                                                try {context.close();}
                                                catch (NamingException e) {
                                                        System.out.println(e.getMessage());
                                                      
                                                }
                               }
                                                
                }
                public static DataSource getDataSource(){
                               return dataSource;
                }
                
                 public static Connection getConnection() {
                 
                    try {
                        return getDataSource().getConnection();
                    } catch (SQLException e) {
                        Logger.getLogger(JNDI_MSSqlConectaITLGDWH.class.getName()).log(Level.SEVERE, null, e);
                        
                    }
                        return null;
                     
                }
}

