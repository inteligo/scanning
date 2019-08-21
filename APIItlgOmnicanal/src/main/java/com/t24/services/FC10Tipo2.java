package com.t24.services;



import dto.t24.services.FC10_ASSETLIST;
import java.util.List;


public interface FC10Tipo2 {
   public String FC10Str(String CustomerNo);
   public List<FC10_ASSETLIST> FC10ASSETList (String xmlString, String CustomerNo) ;
//   public String FC10JSONSUCCESS (String ibaguid,String functioncode,String channel , String agentid ,int customerhead,int customerbody);
   
}
