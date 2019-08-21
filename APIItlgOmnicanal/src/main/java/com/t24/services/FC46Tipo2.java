package com.t24.services;

import dto.t24.services.FC46_MPPRDETS;
import dto.t24.services.FC46_PPRDETS;
import java.util.List;

public interface FC46Tipo2 {
   public String FC46Str(String CustomerNo,String PortfolioNo);
   public List<FC46_PPRDETS> PPRDETS (String xmlString, String CustomerNo, String PortfolioNo) ;
//   public List<FC46_MPPRDETS> MPPRDETS(String xmlString, String CustomerNo, String PortfolioNo);
   
}
