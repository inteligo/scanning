package com.t24.services;

import dto.t24.services.FC01_ACLIST;
import dto.t24.services.FC01_COLLLIST;
import dto.t24.services.FC01_CUSLIST;
import dto.t24.services.FC01_LIMITLIST;
import dto.t24.services.FC01_SIGNLIST;
import java.util.List;


public interface FC01Tipo1Nuevo {
   public String FC01Str(String CustomerNo);
   public List<FC01_CUSLIST> FC01CUSList (String xmlString, String CustomerNo)  ;
   public List<FC01_ACLIST> FC01ACList (String xmlString, String CustomerNo,List<dto.sql.Moneda>  listMoneda) ;
   public List<FC01_SIGNLIST> FC01SIGNList (String xmlString, String CustomerNo) ;
   public List<FC01_COLLLIST> FC01COLLList (String xmlString, String CustomerNo) ;
   public List<FC01_LIMITLIST> FC01LIMITList (String xmlString, String CustomerNo) ;   
   public List FC01List (String xmlString,String CustomerNo,List<dto.sql.Moneda>  listMoneda) ;
   public List<FC01_SIGNLIST> FC01SIGNListTotal (String xmlString,String CustomerNo,List<dto.sql.Moneda>  listMonedas) ;
   public List CuentayFirmaList (String xmlString,String CustomerNo,List<dto.sql.Moneda>  listMoneda)  ;
   public List CuentayFirmaFiltroTyFList (String xmlString,String CustomerNo,List<dto.sql.Moneda>  listMonedas) ;
   public List<FC01_ACLIST> ConsultaSaldo (String xmlString , String CustomerNo , String numCuenta,List<dto.sql.Moneda>  listMoneda);

//   public String FC01List2 (String CustomerNo) ;
//   public  JSONObject Patrimonio (String CustomerNo) ;
//   public  JSONObject PatrimonioHilo (String CustomerNo) ;
}
