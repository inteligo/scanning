package com.sql;

import com.java.Configuracion;
import com.java.Constantes;
import java.sql.Connection;
import java.sql.SQLException;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HikariMsSqlITLGDWH {  
     
    private static final Logger LOG = LogManager.getLogger(HikariMsSqlITLGDWH.class);     
     

    public Connection connection()  {    
        HikariConfig config = new HikariConfig();
        Connection cn = null;
        try{
            config.setMaximumPoolSize(Constantes.MAXIMUN_POOL_SIZE);
//            config.setMinimumIdle(Constantes.MINIMUN_NUM_IDLE);            
//            config.setAutoCommit(false);
            
            config.setDataSourceClassName("com.microsoft.sqlserver.jdbc.SQLServerDataSource");
            
            switch (Configuracion.AMBIENTE_DESPLIEGUE)
                {
                  case "DESA":
                        config.addDataSourceProperty("serverName", Constantes.DB_SERVER_NAME_DESA);
                        //            config.addDataSourceProperty("port", Constantes.DB_PORT_NUMBER_DESA);
                        config.addDataSourceProperty("databaseName", Constantes.DB_DATA_BASE_NAME_DESA);
                        config.addDataSourceProperty("user", Constantes.DB_USER_NAME_DESA);
                        config.addDataSourceProperty("password", Constantes.DB_PASSWORD_DESA);   
                        config.addDataSourceProperty("encrypt", false);
                        config.addDataSourceProperty("trustServerCertificate", true);
                        break;
                  case "CERT":
                        config.addDataSourceProperty("serverName", Constantes.DB_SERVER_NAME_CERT);
                        //            config.addDataSourceProperty("port", Constantes.DB_PORT_NUMBER_CERT);
                        config.addDataSourceProperty("databaseName", Constantes.DB_DATA_BASE_NAME_CERT);
                        config.addDataSourceProperty("user", Constantes.DB_USER_NAME_CERT);
                        config.addDataSourceProperty("password", Constantes.DB_PASSWORD_CERT);  
                        config.addDataSourceProperty("encrypt", false);
                        config.addDataSourceProperty("trustServerCertificate", true);
                        break;
                  case "PROD":
                        config.addDataSourceProperty("serverName", Constantes.DB_SERVER_NAME_PROD);
                        //            config.addDataSourceProperty("port", Constantes.DB_PORT_NUMBER_PROD);
                        config.addDataSourceProperty("databaseName", Constantes.DB_DATA_BASE_NAME_PROD);
                        config.addDataSourceProperty("user", Constantes.DB_USER_NAME_PROD);
                        config.addDataSourceProperty("password", Constantes.DB_PASSWORD_PROD);     
                        config.addDataSourceProperty("encrypt", false);
                        config.addDataSourceProperty("trustServerCertificate", true);
                        break;
                  default :      
                        config.addDataSourceProperty("serverName", Constantes.DB_SERVER_NAME_DESA);
                        //            config.addDataSourceProperty("port", Constantes.DB_PORT_NUMBER_DESA);
                        config.addDataSourceProperty("databaseName", Constantes.DB_DATA_BASE_NAME_DESA);
                        config.addDataSourceProperty("user", Constantes.DB_USER_NAME_DESA);
                        config.addDataSourceProperty("password", Constantes.DB_PASSWORD_DESA);    
                        config.addDataSourceProperty("encrypt", false);
                        config.addDataSourceProperty("trustServerCertificate", true);
                }           
           
            DataSource datasource =new HikariDataSource(config); 
            LOG.info("AMBIENTE: " + Configuracion.AMBIENTE_DESPLIEGUE );
            
            cn = datasource.getConnection();  
            
        }catch(SQLException e){
            LOG.error( "ERROR: " + e.getMessage());
            System.out.println("error: "+ e.getMessage());  
           
        }catch(Exception e){
            LOG.error( "ERROR: " + e.getMessage());
            System.out.println("error: "+ e.getMessage());             
        }
        return cn;
    }
 

}

