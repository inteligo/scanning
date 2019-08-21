package dao.sql.impl;

import com.java.Constantes;
import com.sql.HikariMsSqlITLGDWH;
import dao.sql.DaoCalendarioEvento;
import dto.sql.CalendarioEvento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;


public class DaoCalendarioEventoImpl implements DaoCalendarioEvento {

    private final HikariMsSqlITLGDWH conecta;

    public DaoCalendarioEventoImpl() {
        this.conecta = new HikariMsSqlITLGDWH();
    }

    @Override
    public List<CalendarioEvento> calendarioeventoQry(String idclie, String tipomov)  {
//        Integer intReturn=1;
        List<CalendarioEvento> list = null; 
        list = new ArrayList<>();
        
               
        String sql ="{call uspOmniCalendarioEvento (?,?)}";

        Connection cn = conecta.connection();
        if (cn != null) 
            {
                try 
                    {                
                        CallableStatement cs = cn.prepareCall(sql);
                        cs.setString(1, idclie);   
                        cs.setString(2, tipomov);                

                        boolean results = cs.execute();
                         
                        ResultSet rs = cs.getResultSet(); 
                        
                        if (results==true)
                        {
                            if (!rs.isBeforeFirst())
                                {
                                    list.addAll(LlenaListaVacia(2));  
//                                    throw new DatosNoEncontradosExcepcion("No se encuentra el artículo");
                                }
                            else
                                {
                                    while (rs.next()) 
                                        {  
                                            CalendarioEvento p = new CalendarioEvento();
                                            p.setIdclie(rs.getString(1));
                                            p.setOwner(rs.getString(2));
                                            p.setEvento(rs.getString(3));
                                            p.setProducto(rs.getString(4));
                                            p.setCodpor(rs.getString(5));
                                            p.setCodpro(rs.getString(6));
                                            p.setNombre(rs.getString(7));
                                            p.setTotpag(rs.getInt(8));
                                            p.setNumpag(rs.getInt(9));                       
                                            p.setMonto(rs.getDouble(10));   
                                            p.setFecpag(rs.getString(11));   
                                            p.setEstpag(rs.getInt(12));
                                            p.setSaldo(rs.getDouble(13));
                                            p.setDescri(rs.getString(14));
                                            p.setCarabo(rs.getString(15));
                                            p.setTippro(rs.getString(16));
                                            p.setIdpre(rs.getString(17));
                                            p.setMonpro(rs.getDouble(18));
                                            p.setMonpor(rs.getDouble(19));
                                            p.setEstitu(rs.getString(20));
                                            
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
    public List<CalendarioEvento> LlenaListaVacia(Integer tipo) {  //tipo 1: error;   2: no data
        List<CalendarioEvento> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
        CalendarioEvento p = new CalendarioEvento();
        p.setIdclie("");
        p.setOwner("");
        p.setEvento("");
        p.setProducto("");
        p.setCodpor("");
        p.setCodpro("");
        p.setNombre("");
        p.setTotpag(0);
        p.setNumpag(0);            
        p.setMonto(0.00);         
        p.setMonpro(0.00);         
        p.setMonpor(0.00);
        p.setFecpag("");   
        p.setEstpag(0);   
        p.setSaldo(0.00);
        p.setDescri("");
        p.setCarabo("");
        p.setTippro("");
        p.setIdpre("");
        p.setEstitu("");

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
            
//            p.setErrcod(Constantes.RETORNO_OKSQL.toString());
//            p.setDefcod(Constantes.MENSAJE_OKSQL_DEF);
//            p.setDetcod(Constantes.MENSAJE_OKSQL_DET);

        }

        list.add(p);

        return list;
    }
    
  
}
