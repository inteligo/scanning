package dao.sql;

import dto.sql.BonoPeruano;
import dto.sql.PagoBonoPeruano;
import java.util.List;

public interface DaoBonoPeruano {
    public List<BonoPeruano> bonoperuanoQry();
    public List<BonoPeruano> LlenaListaVaciaBonoPeruano (Integer tipo);
    public List<PagoBonoPeruano> pagobonoperuanoQry(Integer anio, Integer mes);
    public List<PagoBonoPeruano> LlenaListaVaciaPagoBonoPeruano (Integer tipo);


}
