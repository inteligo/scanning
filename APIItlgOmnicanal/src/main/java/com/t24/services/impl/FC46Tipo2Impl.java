package com.t24.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import dto.t24.services.FC46_PPRDETS;
import dto.t24.services.FCReturn;
import java.util.List;
import org.jdom2.input.SAXBuilder;
import java.util.ArrayList;
import com.t24.services.CWServiceTWS_Tipo2;
import com.t24.services.FC46Tipo2;
import com.t24.services.FCResponse;
import com.t24.services.input.InputCollection;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class FC46Tipo2Impl implements FC46Tipo2 {  

    
    @Override
    public String FC46Str(String CustomerNo, String PortfolioNo)   {
        CWServiceTWS_Tipo2  consumingservice= new CWServiceTWS_Tipo2Impl();
        com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();  
        com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
        Gson gson =new GsonBuilder().serializeNulls().create();
        String respuesta="";
        
        InputCollection ic =new InputCollection();
        InputCollectionTipo2Impl icimpl=new InputCollectionTipo2Impl();
        
        ic.setPORTFOLIOID(PortfolioNo);
        enquiryInput=icimpl.Input(ic);
        respuesta = consumingservice.CallService(Constantes.INTEGRADOR_FC46,enquiryInput);      
       
        return respuesta;         
        }
    
    @Override
    public List<FC46_PPRDETS> PPRDETS (String jsonstring,String CustomerNo,String PortfolioNo) {
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
                        JSONArray jsonObj = new JSONArray(jsonstring.toString());               
                        JSONObject table = jsonObj.optJSONObject(0).optJSONObject("gtmsamperfprtymDetailType");
                        if (table!=null)                        
                        {
                            JSONArray dataArray = (JSONArray) table.get("mtmsamperfprtymDetailType");
                            for (int i = 0; i < dataArray.length(); i++) 
                            {
                                        FC46_PPRDETS lista = new FC46_PPRDETS();
                                        JSONObject rec = dataArray.optJSONObject(i);
                                        String strfecha="";
                                        String portfolioId="";

                                        portfolioId= (rec.optString("portfolioId").trim());    
                                        if (!portfolioId.equals(""))
                                        {                                    
                                            lista.setIdClient(CustomerNo);
                                            lista.setCliente(CustomerNo);
                                            lista.setPortafolio((String) rec.optString("portfolioId").trim()); 
                                            lista.setRefCcy((String) rec.optString("portfolioCurrency").trim());                     
                                            lista.setDate ((String) Convierte.FecStraDateStr(rec.optString("date").trim()));           
                                            lista.setEndMarketValue(Convierte.NumStringaDouble(rec.optString("endMarketValue").trim())); 
                                            lista.setYearlyReturn(Convierte.NumStringaDouble(rec.optString("yearlyReturn").trim())); 
                                            lista.setCumReturn(Convierte.NumStringaDouble(rec.optString("cumReturn").trim())); 
                                            lista.setGeoCumReturn(Convierte.NumStringaDouble(rec.optString("geoCumReturn").trim()));                        
                                            lista.setAvgInvesments(Convierte.NumStringaDouble(rec.optString("avgInvestment").trim()));     
                                            lista.setReportType( rec.optString("reportType").trim());     


                                            lista.setErrcod(errcod);
                                            lista.setDetcod(detcod);
                                            lista.setDefcod(defcod);

                                            list.add(lista);       
                                        }                                    
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
            } 
            }

        catch (JSONException e) {
               list.addAll(LlenaListaVacia(1,CustomerNo,PortfolioNo,errcod,e.getMessage(),e.getCause().toString()));
      }
       
        return list;
    
    }
    
    public List<FC46_PPRDETS> LlenaListaVacia(Integer tipo,String CustomerNo,String PortfolioNo,String errcod,String detcod,String defcod) {  //tipo 1: error;   2: no data
        List<FC46_PPRDETS> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
                FC46_PPRDETS lista = new FC46_PPRDETS();
                lista.setIdClient(CustomerNo);
                lista.setDate("19000101");
                lista.setCliente(CustomerNo);
                lista.setPortafolio(PortfolioNo);
                lista.setEndMarketValue(0.00); 
                lista.setYearlyReturn(0.00); 
                lista.setCumReturn(0.00); 
                lista.setGeoCumReturn(0.00);                        
                lista.setAvgInvesments(0.00);     
                
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
    
//     @Override
//    public List<FC46_MPPRDETS> MPPRDETS (String xmlString,String CustomerNo,String PortfolioNo) {
//        SAXBuilder builder = new SAXBuilder();        
//        String errcod="";
//        String detcod="";
//        String defcod="";
//        FCRetorno fcretorno= new FCRetornoImpl();
//        List list = new ArrayList<>();        
//        
//        try {  
          
//                     List<FCReturn> listaRetorno =fcretorno.ListaRetorno(xmlString);       
//
//                    for (FCReturn lpf : listaRetorno) 
//                    {
//                         errcod= lpf.getErrcod();
//                        detcod=lpf.getDetcod();
//                        defcod=lpf.getDefcod();      
//                    }            
//           
//                   if (errcod.equals("0"))
//                    {               
//                        org.jdom2.Document dc02 = (org.jdom2.Document) builder.build(new StringReader(xmlString.toString()));   
//                        org.jdom2.Element rootE01 = dc02.getRootElement();     
//                        org.jdom2.Element head01= rootE01.getChild("head");
//                        org.jdom2.Element body01 = rootE01.getChild("body");
//
//                        org.jdom2.Element lstElement01 = body01.getChild("tables");
//                        List<org.jdom2.Element> lst01table =  lstElement01.getChildren();
//                        
//                        for (org.jdom2.Element element01 : lst01table) {
//                            List<org.jdom2.Element> tablee = element01.getChildren();						
//                            if (element01.getAttributeValue("name").equalsIgnoreCase("MPPR.DETS")) {
//                                for (org.jdom2.Element element1 : tablee) {
//
//                                    FC46_MPPRDETS lista = new FC46_MPPRDETS();
//                                    lista.setIdClient(CustomerNo);
//                                    lista.setCliente(CustomerNo);
//                                    lista.setPortafolio((String) rec.optString("Portafolio").toString().trim()); 
//                                    lista.setRefCcy((String) rec.optString("RefCcy").toString().trim());                     
//                                    lista.setDate ((String) Convierte.FecStraDateStr(rec.optString("Date").toString().trim()));           
//                                    lista.setEndMarketValue((Double) Convierte.NumStringaDouble(rec.optString("EndMarketValue").toString().trim())); 
//                                    lista.setMonthlyReturn((Double) Convierte.NumStringaDouble(rec.optString("YearlyReturn").toString().trim())); 
//                                    lista.setCumReturn((Double) Convierte.NumStringaDouble(rec.optString("CumReturn").toString().trim())); 
//                                    lista.setGeoCumReturn((Double) Convierte.NumStringaDouble(rec.optString("GeoCumReturn").toString().trim()));                        
//                                    lista.setAvgInvesments((Double) Convierte.NumStringaDouble(rec.optString("AvgInvesments").toString().trim()));     
//
//                                    lista.setErrcod(errcod);
//                                    lista.setDetcod(detcod);
//                                    lista.setDefcod(defcod);      
//
//
//                                    }     
//                                }
//                            }        
//                }
//            else
//            {   
//                FC46_MPPRDETS lista = new FC46_MPPRDETS();
//                 lista.setEndMarketValue(0.00); 
//                lista.setMonthlyReturn(0.00); 
//                lista.setCumReturn(0.00); 
//                lista.setGeoCumReturn(0.00);                        
//                lista.setAvgInvesments(0.00);     
//                lista.setErrcod(errcod);
//                lista.setDetcod(detcod);
//                lista.setDefcod(defcod);
//                list.add(lista);   
//            } 
//            }
//
//        catch (Exception e) {
//                System.err.println(e.getMessage().toString()); 
//                FC46_MPPRDETS lista = new FC46_MPPRDETS();
//                lista.setEndMarketValue(0.00); 
//                lista.setMonthlyReturn(0.00); 
//                lista.setCumReturn(0.00); 
//                lista.setGeoCumReturn(0.00);                        
//                lista.setAvgInvesments(0.00);     
//               
//                lista.setErrcod(Constantes.HTTP_RESPUESTA_BADREQUEST.toString());
//                lista.setDetcod(e.getCause().toString());
//                lista.setDefcod(e.getMessage().toString());
//                list.add(lista);   
     
//      }
//       
//        return list;
//    
//    }
      
}
