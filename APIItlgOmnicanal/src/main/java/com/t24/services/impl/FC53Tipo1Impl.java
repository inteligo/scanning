package com.t24.services.impl;

import com.java.Constantes;
import com.java.Convierte;
import com.t24.services.CWServiceTWS_Tipo1;
import com.t24.services.FC53Tipo1;
import com.t24.services.FCRetorno;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;
import java.util.List;
import org.jdom2.input.SAXBuilder;
import dto.t24.services.FC53_ACCTDETS;
import dto.t24.services.FC53_SIGNDETS;
import dto.t24.services.FCCuentaFirma;
import dto.t24.services.FCListaPortafolio;
import dto.t24.services.FCReturn;
import dto.t24.services.FCTotalPortafolio;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.jdom2.JDOMException;


public class FC53Tipo1Impl implements FC53Tipo1  {     
    
    @Override
    public String FC53Str(String CustomerNo)   { 
            com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
             CWServiceTWS_Tipo1  consumingservice= new CWServiceTWS_Tipo1Impl();
            InputCollectionTipo1Impl icimpl=new InputCollectionTipo1Impl();
           
            enquiryInput=icimpl.Input("functioncode;" +Constantes.INTEGRADOR_FC53 +"|CustomerNo;"+CustomerNo);
            String strFC_return = consumingservice.CallService(enquiryInput);

            return strFC_return;
        }
    

    @Override
    public List<FC53_ACCTDETS> FC53ACCTDETS (String xmlString, String CustomerNo,List<dto.sql.Moneda>  listMonedas) {
        SAXBuilder builder = new SAXBuilder();        
        String errcod="";
        String detcod="";
        String defcod="";
        String moneda="";
        FCRetorno fcretorno= new FCRetornoImpl();
        List list = new ArrayList<>();       
        List<dto.sql.Moneda>  listMoneda=null;        
        DaoListaMoneda listamoneda= new DaoListaMonedaImpl(); 
        
        try {                     
        
                 List<FCReturn> listaRetorno =fcretorno.ListaRetorno(xmlString);       

                    for (FCReturn lpf : listaRetorno) 
                    {
                         errcod= lpf.getErrcod();
                        detcod=lpf.getDetcod();
                        defcod=lpf.getDefcod();      
                    }            
           
                   if (errcod.equals("0"))
                    {               
                        org.jdom2.Document dc02 = (org.jdom2.Document) builder.build(new StringReader(xmlString));   
                        org.jdom2.Element rootE53 = dc02.getRootElement();     
//                        org.jdom2.Element head53= rootE53.getChild("head");
                        org.jdom2.Element body53 = rootE53.getChild("body");

                        org.jdom2.Element lstElement53 = body53.getChild("tables");
                        List<org.jdom2.Element> lst53table =  lstElement53.getChildren();


                        for (org.jdom2.Element element53 : lst53table) {
                            List<org.jdom2.Element> tablee = element53.getChildren();						
                            if (element53.getAttributeValue("name").equalsIgnoreCase("ACCT.DETS")) {
                                for (org.jdom2.Element element1 : tablee) {

                                    FC53_ACCTDETS lista = new FC53_ACCTDETS();
                                    lista.setIdClient(CustomerNo);
                                    lista.setAccCustomer((String) element1.getChildText("AccCustomer").trim());
                                    lista.setAccountNo((String) element1.getChildText("AccountNo").trim());
                                    lista.setAccountActive((String) element1.getChildText("AccountActive").trim()); 
                                    lista.setAccountInactive((String) element1.getChildText("AccountInactive").trim()); 
                                    lista.setAccountType((String) element1.getChildText("AccountType").trim()); 
                                    lista.setAccountAssoc((String) element1.getChildText("AccountAssoc").trim());                     
                                    lista.setPortfolio((String) element1.getChildText("Portfolio").trim()); 
                                    lista.setCurrency((String) element1.getChildText("Currency").trim());
                                    lista.setWorkingBal(Convierte.NumStringaDouble(element1.getChildText("WorkingBal").trim()));                   
                                    lista.setAcctBal(Convierte.NumStringaDouble(element1.getChildText("AcctBal").trim()));   
                                    lista.setLimitAmtDisp(Convierte.NumStringaDouble(element1.getChildText("LimitAmtDisp").trim())); 
                                    lista.setLimitExpDate((String) element1.getChildText("LimitExpDate").trim()); 
                                   
                                   
                                    moneda=(String) element1.getChildText("Currency").trim();
                                    if (!moneda.equals(""))
                                    {
                                        listMoneda=listamoneda.ListaDatosMoneda(listMonedas, moneda);                                          
                                        if (listMoneda.size()>0 )
                                                {
                                                        lista.setWorkingBalUSD((Convierte.NumStringaDouble(element1.getChildText("WorkingBal").trim()))*listMoneda.get(0).getTipocambio());                   
                                                        lista.setAcctBalUSD((Convierte.NumStringaDouble(element1.getChildText("AcctBal").trim()))*listMoneda.get(0).getTipocambio());       
                                                        lista.setNombreMoneda(listMoneda.get(0).getMoneda());
                                                        lista.setSimboloMoneda(listMoneda.get(0).getSimbolo());
                                                  }
                                        else{
                                                        lista.setWorkingBalUSD((Convierte.NumStringaDouble(element1.getChildText("WorkingBal").trim())));                   
                                                        lista.setAcctBalUSD((Convierte.NumStringaDouble(element1.getChildText("AcctBal").trim())));       
                                                        lista.setNombreMoneda("");
                                                        lista.setSimboloMoneda("");
                                                 }
                                        }
                                    else
                                    {
                                        lista.setWorkingBalUSD(0.00);                   
                                        lista.setAcctBalUSD(0.00);       
                                    }
                                    
                                   
                                    lista.setErrcod(errcod);
                                    lista.setDetcod(detcod);
                                    lista.setDefcod(defcod);
                                    list.add(lista);         

                                    }     
                                }
                            } 
                }
            else
            {
                FC53_ACCTDETS lista = new FC53_ACCTDETS();
                    lista.setIdClient(CustomerNo);
                    lista.setWorkingBal(0.00);                   
                    lista.setAcctBal(0.00);     
                    lista.setWorkingBalUSD(0.00);                   
                    lista.setAcctBalUSD(0.00);     
                    lista.setLimitAmtDisp(0.00);
                    lista.setErrcod(errcod);
                    lista.setDefcod(detcod);
                    lista.setDetcod(detcod);

                    list.add(lista);
            }         
        }
        
        catch (IOException | JDOMException e) {
                    System.err.println(e.getMessage()); 
                    FC53_ACCTDETS lista = new FC53_ACCTDETS();
                    lista.setIdClient(CustomerNo);
                    lista.setWorkingBal(0.00);                   
                    lista.setAcctBal(0.00);   
                    lista.setWorkingBalUSD(0.00);                   
                    lista.setAcctBalUSD(0.00);      
                     lista.setLimitAmtDisp(0.00);

                    lista.setErrcod(Constantes.HTTP_RESPUESTA_BADREQUEST.toString());
                    lista.setDetcod(e.getCause().toString());
                    lista.setDefcod(e.getMessage());  

                    list.add(lista);         
                               
      }
            
        return list;
        
    }
    
    @Override
    public List<FC53_SIGNDETS> FC53SIGNDETS (String xmlString, String CustomerNo) {
        SAXBuilder builder = new SAXBuilder();
        String errcod="";
        String detcod="";
        String defcod="";
        FCRetorno fcretorno= new FCRetornoImpl();
        List list = new ArrayList<>();        
        
        try {
                    
                     List<FCReturn> listaRetorno =fcretorno.ListaRetorno(xmlString);       

                    for (FCReturn lpf : listaRetorno) 
                    {
                         errcod= lpf.getErrcod();
                        detcod=lpf.getDetcod();
                        defcod=lpf.getDefcod();      
                    }            
           
                   if (errcod.equals("0"))
                    {               
                        org.jdom2.Document dc02 = (org.jdom2.Document) builder.build(new StringReader(xmlString.toString()));   
                        org.jdom2.Element rootE53 = dc02.getRootElement();     
                        org.jdom2.Element head53= rootE53.getChild("head");
                        org.jdom2.Element body53 = rootE53.getChild("body");

                        org.jdom2.Element lstElement53 = body53.getChild("tables");
                        List<org.jdom2.Element> lst53table =  lstElement53.getChildren();

                        for (org.jdom2.Element element53 : lst53table) {
                            List<org.jdom2.Element> tablee = element53.getChildren();						
                            if (element53.getAttributeValue("name").equalsIgnoreCase("SIGN.DETS")) {
                                for (org.jdom2.Element element1 : tablee) {

                                    FC53_SIGNDETS lista = new FC53_SIGNDETS();
                                    lista.setIdClient(CustomerNo);
                                    lista.setCustomerNo((String) element1.getChildText("CustomerNo").trim());
                                    lista.setAccountNo((String) element1.getChildText("AccountNo").trim());
                                    lista.setSignRelation((String) element1.getChildText("SignRelation").trim());
                                    lista.setSignConditionT24((String) element1.getChildText("SignCondition").trim()); 
                                    lista.setSignCondition((String) element1.getChildText("SignCondition").trim());    
//                                    lista.setSignCondition((String) Convierte.CondicionFirma(element1.getChildText("SignGroup").trim(), element1.getChildText("SignCondition").trim()));  
//                                    lista.setSignGroup((String) element1.getChildText("SignGroup").trim());   
//                                    lista.setRelationCode((String) element1.getChildText("RelationCode").trim());  
                                    

                                    lista.setErrcod(errcod);
                                    lista.setDetcod(detcod);
                                    lista.setDefcod(defcod);

                                    list.add(lista);         

                                    }     
                                }
                            }       
            }
            else
            {   
                FC53_SIGNDETS lista = new FC53_SIGNDETS();
                lista.setErrcod(errcod);
                lista.setDetcod(detcod);
                lista.setDefcod(defcod);
                list.add(lista);   
            } 
        }

        catch (IOException | JDOMException e) {
                System.err.println(e.getMessage()); 
                FC53_SIGNDETS lista = new FC53_SIGNDETS();
               
                lista.setErrcod(Constantes.HTTP_RESPUESTA_BADREQUEST.toString());
                lista.setDetcod(e.getCause().toString());
                lista.setDefcod(e.getMessage());  
                
                list.add(lista);           
                
      }
        return list;
    }
    
   
    
    @Override
    public List FC53List (String xmlString,String CustomerNo,List<dto.sql.Moneda>  listMonedas) {
                

        List<FC53_ACCTDETS> lista1 = FC53ACCTDETS (xmlString,CustomerNo,  listMonedas);
        List<FC53_SIGNDETS> lista2 = FC53SIGNDETS (xmlString,CustomerNo);
      
        
        List listaFinal = null;         
        listaFinal = new ArrayList<>();
        
        listaFinal.addAll(lista1);
        listaFinal.addAll(lista2);       
        
        
        return listaFinal;
    }
    
    @Override
    public List CuentayFirmaList (String xmlString,String CustomerNo,List<dto.sql.Moneda>  listMonedas)  
    {
         SAXBuilder builder = new SAXBuilder();        
        String errcod="";
        String detcod="";
        String defcod="";
        FCRetorno fcretorno= new FCRetornoImpl();
        List list = new ArrayList<>();   
        List <FCCuentaFirma> ListAccount = new ArrayList<>();
                
        List<FCCuentaFirma> CuenFirP = null;
        CuenFirP = new ArrayList<>();

        List<FCCuentaFirma> CuenFirPorta = null;
        CuenFirPorta = new ArrayList<>();

        List<FCCuentaFirma> CuenFirPortaAssoc = null;
        CuenFirPortaAssoc = new ArrayList<>();

        List<FCCuentaFirma> CuenFirPortaAssocMoney = null;
        CuenFirPortaAssocMoney = new ArrayList<>();    
        
//         String json= "";
//         
//          System.out.println("xmlString");       
//            System.out.println(xmlString);       

//        Gson gson =new GsonBuilder().serializeNulls().create();    
         try {
                List<FCReturn> listaRetorno =fcretorno.ListaRetorno(xmlString);       
                

                    for (FCReturn lpf : listaRetorno) 
                    {
                         errcod= lpf.getErrcod();
                        detcod=lpf.getDetcod();
                        defcod=lpf.getDefcod();      
                    }     
                    
                        
           
                   if (errcod.equals("0"))
                    {         
        
                        List<FC53_ACCTDETS> LisAc =FC53ACCTDETS(xmlString,CustomerNo,listMonedas);        
                        List<FC53_SIGNDETS> LisSign = FC53SIGNDETS (xmlString,CustomerNo);              

//   json= gson.toJson(LisAc);
//            System.out.println("LisAc");           
//            System.out.println(json);                   

                        for (FC53_ACCTDETS x:LisAc)
                            {
                                FCCuentaFirma listaaccount = new FCCuentaFirma();
                                listaaccount.setIdClient(x.getIdClient());
                                listaaccount.setAccCustomer(x.getAccCustomer());
                                listaaccount.setAccountNo(x.getAccountNo());
                                listaaccount.setAccountActive(x.getAccountActive());
                                listaaccount.setAccountInactive(x.getAccountInactive());
                                listaaccount.setAccountType(x.getAccountType());                              
                                listaaccount.setAccountAssoc(x.getAccountAssoc());
                                listaaccount.setPortfolio(x.getPortfolio());
                                listaaccount.setCurrency(x.getCurrency());
                                listaaccount.setWorkingBal(x.getWorkingBal());
                                listaaccount.setAcctBal(x.getAcctBal());
                                listaaccount.setWorkingBalUSD(x.getWorkingBalUSD());
                                listaaccount.setAcctBalUSD(x.getAcctBalUSD());
                                listaaccount.setLimitAmtDisp(x.getLimitAmtDisp());
                                listaaccount.setLimitExpDate(x.getLimitExpDate());
                                listaaccount.setNombreMoneda(x.getNombreMoneda());
                                listaaccount.setSimboloMoneda(x.getSimboloMoneda());

                                for (FC53_SIGNDETS y:LisSign)
                                {
                                    if(x.getAccountNo().equals(y.getAccountNo()))
                                    {
                                        listaaccount.setSignRelation(y.getSignRelation());                            
                                        listaaccount.setSignCondition(y.getSignCondition());           
                                        listaaccount.setSignConditionT24(y.getSignConditionT24());              
                                    }
                                }
                                listaaccount.setErrcod(x.getErrcod());
                                listaaccount.setDetcod(x.getDetcod());
                                listaaccount.setDefcod(x.getDefcod());
                                
                                ListAccount.add(listaaccount);                
                            } 
                  
                    for (FCCuentaFirma cyf1 : ListAccount) 
                     {
                         FCCuentaFirma cuenta = new FCCuentaFirma();               
                         cuenta.setIdClient(cyf1.getIdClient());
                         cuenta.setAccCustomer(cyf1.getAccCustomer());
                         cuenta.setAccountNo(cyf1.getAccountNo());
                         cuenta.setAccountActive(cyf1.getAccountActive());
                         cuenta.setAccountInactive(cyf1.getAccountInactive());
                         cuenta.setAccountType(cyf1.getAccountType());
                         cuenta.setAccountAssoc(cyf1.getAccountAssoc());            
                         cuenta.setCurrency(cyf1.getCurrency());
                         cuenta.setWorkingBal(cyf1.getWorkingBal());
                         cuenta.setAcctBal(cyf1.getAcctBal());    
                         cuenta.setWorkingBalUSD(cyf1.getWorkingBalUSD());
                         cuenta.setAcctBalUSD(cyf1.getAcctBalUSD());    
                         cuenta.setSignRelation(cyf1.getSignRelation());                      
                         cuenta.setSignCondition(cyf1.getSignCondition());    
                         cuenta.setSignConditionT24(cyf1.getSignConditionT24());     
                         cuenta.setPortfolio(cyf1.getPortfolio());    
                         cuenta.setLimitAmtDisp(cyf1.getLimitAmtDisp());
                         cuenta.setLimitExpDate(cyf1.getLimitExpDate());
                         cuenta.setNombreMoneda(cyf1.getNombreMoneda());
                         cuenta.setSimboloMoneda(cyf1.getSimboloMoneda());
                         
                         for (FCCuentaFirma cyf2 : ListAccount) 
                         {
                             if (!cyf2.getAccountAssoc().trim().equals(""))
                             {
                                 if (cyf1.getAccountNo().trim().equals(cyf2.getAccountAssoc().trim()))
                                 {                                
                                     cuenta.setIdPortfolio(cyf2.getPortfolio());                                
                                 }                        
                             }
                         } 
                         cuenta.setErrcod(cyf1.getErrcod()); 
                         cuenta.setDetcod(cyf1.getDetcod()); 
                         cuenta.setDefcod(cyf1.getDefcod()); 

                         CuenFirP.add(cuenta);
                     }

                   
                     for (FCCuentaFirma cyf3 : CuenFirP) 
                     {
                         FCCuentaFirma cuenta = new FCCuentaFirma();               
                         cuenta.setIdClient(cyf3.getIdClient());
                         cuenta.setAccCustomer(cyf3.getAccCustomer());
                         cuenta.setAccountNo(cyf3.getAccountNo());
                         cuenta.setAccountActive(cyf3.getAccountActive());
                         cuenta.setAccountInactive(cyf3.getAccountInactive());
                         cuenta.setAccountType(cyf3.getAccountType());                      
                         cuenta.setAccountAssoc(cyf3.getAccountAssoc());            
                         cuenta.setCurrency(cyf3.getCurrency());
                         cuenta.setWorkingBal(cyf3.getWorkingBal());
                         cuenta.setAcctBal(cyf3.getAcctBal());     
                         cuenta.setWorkingBalUSD(cyf3.getWorkingBalUSD());
                         cuenta.setAcctBalUSD(cyf3.getAcctBalUSD());     
                         cuenta.setSignRelation(cyf3.getSignRelation());                       
                         cuenta.setSignCondition(cyf3.getSignCondition()); 
                         cuenta.setSignConditionT24(cyf3.getSignConditionT24());                   
                         cuenta.setPortfolio(cyf3.getPortfolio()); 
                         cuenta.setLimitAmtDisp(cyf3.getLimitAmtDisp());
                         cuenta.setLimitExpDate(cyf3.getLimitExpDate());
                         cuenta.setNombreMoneda(cyf3.getNombreMoneda());
                         cuenta.setSimboloMoneda(cyf3.getSimboloMoneda());
                         
                         String Portafolio=cyf3.getIdPortfolio();
                         if (Portafolio=="" || Portafolio==null )
                         {                                
                             cuenta.setIdPortfolio(cyf3.getPortfolio());   
                         } 
                         else{
                             cuenta.setIdPortfolio(cyf3.getIdPortfolio());   
                         }     
                         
                           if (cyf3.getAccCustomer().trim().equals(CustomerNo))
                                 {                                
                                     cuenta.setTitular("T");
                                 } 
                           else
                           {
                               cuenta.setTitular("F");
                           }
                         cuenta.setErrcod(cyf3.getErrcod()); 
                         cuenta.setDetcod(cyf3.getDetcod()); 
                         cuenta.setDefcod(cyf3.getDefcod()); 

                         CuenFirPorta.add(cuenta);
                     }

                    List<FCCuentaFirma> listTrading = null;
                    listTrading= new ArrayList<>();   
                    listTrading = CuenFirPorta.stream().filter(x -> x.getAccountType().trim().equals("Trading Account")).collect(Collectors.toList());


                    for (FCCuentaFirma cyf1 : CuenFirPorta) 
                     {
                         FCCuentaFirma cuenta = new FCCuentaFirma();               
                         cuenta.setIdClient(cyf1.getIdClient());
                         cuenta.setAccCustomer(cyf1.getAccCustomer());
                         cuenta.setAccountNo(cyf1.getAccountNo());
                         cuenta.setAccountActive(cyf1.getAccountActive());
                         cuenta.setAccountInactive(cyf1.getAccountInactive());
                         cuenta.setAccountType(cyf1.getAccountType());                 
                         cuenta.setAccountAssoc(cyf1.getAccountAssoc());            
                         cuenta.setCurrency(cyf1.getCurrency());
                         cuenta.setWorkingBal(cyf1.getWorkingBal());
                         cuenta.setAcctBal(cyf1.getAcctBal());          
                         cuenta.setWorkingBalUSD(cyf1.getWorkingBalUSD());
                         cuenta.setAcctBalUSD(cyf1.getAcctBalUSD());          
                         cuenta.setSignRelation(cyf1.getSignRelation());                       
                         cuenta.setSignCondition(cyf1.getSignCondition());   
                         cuenta.setSignConditionT24(cyf1.getSignConditionT24());    
                         cuenta.setPortfolio(cyf1.getPortfolio());  
                         cuenta.setIdPortfolio(cyf1.getIdPortfolio());   
                         cuenta.setLimitAmtDisp(cyf1.getLimitAmtDisp());
                         cuenta.setLimitExpDate(cyf1.getLimitExpDate());
                         cuenta.setNombreMoneda(cyf1.getNombreMoneda());
                         cuenta.setSimboloMoneda(cyf1.getSimboloMoneda());
                         
                         for (FCCuentaFirma cyf2 : listTrading) 
                         {
                            if (cyf1.getAccountNo().trim().equals(cyf2.getAccountAssoc().trim()))
                                 {                                
                                     cuenta.setAccountAssoc(cyf2.getAccountNo());                                
                                 }
                         } 
                         cuenta.setTitular(cyf1.getTitular());
                         cuenta.setErrcod(cyf1.getErrcod()); 
                         cuenta.setDetcod(cyf1.getDetcod()); 
                         cuenta.setDefcod(cyf1.getDefcod()); 

                         CuenFirPortaAssoc.add(cuenta);
                     }
               
                      for (FCCuentaFirma cyf1 : CuenFirPortaAssoc) 
                     {
                         FCCuentaFirma cuenta = new FCCuentaFirma();               
                         cuenta.setIdClient(cyf1.getIdClient());
                         cuenta.setAccCustomer(cyf1.getAccCustomer());
                         cuenta.setAccountNo(cyf1.getAccountNo());
                         cuenta.setAccountActive(cyf1.getAccountActive());
                         cuenta.setAccountInactive(cyf1.getAccountInactive());
                         cuenta.setAccountType(cyf1.getAccountType());      
                         cuenta.setAccountAssoc(cyf1.getAccountAssoc());            
                         cuenta.setCurrency(cyf1.getCurrency());
                         cuenta.setWorkingBal(cyf1.getWorkingBal());
                         cuenta.setAcctBal(cyf1.getAcctBal());        
                         cuenta.setWorkingBalUSD(cyf1.getWorkingBalUSD());
                         cuenta.setAcctBalUSD(cyf1.getAcctBalUSD());        
                         cuenta.setSignRelation(cyf1.getSignRelation());
                         cuenta.setSignCondition(cyf1.getSignCondition()); 
                         cuenta.setSignConditionT24(cyf1.getSignConditionT24()); 
                         cuenta.setPortfolio(cyf1.getPortfolio()); 
                         cuenta.setIdPortfolio(cyf1.getIdPortfolio());   
                         cuenta.setLimitAmtDisp(cyf1.getLimitAmtDisp());
                         cuenta.setLimitExpDate(cyf1.getLimitExpDate());
                         cuenta.setNombreMoneda(cyf1.getNombreMoneda());
                         cuenta.setSimboloMoneda(cyf1.getSimboloMoneda());
                         
                         for (FCCuentaFirma cyf2 : CuenFirPortaAssoc) 
                         {
                            if (cyf1.getAccountAssoc().trim().equals(cyf2.getAccountNo().trim()))
                                 {                                
                                     cuenta.setCurrencyAssoc(cyf2.getCurrency());                                
                                 } 
                         } 
                         
                        cuenta.setTitular(cyf1.getTitular());

                         cuenta.setErrcod(cyf1.getErrcod()); 
                         cuenta.setDetcod(cyf1.getDetcod()); 
                         cuenta.setDefcod(cyf1.getDefcod()); 

                         CuenFirPortaAssocMoney.add(cuenta);
                     } 
                        
                    }
                     else
                    {   
                        FCCuentaFirma lista = new FCCuentaFirma();                       
                        lista.setWorkingBal(0.00);
                        lista.setAcctBal(0.00);    
                        lista.setWorkingBalUSD(0.00);
                        lista.setAcctBalUSD(0.00);    
                        lista.setLimitAmtDisp(0.00);
                        
                        lista.setErrcod(errcod);
                        lista.setDetcod(detcod);
                        lista.setDefcod(defcod);                 
                        CuenFirPortaAssocMoney.add(lista);                            
                    }         
                   
                  }
        catch (Exception e) {
                System.err.println(e.getMessage()); 
                FCCuentaFirma lista = new FCCuentaFirma();                       
                lista.setWorkingBal(0.00);
                lista.setAcctBal(0.00);     
                lista.setWorkingBalUSD(0.00);
                lista.setAcctBalUSD(0.00);    
                lista.setLimitAmtDisp(0.00);
             
                lista.setErrcod(Constantes.HTTP_RESPUESTA_BADREQUEST.toString());
                lista.setDetcod(e.getCause().toString());
                lista.setDefcod(e.getMessage());                 
                
                CuenFirPortaAssocMoney.add(lista);                    
      }
        
        return CuenFirPortaAssocMoney;
    }    
     
    
     @Override
    public List<FCCuentaFirma> CuentaConPortafolioLista(String xmlString,String CustomerNo,List<dto.sql.Moneda>  listMonedas) {
        
        List<FCCuentaFirma> list = null;
        list = new ArrayList<>();

        List<FCCuentaFirma> acList = null;
        acList = new ArrayList<>();

        try {
            list = CuentayFirmaList(xmlString, CustomerNo,listMonedas);
            acList = list.stream().filter(x -> ! x.getIdPortfolio().trim().equals("")).collect(Collectors.toList());

        } catch (Exception e) {
        }
        return acList;
     }
    
     @Override
    public List<FCCuentaFirma> CuentaSinPortafolioLista(String xmlString,String CustomerNo,List<dto.sql.Moneda>  listMonedas) {
        
        List<FCCuentaFirma> list = null;
        list = new ArrayList<>();

        List<FCCuentaFirma> acList = null;
        acList = new ArrayList<>();

        try {
            list = CuentayFirmaList(xmlString, CustomerNo,listMonedas);
            acList = list.stream().filter(x ->  x.getIdPortfolio().trim().equals("")).collect(Collectors.toList());

        } catch (Exception e) {
        }
        return acList;
     }
    
      @Override
    public List<FCTotalPortafolio> TotalPortafolio(String xmlString,String CustomerNo,List<dto.sql.Moneda>  listMonedas) {
        
        List<FCCuentaFirma> list = null;
        list = new ArrayList<>();

        List<FCCuentaFirma> acList = null;
        acList = new ArrayList<>();
        
        List<FCListaPortafolio> ListaPortafolio = null;
        ListaPortafolio = new ArrayList<>();
        
        List<FCTotalPortafolio> TotalPortafolio = null;
        TotalPortafolio = new ArrayList<>();
        
        Map<String, Double> sum =null;

        try {
            list = CuentayFirmaList(xmlString, CustomerNo,listMonedas);
            acList = list.stream().filter(x ->!x.getIdPortfolio().trim().equals("")).collect(Collectors.toList());
            
            sum = acList.stream().collect(
                Collectors.groupingBy(FCCuentaFirma::getIdPortfolio, Collectors.summingDouble(FCCuentaFirma::getWorkingBalUSD)));
            
            Set<String> mapKeys = sum.keySet();
            for (String key : mapKeys) {
                // Obtenemos el value.
                Double value = sum.get(key);
                FCTotalPortafolio TotPorta = new FCTotalPortafolio();               
                TotPorta.setIdPortfolio(key);
                TotPorta.setSumaPortafolio(value);

                TotalPortafolio.add(TotPorta);    
    
                 }
                       
        } catch (Exception e) {
        }
        return TotalPortafolio;
     }
    
     @Override
    public List<FC53_ACCTDETS> ConsultaSaldo(String xmlString , String customerNo , String numCuenta,List<dto.sql.Moneda>  listMonedas) {
        
        List<FC53_ACCTDETS> list = null;
        list = new ArrayList<>();

        List<FC53_ACCTDETS> acList = null;
        acList = new ArrayList<>();

        try {
            list = FC53ACCTDETS(xmlString, customerNo, listMonedas);
            acList = list.stream().filter(x -> x.getAccountNo().trim().equals(numCuenta)).collect(Collectors.toList());

        } catch (Exception e) {
        }
        return acList;
     }
       
         
}