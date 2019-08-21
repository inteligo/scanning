package com.t24.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import com.t24.services.FC14Tipo2;
import dto.t24.services.FC14_PORTFOLIOLIST;
import java.util.List;
import java.util.ArrayList;
import com.t24.services.CWServiceTWS_Tipo2;
import com.t24.services.FCResponse;
import com.t24.services.input.InputCollection;
import dto.t24.services.FCCuentaFirma;
import dto.t24.services.FCReturn;
import java.util.stream.Collectors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FC14Tipo2Impl  implements FC14Tipo2  {     

    
      @Override
    public String FC14Str(String CustomerNo)   {
        CWServiceTWS_Tipo2  consumingservice= new CWServiceTWS_Tipo2Impl();
        com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();  
        com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
        Gson gson =new GsonBuilder().serializeNulls().create();
        String respuesta="";
        
        InputCollection ic =new InputCollection();
        InputCollectionTipo2Impl icimpl=new InputCollectionTipo2Impl();
        
        ic.setCUSTOMERID(CustomerNo);
        enquiryInput=icimpl.Input(ic);
        respuesta = consumingservice.CallService(Constantes.INTEGRADOR_FC14,enquiryInput);      
       
        return respuesta;
        }
    
     
    @Override
    public List<FC14_PORTFOLIOLIST> PORTFOLIOLIST(String jsonstring, String CustomerNo) {
        String errcod="";
        String detcod="";
        String defcod="";
        
        FCResponse fcretorno= new FCResponseImpl();
        List list = new ArrayList<>();
        FC14_PORTFOLIOLIST lista = null;        

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
                        JSONObject table = jsonObj.optJSONObject(0).optJSONObject("gbrintbportlistDetailType");
                        if (table!=null)                        
                        {
                            JSONArray dataArray = (JSONArray) table.get("mbrintbportlistDetailType");
                            for (int i = 0; i < dataArray.length(); i++) 
                            {
                                lista = new FC14_PORTFOLIOLIST();
                                JSONObject rec = dataArray.optJSONObject(i);
                                lista.setIdClient(CustomerNo);
                                lista.setOwner(rec.optString("owner").trim());
                                lista.setClientType(rec.optString("clientType").trim());
                                lista.setDescription(rec.optString("description").trim());
                                lista.setJointHolder(rec.optString("jointHolder"));
                                lista.setPortfolioID(rec.optString("portfolioID").trim());
                                lista.setBalance(Convierte.NumStringaDouble(rec.optString("balanceUS").trim()));

                                lista.setErrcod(errcod);
                                lista.setDetcod(detcod);
                                lista.setDefcod(defcod);
                                list.add(lista);
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
            list.addAll(LlenaListaVacia(1,CustomerNo,errcod,e.getMessage(),e.getCause().toString()));
  
    
      }
        return list;
    }      
    
        public List<FC14_PORTFOLIOLIST> LlenaListaVacia(Integer tipo,String CustomerNo,String errcod,String detcod,String defcod) {  //tipo 1: error;   2: no data
        List<FC14_PORTFOLIOLIST> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
                FC14_PORTFOLIOLIST lista = new FC14_PORTFOLIOLIST();
                lista.setIdClient(CustomerNo);
                lista.setPortfolioID("");
                lista.setBalance(0.00);               
                   
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
        
        public List<FC14_PORTFOLIOLIST> PORTFOLIOLISTACTIVOS(String jsonstring, String CustomerNo) {
        
        List<FC14_PORTFOLIOLIST> list = null;
        list = new ArrayList<>();

        List<FC14_PORTFOLIOLIST> PortList = null;
        PortList = new ArrayList<>();

        try {
            list = PORTFOLIOLIST(jsonstring, CustomerNo);
            PortList = list.stream().filter(x -> ! x.getDescription().contains("CERRADO")).collect(Collectors.toList());

        } catch (Exception e) {
        }
        return PortList;
     }
      
}
