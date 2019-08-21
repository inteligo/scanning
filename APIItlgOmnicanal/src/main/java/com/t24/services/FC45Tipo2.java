package com.t24.services;

import dto.t24.services.FC45_LOANDETS;
import java.util.List;

public interface FC45Tipo2 {
   public String FC45Str(String CustomerNo);
   public List<FC45_LOANDETS> LOANDETAILS (String xmlString, String CustomerNo,List<dto.sql.Moneda>  listMonedas) ;
   public List<FC45_LOANDETS> LlenaListaVacia(Integer tipo,String CustomerNo,String errcod,String detcod,String defcod);
}
