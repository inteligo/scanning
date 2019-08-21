package dao.sql.impl;

import com.java.Constantes;
import com.sql.HikariMsSqlITLGDWH;
import dao.sql.DaoCalendarioBono;
import dto.sql.CalendarioEvento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;


public class DaoCalendarioBonoImpl implements DaoCalendarioBono {

    private final HikariMsSqlITLGDWH conecta;

    public DaoCalendarioBonoImpl() {
        this.conecta = new HikariMsSqlITLGDWH();
    }

    @Override
    public List<CalendarioEvento> calendariobonoQry(String idclie,String codpor, String codpro, Double couponamount) {
        List<CalendarioEvento> list = null; 
        list = new ArrayList<>();
        
        String sql ="{call uspOmniCalendBonos (?,?)}";

        Connection cn = conecta.connection();
        if (cn != null) {
            try { 
                
                CallableStatement cs = cn.prepareCall(sql);
                cs.setString(1, codpro);   
                cs.setDouble(2, couponamount);                

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
                                    CalendarioEvento p = new CalendarioEvento();
                                    p.setIdclie(idclie);
                                    p.setCodpor(codpor);
                                    p.setCodpro(rs.getString(1));
                                    p.setTotpag(rs.getInt(2));
                                    p.setNumpag(rs.getInt(3));                       
                                    p.setMonto(rs.getDouble(4));   
                                    p.setFecpag(rs.getString(5));   
                                    p.setEstpag(rs.getInt(6)); 

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
    public List<CalendarioEvento> LlenaListaVacia(Integer tipo) {  //tipo 1: error;    2: no data
        List<CalendarioEvento> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
        CalendarioEvento p = new CalendarioEvento();
        p.setIdclie("");
        p.setCodpor("");
        p.setCodpro("");
        p.setTotpag(0);
        p.setNumpag(0);                       
        p.setMonto(0.00);   
        p.setFecpag("19000101");   
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
