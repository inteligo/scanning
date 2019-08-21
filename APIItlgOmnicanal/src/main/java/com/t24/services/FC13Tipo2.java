package com.t24.services;

import dto.t24.services.FC13_INVTASSETDETS;
import java.util.List;


public interface FC13Tipo2 {
   public String FC13Str(String CustomerNo,String PortfolioNo,String Product);
//   public List FC13Tipo2List(String CustomerNo,String PortfolioNo,String Product)  ;
   public List<FC13_INVTASSETDETS> INVTASSETDETS (String jsonstring, String CustomerNo,String IdProduct,List<dto.sql.Moneda>  listMonedas) ;
   
//   public String FC13SUCCESS(String CustomerNo);
//   public List<FC13_INVTASSETDETS> INVTASSETDETSJSON (String json, String CustomerNo,String IdProduct) ;
//   public String FC13JSONSUCCESS(String ibaguid , String functioncode , String channel , String agentid, int customerhead , int customerbody , String portafoliono);
   
}
