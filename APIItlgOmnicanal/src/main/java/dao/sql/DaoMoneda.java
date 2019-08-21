package dao.sql;

import dto.sql.Moneda;
import java.util.List;
public interface DaoMoneda {
    public List<Moneda> monedaQry(String Id);
    public List<Moneda> LlenaListaVacia (Integer tipo);

}
