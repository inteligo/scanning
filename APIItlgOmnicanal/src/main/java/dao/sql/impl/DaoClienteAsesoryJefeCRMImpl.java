package dao.sql.impl;

import com.java.Constantes;
import com.sql.HikariMsSqlITLGDWH;
import dto.sql.ClienteCRM;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;
import dao.sql.DaoClienteAsesoryJefeCRM;


public class DaoClienteAsesoryJefeCRMImpl implements DaoClienteAsesoryJefeCRM {

    private final HikariMsSqlITLGDWH conecta;

    public DaoClienteAsesoryJefeCRMImpl() {
        this.conecta = new HikariMsSqlITLGDWH();
    }

    @Override
    public List<ClienteCRM> clienteasesoryjefecrmQry(String idclie,String codase) {
        List<ClienteCRM> list = null; 
        list = new ArrayList<>();
        
        String sql ="{call uspOmniClienteCRMAsesoroJefe (?,?)}";

        Connection cn = conecta.connection();
        if (cn != null) {
            try { 
                
                CallableStatement cs = cn.prepareCall(sql);
                cs.setString(1, idclie);   
                cs.setString(2, codase);   
            

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
                                    ClienteCRM p = new ClienteCRM();
                                    p.setIdclie(idclie);                                  
                                    p.setCodigo(rs.getString(1));
                                    p.setNombre(rs.getString(2));
                                    p.setApellidos(rs.getString(3));                       
                                    p.setSector(rs.getString(4));   
                                    p.setMarcaservicio(rs.getString(5));   
                                    p.setEmail(rs.getString(6)); 
                                    
                                    p.setDireccion(rs.getString(7)); 
                                    p.setTipopersona(rs.getString(8)); 
                                    p.setNombrecompleto(rs.getString(9)); 
                                    p.setSegmento(rs.getString(10)); 
                                    p.setNomsector(rs.getString(11)); 
                                    p.setApesector(rs.getString(12)); 
                                    p.setFonosector(rs.getString(13)); 
                                    p.setAnexosector(rs.getString(14)); 
                                    p.setEmailsector(rs.getString(15)); 
                                    p.setApepaterno(rs.getString(16)); 
                                    p.setApematerno(rs.getString(17)); 
                                    p.setPermiso(rs.getInt(18)); 

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
    public List<ClienteCRM> LlenaListaVacia(Integer tipo) {  //tipo 1: error;    2: no data
        List<ClienteCRM> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
        ClienteCRM p = new ClienteCRM();
        p.setIdclie("");                                  
        p.setCodigo("");
        p.setNombre("");
        p.setApellidos("");                       
        p.setSector("");   
        p.setMarcaservicio("");   
        p.setEmail(""); 

        p.setDireccion(""); 
        p.setTipopersona(""); 
        p.setNombrecompleto(""); 
        p.setSegmento("");
        p.setNomsector(""); 
        p.setApesector(""); 
        p.setFonosector(""); 
        p.setAnexosector(""); 
        p.setEmailsector(""); 
        p.setApepaterno(""); 
        p.setApematerno(""); 
        p.setPermiso(0); 
        
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
