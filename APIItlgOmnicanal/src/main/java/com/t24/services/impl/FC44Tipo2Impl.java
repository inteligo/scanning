package com.t24.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import dto.t24.services.FC44_DEPODETS;
import dto.t24.services.FCReturn;
import java.util.List;
import org.jdom2.input.SAXBuilder;
import java.util.ArrayList;
import com.t24.services.CWServiceTWS_Tipo2;
import com.t24.services.FC44Tipo2;
import com.t24.services.FCResponse;
import com.t24.services.input.InputCollection;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FC44Tipo2Impl implements FC44Tipo2{  

    
    @Override
    public String FC44Str(String CustomerNo)   {
        CWServiceTWS_Tipo2  consumingservice= new CWServiceTWS_Tipo2Impl();
        com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();  
        com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
        Gson gson =new GsonBuilder().serializeNulls().create();
        String respuesta="";
        
        InputCollection ic =new InputCollection();
        InputCollectionTipo2Impl icimpl=new InputCollectionTipo2Impl();
        
        ic.setCUSTOMERID(CustomerNo);
        enquiryInput=icimpl.Input(ic);
        respuesta = consumingservice.CallService(Constantes.INTEGRADOR_FC44,enquiryInput);      
       
        return respuesta;
        }
    
    @Override
    public List<FC44_DEPODETS> DEPODETS (String jsonstring,String CustomerNo,List<dto.sql.Moneda>  listMonedas) {
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
                        JSONObject table = jsonObj.optJSONObject(0).optJSONObject("gtmsbrintldepodetDetailType");
                       
                        if (table!=null)                        
                        {
                                JSONArray dataArray = (JSONArray) table.get("mtmsbrintldepodetDetailType");
                                for (int i = 0; i < dataArray.length(); i++) 
                                {

                                            FC44_DEPODETS lista = new FC44_DEPODETS();
                                            JSONObject rec = dataArray.optJSONObject(i);
                                            lista.setIdClient(CustomerNo);
                                            lista.setCliente(CustomerNo);
                                            lista.setDepositNumber((String) rec.optString("depositNumber").trim()); 
                                            lista.setCurrency((String) rec.optString("currency").trim());                     
                                            lista.setAccountingBalance(Convierte.NumStringaDouble(rec.optString("accountingBalance").trim()));  
                                            lista.setRate(Convierte.NumStringaDouble(rec.optString("rate").trim())); 
                                            lista.setStartDate((String) Convierte.FecStraDateStr(rec.optString("startDate").trim()));
                                            lista.setMaturityDate((String) Convierte.FecStraDateStr(rec.optString("maturityDate").trim())); 
                                            lista.setTermDays((String) rec.optString("termDays").trim()); 
                                            lista.setInterestFrequency  ((String) rec.optString("interestFrequency").trim()); 
                                            lista.setNextPayment((String) Convierte.FecStraDateStr(rec.optString("nextPayment").trim()));  
                                            lista.setAccruedInterest(Convierte.NumStringaDouble(rec.optString("accruedInterest").trim())); 
                                            lista.setPaymentAmount(Convierte.NumStringaDouble(rec.optString("paymentAmount").trim())); 
                                            lista.setGuaranteedAccountingBalance(Convierte.NumStringaDouble(rec.optString("guaranteedAccountingBalance").trim())); 
                                            lista.setInstructionsAtMaturity((String) rec.optString("instructionsatMaturity").trim()); 
                                            lista.setDrawdownAccount((String) rec.optString("drawdownAccount").trim());   

                                            moneda=(String) rec.optString("currency").trim();
                                            if (!moneda.equals(""))
                                            {
                                                listMoneda=listamoneda.ListaDatosMoneda(listMonedas, moneda);                                          
                                                if (listMoneda.size()>0 )
                                                        {
                                                            lista.setAccountingBalanceUSD((Convierte.NumStringaDouble(rec.optString("accountingBalance").trim()))*listMoneda.get(0).getTipocambio());                   
                                                            lista.setNombreMoneda(listMoneda.get(0).getMoneda());
                                                            lista.setSimboloMoneda(listMoneda.get(0).getSimbolo());
                                                         }
                                                else{
                                                            lista.setAccountingBalanceUSD((Convierte.NumStringaDouble(rec.optString("accountingBalance").trim())));                   
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
                        else{
                             list.addAll(LlenaListaVacia(2,CustomerNo,errcod,detcod,defcod));                           
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
    
     public List<FC44_DEPODETS> LlenaListaVacia(Integer tipo,String CustomerNo,String errcod,String detcod,String defcod) {  //tipo 1: error;   2: no data
        List<FC44_DEPODETS> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
        FC44_DEPODETS lista = new FC44_DEPODETS();
                lista.setIdClient(CustomerNo);
                lista.setCliente(CustomerNo);
                lista.setDepositNumber("");
                lista.setDrawdownAccount("");   
                lista.setAccountingBalance(0.00);  
                lista.setAccountingBalanceUSD(0.00);  
                lista.setRate(0.00);                
                lista.setAccruedInterest(0.00); 
                lista.setPaymentAmount(0.00); 
                lista.setGuaranteedAccountingBalance(0.00); 
                   
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
