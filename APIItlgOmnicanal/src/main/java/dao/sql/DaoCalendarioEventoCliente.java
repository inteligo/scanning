package dao.sql;

import dto.sql.CalendarioEventoCliente;
import java.util.List;
public interface DaoCalendarioEventoCliente {
    public List<CalendarioEventoCliente> calendarioeventoclienteQry(String idclie, String tipomov,Integer anio, Integer mes,String estitu);
    public List<CalendarioEventoCliente> LlenaListaVacia (Integer tipo);

}
