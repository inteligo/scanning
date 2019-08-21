package dao.sql;

import dto.sql.PagoCupon;
import java.util.List;
public interface DaoPagoCupon {
    public List<PagoCupon> pagocuponQry(String fechaini, String fechafin);
    public List<PagoCupon> LlenaListaVacia(Integer tipo);

}
