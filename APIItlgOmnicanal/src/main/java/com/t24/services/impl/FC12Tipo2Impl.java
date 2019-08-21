package com.t24.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import com.t24.services.FC12Tipo2;
import dto.t24.services.FCReturn;
import java.util.List;
import org.jdom2.input.SAXBuilder;
import java.util.ArrayList;
import com.t24.services.CWServiceTWS_Tipo2;
import com.t24.services.FCResponse;
import com.t24.services.input.InputCollection;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;

import dto.t24.services.FC12_PORTFOLIODETAILS;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FC12Tipo2Impl implements FC12Tipo2 {  
        
 
    
    @Override
    public String FC12Str(String CustomerNo,String PortfolioNo)   {
        CWServiceTWS_Tipo2  consumingservice= new CWServiceTWS_Tipo2Impl();
        com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();  
        com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
        Gson gson =new GsonBuilder().serializeNulls().create();
        String respuesta="";          
        
        InputCollection ic =new InputCollection();
        InputCollectionTipo2Impl icimpl=new InputCollectionTipo2Impl();
        
        ic.setCUSTOMERID(CustomerNo);
        ic.setPORTFOLIOID(PortfolioNo);        
        
        enquiryInput=icimpl.Input(ic);
        respuesta = consumingservice.CallService(Constantes.INTEGRADOR_FC12,enquiryInput);
        
        return respuesta;
        }
    

    @Override
    public List<FC12_PORTFOLIODETAILS> PORTFOLIODETAILS (String jsonstring,String CustomerNo,String PortfolioNo,List<dto.sql.Moneda>  listMonedas) {
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
                        JSONObject table = jsonObj.optJSONObject(0).optJSONObject("gbrintbportdetDetailType");
                         if (table!=null)                        
                        {
                            JSONArray dataArray = (JSONArray) table.get("mbrintbportdetDetailType");
                            for (int i = 0; i < dataArray.length(); i++) 
                            {
                                        FC12_PORTFOLIODETAILS lista = new FC12_PORTFOLIODETAILS();
                                        JSONObject rec = dataArray.optJSONObject(i);
                                        lista.setIdClient(CustomerNo);
                                        lista.setIdPortfolio(PortfolioNo);
                                        lista.setGroup((String) rec.optString("group").trim());
                                        lista.setProductType((String) rec.optString("productType").trim());
                                        lista.setAssetClass((String) rec.optString("assetClass").trim()); 
                                        lista.setSector((String) rec.optString("sector").trim()); 

                                        lista.setRegion((String) rec.optString("region").trim());
                                        lista.setCurrency((String) rec.optString("currency").trim());
                                        lista.setSecurityID((String) rec.optString("securityId").trim()); 
                                        lista.setProductName((String) rec.optString("productName").trim());                    

                                        lista.setCurrentBalance(Convierte.NumStringaDouble(rec.optString("currentBalance").trim()));  
                                        lista.setRealDist((String) rec.optString("realDist").trim());  

                                         moneda=(String) rec.optString("currency").trim();
                                        if (!moneda.equals(""))
                                        {
                                            listMoneda=listamoneda.ListaDatosMoneda(listMonedas, moneda);                                                             
                                            if (listMoneda.size()>0 )
                                                    {
                                                        lista.setCurrentBalanceUSD((Convierte.NumStringaDouble(rec.optString("currentBalance").trim()))*listMoneda.get(0).getTipocambio());                   
                                                        lista.setNombreMoneda(listMoneda.get(0).getMoneda());
                                                        lista.setSimboloMoneda(listMoneda.get(0).getSimbolo());
                                                    }
                                            else{
                                                       lista.setCurrentBalanceUSD((Convierte.NumStringaDouble(rec.optString("currentBalance").trim())));      
                                                       lista.setNombreMoneda(moneda);
                                                       lista.setSimboloMoneda("$");
                                            }                                        
                                        }

                                        lista.setErrcod(errcod);
                                        lista.setDetcod(detcod);
                                        lista.setDefcod(defcod);                                  

                                        list.add(lista);         

                                        }  
                            }
                            else
                            {
                                  list.addAll(LlenaListaVacia(2,CustomerNo,PortfolioNo,errcod,detcod,defcod));
                            }

                        }
                    else
                    {      
                        list.addAll(LlenaListaVacia(2,CustomerNo,PortfolioNo,errcod,detcod,defcod));
;   
                    }         
               }
        catch (JSONException e) {           
             list.addAll(LlenaListaVacia(1,CustomerNo,PortfolioNo,errcod,e.getMessage(),e.getCause().toString()));

     
      }
        return list;
    }
   
        public List<FC12_PORTFOLIODETAILS> LlenaListaVacia(Integer tipo,String CustomerNo,String PortfolioNo,String errcod,String detcod,String defcod) {  //tipo 1: error;   2: no data
        List<FC12_PORTFOLIODETAILS> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
                FC12_PORTFOLIODETAILS lista = new FC12_PORTFOLIODETAILS();
               lista.setIdClient(CustomerNo);
                lista.setIdPortfolio(PortfolioNo);
                lista.setSecurityID("");
                lista.setGroup("");
                lista.setProductType("");
                lista.setAssetClass(""); 
                lista.setSector(""); 
                lista.setRegion("");
                lista.setCurrency("");
                lista.setProductName("");                  
                lista.setCurrentBalance(0.00);            
                   
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
