package dao.sql;

import dto.sql.CalendarioEvento;
import java.util.List;
public interface DaoCalendarioBono {
    public List<CalendarioEvento> calendariobonoQry(String idclie,String codpor, String codpro, Double couponamount);
    public List<CalendarioEvento> LlenaListaVacia(Integer tipo); 

}
