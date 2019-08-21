package com.t24.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import dto.t24.services.FC43_MASTERLIST;
import dto.t24.services.FCReturn;
import java.util.List;
import org.jdom2.input.SAXBuilder;
import java.util.ArrayList;
import com.t24.services.CWServiceTWS_Tipo2;
import com.t24.services.FC43Tipo2;
import com.t24.services.FCResponse;
import com.t24.services.input.InputCollection;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FC43Tipo2Impl implements FC43Tipo2 {  

    
    @Override
    public String FC43Str(String product)   {
        CWServiceTWS_Tipo2  consumingservice= new CWServiceTWS_Tipo2Impl();
        com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();  
        com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
        Gson gson =new GsonBuilder().serializeNulls().create();
        String respuesta="";   
           String json="";
        
        InputCollection ic =new InputCollection();
        InputCollectionTipo2Impl icimpl=new InputCollectionTipo2Impl();
              
        ic.setID(product);
        
//        json= gson.toJson(ic);
//            System.out.println("ic");   
//            System.out.println(json); 
        
        enquiryInput=icimpl.Input(ic);
        respuesta = consumingservice.CallService(Constantes.INTEGRADOR_FC43,enquiryInput);
        
        return respuesta;
        }
    
    @Override
    public List<FC43_MASTERLIST> MASTERLIST (String jsonstring,String product) {
        SAXBuilder builder = new SAXBuilder();
        String errcod="";
        String detcod="";
        String defcod="";
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
                    JSONObject table = jsonObj.optJSONObject(0).optJSONObject("gitlgintsecmastlistDetailType");
                    if (table!=null)                        
                        {
                        JSONArray dataArray = (JSONArray) table.get("mitlgintsecmastlistDetailType");
                                for (int i = 0; i < dataArray.length(); i++) 
                                {                                             
                                        JSONObject rec = dataArray.optJSONObject(i);
                                        if (rec.optString("ihdr").trim().equals(""))
                                        {
                                            FC43_MASTERLIST lista = new FC43_MASTERLIST();
                                            lista.setCodigodeProducto((String) product);
                                            lista.setISIN((String) rec.optString("isin").trim());
                                            lista.setCusip((String) rec.optString("cusipNO").trim()); 
                                            lista.setName((String) rec.optString("secName").trim());                     
                                            lista.setSubAssetType((Integer) Integer.parseInt(rec.optString("sat").trim()));           
                                            lista.setAssetType((Integer) Integer.parseInt(rec.optString("assetType").trim())); 

                                            lista.setErrcod(errcod);
                                            lista.setDetcod(detcod);
                                            lista.setDefcod(defcod);

                                            list.add(lista);
                                        }
                                }  
                        }
                    else
                    {
                        list.addAll(LlenaListaVacia(2,product,errcod,detcod,defcod));
                    }
                 }                                     
            else
            {   
                 list.addAll(LlenaListaVacia(2,product,errcod,detcod,defcod));
//                FC43_MASTERLIST lista = new FC43_MASTERLIST();
//                lista.setCodigodeProducto((String) product);
//                lista.setSubAssetType(0);           
//                lista.setAssetType(0); 
//                lista.setErrcod(errcod);
//                lista.setDetcod(detcod);
//                lista.setDefcod(defcod);
//                list.add(lista);   
            } 
            }

        catch (NumberFormatException | JSONException e) {
                list.addAll(LlenaListaVacia(1,product,errcod,e.getMessage(),e.getCause().toString()));
//                System.err.println(e.getMessage().toString()); 
//                FC43_MASTERLIST lista = new FC43_MASTERLIST();
//                lista.setCodigodeProducto((String) product);
//                lista.setSubAssetType(0);           
//                lista.setAssetType(0);                 
//               
//                lista.setErrcod(Constantes.HTTP_RESPUESTA_BADREQUEST.toString());
//                lista.setDetcod(e.getCause().toString());
//                lista.setDefcod(e.getMessage().toString());
//                
//                list.add(lista);   
    
      }
               
        return list;
    
    }
    
    public List<FC43_MASTERLIST> LlenaListaVacia(Integer tipo,String product,String errcod,String detcod,String defcod) {  //tipo 1: error;   2: no data
        List<FC43_MASTERLIST> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
                FC43_MASTERLIST lista = new FC43_MASTERLIST();
                lista.setCodigodeProducto((String) product);
                lista.setISIN("");
                lista.setCusip(""); 
                lista.setName("");                   
                lista.setSubAssetType(0);           
                lista.setAssetType(0);           
                   
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
