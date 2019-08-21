package com.t24.services;

import dto.t24.services.ACCOUNTDETAILS;
import java.util.List;

public interface AccountDetails360 {
   public String AccountDetails360Str(String CustomerNo);
   public List<ACCOUNTDETAILS> ACCOUNTDETAILS (String jsonstring, String CustomerNo,List<dto.sql.Moneda>  listMonedas) ;   
}
