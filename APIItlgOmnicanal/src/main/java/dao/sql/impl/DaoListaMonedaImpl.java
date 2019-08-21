package dao.sql.impl;

import com.java.Constantes;
import com.sql.HikariMsSqlITLGDWH;
import dao.sql.DaoListaMoneda;
import dto.sql.Moneda;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;
import java.util.stream.Collectors;




public class DaoListaMonedaImpl implements DaoListaMoneda {

    private final HikariMsSqlITLGDWH conecta;

    public DaoListaMonedaImpl() {
        this.conecta = new HikariMsSqlITLGDWH();
    }

    @Override
    public List<Moneda> listamonedaQry() {
        List<Moneda> list = null; 
        list = new ArrayList<>();        
        
       
        String sql ="{call uspOmniListaMoneda }";

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
                            list.addAll(LlenaListaVacia(2));  
                        }
                    else
                        {
                        while (rs.next()) 
                            {  
                                Moneda p = new Moneda();                            
                                p.setId(rs.getString(1));
                                p.setMoneda(rs.getString(2));    
                                p.setSimbolo(rs.getString(3));     
                                p.setTipocambio(rs.getDouble(4));     
                                p.setFecha(rs.getString(5));     
                                
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
    public List<Moneda> LlenaListaVacia(Integer tipo) {  //tipo 1: error;    2: no data
        List<Moneda> list = null; 
        list = new ArrayList<>();
        if (tipo.equals(null)) {  tipo=1; }
        
        Moneda p = new Moneda();
        
        p.setId("");
        p.setMoneda("");
        p.setSimbolo("");
        p.setTipocambio(0.00);     
         p.setFecha("19000101");
     
       
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
    
     public List<dto.sql.Moneda> ListaDatosMoneda( List<dto.sql.Moneda>  listMoneda,String moneda) 
     {       
         List<dto.sql.Moneda> result = null;  
         result= new ArrayList<>();   
        
         int cantidadDatosLista=0;                     
        
        try
        { 
            cantidadDatosLista= listMoneda.size();
            if (cantidadDatosLista>0 )
                    {   
                        result = listMoneda.stream().filter(x -> x.getId().trim().equals(moneda)).collect(Collectors.toList());                        
                      }
                 else
                    {
                         result= null;
                    }
        }
        catch (Exception e){
        }
         return result;
    }
    
  
}
