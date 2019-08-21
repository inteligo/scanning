package dao.sql.impl;

import com.java.Constantes;
import com.sql.HikariMsSqlITLGDWH;
import dto.sql.ClienteFirmante;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;
import dao.sql.DaoClienteFirmante;


public class DaoClienteFirmanteImpl implements DaoClienteFirmante {

    private final HikariMsSqlITLGDWH conecta;

    public DaoClienteFirmanteImpl() {
        this.conecta = new HikariMsSqlITLGDWH();
    }

    @Override
    public List<ClienteFirmante> clientefirmanteQry(String idclie) {
        List<ClienteFirmante> list = null; 
        list = new ArrayList<>();
        
        String sql ="{call uspOmniClienteFirmante (?)}";

        Connection cn = conecta.connection();
        if (cn != null) {
            try { 
                
                CallableStatement cs = cn.prepareCall(sql);
                cs.setString(1, idclie);   
            

                boolean results = cs.execute();

                ResultSet rs = cs.getResultSet(); 

                if (results==true)
                {
                    if (!rs.isBeforeFirst())
                        {
                            list.addAll(LlenaListaVacia(2));  
                        }
                    else
                        {
                            while (rs.next()) 
                                {  
                                    ClienteFirmante p = new ClienteFirmante();
                                    p.setIdclie(rs.getString(1));                                  
                                    p.setTipocli(rs.getString(2));
                                    p.setFirmante(rs.getString(3));
                                  
                                    p.setErrcod(Constantes.RETORNO_OKSQL.toString());
                                    p.setDefcod(Constantes.MENSAJE_OKSQL_DEF);
                                    p.setDetcod(Constantes.MENSAJE_OKSQL_DET);

                                    list.add(p);
                                 }
                                }    
                        }
                        else 
                        { //Hay error en SQL                             
                            list.addAll(LlenaListaVacia(1));
                        }                       
                        cs.close();
                    } catch (SQLException e) { 
                         System.out.println("error: "+ e.getMessage());
                    } finally {
                        try {                           
                            cn.close();
//                            System.out.println("error: " );
                            } 
                        catch (SQLException e) {
                            System.out.println("error: " + e.getMessage());
                            }
                    }
        } 
        else
        {
            list.addAll(LlenaListaVacia(1));
        }        
        return list;
    }

    
    @Override
    public List<ClienteFirmante> LlenaListaVacia(Integer tipo) {  //tipo 1: error;    2: no data
        List<ClienteFirmante> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
        ClienteFirmante p = new ClienteFirmante();
        p.setIdclie("");                                  
        p.setTipocli("");
        p.setFirmante("");    
        
        if ( tipo.equals(1)) //error
        {
            p.setErrcod(Constantes.RETORNO_ERRORSQL.toString());
            p.setDefcod(Constantes.MENSAJE_ERRORSQL_DEF);
            p.setDetcod(Constantes.MENSAJE_ERRORSQL_DET);
        }
        else  //sin data
        {
            p.setErrcod(Constantes.RETORNO_NODATASQL.toString());
            p.setDefcod(Constantes.MENSAJE_NODATASQL_DEF);
            p.setDetcod(Constantes.MENSAJE_NODATASQL_DET);
        }

        list.add(p);

        return list;
    }
    

   
  
}
