package dao.sql;

import dto.sql.MovimientoDeposito;
import java.util.List;
public interface DaoMovimientoDeposito {
    public List<MovimientoDeposito> movimientodepositoQry(String Id);
    public List<MovimientoDeposito> LlenaListaVacia(Integer tipo);

}
