package dao.sql.impl;

import com.java.Constantes;
import com.sql.HikariMsSqlITLGDWH;
import dto.sql.TipoDocumentoBIZAGI;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;
import dao.sql.DaoTipoDocumentoBIZAGI;
import java.util.stream.Collectors;


public class DaoTipoDocumentoBIZAGIImpl implements DaoTipoDocumentoBIZAGI {

    private final HikariMsSqlITLGDWH conecta;

    public DaoTipoDocumentoBIZAGIImpl() {
        this.conecta = new HikariMsSqlITLGDWH();
    }

    @Override
    public List<TipoDocumentoBIZAGI> tipodocumentobizagiQry() {
        List<TipoDocumentoBIZAGI> list = null; 
        list = new ArrayList<>();
        
        String sql ="{call uspOmniBZGTipoDocumento}";

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
                                    TipoDocumentoBIZAGI p = new TipoDocumentoBIZAGI();                                  
                                    p.setCodigo(rs.getString(1));
                                    p.setDescripcion(rs.getString(2));
                                    p.setEquivalenciate(rs.getString(3));                       
                                    p.setEquivalenciaib(rs.getString(4));   
                                    
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
    public List<TipoDocumentoBIZAGI> LlenaListaVacia(Integer tipo) {  //tipo 1: error;    2: no data
        List<TipoDocumentoBIZAGI> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
        TipoDocumentoBIZAGI p = new TipoDocumentoBIZAGI();
        p.setCodigo("");                                  
        p.setDescripcion("");
        p.setEquivalenciate("");
        p.setEquivalenciaib("");   
         
        
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
    
      public List<dto.sql.TipoDocumentoBIZAGI> ListaDatosTipoDocumentoBIZAGI( List<dto.sql.TipoDocumentoBIZAGI>  listTipoDocumentoBIZAGI,String tipodoc) 
     {       
         List<dto.sql.TipoDocumentoBIZAGI> result = null;  
         result= new ArrayList<>();   
        
         int cantidadDatosLista=0;                     
        
        try
        { 
            cantidadDatosLista= listTipoDocumentoBIZAGI.size();
            if (cantidadDatosLista>0 )
                    {   
                        result = listTipoDocumentoBIZAGI.stream().filter(x -> x.getDescripcion().trim().equals(tipodoc)).collect(Collectors.toList());                        
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
