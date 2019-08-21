//////package com.sql;
//////
//////import java.sql.Connection;
//////import java.sql.DriverManager;
//////import java.sql.SQLException;
//////import com.java.Constantes;
//////import org.apache.logging.log4j.LogManager;
//////import org.apache.logging.log4j.Logger;
//////
//////public class MSSqlConectaITLGDWH {
//////     private final String db;
//////     private static final Logger LOG = LogManager.getLogger(MSSqlConectaITLGDWH.class);
//////     
//////    public MSSqlConectaITLGDWH(){
//////        db="ITLGDWH";
//////    }
//////    
//////    public Connection connection()  {
//////        Connection cn = null;
//////        try{
//////           
//////
//////            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
//////            DriverManager.setLoginTimeout(Constantes.DB_CONNECTION_TIMEOUTS_SECONDS);            
//////             // cn = DriverManager.getConnection("jdbc:sqlserver://172.18.10.99\\ITLGDWH_INS;databaseName="+db,"omnicanal","Puzrxafhk%y5k1");                
//////            cn = DriverManager.getConnection("jdbc:sqlserver://BNK01TS083\\ITLGDWH;databaseName="+db,"pausrdbdesa","Inteligo2015");                     
//////            
//////        }catch(SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e){
//////            LOG.error( "ERROR: " + e.getMessage());
//////            System.out.println("error: "+ e.getMessage());  
//////           
//////        }
//////        return cn;
//////    }
//////}
//////



package com.sql;

import com.java.Configuracion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.java.Constantes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MSSqlConectaITLGDWH {

     private static final Logger LOG = LogManager.getLogger(MSSqlConectaITLGDWH.class);
     
    public MSSqlConectaITLGDWH(){
        
    }
    
    public Connection connection()  {
        Connection cn = null;
        try{
           

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            DriverManager.setLoginTimeout(Constantes.DB_CONNECTION_TIMEOUTS_SECONDS);            
             // cn = DriverManager.getConnection("jdbc:sqlserver://172.18.10.99\\ITLGDWH_INS;databaseName="+db,"omnicanal","Puzrxafhk%y5k1");                
//            cn = DriverManager.getConnection("jdbc:sqlserver://BNK01TS083\\ITLGDWH;databaseName="+db,"pausrdbdesa","Inteligo2015");      
            cn = DriverManager.getConnection(getConnectionUrl());      

            
        }catch(SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e){
            LOG.error( "ERROR: " + e.getMessage());
            System.out.println("error: "+ e.getMessage());  
           
        }
        return cn;
    }
    
    public String getConnectionUrl() {
        String Conexion ="";
          try{
             switch (Configuracion.AMBIENTE_DESPLIEGUE)
                {
                  case "DESA":
                      Conexion=Constantes.JDBC_URL+Constantes.DB_SERVER_NAME_DESA+";databaseName="+Constantes.DB_DATA_BASE_NAME_DESA+";user="+Constantes.DB_USER_NAME_DESA+";password="+Constantes.DB_PASSWORD_DESA+";";
                      break;
                  case "CERTI":
                       Conexion=Constantes.JDBC_URL+Constantes.DB_SERVER_NAME_CERT+";databaseName="+Constantes.DB_DATA_BASE_NAME_CERT+";user="+Constantes.DB_USER_NAME_CERT+";password="+Constantes.DB_PASSWORD_CERT+";";
                       break;
                  case "PROD":
                       Conexion=Constantes.JDBC_URL+Constantes.DB_SERVER_NAME_PROD+";databaseName="+Constantes.DB_DATA_BASE_NAME_PROD+";user="+Constantes.DB_USER_NAME_PROD+";password="+Constantes.DB_PASSWORD_PROD+";";                      
                       break;
                  default :      
                       Conexion=Constantes.JDBC_URL+Constantes.DB_SERVER_NAME_DESA+";databaseName="+Constantes.DB_DATA_BASE_NAME_DESA+";user="+Constantes.DB_USER_NAME_DESA+";password="+Constantes.DB_PASSWORD_DESA+";";
                               
                }
             
                LOG.info("AMBIENTE: " + Configuracion.AMBIENTE_DESPLIEGUE );
            
             }catch(Exception e){
            LOG.error( "ERROR: " + e.getMessage());
            System.out.println("error: "+ e.getMessage());             
        }
        return Conexion;
    }
}