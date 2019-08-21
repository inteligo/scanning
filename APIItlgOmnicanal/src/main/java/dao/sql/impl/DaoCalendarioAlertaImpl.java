package dao.sql.impl;

import com.java.Constantes;
import com.sql.HikariMsSqlITLGDWH;
import dao.sql.DaoCalendarioAlerta;
import dto.sql.CalendarioAlerta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;


public class DaoCalendarioAlertaImpl implements DaoCalendarioAlerta {

    private final HikariMsSqlITLGDWH conecta;

    public DaoCalendarioAlertaImpl() {
        this.conecta = new HikariMsSqlITLGDWH();
    }

    @Override
    public List<CalendarioAlerta> calendarioalertaQry(String fecpro, String tipale, String numdias) {
        List<CalendarioAlerta> list = null; 
        list = new ArrayList<>();
                       
        String sql ="{call uspOmniAlertas (?,?,?)}";

        Connection cn = conecta.connection();
        if (cn != null) 
            {
                try 
                    {                
                        CallableStatement cs = cn.prepareCall(sql);
                        cs.setString(1, fecpro);   
                        cs.setString(2, tipale);          
                        cs.setString(3, numdias);            

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
                                            CalendarioAlerta p = new CalendarioAlerta();
                                            p.setIdclie(rs.getString(1));
                                            p.setEvento(rs.getString(2));
                                            p.setProducto(rs.getString(3));
                                            p.setCodpor(rs.getString(4));
                                            p.setCodpro(rs.getString(5));
                                            p.setNombre(rs.getString(6));
                                            p.setTotpag(rs.getInt(7));
                                            p.setNumpag(rs.getInt(8));  
                                            p.setFecpag(rs.getString(9));   
                                            p.setDiasres(rs.getInt(10));  
                                           
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
    public List<CalendarioAlerta> LlenaListaVacia(Integer tipo) {  //tipo 1: error;    2: no data
        List<CalendarioAlerta> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
        CalendarioAlerta p = new CalendarioAlerta();
        p.setIdclie("");
        p.setEvento("");
        p.setProducto("");
        p.setCodpor("");
        p.setCodpro("");
        p.setNombre("");
        p.setTotpag(0);
        p.setNumpag(0); 
        p.setFecpag(""); 
        p.setDiasres(0);  

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
