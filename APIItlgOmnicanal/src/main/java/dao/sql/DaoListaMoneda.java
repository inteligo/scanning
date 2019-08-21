package dao.sql;

import dto.sql.Moneda;
import java.util.List;
public interface DaoListaMoneda {
    public List<Moneda> listamonedaQry();
    public List<Moneda> LlenaListaVacia (Integer tipo);
    public List<dto.sql.Moneda> ListaDatosMoneda( List<dto.sql.Moneda>  listMoneda,String moneda) ;

}
