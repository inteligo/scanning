package dao.sql;

import dto.sql.ClienteCRM;
import java.util.List;
public interface DaoClienteAsesoryJefeCRM {
    public List<ClienteCRM> clienteasesoryjefecrmQry(String idclie,String codase);
    public List<ClienteCRM> LlenaListaVacia(Integer tipo);  
}
