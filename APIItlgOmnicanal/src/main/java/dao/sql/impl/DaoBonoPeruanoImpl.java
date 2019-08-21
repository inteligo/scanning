package dao.sql.impl;

import com.java.Constantes;
import com.sql.HikariMsSqlITLGDWH;
import dto.sql.BonoPeruano;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;
import dao.sql.DaoBonoPeruano;
import dto.sql.PagoBonoPeruano;



public class DaoBonoPeruanoImpl implements DaoBonoPeruano {

    private final HikariMsSqlITLGDWH conecta;

    public DaoBonoPeruanoImpl() {
        this.conecta = new HikariMsSqlITLGDWH();
    }

    @Override
    public List<BonoPeruano> bonoperuanoQry() {
        List<BonoPeruano> list = null; 
        list = new ArrayList<>();        
       
        String sql ="{call uspOmniListaBonosPeruanos}";

        Connection cn = conecta.connection();
        if (cn != null) {
            try {
                CallableStatement cs = cn.prepareCall(sql);
                              
                boolean results = cs.execute();

                ResultSet rs = cs.getResultSet(); 

                if (results==true)
                {
                    if (!rs.isBeforeFirst())
                        {
                            list.addAll(LlenaListaVaciaBonoPeruano(2));  
                        }
                    else
                        {
                        while (rs.next()) 
                            {  
                                BonoPeruano p = new BonoPeruano();                            
                                p.setId(rs.getString(1));
                                p.setIsin(rs.getString(2));     
                                p.setCompanyname(rs.getString(3));  
                                p.setShortname(rs.getString(4));  
                                p.setNombretrading(rs.getString(5));  

                                p.setErrcod(Constantes.RETORNO_OKSQL.toString());
                                p.setDefcod(Constantes.MENSAJE_OKSQL_DEF);
                                p.setDetcod(Constantes.MENSAJE_OKSQL_DET);

                                list.add(p);
                            }
                        }
                }
                else 
                        { //Hay error en SQL                             
                            list.addAll(LlenaListaVaciaBonoPeruano(1));
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
            list.addAll(LlenaListaVaciaBonoPeruano(1));
        }        
        return list;  
    }

    @Override
    public List<BonoPeruano> LlenaListaVaciaBonoPeruano(Integer tipo) {  //tipo 1: error;    2: no data
        List<BonoPeruano> list = null; 
        list = new ArrayList<>();
        if (tipo.equals(null)) {  tipo=1; }
        
        BonoPeruano p = new BonoPeruano();
        
        p.setId("");
        p.setIsin("");
        p.setCompanyname("");  
        p.setShortname("");  
        p.setNombretrading("");      
     
       
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
    public List<PagoBonoPeruano> pagobonoperuanoQry(Integer anio, Integer mes) {
        List<PagoBonoPeruano> list = null; 
        list = new ArrayList<>();        
        
       
        String sql ="{call uspOmniPagoBonosPeruanos (?,?)}";

        Connection cn = conecta.connection();
        if (cn != null) {
            try {
                CallableStatement cs = cn.prepareCall(sql);
                cs.setInt(1, anio);   
                cs.setInt(2, mes);   
                              
                boolean results = cs.execute();

                ResultSet rs = cs.getResultSet(); 

                if (results==true)
                {
                    if (!rs.isBeforeFirst())
                        {
                            list.addAll(LlenaListaVaciaPagoBonoPeruano(2));  
                        }
                    else
                        {
                        while (rs.next()) 
                            {  
                                PagoBonoPeruano p = new PagoBonoPeruano();                            
                                p.setCustomer(rs.getString(1));
                                p.setSector(rs.getString(2));     
                                p.setPortafolio(rs.getString(3));  
                                p.setDesctrans(rs.getString(4));  
                                p.setIdactivo(rs.getString(5));  
                                p.setIsin(rs.getString(6));
                                p.setNombreactivo(rs.getString(7));  
                                p.setMoneda(rs.getString(8));  
                                p.setNominal(rs.getDouble(9));  
                                p.setMontopago(rs.getDouble(10));
                                p.setFechapago(rs.getString(11));  
                                p.setNrodiario(rs.getString(12));  
                                
                                p.setErrcod(Constantes.RETORNO_OKSQL.toString());
                                p.setDefcod(Constantes.MENSAJE_OKSQL_DEF);
                                p.setDetcod(Constantes.MENSAJE_OKSQL_DET);

                                list.add(p);
                            }
                        }
                }
                else 
                        { //Hay error en SQL                             
                            list.addAll(LlenaListaVaciaPagoBonoPeruano(1));
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
            list.addAll(LlenaListaVaciaPagoBonoPeruano(1));
        }        
        return list;  
    }
    
    @Override
    public List<PagoBonoPeruano> LlenaListaVaciaPagoBonoPeruano(Integer tipo) {  //tipo 1: error;    2: no data
        List<PagoBonoPeruano> list = null; 
        list = new ArrayList<>();
        if (tipo.equals(null)) {  tipo=1; }
        
        PagoBonoPeruano p = new PagoBonoPeruano();        

        p.setCustomer("");
        p.setSector("");     
        p.setPortafolio("");  
        p.setDesctrans("");  
        p.setIdactivo("");  
        p.setIsin("");
        p.setNombreactivo("");  
        p.setMoneda("");  
        p.setNominal(0.00);  
        p.setMontopago(0.00);
        p.setFechapago("");  
        p.setNrodiario("");  
     
       
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
