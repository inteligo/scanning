package com.t24.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import com.t24.services.AccountDetails360;
import dto.t24.services.ACCOUNTDETAILS;
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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class AccountDetails360Impl implements AccountDetails360 {  
    private static final Logger LOG = LogManager.getLogger(AccountDetails360Impl.class);
   
    
    @Override
    public String AccountDetails360Str(String CustomerNo)   {
        CWServiceTWS360  consumingservice= new CWServiceTWS360Impl();
        
        com.tws360.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws360.wsdl.EnquiryInputCollection();  
        com.tws360.wsdl.EnquiryInput enquiryInput=new com.tws360.wsdl.EnquiryInput();
        Gson gson =new GsonBuilder().serializeNulls().create();
        String respuesta="";
        
        InputCollection ic =new InputCollection();
        InputCollection360Impl icimpl=new InputCollection360Impl();
        
        ic.setCUSTOMERID(CustomerNo);
        enquiryInput=icimpl.Input(ic);
        respuesta = consumingservice.CallService(Constantes.TMNV360ACCOUNTDETAILS,enquiryInput);      
       
        return respuesta;
        }
    
    @Override
    public List<ACCOUNTDETAILS>ACCOUNTDETAILS (String jsonstring,String CustomerNo,List<dto.sql.Moneda>  listMonedas) {
        SAXBuilder builder = new SAXBuilder();        
        String errcod="";
        String detcod="";
        String defcod="";
        String strFecha="";
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
                        JSONObject table = jsonObj.optJSONObject(0).optJSONObject("gbrintbcuraccdetDetailType");
                        if (table!=null)                          
                        {
                            JSONArray dataArray = (JSONArray) table.get("mbrintbcuraccdetDetailType");
                            for (int i = 0; i < dataArray.length(); i++) 
                            {

                                        ACCOUNTDETAILS lista = new ACCOUNTDETAILS();
                                        JSONObject rec = dataArray.optJSONObject(i);
                                        String strfecha="";
//                                        String loanNumber="";
//
//                                        loanNumber= (rec.optString("loanNumber").trim());    
//                                        if (!loanNumber.equals(""))
//                                        {
                                                    lista.setIdClient(CustomerNo);
                                                    lista.setAccountNumber((String) (rec.optString("accountNumber").trim()));
                                                    lista.setOwner((String) (rec.optString("owner").trim()));    
                                                    lista.setCustomerType((String) (rec.optString("customerType").trim())); 
                                                  
                                                    lista.setAccountingBalance(Convierte.NumStringaDouble(rec.optString("accountingBalance").trim())); 
                                                    lista.setRetainedBalance(Convierte.NumStringaDouble(rec.optString("retainedBalance").trim()));      
                                                    lista.setAvailableBalance(Convierte.NumStringaDouble(rec.optString("availableBalance").trim())); 
                                                    lista.setOverdraft(Convierte.NumStringaDouble(rec.optString("overdraft").trim()));                                                     
                                                  
                                                    lista.setJointHolders((String) (rec.optString("jointHolders").trim()));            
                                                    lista.setCurrency((String) (rec.optString("currency").trim()));     
                                                    lista.setWorkingBalanceinUSD(Convierte.NumStringaDouble(rec.optString("workingBalanceinUSD").trim()));            
                                                    
                                                    lista.setNickname((String) (rec.optString("nickname").trim()));     
                                               

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
//                                             }

                                        }  
                        }
                        else
                        {
                              list.addAll(LlenaListaVacia(2,CustomerNo,errcod,detcod,defcod));
                        }
                        
                }
            else
            {   
                  list.addAll(LlenaListaVacia(2,CustomerNo,errcod,detcod,defcod));

            }          

            }

        catch (JSONException e) {
            LOG.error( "ERROR: " + e.getMessage()); 
            list.addAll(LlenaListaVacia(1,CustomerNo,errcod,e.getMessage(),e.getCause().toString()));
            
             
      }
       
        return list;    
    }      
    
    public List<ACCOUNTDETAILS> LlenaListaVacia(Integer tipo,String CustomerNo,String errcod,String detcod,String defcod) {  //tipo 1: error;   2: no data
        List<ACCOUNTDETAILS> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
                ACCOUNTDETAILS lista = new ACCOUNTDETAILS();
                lista.setIdClient(CustomerNo);               
                lista.setAccountingBalance(0.00);     
                lista.setRetainedBalance(0.00); 
                lista.setAvailableBalance(0.00); 
                lista.setOverdraft(0.00); 
                lista.setWorkingBalanceinUSD(0.00); 
                           
                lista.setDefcod(defcod);
                lista.setDetcod(detcod);
                   
                if ( tipo.equals(1)) //error
               {
                    lista.setErrcod(Constantes.HTTP_RESPUESTA_NOTFOUND.toString());                  
                    lista.setDefcod(Constantes.MENSAJE_ERRORSQL_DEF);
                    lista.setDetcod(Constantes.MENSAJE_ERRORSQL_DET);
               }
               else  //sin data
               {  
                   lista.setErrcod(errcod);    
                   lista.setDefcod(defcod);
                   lista.setDetcod(detcod);
               }

                list.add(lista);   

        return list;
    }
      
}
