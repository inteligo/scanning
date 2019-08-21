package dao.sql;

import dto.sql.ComisionClienteBIZAGI;
import java.util.List;
public interface DaoComisionClienteBIZAGI {
    public List<ComisionClienteBIZAGI> comisionclientebizagiQry(String segmento,String tipotransferencia,Integer esbancolocal);
    public List<ComisionClienteBIZAGI> LlenaListaVacia(Integer tipo); 

}
