package com.t24.services;

import dto.t24.services.FC48_STMTDETS;
import java.util.List;

public interface FC48Tipo2 {
   public String FC48Str(String CustomerNo,String Id, String Fecha);
   public List<FC48_STMTDETS> STMTDETS (String xmlString, String CustomerNo,List<dto.sql.Moneda>  listMonedas) ;
   public List<FC48_STMTDETS>  calcularCuenta(List <FC48_STMTDETS> ls , Double saldo);   
}
