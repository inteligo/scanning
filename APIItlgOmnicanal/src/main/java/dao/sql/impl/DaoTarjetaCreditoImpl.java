package dao.sql.impl;

import com.java.Constantes;
import static com.java.Convierte.straDate;
import com.sql.HikariMsSqlITLGDWH;
import dto.sql.DetalleTarjetaCredito;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;
import dao.sql.DaoTarjetaCredito;
import dto.sql.MovimientoTarjetaCredito;
import java.sql.Timestamp;



public class DaoTarjetaCreditoImpl implements DaoTarjetaCredito {

    private final HikariMsSqlITLGDWH conecta;

    public DaoTarjetaCreditoImpl() {
        this.conecta = new HikariMsSqlITLGDWH();
    }

    @Override
    public List<DetalleTarjetaCredito> detalletarjetacreditoQry(String id,String fecpro, String verbloq) {
        List<DetalleTarjetaCredito> list = null; 
        list = new ArrayList<>();        
        
      
        
        String sql ="{call uspOmniDetalleTarjetasCredito (?,?,?)}";

        Connection cn = conecta.connection();
        if (cn != null) {
            try {
                
                 Timestamp datfecpro=straDate(fecpro);
                 
                CallableStatement cs = cn.prepareCall(sql);
                cs.setString(1, id);   
                cs.setString(2, fecpro);                
                cs.setString(3, verbloq);                

                boolean results = cs.execute();

                ResultSet rs = cs.getResultSet(); 

                if (results==true)
                {
                    if (!rs.isBeforeFirst())
                        {
                            list.addAll(LlenaListaVaciaDetalleTarjetaCredito(2));  
                        }
                    else
                        {
                        while (rs.next()) 
                            {  
                                DetalleTarjetaCredito p = new DetalleTarjetaCredito();
                                p.setIdclie(id);
                                p.setFecpro(datfecpro);
                                p.setNumtar(rs.getString(1));
                                p.setFectra(rs.getString(2));
                                p.setStrfecpro(rs.getString(3));
                                p.setSaltar(rs.getDouble(4));
                                p.setSalcon(rs.getDouble(5));   
                                p.setSaldis(rs.getDouble(6));   
                                p.setPagmes(rs.getDouble(7));   
                                p.setPagmin(rs.getDouble(8));   
                                p.setUltpag(rs.getString(9));
                                p.setCierre(rs.getString(10));
                                p.setEsttit(rs.getString(11));
                                p.setEsttar(rs.getString(12));
                                p.setPunint(rs.getInt(13));
                                p.setLintot(rs.getDouble(14));
                                p.setTiptar(rs.getString(15));
                                p.setTippago(rs.getString(16));                                
                                p.setCodbloque(rs.getString(17));
                                p.setDescbloque(rs.getString(18));
                                p.setFecbloque(rs.getString(19));
                                p.setFecexpira(rs.getString(20));
                                
                                p.setErrcod(Constantes.RETORNO_OKSQL.toString());
                                p.setDefcod(Constantes.MENSAJE_OKSQL_DEF);
                                p.setDetcod(Constantes.MENSAJE_OKSQL_DET);

                                list.add(p);
                            }
                        }
                }
                else 
                        { //Hay error en SQL                             
                            list.addAll(LlenaListaVaciaDetalleTarjetaCredito(1));
                        }                       
                        cs.close();
                 } catch (SQLException e) {
                     System.out.println("error: "+ e.getMessage());
                   
                    } finally {
                        try {                           
                            cn.close();
//                            System.out.println("error: " );
                          //  list.addAll(LlenaListaVacia(1));
                            } 
                        catch (SQLException e) {
                        System.out.println("error: " + e.getMessage());
                        // list.addAll(LlenaListaVacia(1));
                }
            }
        } 
        else
        {
            list.addAll(LlenaListaVaciaDetalleTarjetaCredito(1));
        }        
        return list;  
    }

    @Override
    public List<DetalleTarjetaCredito> LlenaListaVaciaDetalleTarjetaCredito(Integer tipo) {  //tipo 1: error;    2: no data
        List<DetalleTarjetaCredito> list = null; 
        list = new ArrayList<>();
        if (tipo.equals(null)) {  tipo=1; }
        
        DetalleTarjetaCredito p = new DetalleTarjetaCredito();
        
        p.setIdclie("");
        p.setFecpro(null);
        p.setNumtar("");
        p.setFectra("");
        p.setStrfecpro("");
        p.setSaltar(0.00);
        p.setSalcon(0.00);
        p.setSaldis(0.00);
        p.setPagmes(0.00);
        p.setPagmin(0.00);
        p.setUltpag("");
        p.setCierre("");
        p.setEsttit("");
        p.setEsttar("");
        p.setPunint(0);
        p.setLintot(0.00);
        p.setCodbloque("");
        p.setDescbloque("");
        p.setFecbloque("");
        p.setFecexpira("");
       
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
    
    
    @Override
    public List<MovimientoTarjetaCredito> movimientotarjetacreditoQry(String id,String fecpro) {
        List<MovimientoTarjetaCredito> list = null;
        list = new ArrayList<>();        
        
//        Timestamp datfecpro=straDate(fecpro);
        
        String sql ="{call uspOmniMovimiTarjetasCredito (?,?)}";

        Connection cn = conecta.connection();
        if (cn != null) {
            try {
                CallableStatement cs = cn.prepareCall(sql);
                cs.setString(1, id);   
                cs.setString(2, fecpro);                

                boolean results = cs.execute();

                ResultSet rs = cs.getResultSet(); 

                if (results==true)
                {
                    if (!rs.isBeforeFirst())
                        {
                            list.addAll(LlenaListaVaciaMovimientoTarjetaCredito(2));  
                        }
                    else
                        {
                        while (rs.next()) 
                            {  
                                MovimientoTarjetaCredito p = new MovimientoTarjetaCredito();
                                p.setIdclie(id);
                                p.setFecpro(fecpro);
                                p.setId(rs.getInt(1));
                                p.setNumtar(rs.getString(2));
                                p.setDescri(rs.getString(3));
                                p.setFecmov(rs.getString(4));
                                p.setMonto(rs.getDouble(5));
                                p.setCarabo(rs.getString(6));   
                                p.setDescrip(rs.getString(7));

                                 p.setErrcod(Constantes.RETORNO_OKSQL.toString());
                                p.setDefcod(Constantes.MENSAJE_OKSQL_DEF);
                                p.setDetcod(Constantes.MENSAJE_OKSQL_DET);

                                list.add(p);
                            }
                        }
                }
                else 
                        { //Hay error en SQL                             
                            list.addAll(LlenaListaVaciaMovimientoTarjetaCredito(1));
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
            list.addAll(LlenaListaVaciaMovimientoTarjetaCredito(1));
        }        
        return list;  
    }
 
 

@Override
    public List<MovimientoTarjetaCredito> LlenaListaVaciaMovimientoTarjetaCredito(Integer tipo) {  //tipo 1: error;    2: no data
        List<MovimientoTarjetaCredito> list = null; 
        list = new ArrayList<>();
        if (tipo.equals(null)) {  tipo=1; }
        
        MovimientoTarjetaCredito p = new MovimientoTarjetaCredito();
        
        p.setIdclie("");
        p.setFecpro("");
        p.setId(0);
        p.setNumtar("");
        p.setDescri("");
        p.setFecmov("");
        p.setMonto(0.00);
        p.setCarabo("");   
        p.setDescrip("");
       
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
    
  @Override
    public List<MovimientoTarjetaCredito> movimientotarjetacreditoporcantidadQry(String id,String fecpro,Integer numcant ) {
        List<MovimientoTarjetaCredito> list = null;
        list = new ArrayList<>();        
        
//        Timestamp datfecpro=straDate(fecpro);
        
        String sql ="{call uspOmniMovimiTarjetasCreditoPorCantidad (?,?,?)}";

        Connection cn = conecta.connection();
        if (cn != null) {
            try {
                CallableStatement cs = cn.prepareCall(sql);
                cs.setString(1, id);   
                cs.setString(2, fecpro); 
                cs.setInt(3, numcant);       

                boolean results = cs.execute();

                ResultSet rs = cs.getResultSet(); 

                if (results==true)
                {
                    if (!rs.isBeforeFirst())
                        {
                            list.addAll(LlenaListaVaciaMovimientoTarjetaCredito(2));  
                        }
                    else
                        {
                        while (rs.next()) 
                            {  
                                MovimientoTarjetaCredito p = new MovimientoTarjetaCredito();
                                p.setIdclie(id);
                                p.setFecpro(fecpro);
                                p.setId(rs.getInt(1));
                                p.setNumtar(rs.getString(2));
                                p.setDescri(rs.getString(3));
                                p.setFecmov(rs.getString(4));
                                p.setMonto(rs.getDouble(5));
                                p.setCarabo(rs.getString(6));   
                                p.setDescrip(rs.getString(7));

                                p.setErrcod(Constantes.RETORNO_OKSQL.toString());
                                p.setDefcod(Constantes.MENSAJE_OKSQL_DEF);
                                p.setDetcod(Constantes.MENSAJE_OKSQL_DET);

                                list.add(p);
                            }
                        }
                }
                else 
                        { //Hay error en SQL                             
                            list.addAll(LlenaListaVaciaMovimientoTarjetaCredito(1));
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
            list.addAll(LlenaListaVaciaMovimientoTarjetaCredito(1));
        }        
        return list;  
    }
 
    @Override
    public List<DetalleTarjetaCredito> tarjetacreditobloquedasQry(String fecpro) {
        List<DetalleTarjetaCredito> list = null; 
        list = new ArrayList<>();        
        
      
        
        String sql ="{call uspOmniTarjetasCreditoBloqueadas (?)}";

        Connection cn = conecta.connection();
        if (cn != null) {
            try {
                
                 Timestamp datfecpro=straDate(fecpro);
                 
                CallableStatement cs = cn.prepareCall(sql);
                cs.setString(1, fecpro);  
                
                
                boolean results = cs.execute();

                ResultSet rs = cs.getResultSet(); 

                if (results==true)
                {
                    if (!rs.isBeforeFirst())
                        {
                            list.addAll(LlenaListaVaciaDetalleTarjetaCredito(2));  
                        }
                    else
                        {
                        while (rs.next()) 
                            {  
                                DetalleTarjetaCredito p = new DetalleTarjetaCredito();
                                p.setIdclie(rs.getString(1));                               
                                p.setNumtar(rs.getString(2));                               
                                p.setEsttit(rs.getString(3));
                                p.setEsttar(rs.getString(4));                               
                                p.setTiptar(rs.getString(5));                                                             
                                p.setCodbloque(rs.getString(6));
                                p.setDescbloque(rs.getString(7));
                                p.setFecbloque(rs.getString(8));    
                                                                
                                p.setFecpro(null);                               
                                p.setFectra("");
                                p.setStrfecpro("");
                                p.setSaltar(0.00);
                                p.setSalcon(0.00);
                                p.setSaldis(0.00);
                                p.setPagmes(0.00);
                                p.setPagmin(0.00);
                                p.setUltpag("");
                                p.setCierre("");                              
                                p.setPunint(0);
                                p.setLintot(0.00);                               
                                p.setFecexpira("");

                                p.setErrcod(Constantes.RETORNO_OKSQL.toString());
                                p.setDefcod(Constantes.MENSAJE_OKSQL_DEF);
                                p.setDetcod(Constantes.MENSAJE_OKSQL_DET);

                                list.add(p);
                            }
                        }
                }
                else 
                        { //Hay error en SQL                             
                            list.addAll(LlenaListaVaciaTarjetaCreditoBloqueadas(1));
                        }                       
                        cs.close();
                 } catch (SQLException e) {
                     System.out.println("error: "+ e.getMessage());
                   
                    } finally {
                        try {                           
                            cn.close();
//                            System.out.println("error: " );
                          //  list.addAll(LlenaListaVacia(1));
                            } 
                        catch (SQLException e) {
                        System.out.println("error: " + e.getMessage());
                        // list.addAll(LlenaListaVacia(1));
                }
            }
        } 
        else
        {
            list.addAll(LlenaListaVaciaTarjetaCreditoBloqueadas(1));
        }        
        return list;  
    }

    @Override
    public List<DetalleTarjetaCredito> LlenaListaVaciaTarjetaCreditoBloqueadas(Integer tipo) {  //tipo 1: error;    2: no data
        List<DetalleTarjetaCredito> list = null; 
        list = new ArrayList<>();
        if (tipo.equals(null)) {  tipo=1; }
        
        DetalleTarjetaCredito p = new DetalleTarjetaCredito();
        
        p.setIdclie("");
        p.setFecpro(null);
        p.setNumtar("");
        p.setFectra("");
        p.setStrfecpro("");
        p.setSaltar(0.00);
        p.setSalcon(0.00);
        p.setSaldis(0.00);
        p.setPagmes(0.00);
        p.setPagmin(0.00);
        p.setUltpag("");
        p.setCierre("");
        p.setEsttit("");
        p.setEsttar("");
        p.setPunint(0);
        p.setLintot(0.00);
        p.setCodbloque("");
        p.setDescbloque("");
        p.setFecbloque("");
        p.setFecexpira("");
       
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
