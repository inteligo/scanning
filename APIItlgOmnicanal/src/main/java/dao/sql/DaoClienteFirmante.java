package dao.sql;

import dto.sql.ClienteFirmante;
import java.util.List;
public interface DaoClienteFirmante {
    public List<ClienteFirmante> clientefirmanteQry(String idclie);
    public List<ClienteFirmante> LlenaListaVacia(Integer tipo); 

}
