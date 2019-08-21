package dao.sql.impl;

import com.java.Constantes;
import com.sql.HikariMsSqlITLGDWH;
import dao.sql.DaoCalendarioPagoBono;
import dto.sql.CalendarioBono;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;


public class DaoCalendarioPagoBonoImpl implements DaoCalendarioPagoBono {

    private final HikariMsSqlITLGDWH conecta;

    public DaoCalendarioPagoBonoImpl() {
        this.conecta = new HikariMsSqlITLGDWH();
    }

    @Override
    public List<CalendarioBono> calendariopagobonoQry( String codpro) {
        List<CalendarioBono> list = null; 
        list = new ArrayList<>();
        
        String sql ="{call uspOmniCalendarioBono (?)}";

        Connection cn = conecta.connection();
        if (cn != null) {
            try { 
                
                CallableStatement cs = cn.prepareCall(sql);
                cs.setString(1, codpro);                  

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
                                    CalendarioBono p = new CalendarioBono();
                                   
                                    p.setCodpro(rs.getString(1));
                                    p.setTotpag(rs.getInt(2));
                                    p.setNumpag(rs.getInt(3));
                                    p.setFecpag(rs.getString(4));   
                                    p.setEstpag(rs.getInt(5)); 

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
    public List<CalendarioBono> LlenaListaVacia(Integer tipo) {  //tipo 1: error;    2: no data
        List<CalendarioBono> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
        CalendarioBono p = new CalendarioBono();       
        p.setCodpro("");
        p.setTotpag(0);
        p.setNumpag(0); 
        p.setEstpag(0);         

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
