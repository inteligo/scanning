package com.t24.services;

import dto.t24.services.FC51_DEPODET;
import java.util.List;


public interface FC51Tipo1 {
   public String FC51Str(String CustomerNo);
   public List<FC51_DEPODET> DEPODET (String xmlString, String CustomerNo) ;

}
