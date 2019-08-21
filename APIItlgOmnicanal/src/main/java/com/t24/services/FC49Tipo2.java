package com.t24.services;

import dto.t24.services.FC49_LOANSIGN;
import java.util.List;

public interface FC49Tipo2 {
   public String FC49Str(String CustomerNo);
   public List<FC49_LOANSIGN> LOANSIGN (String jsonstring, String CustomerNo,List<dto.sql.Moneda>  listMonedas) ;
 
}
