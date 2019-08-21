package com.t24.services.impl;

import com.java.Constantes;
import com.java.Convierte;
import com.t24.services.FC13Tipo2;
import dto.t24.services.FC13_INVTASSETDETS;
import dto.t24.services.FCReturn;
import java.util.List;
import org.jdom2.input.SAXBuilder;
import java.util.ArrayList;
import com.t24.services.CWServiceTWS_Tipo2;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.t24.services.FCResponse;
import com.t24.services.input.InputCollection;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class FC13Tipo2Impl implements FC13Tipo2 {      


    
    @Override
    public String FC13Str(String CustomerNo,String PortfolioNo,String Product)   {
        CWServiceTWS_Tipo2  consumingservice= new CWServiceTWS_Tipo2Impl();
        com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();  
        com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
        Gson gson =new GsonBuilder().serializeNulls().create();
        String respuesta="";          
        
        InputCollection ic =new InputCollection();
        InputCollectionTipo2Impl icimpl=new InputCollectionTipo2Impl();
        
        ic.setCUSTOMERID(CustomerNo);
        ic.setPORTFOLIOID(PortfolioNo);
        ic.setPRODUCTID(Product);
        
        enquiryInput=icimpl.Input(ic);
        respuesta = consumingservice.CallService(Constantes.INTEGRADOR_FC13,enquiryInput);
        
        return respuesta;
        }
    
    @Override
    public List<FC13_INVTASSETDETS> INVTASSETDETS (String jsonstring,String CustomerNo,String IdProduct,List<dto.sql.Moneda>  listMonedas) {
        SAXBuilder builder = new SAXBuilder();        
        String errcod="";
        String detcod="";
        String defcod="";
        String moneda="";
        FCResponse fcretorno= new FCResponseImpl();
        List list = new ArrayList<>();   
        List<dto.sql.Moneda>  listMoneda=null;        
        DaoListaMoneda listamoneda= new DaoListaMonedaImpl(); 

        try {     
          
                List<FCReturn> listaRetorno =fcretorno.ListaRetorno(jsonstring);       

                    for (FCReturn lpf : listaRetorno) 
                    {
                            errcod= lpf.getErrcod();
                            detcod=lpf.getDetcod();
                            defcod=lpf.getDefcod();      
                    }            
           
                   if (errcod.equals("0"))
                    {                          
                         JSONArray jsonObj = new JSONArray(jsonstring);               
                         JSONObject table = jsonObj.optJSONObject(0).optJSONObject("gbrinvassetdetDetailType");
                         if (table!=null)                        
                         {
                            JSONArray dataArray = (JSONArray) table.get("mbrinvassetdetDetailType");
                                for (int i = 0; i < dataArray.length(); i++) 
                                {                                    
                                    JSONObject rec = dataArray.optJSONObject(i);                                    
                                    if (rec.optString("hdr").trim().equals(""))
                                    {
                                            FC13_INVTASSETDETS lista = new FC13_INVTASSETDETS();
                                            String strfecha="";
                                       
                                            lista.setIdClient(CustomerNo);
                                            lista.setIdProduct(IdProduct);
                                            lista.setProductType((String) rec.optString("productType").trim());
                                            lista.setAssetClass((String) rec.optString("assetClass").trim()); 
                                            lista.setSector((String) rec.optString("sector").trim()); 

                                            lista.setRegion((String) rec.optString("region").trim());
                                            lista.setCurrency((String) rec.optString("currency").trim());
                                            lista.setProducto((String) rec.optString("producto").trim()); 
                                            lista.setValorNominal(Convierte.NumStringaDouble(rec.optString("valorNominal").trim())); 
                                            lista.setUnits(Convierte.NumStringaDouble(rec.optString("units").trim()));
                                            strfecha=rec.optString("lastPurchaseDate","").trim();
                                            if (strfecha.equals(""))
                                                        {
                                                     lista.setLastPurchaseDate((String) Convierte.FecStraDateStr(strfecha));           
                                                }
                                                else
                                                {
                                                    lista.setLastPurchaseDate((String) Convierte.FecStraDateStr("19000101"));           
                                                }
                                            lista.setLastPurchaseDate((String) Convierte.FecStraDateStr(rec.optString("lastPurchaseDate","").trim()));    
                                            lista.setAvgPurchasePrice(Convierte.NumStringaDouble(rec.optString("avgPurchasePrice").trim()));    
                                            lista.setTotalInvestment(Convierte.NumStringaDouble(rec.optString("totalInvestment").trim()));    
                                            lista.setOriginalCurrency((String) rec.optString("originalCurrency").trim());    
                                            lista.setTotalInvOriginalCcy(Convierte.NumStringaDouble(rec.optString("totalInvOriginalCCY").trim()));    
                                            lista.setMarketPrice(Convierte.NumStringaDouble(rec.optString("marketPrice").trim()));    
                                            lista.setMarketValueDate((String) Convierte.FecStraDateStr(rec.optString("marketValueDate","").trim()));    
//                                            lista.setMarketValue((Double) Convierte.NumStringaDouble(rec.optString("marketValue").trim()));    
                                            
                                           lista.setMarketValueUSD((Convierte.NumStringaDouble(rec.optString("marketValue").trim())));  
                                            
                                            lista.setAccruedInterest(Convierte.NumStringaDouble(rec.optString("accuredInterest").trim()));   
                                            
                                            lista.setProfitLossUSD(Convierte.NumStringaDouble(rec.optString("profitLoss").trim()));    
                                            
                                            lista.setCoupon(Convierte.NumStringaDouble(rec.optString("coupon").trim()));    
                                            lista.setCouponAmount(Convierte.NumStringaDouble(rec.optString("couponAmount").trim()));    
                                            lista.setNextPayment((String) Convierte.FecStraDateStr(rec.optString("nextPayment","").trim()));    

                                            lista.setInterestFrequency((String) rec.optString("interestFrequency").trim());    
                                            lista.setMaturityDate((String) Convierte.FecStraDateStr(rec.optString("maturityDate","").trim()));    
                                            lista.setPledge((String) rec.optString("pledge").trim());   

                                            moneda=(String) rec.optString("originalCurrency").trim();
                                            if (!moneda.equals(""))
                                            {
                                           listMoneda=listamoneda.ListaDatosMoneda(listMonedas, moneda);                                          
                                            if (listMoneda.size()>0 )
                                                {                                            
                                                    lista.setNombreMoneda(listMoneda.get(0).getMoneda());
                                                    lista.setSimboloMoneda(listMoneda.get(0).getSimbolo());
                                                    lista.setTotalInvestmentUSD((Convierte.NumStringaDouble(rec.optString("totalInvOriginalCCY").trim()))*listMoneda.get(0).getTipocambio());    
                                                    lista.setMarketPriceUSD((Convierte.NumStringaDouble(rec.optString("marketPrice").trim()))*listMoneda.get(0).getTipocambio());  
                                                    lista.setMarketValue((Convierte.NumStringaDouble(rec.optString("marketValue").trim()))/listMoneda.get(0).getTipocambio());  
                                                    lista.setAccruedInterestUSD((Convierte.NumStringaDouble(rec.optString("accuredInterest").trim()))*listMoneda.get(0).getTipocambio()); 
                                                    lista.setProfitLoss(Convierte.NumStringaDouble(rec.optString("profitLoss").trim())/listMoneda.get(0).getTipocambio());   
                                            }
                                        else{
                                                    lista.setTotalInvestmentUSD((Convierte.NumStringaDouble(rec.optString("totalInvOriginalCCY").trim())));    
                                                    lista.setMarketPrice((Convierte.NumStringaDouble(rec.optString("marketPrice").trim())));  
                                                    lista.setMarketPriceUSD((Convierte.NumStringaDouble(rec.optString("marketPrice").trim())));
                                                    lista.setMarketValue((Convierte.NumStringaDouble(rec.optString("marketValue").trim())));  
                                                    lista.setAccruedInterestUSD((Convierte.NumStringaDouble(rec.optString("accuredInterest").trim()))); 
                                                    lista.setProfitLoss(Convierte.NumStringaDouble(rec.optString("profitLoss").trim()));   
                                                    lista.setNombreMoneda(moneda);
                                                    lista.setSimboloMoneda("$");
                                            }
                                            }
                                            else{
                                                lista.setTotalInvestmentUSD(0.00);    
                                                lista.setMarketPriceUSD(0.00);  
                                                lista.setMarketValueUSD(0.00);  
                                            }
                                        lista.setErrcod(errcod);
                                        lista.setDetcod(detcod);
                                        lista.setDefcod(defcod); 
                                        list.add(lista);        
                                    } 
                            }  
                        }
                        else
                        {
                              list.addAll(LlenaListaVacia(2,CustomerNo,IdProduct,errcod,detcod,defcod));
                        }
            }
            else
            {   
                list.addAll(LlenaListaVacia(2,CustomerNo,IdProduct,errcod,detcod,defcod));
                
  
            } 
            }

        catch (JSONException e) {
                 list.addAll(LlenaListaVacia(1,CustomerNo,IdProduct,errcod,e.getMessage(),e.getCause().toString()));

      
      }
        return list;
    } 
    
        public List<FC13_INVTASSETDETS> LlenaListaVacia(Integer tipo,String CustomerNo,String IdProduct, String errcod,String detcod,String defcod) {  //tipo 1: error;   2: no data
        List<FC13_INVTASSETDETS> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
                FC13_INVTASSETDETS lista = new FC13_INVTASSETDETS();
               lista.setIdClient("");
                lista.setIdProduct("");
                lista.setProducto(""); 
                lista.setProductType("");
                lista.setAssetClass(""); 
                lista.setSector(""); 
                lista.setRegion("");
                lista.setCurrency("");
                lista.setValorNominal(0.00); 
                lista.setUnits(0.00);               
                lista.setAvgPurchasePrice(0.00);    
                lista.setTotalInvestment(0.00);               
                lista.setTotalInvOriginalCcy(0.00);    
                lista.setMarketPrice(0.00);               
                lista.setMarketValue(0.00);    
                lista.setAccruedInterest(0.00);    
                lista.setProfitLoss(0.00);    
                lista.setProfitLossUSD(0.00);    
                lista.setCoupon(0.00);    
                lista.setCouponAmount(0.00);     
                lista.setTotalInvestmentUSD(0.00);    
                lista.setMarketPriceUSD(0.00);    
                lista.setMarketValueUSD(0.00);    
                lista.setAccruedInterestUSD(0.00);
                   
                lista.setDefcod(defcod);
                lista.setDetcod(detcod);
                   
                if ( tipo.equals(1)) //error
                {
                   lista.setErrcod(Constantes.HTTP_RESPUESTA_NOTFOUND.toString());                 
                }
                else  //sin data
                {  
                   lista.setErrcod(errcod);                 
                }

                list.add(lista);   

        return list;
    }
      
}
