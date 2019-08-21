package dao.sql;

import dto.sql.CalendarioAlerta;
import java.util.List;
public interface DaoCalendarioAlerta {
    public List<CalendarioAlerta> calendarioalertaQry(String fecpro, String tipale, String numdias);
    public List<CalendarioAlerta> LlenaListaVacia (Integer tipo);

}
