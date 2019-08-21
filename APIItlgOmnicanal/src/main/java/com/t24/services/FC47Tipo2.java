package com.t24.services;

import dto.t24.services.FC47_AASCH;
import dto.t24.services.FC47_BILLDETS;
import java.util.List;


public interface FC47Tipo2 {
   public String FC47Str(String CustomerNo,String Id);
   public List<FC47_AASCH> AASCH (String xmlString, String CustomerNo) ;
//   public List<FC47_BILLDETS> BILLDETS(String json, String CustomerNo);
   
}
