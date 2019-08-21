package dao.sql;

import dto.sql.ClienteCRM;
import java.util.List;
public interface DaoClienteCRM {
    public List<ClienteCRM> clientecrmQry(String idclie);
    public List<ClienteCRM> LlenaListaVacia(Integer tipo); 

}
