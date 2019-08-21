package dao.sql;

import dto.sql.DetalleTarjetaCredito;
import dto.sql.MovimientoTarjetaCredito;
import java.util.List;
public interface DaoTarjetaCredito {
    public List<DetalleTarjetaCredito> detalletarjetacreditoQry(String Id,String fecpro, String verbloq);
    public List<DetalleTarjetaCredito> LlenaListaVaciaDetalleTarjetaCredito (Integer tipo);
    public List<MovimientoTarjetaCredito> movimientotarjetacreditoQry(String Id,String fecpro);
    public List<MovimientoTarjetaCredito> LlenaListaVaciaMovimientoTarjetaCredito(Integer tipo);
    public List<MovimientoTarjetaCredito> movimientotarjetacreditoporcantidadQry(String id,String fecpro,Integer numcant );
    public List<DetalleTarjetaCredito> tarjetacreditobloquedasQry(String fecpro);
    public List<DetalleTarjetaCredito> LlenaListaVaciaTarjetaCreditoBloqueadas (Integer tipo);
}
