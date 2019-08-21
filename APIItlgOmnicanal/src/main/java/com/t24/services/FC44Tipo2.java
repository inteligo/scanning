package com.t24.services;

import dto.t24.services.FC44_DEPODETS;
import java.util.List;


public interface FC44Tipo2 {
   public String FC44Str(String CustomerNo);
   public List<FC44_DEPODETS> DEPODETS (String xmlString, String CustomerNo,List<dto.sql.Moneda>  listMonedas) ;
   
}
