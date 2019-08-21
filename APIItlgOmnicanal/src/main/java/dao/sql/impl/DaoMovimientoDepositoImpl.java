package dao.sql.impl;

import com.java.Constantes;
import com.sql.HikariMsSqlITLGDWH;
import dto.sql.MovimientoDeposito;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;
import dao.sql.DaoMovimientoDeposito;


public class DaoMovimientoDepositoImpl implements DaoMovimientoDeposito {

    private final HikariMsSqlITLGDWH conecta;

    public DaoMovimientoDepositoImpl() {
        this.conecta = new HikariMsSqlITLGDWH();
    }

    @Override
    public List<MovimientoDeposito> movimientodepositoQry(String id) {
        List<MovimientoDeposito> list = null; 
        list = new ArrayList<>();
        
        String sql ="{call uspOmniMovDepositos (?)}";

        Connection cn = conecta.connection();
        if (cn != null) {
            try {
                
                CallableStatement cs = cn.prepareCall(sql);
                cs.setString(1, id); 
                
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
                                MovimientoDeposito p = new MovimientoDeposito();
                                p.setId(rs.getString(1));
                                p.setDate(rs.getInt(2));
                                p.setSequenceNo(rs.getString(3));
                                p.setCurrentNo(rs.getInt(4)); 
                                p.setCustomerCode(rs.getString(5));   
                                p.setFechaValor(rs.getString(6));   
                                p.setActionCode(rs.getString(7));   
                                p.setAdviceCode(rs.getString(8));   
                                p.setTransaccion(rs.getString(9));   
                                p.setMonto(rs.getDouble(10)); 

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
    public List<MovimientoDeposito> LlenaListaVacia(Integer tipo) {  //tipo 1: error;    2: no data
        List<MovimientoDeposito> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
        MovimientoDeposito p = new MovimientoDeposito();
        
        p.setId("");
        p.setDate(0);
        p.setSequenceNo("");
        p.setCurrentNo(0); 
        p.setCustomerCode("");   
        p.setFechaValor("");   
        p.setActionCode("");   
        p.setAdviceCode("");   
        p.setTransaccion("");   
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
        }
        
        list.add(p);

        return list;
    }
    
  
}
