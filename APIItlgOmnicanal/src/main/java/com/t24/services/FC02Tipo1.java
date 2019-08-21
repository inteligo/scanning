package com.t24.services;

import dto.t24.services.FC02_ACCCUST;
import java.util.List;

public interface FC02Tipo1 {
   public String FC02Str(String AccountNo);
   public List<FC02_ACCCUST> FC02ACCCUST (String xmlString, String AccountNo)  ;
   
 
}
