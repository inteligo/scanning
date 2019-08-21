package dao.sql;

import dto.sql.TipoDocumentoBIZAGI;
import java.util.List;
public interface DaoTipoDocumentoBIZAGI {
    public List<TipoDocumentoBIZAGI> tipodocumentobizagiQry();
    public List<TipoDocumentoBIZAGI> LlenaListaVacia(Integer tipo); 
    public List<dto.sql.TipoDocumentoBIZAGI> ListaDatosTipoDocumentoBIZAGI( List<dto.sql.TipoDocumentoBIZAGI>  listTipoDocumentoBIZAGI,String tipodoc) ;

}
