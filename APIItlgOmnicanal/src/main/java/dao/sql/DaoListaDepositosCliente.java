package dao.sql;

import dto.t24.services.FC44_DEPODETS;
import java.util.List;
public interface DaoListaDepositosCliente {
    public List<FC44_DEPODETS> listadepositosclienteQry(String idclie);
    public List<FC44_DEPODETS> LlenaListaVacia (Integer tipo);

}
