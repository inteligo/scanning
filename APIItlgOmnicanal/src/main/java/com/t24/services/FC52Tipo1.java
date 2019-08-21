package com.t24.services;

import dto.t24.services.FC52_LOANDET;
import java.util.List;

public interface FC52Tipo1 {
   public String FC52Str(String CustomerNo);
   public List<FC52_LOANDET> LOANDET (String xmlString, String CustomerNo) ;

}
