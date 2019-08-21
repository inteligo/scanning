package com.t24.services;

import dto.t24.services.FC12_PORTFOLIODETAILS;
import java.util.List;


public interface FC12Tipo2 {
   public String FC12Str(String CustomerNo,String PortfolioNo);
   public List<FC12_PORTFOLIODETAILS> PORTFOLIODETAILS (String jsonstring, String CustomerNo,String PortfolioNo,List<dto.sql.Moneda>  listMonedas) ;   
}
