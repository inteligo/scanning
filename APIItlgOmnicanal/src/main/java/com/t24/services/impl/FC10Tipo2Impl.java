package com.t24.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import com.t24.services.FC10Tipo2;
import dto.t24.services.FC10_ASSETLIST;
import dto.t24.services.FCReturn;
import java.util.List;
import org.jdom2.input.SAXBuilder;
import java.util.ArrayList;
import com.t24.services.CWServiceTWS_Tipo2;
import com.t24.services.FCResponse;
import com.t24.services.input.InputCollection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



public class FC10Tipo2Impl implements FC10Tipo2 {  

    
    @Override
    public String FC10Str(String CustomerNo)   {
        CWServiceTWS_Tipo2  consumingservice= new CWServiceTWS_Tipo2Impl();
        com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();  
        com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
        Gson gson =new GsonBuilder().serializeNulls().create();
        String respuesta="";          
        
        InputCollection ic =new InputCollection();
        InputCollectionTipo2Impl icimpl=new InputCollectionTipo2Impl();
        
        ic.setCUSTOMERID(CustomerNo);   
        
        enquiryInput=icimpl.Input(ic);
        respuesta = consumingservice.CallService(Constantes.INTEGRADOR_FC10,enquiryInput);
        
        return respuesta;
        }
    
    @Override
    public List<FC10_ASSETLIST> FC10ASSETList (String jsonstring,String CustomerNo) {
        SAXBuilder builder = new SAXBuilder();
        String errcod=null;
        String detcod=null;
        String defcod=null;
        FCResponse fcretorno= new FCResponseImpl();
        List list = new ArrayList<>();        
        
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
                        JSONObject table = jsonObj.optJSONObject(0).optJSONObject("gbrintbassetlistDetailType");
                        if (table!=null)                        
                        {
                            JSONArray dataArray = (JSONArray) table.get("mbrintbassetlistDetailType");
                            for (int i = 0; i < dataArray.length(); i++) 
                            {    
                                    FC10_ASSETLIST lista = new FC10_ASSETLIST();
                                    JSONObject rec = dataArray.optJSONObject(i);
                                    lista.setIdClient(CustomerNo);
                                    lista.setGroup( rec.optString("group").trim());
                                    lista.setReference( rec.optString("reference").trim());
                                    lista.setDescription( rec.optString("description").trim());                     
                                    lista.setBalance(Convierte.NumStringaDouble(rec.optString("balance").trim())); 

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

        catch ( JSONException e ) {
            list.addAll(LlenaListaVacia(1,CustomerNo,errcod,e.getMessage(),e.getCause().toString()));
        }
        return list;
    }
    
        public List<FC10_ASSETLIST> LlenaListaVacia(Integer tipo,String CustomerNo,String errcod,String detcod,String defcod) {  //tipo 1: error;   2: no data
        List<FC10_ASSETLIST> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
                FC10_ASSETLIST lista = new FC10_ASSETLIST();
                lista.setIdClient(CustomerNo);
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
   
      
}
