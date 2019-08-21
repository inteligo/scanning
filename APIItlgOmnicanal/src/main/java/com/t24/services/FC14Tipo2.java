package com.t24.services;

import dto.t24.services.FC14_PORTFOLIOLIST;
import java.util.List;


public interface FC14Tipo2 {
   public String FC14Str(String CustomerNo);
   public List<FC14_PORTFOLIOLIST> PORTFOLIOLIST (String jsonstring, String CustomerNo) ;   
   public List<FC14_PORTFOLIOLIST> PORTFOLIOLISTACTIVOS(String jsonstring, String CustomerNo) ;
}
