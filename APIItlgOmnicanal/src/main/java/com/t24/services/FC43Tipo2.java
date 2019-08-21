package com.t24.services;

import dto.t24.services.FC43_MASTERLIST;
import java.util.List;


public interface FC43Tipo2 {
   public String FC43Str(String product);
   public List<FC43_MASTERLIST> MASTERLIST (String jsonstring, String product) ;
   
}
