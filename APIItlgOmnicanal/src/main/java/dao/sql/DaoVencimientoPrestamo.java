package dao.sql;

import dto.sql.VencimientoPrestamo;
import java.util.List;
public interface DaoVencimientoPrestamo {
    public List<VencimientoPrestamo> VencPrestamoQry(String fecpro, String numdias);
    public List<VencimientoPrestamo> LlenaListaVacia (Integer tipo);

}
