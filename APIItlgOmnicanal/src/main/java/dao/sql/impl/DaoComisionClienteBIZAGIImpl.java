package dao.sql.impl;

import com.java.Constantes;
import com.sql.HikariMsSqlITLGDWH;
import dto.sql.ComisionClienteBIZAGI;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;
import dao.sql.DaoComisionClienteBIZAGI;


public class DaoComisionClienteBIZAGIImpl implements DaoComisionClienteBIZAGI {

    private final HikariMsSqlITLGDWH conecta;

    public DaoComisionClienteBIZAGIImpl() {
        this.conecta = new HikariMsSqlITLGDWH();
    }

    @Override
    public List<ComisionClienteBIZAGI> comisionclientebizagiQry(String segmento,String tipotransferencia,Integer esbancolocal ) {
        List<ComisionClienteBIZAGI> list = null; 
        list = new ArrayList<>();
        
        String sql ="{call uspOmniComisionCliente (?,?,?)}";

        Connection cn = conecta.connection();
        if (cn != null) {
            try { 
                
                CallableStatement cs = cn.prepareCall(sql);
                cs.setString(1, segmento);   
                cs.setString(2,tipotransferencia);
                cs.setInt(3,esbancolocal);

            

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
                                    ComisionClienteBIZAGI p = new ComisionClienteBIZAGI();                                  
                                    p.setCodsegmento(rs.getString(1));
                                    p.setSegmento(rs.getString(2));
                                    p.setCodtipotransferencia(rs.getString(3));                       
                                    p.setTipotransferencia(rs.getString(4));   
                                    p.setMontominimo(rs.getDouble(5));   
                                    p.setMontomaximo(rs.getDouble(6));                                    
                                 

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
    public List<ComisionClienteBIZAGI> LlenaListaVacia(Integer tipo) {  //tipo 1: error;    2: no data
        List<ComisionClienteBIZAGI> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
        ComisionClienteBIZAGI p = new ComisionClienteBIZAGI();
        p.setCodsegmento("");                                  
        p.setSegmento("");
        p.setCodtipotransferencia("");
        p.setTipotransferencia("");   
       p.setMontominimo(0.00);   
        p.setMontomaximo(0.00);    
        
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
