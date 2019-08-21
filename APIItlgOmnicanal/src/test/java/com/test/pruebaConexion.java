
package com.test;

//import com.sql.conexionAD;
//
//public class pruebaConexion {
//
//    public static void main(String[] args) {
//        conexionAD ad = new conexionAD();
//        System.out.println(ad.login("vsaavedra", "Inteligo2018"));
//    }
//}


import com.sql.JNDI_MSSqlConectaITLGDWH;
import java.sql.Connection;
import java.sql.SQLException;

public class pruebaConexion {

    public static void main(String[] args) throws SQLException {
        Connection conec=null;
        JNDI_MSSqlConectaITLGDWH con = new JNDI_MSSqlConectaITLGDWH();
        try
        {
        conec = JNDI_MSSqlConectaITLGDWH.getConnection();
        
        }
        catch (Exception e)
        {

//           System.out.println(conec.toString());
        }
       
    }
}