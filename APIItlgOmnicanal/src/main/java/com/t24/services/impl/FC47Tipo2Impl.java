package com.t24.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import dto.t24.services.FC47_AASCH;
import dto.t24.services.FCReturn;
import java.util.List;
import org.jdom2.input.SAXBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import com.t24.services.CWServiceTWS_Tipo2;
import com.t24.services.FC47Tipo2;
import com.t24.services.FCResponse;
import com.t24.services.input.InputCollection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FC47Tipo2Impl implements FC47Tipo2 {  
    
    @Override
    public String FC47Str(String CustomerNo,String ArrangementId)   {
         CWServiceTWS_Tipo2  consumingservice= new CWServiceTWS_Tipo2Impl();
        com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();  
        com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
        Gson gson =new GsonBuilder().serializeNulls().create();
        String respuesta="";
        
        InputCollection ic =new InputCollection();
        InputCollectionTipo2Impl icimpl=new InputCollectionTipo2Impl();
        
        ic.setARRANGEMENTID(ArrangementId);
        enquiryInput=icimpl.Input(ic);
        respuesta = consumingservice.CallService(Constantes.INTEGRADOR_FC47,enquiryInput);      
       
        return respuesta;
        }
    
    @Override
    public List<FC47_AASCH> AASCH (String jsonstring,String CustomerNo) {
        SAXBuilder builder = new SAXBuilder();        
        String errcod="";
        String detcod="";
        String defcod="";
        String strFecha="";
        
        FCResponse fcretorno= new FCResponseImpl();
        List list = new ArrayList<>();        
        
        try {  
         
                     List<FCReturn> listaRetorno =fcretorno.ListaRetorno(jsonstring);       
                     
                     System.out.println(jsonstring);

                    for (FCReturn lpf : listaRetorno) 
                    {
                         errcod= lpf.getErrcod();
                        detcod=lpf.getDetcod();
                        defcod=lpf.getDefcod();      
                    }            
           
                   if (errcod.equals("0"))
                    {               
                       JSONArray jsonObj = new JSONArray(jsonstring);               
                        JSONObject table = jsonObj.optJSONObject(0).optJSONObject("gtmsaabillsschedulesDetailType");
                        if (table!=null)                        
                        {
                            JSONArray dataArray = (JSONArray) table.get("mtmsaabillsschedulesDetailType");
                            for (int i = 0; i < dataArray.length(); i++) 
                            {

                                         FC47_AASCH lista = new FC47_AASCH();            
                                        JSONObject rec = dataArray.optJSONObject(i);
                                        String strfecha="";
                                        String paymentDate="";

                                        paymentDate= (rec.optString("paymentDate").trim());    
                                        if (!paymentDate.equals(""))
                                        {                   
                                            lista.setIdClient(CustomerNo);
                                            strFecha=(String) Convierte.FecStraDateStr(paymentDate);
                                            lista.setFecha(strFecha);   
                                            lista.setIntFecha((Integer) Integer.parseInt(strFecha));     
                                            lista.setTotalDue(Convierte.NumStringaDouble(rec.optString("totalDue").trim())); 
                                            lista.setTotalCap(Convierte.NumStringaDouble(rec.optString("totalCap").trim()));             
                                            lista.setCharge (Convierte.NumStringaDouble(rec.optString("charge").trim()));   
                                            lista.setPrincipal(Convierte.NumStringaDouble(rec.optString("principal").trim())); 
                                            lista.setInterest(Convierte.NumStringaDouble(rec.optString("interest").trim())); 
                                            lista.setPrincipalInterest(Convierte.NumStringaDouble(rec.optString("totalPrincipalInterest").trim())); 
                                            lista.setOutstanding(Convierte.NumStringaDouble(rec.optString("outstanding").trim()));                        

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
                           Comparator<FC47_AASCH> cmp = Collections.reverseOrder(new IntFechaComparator());          
                           Collections.sort(list, cmp);  
                }               
            else
            {   
                list.addAll(LlenaListaVacia(2,CustomerNo,errcod,detcod,defcod));
            }

            }
        
        catch (NumberFormatException | JSONException e) {
                list.addAll(LlenaListaVacia(1,CustomerNo,errcod,e.getMessage(),e.getCause().toString()));
      }
       
        return list;
    
    }
    
        public List<FC47_AASCH> LlenaListaVacia(Integer tipo,String CustomerNo,String errcod,String detcod,String defcod) {  //tipo 1: error;   2: no data
        List<FC47_AASCH> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
                FC47_AASCH lista = new FC47_AASCH();
                lista.setIdClient(CustomerNo);
                lista.setFecha("19000101");   
                lista.setIntFecha(0);     
                lista.setTotalDue(0.00); 
                lista.setTotalCap(0.00);             
                lista.setCharge (0.00);   
                lista.setPrincipal(0.00); 
                lista.setInterest(0.00); 
                lista.setPrincipalInterest(0.00); 
                lista.setOutstanding(0.00);          

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
    
     public class IntFechaComparator implements Comparator {
    
    @Override
    public int compare(Object o1, Object o2) {
        FC47_AASCH lista1 = (FC47_AASCH)o1;
        FC47_AASCH lista2 = (FC47_AASCH)o2;
        return lista1.getIntFecha().compareTo(lista2.getIntFecha());
               
    }
    
    }
     
//     @Override
//    public List<FC47_BILLDETS> BILLDETS (String jsonstring,String CustomerNo) {
//        SAXBuilder builder = new SAXBuilder();        
//        String errcod="";
//        String detcod="";
//        String defcod="";
//        String strFecha="";
//        
//        FCResponse fcretorno= new FCResponseImpl();
//        List list = new ArrayList<>();        
//        
//        try {  
        
//                     List<FCReturn> listaRetorno =fcretorno.ListaRetorno(jsonstring);       
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
//                       JSONArray jsonObj = new JSONArray(jsonstring);               
//                        JSONObject table = jsonObj.optJSONObject(0).optJSONObject("gtmsbrintenqloandetsDetailType");
//                        if (table!=null)                        
//                        {
//                            JSONArray dataArray = (JSONArray) table.get("mtmsbrintenqloandetsDetailType");
//                            for (int i = 0; i < dataArray.length(); i++) 
//                            {
//
//                                    FC47_BILLDETS lista = new FC47_BILLDETS();            
//                                   JSONObject rec = dataArray.optJSONObject(i);
//                                   String strfecha="";
//                                   String loanNumber="";
//
////                                    FC47_BILLDETS lista = new FC47_BILLDETS();                           
//                                    lista.setIdClient(CustomerNo);
//                                    strFecha=(String) Convierte.FecStraDateStr(rec.optString("Fecha").toString().trim());
//                                    lista.setFecha(strFecha);   
//                                    lista.setIntFecha((Integer) Integer.parseInt(strFecha));     
//                                    lista.setBillreference(rec.optString("BillReference").toString().trim()); 
//                                    lista.setDuedate((String) Convierte.FecStraDateStr(rec.optString("DueDate").toString().trim()));             
//                                    lista.setType (rec.optString("Type").toString().trim());   
//                                    lista.setBillamount((Double) Convierte.NumStringaDouble(rec.optString("BillAmount").toString().trim())); 
//                                    lista.setOutstanding((Double) Convierte.NumStringaDouble(rec.optString("Outstanding").toString().trim())); 
//                                    lista.setStatus(rec.optString("Status").toString().trim()); 
//                                    lista.setStatusdate((String) Convierte.FecStraDateStr(rec.optString("StatusDate").toString().trim()));                        
//
//                                    lista.setErrcod(errcod);
//                                    lista.setDetcod(detcod);
//                                    lista.setDefcod(defcod);
//
//                                    list.add(lista);         
//
//                                    }     
//                                }
////                            } 
//                        Comparator<FC47_BILLDETS> cmp = Collections.reverseOrder(new IntFechaComparator2());          
//                        Collections.sort(list, cmp);  
//                }               
//            else
//            {   
//                FC47_BILLDETS lista = new FC47_BILLDETS();
//                lista.setIntFecha(0);     
//                lista.setBillamount(0.00); 
//                lista.setOutstanding(0.00);             
//              
//                lista.setOutstanding(0.00);                       
//                lista.setErrcod(errcod);
//                lista.setDetcod(detcod);
//                lista.setDefcod(defcod);
//                list.add(lista);   
//            }
//
//
//            
//
//            }
//        
//        catch (Exception e) {
//                System.err.println(e.getMessage().toString()); 
//                FC47_BILLDETS lista = new FC47_BILLDETS();
//                lista.setIntFecha(0);     
//                lista.setBillamount(0.00); 
//                lista.setOutstanding(0.00);                     
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
//    
//     public class IntFechaComparator2 implements Comparator {
//    
//    @Override
//    public int compare(Object o1, Object o2) {
//        FC47_BILLDETS lista1 = (FC47_BILLDETS)o1;
//        FC47_BILLDETS lista2 = (FC47_BILLDETS)o2;
//        return lista1.getIntFecha().compareTo(lista2.getIntFecha());
//               
//    }
//    
//    }
    
      
}
