package dao.sql.impl;

import com.java.Constantes;
import com.sql.HikariMsSqlITLGDWH;
import dao.sql.DaoCalendarioEventoCliente;
import dto.sql.CalendarioEventoCliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;


public class DaoCalendarioEventoClienteImpl implements DaoCalendarioEventoCliente {

    private final HikariMsSqlITLGDWH conecta;

    public DaoCalendarioEventoClienteImpl() {
        this.conecta = new HikariMsSqlITLGDWH();
    }

    @Override
    public List<CalendarioEventoCliente> calendarioeventoclienteQry(String idclie, String tipomov,Integer anio, Integer mes,String estitu)  {
//        Integer intReturn=1;
        List<CalendarioEventoCliente> list = null; 
        list = new ArrayList<>();
        
               
        String sql ="{call uspOmniCalendarioEventoCliente (?,?,?,?,?)}";

        Connection cn = conecta.connection();
        if (cn != null) 
            {
                try 
                    {                
                        CallableStatement cs = cn.prepareCall(sql);
                        cs.setString(1, idclie);   
                        cs.setString(2, tipomov);          
                        cs.setInt(3, anio);   
                        cs.setInt(4, mes);      
                        cs.setString(5, estitu);          

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
                                            CalendarioEventoCliente p = new CalendarioEventoCliente();
                                            p.setIdclie(rs.getString(1));                                                 
                                            p.setMonto(rs.getDouble(2));                                           
                                            
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
    public List<CalendarioEventoCliente> LlenaListaVacia(Integer tipo) {  //tipo 1: error;   2: no data
        List<CalendarioEventoCliente> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
        CalendarioEventoCliente p = new CalendarioEventoCliente();
        p.setIdclie("");      
        p.setMonto(0.00);         
       

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
