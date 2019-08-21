package com.t24.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import dto.t24.services.FC45_LOANDETS;
import dto.t24.services.FCReturn;
import java.util.List;
import org.jdom2.input.SAXBuilder;
import java.util.ArrayList;
import com.t24.services.CWServiceTWS_Tipo2;
import com.t24.services.FC45Tipo2;
import com.t24.services.FCResponse;
import com.t24.services.input.InputCollection;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class FC45Tipo2Impl implements FC45Tipo2 {  

    
    @Override
    public String FC45Str(String CustomerNo)   {
        CWServiceTWS_Tipo2  consumingservice= new CWServiceTWS_Tipo2Impl();
        com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();  
        com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
        Gson gson =new GsonBuilder().serializeNulls().create();
        String respuesta="";
        
        InputCollection ic =new InputCollection();
        InputCollectionTipo2Impl icimpl=new InputCollectionTipo2Impl();
        
        ic.setCUSTOMERID(CustomerNo);
        enquiryInput=icimpl.Input(ic);
        respuesta = consumingservice.CallService(Constantes.INTEGRADOR_FC45,enquiryInput);      
       
        return respuesta;
        }
    
    @Override
    public List<FC45_LOANDETS> LOANDETAILS (String jsonstring,String CustomerNo,List<dto.sql.Moneda>  listMonedas) {
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
                        JSONObject table = jsonObj.optJSONObject(0).optJSONObject("gtmsbrintenqloandetailsDetailType");
                        if (table!=null)                        
                        {
                            JSONArray dataArray = (JSONArray) table.get("mtmsbrintenqloandetailsDetailType");
                            for (int i = 0; i < dataArray.length(); i++) 
                            {
                                    FC45_LOANDETS lista = new FC45_LOANDETS();
                                    JSONObject rec = dataArray.optJSONObject(i);
                                    String strfecha="";
                               
                                    lista.setIdClient(CustomerNo);
                                    lista.setCliente((String) rec.optString("customerId").trim());
                                    lista.setLoanNumber((String) rec.optString("loanNumber").trim()); 
                                    lista.setCurrency((String) rec.optString("currency").trim());                     
                                    lista.setLoanType ((String) rec.optString("loanType").trim());  
                                    strfecha=Convierte.FecStraDateStr(rec.optString("disbursementDate").trim());
                                    lista.setDisbursementDate(strfecha); 
                                    lista.setCreditAmount(Convierte.NumStringaDouble(rec.optString("creditAmount").trim())); 
                                    lista.setRate(Convierte.NumStringaDouble(rec.optString("rate").trim())); 
                                    lista.setBalance(Convierte.NumStringaDouble(rec.optString("balance").trim())); 
                                    lista.setNextPayment(Convierte.NumStringaDouble(rec.optString("nextPayment").trim())); 
                                    
                                    strfecha=Convierte.FecStraDateStr(rec.optString("nextPaymentDate").trim());
                                    lista.setNextPaymentDate(strfecha);  
                                    
                                     strfecha=Convierte.FecStraDateStr(rec.optString("maturityDate").trim());                                  
                                    lista.setMaturityDate(strfecha); 
                                    
                                    lista.setFrequencyCapitalInterests((String) rec.optString("frequencyCapitalInterests").trim()); 
                                    lista.setAccruedInterests(Convierte.NumStringaDouble(rec.optString("accruedInterests").trim())); 
                                    lista.setID((String) rec.optString("arrangementId").trim()); 
                                    lista.setAccountOfficer((String) rec.optString("accountOfficer").trim());   
                                    lista.setAccountReference((String) rec.optString("accountReference").trim());   
                                    lista.setDisburseAcct((String) rec.optString("disburseAccount").trim());   
                                    
                                    moneda=(String) rec.optString("currency").trim();
                                    if (!moneda.equals(""))
                                    {
                                        listMoneda=listamoneda.ListaDatosMoneda(listMonedas, moneda);                                          
                                        if (listMoneda.size()>0 )
                                                {
                                                    lista.setBalanceUSD((Convierte.NumStringaDouble(rec.optString("balance").trim()))*listMoneda.get(0).getTipocambio());   
                                                    lista.setNombreMoneda(listMoneda.get(0).getMoneda());
                                                    lista.setSimboloMoneda(listMoneda.get(0).getSimbolo());
                                                 }
                                        else{
                                                    lista.setBalanceUSD((Convierte.NumStringaDouble(rec.optString("balance").trim())));   
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
                        
//                            }        
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
    
      public List<FC45_LOANDETS> LlenaListaVacia(Integer tipo,String CustomerNo,String errcod,String detcod,String defcod) {  //tipo 1: error;   2: no data
        List<FC45_LOANDETS> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
                FC45_LOANDETS lista = new FC45_LOANDETS();
                lista.setIdClient(CustomerNo);
                lista.setCliente(CustomerNo);
                lista.setCreditAmount(0.00); 
                lista.setRate(0.00); 
                lista.setBalance(0.00); 
                lista.setBalanceUSD(0.00); 
                lista.setNextPayment(0.00);              
                lista.setAccruedInterests(0.00); 
                   
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
