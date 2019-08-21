package com.t24.services;

import dto.t24.services.FC53_ACCTDETS;
import dto.t24.services.FC53_SIGNDETS;
import dto.t24.services.FCCuentaFirma;
import dto.t24.services.FCTotalPortafolio;
import java.util.List;



public interface FC53Tipo1Nuevo {
   public String FC53Str(String CustomerNo);
   public List<FC53_ACCTDETS> FC53ACCTDETS (String xmlString, String CustomerNo,List<dto.sql.Moneda>  listMonedas)  ;
   public List<FC53_SIGNDETS> FC53SIGNDETS (String xmlString, String CustomerNo) ;
   public List FC53List (String xmlString,String CustomerNo,List<dto.sql.Moneda>  listMonedas) ;
   public List<FC53_SIGNDETS> FC53SIGNDETSTotal (String xmlString,String CustomerNo,List<dto.sql.Moneda>  listMonedas);
   public List CuentayFirmaList (String xmlString,String CustomerNo,List<dto.sql.Moneda>  listMonedas)  ;
   public List CuentayFirmaFiltroTyFList (String xmlString,String CustomerNo,List<dto.sql.Moneda>  listMonedas) ;
   public List<FCCuentaFirma> CuentaConPortafolioLista(String xmlString,String CustomerNo,List<dto.sql.Moneda>  listMonedas);
   public List<FCCuentaFirma> CuentaSinPortafolioLista(String xmlString,String CustomerNo,List<dto.sql.Moneda>  listMonedas);
   public List<FC53_ACCTDETS> ConsultaSaldo (String xmlString , String CustomerNo , String numCuenta,List<dto.sql.Moneda>  listMonedas);
   public List<FCTotalPortafolio> TotalPortafolio(String xmlString,String CustomerNo,List<dto.sql.Moneda>  listMonedas)  ;

//   public String FC53List2 (String CustomerNo) ;
//   public  JSONObject Patrimonio (String CustomerNo) ;
//   public  JSONObject PatrimonioHilo (String CustomerNo) ;
}
