package dao.sql;

import dto.sql.CalendarioBono;
import java.util.List;
public interface DaoCalendarioPagoBono {
    public List<CalendarioBono> calendariopagobonoQry(String codpro);
    public List<CalendarioBono> LlenaListaVacia(Integer tipo); 

}
