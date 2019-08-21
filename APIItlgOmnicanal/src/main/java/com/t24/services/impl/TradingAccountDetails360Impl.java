package com.t24.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import com.t24.services.TradingAccountDetails360;
import dto.t24.services.TRADINGACCOUNTDETAILS;
import dto.t24.services.FCReturn;
import java.util.List;
import org.jdom2.input.SAXBuilder;
import java.util.ArrayList;
import com.t24.services.FCResponse;
import com.t24.services.input.InputCollection;
import org.json.JSONArray;
import org.json.JSONObject;
import com.t24.services.CWServiceTWS360;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;
import org.json.JSONException;


public class TradingAccountDetails360Impl implements TradingAccountDetails360 {  
    
      
    @Override
    public String TradingAccountDetails360Str(String CustomerNo)   {
        CWServiceTWS360  consumingservice= new CWServiceTWS360Impl();
        com.tws360.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws360.wsdl.EnquiryInputCollection();  
        com.tws360.wsdl.EnquiryInput enquiryInput=new com.tws360.wsdl.EnquiryInput();
        Gson gson =new GsonBuilder().serializeNulls().create();
        String respuesta="";
        
        InputCollection ic =new InputCollection();
        InputCollection360Impl icimpl=new InputCollection360Impl();
        
        ic.setCUSTOMERID(CustomerNo);
        enquiryInput=icimpl.Input(ic);
        respuesta = consumingservice.CallService(Constantes.TMNV360TRADINGACCOUNTDETAILS,enquiryInput);      
       
        return respuesta;
        }
    
    
    @Override
    public List<TRADINGACCOUNTDETAILS>TRADINGACCOUNTDETAILS (String jsonstring,String CustomerNo,List<dto.sql.Moneda>  listMonedas) {
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
                        JSONObject table = jsonObj.optJSONObject(0).optJSONObject("gbrintbtradeaccdetDetailType");
                        if (table!=null)                          
                        {
                            JSONArray dataArray = (JSONArray) table.get("mbrintbtradeaccdetDetailType");
                            for (int i = 0; i < dataArray.length(); i++) 
                            {

                                TRADINGACCOUNTDETAILS lista = new TRADINGACCOUNTDETAILS();
                                JSONObject rec = dataArray.optJSONObject(i);
                                      
                                lista.setIdClient(CustomerNo);
                                lista.setAccountNumber((String) (rec.optString("accountNumber").trim()));
                                lista.setCurrency((String) (rec.optString("currency").trim()));                                                     
                                lista.setCustomerType((String) (rec.optString("customerType").trim())); 
                                lista.setWorkingBalanceinUSD(Convierte.NumStringaDouble(rec.optString("workingBalanceinUSD").trim()));   
                                lista.setAccountNickname((String) (rec.optString("accountNickname").trim()));  
                                lista.setAccountingBalance(Convierte.NumStringaDouble(rec.optString("accountingBalance").trim())); 
                                lista.setAvailableBalance(Convierte.NumStringaDouble(rec.optString("availableBalance").trim())); 
                                lista.setOverdraft(Convierte.NumStringaDouble(rec.optString("overdraft").trim()));                           

                                lista.setSaldoNeto(Convierte.NumStringaDouble(rec.optString("saldoNeto").trim()));      
                                lista.setSaldoNetoUSD(Convierte.NumStringaDouble(rec.optString("saldoNetoUSD").trim()));      

                                moneda=(String) rec.optString("currency").trim();
                                if (!moneda.equals(""))
                                {
                                    listMoneda=listamoneda.ListaDatosMoneda(listMonedas, moneda);                                          
                                    if (listMoneda.size()>0 )
                                        {     
                                            lista.setNombreMoneda(listMoneda.get(0).getMoneda());
                                            lista.setSimboloMoneda(listMoneda.get(0).getSimbolo());
                                        }
                                    else
                                        {                                                             
                                            lista.setNombreMoneda("");
                                            lista.setSimboloMoneda("");
                                         }                                        
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
                  list.addAll(LlenaListaVacia(2,CustomerNo,errcod,detcod,defcod));
 
            }          

            }

        catch (JSONException e) {
             list.addAll(LlenaListaVacia(1,CustomerNo,errcod,e.getMessage(),e.getCause().toString()));
        }
        return list;    
    }      
    
       
    public List<TRADINGACCOUNTDETAILS> LlenaListaVacia(Integer tipo,String CustomerNo,String errcod,String detcod,String defcod) {  //tipo 1: error;   2: no data
        List<TRADINGACCOUNTDETAILS> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
                TRADINGACCOUNTDETAILS lista = new TRADINGACCOUNTDETAILS();
                lista.setIdClient(CustomerNo);               
                lista.setAccountingBalance(0.00);     
                lista.setSaldoNeto(0.00); 
                lista.setSaldoNetoUSD(0.00); 
                lista.setAvailableBalance(0.00); 
                lista.setOverdraft(0.00); 
                lista.setWorkingBalanceinUSD(0.00); 
                           
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
