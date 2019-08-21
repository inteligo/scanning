package com.t24.services;

import dto.t24.services.TRADINGACCOUNTDETAILS;
import java.util.List;

public interface TradingAccountDetails360 {
   public String TradingAccountDetails360Str(String CustomerNo);
   public List<TRADINGACCOUNTDETAILS> TRADINGACCOUNTDETAILS (String jsonstring, String CustomerNo,List<dto.sql.Moneda>  listMonedas) ;   
}
