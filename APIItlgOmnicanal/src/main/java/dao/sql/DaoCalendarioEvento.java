package dao.sql;

import dto.sql.CalendarioEvento;
import java.util.List;
public interface DaoCalendarioEvento {
    public List<CalendarioEvento> calendarioeventoQry(String idclie, String tipomov);
    public List<CalendarioEvento> LlenaListaVacia (Integer tipo);

}
