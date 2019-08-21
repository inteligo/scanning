package dao.sql.impl;

import com.java.Constantes;
import com.sql.HikariMsSqlITLGDWH;
import dao.sql.DaoVencimientoPrestamo;
import dto.sql.VencimientoPrestamo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;


public class DaoVencimientoPrestamoImpl implements DaoVencimientoPrestamo {

    private final HikariMsSqlITLGDWH conecta;

    public DaoVencimientoPrestamoImpl() {
        this.conecta = new HikariMsSqlITLGDWH();
    }

    @Override
    public List<VencimientoPrestamo> VencPrestamoQry(String fecpro, String numdias) {
        List<VencimientoPrestamo> list = null; 
        list = new ArrayList<>();
                       
        String sql ="{call uspOmniVencimientoPrestamo (?,?)}";

        Connection cn = conecta.connection();
        if (cn != null) 
            {
                try 
                    {                
                        CallableStatement cs = cn.prepareCall(sql);
                        cs.setString(1, fecpro);                          
                        cs.setString(2, numdias);            

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
                                            VencimientoPrestamo p = new VencimientoPrestamo();
                                            p.setIdclie(rs.getString(1));
                                            p.setEstitu(rs.getString(2));
                                            p.setCodpro(rs.getString(3));
                                            p.setStartdate(rs.getString(4));
                                            p.setMaturitydate(rs.getString(5));
                                            p.setDiasres(rs.getInt(6));
                                            p.setCuenta(rs.getString(7));
                                            p.setLoantype(rs.getString(8));  
                                            p.setMonto(rs.getDouble(9));   
                                            p.setMoneda(rs.getString(10));  
                                            p.setTipocliente(rs.getString(11));  
                                           
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
    public List<VencimientoPrestamo> LlenaListaVacia(Integer tipo) {  //tipo 1: error;    2: no data
        List<VencimientoPrestamo> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
        VencimientoPrestamo p = new VencimientoPrestamo();
        p.setIdclie("");
        p.setEstitu("");
        p.setCodpro("");
        p.setStartdate("");
        p.setMaturitydate("");
        p.setDiasres(0);
        p.setCuenta("");
        p.setLoantype(""); 
        p.setMonto(0.00); 
        p.setMoneda("");  
        p.setTipocliente(""); 
        
       
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
