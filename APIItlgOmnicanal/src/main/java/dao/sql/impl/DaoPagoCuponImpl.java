package dao.sql.impl;

import com.java.Constantes;
import com.sql.HikariMsSqlITLGDWH;
import dto.sql.PagoCupon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;
import dao.sql.DaoPagoCupon;


public class DaoPagoCuponImpl implements DaoPagoCupon {

    private final HikariMsSqlITLGDWH conecta;

    public DaoPagoCuponImpl() {
        this.conecta = new HikariMsSqlITLGDWH();
    }

    @Override
    public List<PagoCupon> pagocuponQry(String fechaini, String fechafin) {
        List<PagoCupon> list = null; 
        list = new ArrayList<>();
        
        String sql ="{call uspOmniMovPagoCupon (?,?)}";

        Connection cn = conecta.connection();
        if (cn != null) {
            try {
                
                CallableStatement cs = cn.prepareCall(sql);
                cs.setString(1, fechaini); 
                cs.setString(2, fechafin); 
                
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
                                PagoCupon p = new PagoCupon();
                                p.setTipocliente(rs.getString(1));
                                p.setCliente(rs.getString(2));
                                p.setCurrency(rs.getString(3));
                                p.setCuenta(rs.getString(4)); 
                                p.setFecha(rs.getString(5)); 
                                p.setDescripcion(rs.getString(6));   
                                p.setReference(rs.getString(7));   
                                p.setPostfecha(rs.getString(8));   
                                p.setCargo(rs.getDouble(9));   
                                p.setAbono(rs.getDouble(10));   
                                p.setBookingdate(rs.getString(11)); 

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
    public List<PagoCupon> LlenaListaVacia(Integer tipo) {  //tipo 1: error;    2: no data
        List<PagoCupon> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
        PagoCupon p = new PagoCupon();
        
   
        p.setTipocliente("");
        p.setCliente("");
        p.setCurrency("");
        p.setCuenta(""); 
        p.setFecha(""); 
        p.setDescripcion("");   
        p.setReference("");   
        p.setPostfecha("");   
        p.setCargo(0.00);   
        p.setAbono(0.00);   
        p.setBookingdate("");        
       
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
