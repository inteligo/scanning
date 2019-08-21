package com.t24.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import com.t24.services.FCRetorno;
import dto.t24.services.FCCuenta;
import dto.t24.services.FC01_ACLIST;
import dto.t24.services.FC01_COLLLIST;
import java.util.List;
import org.jdom2.input.SAXBuilder;
import dto.t24.services.FC01_CUSLIST;
import dto.t24.services.FC01_LIMITLIST;
import dto.t24.services.FC01_SIGNLIST;
import dto.t24.services.FCReturn;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.stream.Collectors;
import com.t24.services.CWServiceTWS_Tipo1;
import com.t24.services.FC01Tipo1;
import dao.sql.DaoTipoDocumentoBIZAGI;
import dao.sql.impl.DaoTipoDocumentoBIZAGIImpl;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;
import java.io.IOException;
import org.jdom2.JDOMException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FC01Tipo1Impl implements FC01Tipo1   {  

    private static final Logger LOG = LogManager.getLogger(FC01Tipo1Impl.class);
    
    @Override
    public String FC01Str(String CustomerNo)   {
        com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
        CWServiceTWS_Tipo1  consumingservice= new CWServiceTWS_Tipo1Impl();
        InputCollectionTipo1Impl icimpl=new InputCollectionTipo1Impl();

        enquiryInput=icimpl.Input("functioncode;" +Constantes.INTEGRADOR_FC01 +"|CustomerNo;"+CustomerNo);
      
        String strFC_return = consumingservice.CallService(enquiryInput);

        return strFC_return;
        }
    
    @Override
    public List<FC01_CUSLIST> FC01CUSList  (String xmlString,String CustomerNo) {
        SAXBuilder builder = new SAXBuilder();        
        String errcod="";
        String detcod="";
        String defcod="";
        FCRetorno fcretorno= new FCRetornoImpl();
        List list = new ArrayList<>();  
        String tipodoc="";
       
        List<dto.sql.TipoDocumentoBIZAGI>  listTipoDocBIZAGI=null;        
        DaoTipoDocumentoBIZAGI listaTipoDocBIZAGI= new DaoTipoDocumentoBIZAGIImpl(); 
        
        Integer i=0;
        
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
                        org.jdom2.Element rootE01 = dc02.getRootElement();     
//                        org.jdom2.Element head01= rootE01.getChild("head");
                        org.jdom2.Element body01 = rootE01.getChild("body");

                        org.jdom2.Element lstElement01 = body01.getChild("tables");
                        List<org.jdom2.Element> lst01table =  lstElement01.getChildren();

                        for (org.jdom2.Element element01 : lst01table) {
                            List<org.jdom2.Element> tablee = element01.getChildren();						
                            if (element01.getAttributeValue("name").equals("CUS.LIST")) {
                                for (org.jdom2.Element element1 : tablee) {
                                    i=i+1;
                                    FC01_CUSLIST lista = new FC01_CUSLIST();
                                    lista.setIdClient(CustomerNo);
                                    lista.setInactiveCustomer((String) element1.getChildText("InactiveCustomer").trim());
                                    lista.setActiveCustomer((String) element1.getChildText("ActiveCustomer").trim());
                                    lista.setDocType((String) element1.getChildText("DocType").trim()); 
                                    lista.setID((String) element1.getChildText("ID").trim()); 
                                    lista.setCollateralDeuda((String) element1.getChildText("CollateralDeuda").trim()); 
                                    lista.setCusSegment((String) element1.getChildText("CusSegment").trim()); 
                                    lista.setCusStatus((String) element1.getChildText("CusStatus").trim()); 

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
                FC01_CUSLIST lista = new FC01_CUSLIST();                
                lista.setErrcod(errcod);
                lista.setDetcod(detcod);
                lista.setDefcod(defcod);
                list.add(lista);   
            } 
            }
        
        catch (IOException | JDOMException e) {
            LOG.error( "ERROR: " + e.getMessage());
            System.err.println(e.getMessage()); 
            FC01_CUSLIST lista = new FC01_CUSLIST();                          

            lista.setErrcod(Constantes.HTTP_RESPUESTA_BADREQUEST.toString());
            lista.setDetcod(e.getCause().toString());
            lista.setDefcod(e.getMessage());  

            list.add(lista);       
      
      }
        System.out.println(i);
        return list;
    }
      
    @Override
    public List<FC01_ACLIST> FC01ACList (String xmlString, String CustomerNo,List<dto.sql.Moneda>  listMonedas) {
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
                        org.jdom2.Document dc02 = (org.jdom2.Document) builder.build(new StringReader(xmlString.toString()));   
                        org.jdom2.Element rootE01 = dc02.getRootElement();     
//                        org.jdom2.Element head01= rootE01.getChild("head");
                        org.jdom2.Element body01 = rootE01.getChild("body");

                        org.jdom2.Element lstElement01 = body01.getChild("tables");
                        List<org.jdom2.Element> lst01table =  lstElement01.getChildren();


                        for (org.jdom2.Element element01 : lst01table) {
                            List<org.jdom2.Element> tablee = element01.getChildren();						
                            if (element01.getAttributeValue("name").equalsIgnoreCase("AC.LIST")) {
                                for (org.jdom2.Element element1 : tablee) {

                                    FC01_ACLIST lista = new FC01_ACLIST();
                                    lista.setIdClient(CustomerNo);
                                    lista.setAccCustomer((String) element1.getChildText("AccCustomer").trim());
                                    lista.setAccountNo((String) element1.getChildText("AccountNo").trim());
                                    lista.setAccountActive((String) element1.getChildText("AccountActive").trim()); 
                                    lista.setAccountInactive((String) element1.getChildText("AccountInactive").trim()); 
                                    lista.setAccountType((String) element1.getChildText("AccountType").trim()); 
                                    lista.setAgreementID((String) element1.getChildText("AgreementID").trim()); 
                                    lista.setAccountAssoc((String) element1.getChildText("AccountAssoc").trim());                     
                                    lista.setPortfolio((String) element1.getChildText("Portfolio").trim()); 
                                    lista.setCurrency((String) element1.getChildText("Currency").trim());
                                    lista.setWorkingBal(Convierte.NumStringaDouble(element1.getChildText("WorkingBal").trim()));                   
                                    lista.setAcctBal(Convierte.NumStringaDouble(element1.getChildText("AcctBal").trim()));                   
                                    lista.setOLBActive((String) element1.getChildText("OLBActive").trim());                     
                                    lista.setLimit((String) element1.getChildText("Limit").trim()); 
                                    lista.setLimitAmount(Convierte.NumStringaDouble(element1.getChildText("LimitAmount").trim())); 
                                    lista.setLimitAmtDisp(Convierte.NumStringaDouble(element1.getChildText("LimitAmtDisp").trim())); 
                                    lista.setLimitExpDate((String) element1.getChildText("LimitExpDate").trim()); 
                                    lista.setCollateralActive((String) element1.getChildText("CollateralActive").trim());                    
                                    lista.setAccSegment((String) element1.getChildText("AccSegment").trim()); 
                                    
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
                FC01_ACLIST lista = new FC01_ACLIST();
                    lista.setWorkingBal(0.00);                   
                    lista.setAcctBal(0.00);      
                    lista.setWorkingBalUSD(0.00);                   
                    lista.setAcctBalUSD(0.00);      
                    lista.setLimitAmount(0.00); 
                    lista.setLimitAmtDisp(0.00); 
                    lista.setErrcod(errcod);
                    lista.setDefcod(detcod);
                    lista.setDetcod(detcod);

                    list.add(lista);
            }         
        }
        
        catch (IOException | JDOMException e) {
                LOG.error( "ERROR: " + e.getMessage());
                 System.err.println(e.getMessage()); 
                 FC01_ACLIST lista = new FC01_ACLIST();
                lista.setWorkingBal(0.00);                   
                lista.setAcctBal(0.00);      
                lista.setLimitAmount(0.00); 
                lista.setLimitAmtDisp(0.00);                   
               
                lista.setErrcod(Constantes.HTTP_RESPUESTA_BADREQUEST.toString());
                lista.setDetcod(e.getCause().toString());
                lista.setDefcod(e.getMessage());  
                
                list.add(lista);     
      
      }
            
        return list;
        
    }
    
    @Override
    public List<FC01_SIGNLIST> FC01SIGNList (String xmlString, String CustomerNo) {
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
                        org.jdom2.Element rootE01 = dc02.getRootElement();     
//                        org.jdom2.Element head01= rootE01.getChild("head");
                        org.jdom2.Element body01 = rootE01.getChild("body");

                        org.jdom2.Element lstElement01 = body01.getChild("tables");
                        List<org.jdom2.Element> lst01table =  lstElement01.getChildren();

                        for (org.jdom2.Element element01 : lst01table) {
                            List<org.jdom2.Element> tablee = element01.getChildren();						
                            if (element01.getAttributeValue("name").equalsIgnoreCase("SIGN.LIST")) {
                                for (org.jdom2.Element element1 : tablee) {

                                    FC01_SIGNLIST lista = new FC01_SIGNLIST();
                                    lista.setIdClient(CustomerNo);
                                    lista.setCustomerNo((String) element1.getChildText("CustomerNo").trim());
                                    lista.setAccountNo((String) element1.getChildText("AccountNo").trim());
                                    lista.setSignRelation((String) element1.getChildText("SignRelation").trim()); 
                                    lista.setSignGroup((String) element1.getChildText("SignGroup").trim()); 
                                    lista.setSignConditionT24((String) element1.getChildText("SignCondition").trim()); 
                                    lista.setSignLink((String) element1.getChildText("SignLink").trim()); 
                                    lista.setSignCondition((String) element1.getChildText("SignCondition").trim()); 
//                                    lista.setSignCondition((String) Convierte.CondicionFirma(element1.getChildText("SignGroup").trim(), element1.getChildText("SignCondition").trim()));    
                                    

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
                FC01_SIGNLIST lista = new FC01_SIGNLIST();
                lista.setErrcod(errcod);
                lista.setDetcod(detcod);
                lista.setDefcod(defcod);
                list.add(lista);   
            } 
        }

        catch (IOException | JDOMException e) {
            LOG.error( "ERROR: " + e.getMessage());
            System.err.println(e.getMessage()); 
            FC01_SIGNLIST lista = new FC01_SIGNLIST();

            lista.setErrcod(Constantes.HTTP_RESPUESTA_BADREQUEST.toString());
            lista.setDetcod(e.getCause().toString());
            lista.setDefcod(e.getMessage());  

            list.add(lista);            
    
      }
        return list;
    }
    
    @Override
    public List<FC01_COLLLIST> FC01COLLList (String xmlString, String CustomerNo) {
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
                        org.jdom2.Document dc02 = (org.jdom2.Document) builder.build(new StringReader(xmlString));   
                        org.jdom2.Element rootE01 = dc02.getRootElement();     
//                        org.jdom2.Element head01= rootE01.getChild("head");
                        org.jdom2.Element body01 = rootE01.getChild("body");

                        org.jdom2.Element lstElement01 = body01.getChild("tables");
                        List<org.jdom2.Element> lst01table =  lstElement01.getChildren();

                        for (org.jdom2.Element element01 : lst01table) {
                            List<org.jdom2.Element> tablee = element01.getChildren();						
                            if (element01.getAttributeValue("name").equalsIgnoreCase("COLL.LIST")) {
                                for (org.jdom2.Element element1 : tablee) {

                                    FC01_COLLLIST lista = new FC01_COLLLIST();
                                    lista.setIdClient(CustomerNo);
                                    lista.setCollateralId((String) element1.getChildText("CollateralId").trim());
                                    lista.setExecutionValue((String) element1.getChildText("ExecutionValue").trim());
                                    lista.setCollateralCode((String) element1.getChildText("CollateralCode").trim()); 
                                    lista.setApplicationId((String) element1.getChildText("ApplicationId").trim()); 

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
                FC01_COLLLIST lista = new FC01_COLLLIST();
                lista.setErrcod(errcod);
                lista.setDetcod(detcod);
                lista.setDefcod(defcod);
                list.add(lista);   
            }
            }
        
        catch (IOException | JDOMException e) {
            LOG.error( "ERROR: " + e.getMessage());
            System.err.println(e.getMessage()); 
            FC01_COLLLIST lista = new FC01_COLLLIST();

            lista.setErrcod(Constantes.HTTP_RESPUESTA_BADREQUEST.toString());
            lista.setDetcod(e.getCause().toString());
            lista.setDefcod(e.getMessage());  

            list.add(lista);      
     
      }
        return list;
    }
    
    @Override
    public List<FC01_LIMITLIST> FC01LIMITList (String xmlString, String CustomerNo) {
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
                        org.jdom2.Document dc02 = (org.jdom2.Document) builder.build(new StringReader(xmlString));   
                        org.jdom2.Element rootE01 = dc02.getRootElement();     
//                        org.jdom2.Element head01= rootE01.getChild("head");
                        org.jdom2.Element body01 = rootE01.getChild("body");

                        org.jdom2.Element lstElement01 = body01.getChild("tables");
                        List<org.jdom2.Element> lst01table =  lstElement01.getChildren();

                        for (org.jdom2.Element element01 : lst01table) {
                            List<org.jdom2.Element> tablee = element01.getChildren();						
                            if (element01.getAttributeValue("name").equalsIgnoreCase("LIMIT.LIST")) {
                                for (org.jdom2.Element element1 : tablee) {

                                    FC01_LIMITLIST lista = new FC01_LIMITLIST();
                                    lista.setIdClient(CustomerNo);

                                    lista.setLimitReference((String) element1.getChildText("LimitReference").trim());
                                    lista.setCOllAmount((String) element1.getChildText("COllAmount").trim());
                                    lista.setApplicationId((String) element1.getChildText("ApplicationId").trim());

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
                FC01_LIMITLIST lista = new FC01_LIMITLIST();
                lista.setErrcod(errcod);
                lista.setDetcod(detcod);
                lista.setDefcod(defcod);
                list.add(lista);   
            } 
            }

        catch (IOException | JDOMException e) {
            LOG.error( "ERROR: " + e.getMessage());
            System.err.println(e.getMessage()); 
            FC01_LIMITLIST lista = new FC01_LIMITLIST();

            lista.setErrcod(Constantes.HTTP_RESPUESTA_BADREQUEST.toString());
            lista.setDetcod(e.getCause().toString());
            lista.setDefcod(e.getMessage());  

            list.add(lista);     
    
      }
        return list;
    }
    
    @Override
    public List FC01List (String xmlString,String CustomerNo,List<dto.sql.Moneda>  listMonedas) {
        
        
        List<FC01_CUSLIST> lista1 =FC01CUSList(xmlString,CustomerNo);
        List<FC01_ACLIST> lista2 = FC01ACList (xmlString,CustomerNo,listMonedas);
        List<FC01_SIGNLIST> lista3 = FC01SIGNList (xmlString,CustomerNo);
        List<FC01_COLLLIST> lista4 = FC01COLLList (xmlString,CustomerNo);
        List<FC01_LIMITLIST> lista5 = FC01LIMITList (xmlString,CustomerNo);
        
        List listaFinal = null;         
        listaFinal = new ArrayList<>();
        
        listaFinal.addAll(lista1);
        listaFinal.addAll(lista2);
        listaFinal.addAll(lista3);
        listaFinal.addAll(lista4);
        listaFinal.addAll(lista5);
        
        
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
        List <FCCuenta> ListAccount = new ArrayList<>();
                
        List<FCCuenta> CuenFirP = null;
        CuenFirP = new ArrayList<>();

        List<FCCuenta> CuenFirPorta = null;
        CuenFirPorta = new ArrayList<>();

        List<FCCuenta> CuenFirPortaAssoc = null;
        CuenFirPortaAssoc = new ArrayList<>();

        List<FCCuenta> CuenFirPortaAssocMoney = null;
        CuenFirPortaAssocMoney = new ArrayList<>();    
        
         String json= "";

        Gson gson =new GsonBuilder().serializeNulls().create();    
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
        
                        List<FC01_ACLIST> LisAc =FC01ACList(xmlString,CustomerNo,listMonedas);        
                        List<FC01_SIGNLIST> LisSign = FC01SIGNList (xmlString,CustomerNo);              



                        for (FC01_ACLIST x:LisAc)
                            {
                                FCCuenta listaaccount = new FCCuenta();
                                listaaccount.setIdClient(x.getIdClient());
                                listaaccount.setAccCustomer(x.getAccCustomer());
                                listaaccount.setAccountNo(x.getAccountNo());
                                listaaccount.setAccountActive(x.getAccountActive());
                                listaaccount.setAccountInactive(x.getAccountInactive());
                                listaaccount.setAccountType(x.getAccountType());
                                listaaccount.setAgreementID(x.getAgreementID());
                                listaaccount.setAccountAssoc(x.getAccountAssoc());
                                listaaccount.setPortfolio(x.getPortfolio());
                                listaaccount.setCurrency(x.getCurrency());
                                listaaccount.setWorkingBal(x.getWorkingBal());
                                listaaccount.setAcctBal(x.getAcctBal());
                                listaaccount.setWorkingBalUSD(x.getWorkingBalUSD());
                                listaaccount.setAcctBalUSD(x.getAcctBalUSD());
                                listaaccount.setOLBActive(x.getOLBActive());
                                listaaccount.setLimit(x.getLimit());
                                listaaccount.setLimitAmount(x.getLimitAmount());
                                listaaccount.setLimitAmtDisp(x.getLimitAmtDisp());
                                listaaccount.setLimitExpDate(x.getLimitExpDate());
                                listaaccount.setCollateralActive(x.getCollateralActive());
                                listaaccount.setAccSegment(x.getAccSegment());
                                listaaccount.setNombreMoneda(x.getNombreMoneda());
                                listaaccount.setSimboloMoneda(x.getSimboloMoneda());
                                for (FC01_SIGNLIST y:LisSign)
                                {
                                    if(x.getAccountNo().equals(y.getAccountNo()))
                                    {
                                        listaaccount.setSignRelation(y.getSignRelation());
                                        listaaccount.setSignGroup(y.getSignGroup());
                                        listaaccount.setSignCondition(y.getSignCondition());
                                        listaaccount.setSignConditionT24(y.getSignConditionT24());
                                        listaaccount.setSignLink(y.getSignLink());
                                    }
                                }
                                listaaccount.setErrcod(x.getErrcod());
                                listaaccount.setDetcod(x.getDetcod());
                                listaaccount.setDefcod(x.getDefcod());
                                
                                ListAccount.add(listaaccount);                
                            } 
                  
                    for (FCCuenta cyf1 : ListAccount) 
                     {
                         FCCuenta cuenta = new FCCuenta();               
                         cuenta.setIdClient(cyf1.getIdClient());
                         cuenta.setAccCustomer(cyf1.getAccCustomer());
                         cuenta.setAccountNo(cyf1.getAccountNo());
                         cuenta.setAccountActive(cyf1.getAccountActive());
                         cuenta.setAccountInactive(cyf1.getAccountInactive());
                         cuenta.setAccountType(cyf1.getAccountType());
                         cuenta.setAgreementID(cyf1.getAgreementID());
                         cuenta.setAccountAssoc(cyf1.getAccountAssoc());            
                         cuenta.setCurrency(cyf1.getCurrency());
                         cuenta.setWorkingBal(cyf1.getWorkingBal());
                         cuenta.setAcctBal(cyf1.getAcctBal());
                         cuenta.setWorkingBalUSD(cyf1.getWorkingBalUSD());
                         cuenta.setAcctBalUSD(cyf1.getAcctBalUSD());
                         cuenta.setOLBActive(cyf1.getOLBActive());
                         cuenta.setLimit(cyf1.getLimit());
                         cuenta.setLimitAmount(cyf1.getLimitAmount());
                         cuenta.setLimitAmtDisp(cyf1.getLimitAmtDisp());            
                         cuenta.setLimitExpDate(cyf1.getLimitExpDate());
                         cuenta.setCollateralActive(cyf1.getCollateralActive());
                         cuenta.setAccSegment(cyf1.getAccSegment());
                         cuenta.setSignRelation(cyf1.getSignRelation());
                         cuenta.setSignGroup(cyf1.getSignGroup());
                         cuenta.setSignCondition(cyf1.getSignCondition());    
                         cuenta.setSignConditionT24(cyf1.getSignConditionT24());   
                         cuenta.setSignLink(cyf1.getSignLink());          
                         cuenta.setPortfolio(cyf1.getPortfolio());           
                         cuenta.setNombreMoneda(cyf1.getNombreMoneda());
                         cuenta.setSimboloMoneda(cyf1.getSimboloMoneda());
                         for (FCCuenta cyf2 : ListAccount) 
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

                   
                     for (FCCuenta cyf3 : CuenFirP) 
                     {
                         FCCuenta cuenta = new FCCuenta();               
                         cuenta.setIdClient(cyf3.getIdClient());
                         cuenta.setAccCustomer(cyf3.getAccCustomer());
                         cuenta.setAccountNo(cyf3.getAccountNo());
                         cuenta.setAccountActive(cyf3.getAccountActive());
                         cuenta.setAccountInactive(cyf3.getAccountInactive());
                         cuenta.setAccountType(cyf3.getAccountType());
                         cuenta.setAgreementID(cyf3.getAgreementID());
                         cuenta.setAccountAssoc(cyf3.getAccountAssoc());            
                         cuenta.setCurrency(cyf3.getCurrency());
                         cuenta.setWorkingBal(cyf3.getWorkingBal());
                         cuenta.setAcctBal(cyf3.getAcctBal());
                         cuenta.setWorkingBalUSD(cyf3.getWorkingBalUSD());
                         cuenta.setAcctBalUSD(cyf3.getAcctBalUSD());
                         cuenta.setOLBActive(cyf3.getOLBActive());
                         cuenta.setLimit(cyf3.getLimit());
                         cuenta.setLimitAmount(cyf3.getLimitAmount());
                         cuenta.setLimitAmtDisp(cyf3.getLimitAmtDisp());            
                         cuenta.setLimitExpDate(cyf3.getLimitExpDate());
                         cuenta.setCollateralActive(cyf3.getCollateralActive());
                         cuenta.setAccSegment(cyf3.getAccSegment());
                         cuenta.setSignRelation(cyf3.getSignRelation());
                         cuenta.setSignGroup(cyf3.getSignGroup());
                         cuenta.setSignCondition(cyf3.getSignCondition());  
                         cuenta.setSignConditionT24(cyf3.getSignConditionT24());      
                         cuenta.setSignLink(cyf3.getSignLink());          
                         cuenta.setPortfolio(cyf3.getPortfolio()); 
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

                    List<FCCuenta> listTrading = null;
                    listTrading= new ArrayList<>();   
                    listTrading = CuenFirPorta.stream().filter(x -> x.getAccountType().trim().equals("Trading Account")).collect(Collectors.toList());


                    for (FCCuenta cyf1 : CuenFirPorta) 
                     {
                         FCCuenta cuenta = new FCCuenta();               
                         cuenta.setIdClient(cyf1.getIdClient());
                         cuenta.setAccCustomer(cyf1.getAccCustomer());
                         cuenta.setAccountNo(cyf1.getAccountNo());
                         cuenta.setAccountActive(cyf1.getAccountActive());
                         cuenta.setAccountInactive(cyf1.getAccountInactive());
                         cuenta.setAccountType(cyf1.getAccountType());
                         cuenta.setAgreementID(cyf1.getAgreementID());
                         cuenta.setAccountAssoc(cyf1.getAccountAssoc());            
                         cuenta.setCurrency(cyf1.getCurrency());
                         cuenta.setWorkingBal(cyf1.getWorkingBal());
                         cuenta.setAcctBal(cyf1.getAcctBal());
                         cuenta.setWorkingBalUSD(cyf1.getWorkingBalUSD());
                         cuenta.setAcctBalUSD(cyf1.getAcctBalUSD());
                         cuenta.setOLBActive(cyf1.getOLBActive());
                         cuenta.setLimit(cyf1.getLimit());
                         cuenta.setLimitAmount(cyf1.getLimitAmount());
                         cuenta.setLimitAmtDisp(cyf1.getLimitAmtDisp());            
                         cuenta.setLimitExpDate(cyf1.getLimitExpDate());
                         cuenta.setCollateralActive(cyf1.getCollateralActive());
                         cuenta.setAccSegment(cyf1.getAccSegment());
                         cuenta.setSignRelation(cyf1.getSignRelation());
                         cuenta.setSignGroup(cyf1.getSignGroup());
                         cuenta.setSignCondition(cyf1.getSignCondition());   
                         cuenta.setSignConditionT24(cyf1.getSignConditionT24());   
                         cuenta.setSignLink(cyf1.getSignLink());          
                         cuenta.setPortfolio(cyf1.getPortfolio());  
                         cuenta.setIdPortfolio(cyf1.getIdPortfolio());   
                         cuenta.setNombreMoneda(cyf1.getNombreMoneda());
                         cuenta.setSimboloMoneda(cyf1.getSimboloMoneda());
                         for (FCCuenta cyf2 : listTrading) 
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
               
                      for (FCCuenta cyf1 : CuenFirPortaAssoc) 
                     {
                         FCCuenta cuenta = new FCCuenta();               
                         cuenta.setIdClient(cyf1.getIdClient());
                         cuenta.setAccCustomer(cyf1.getAccCustomer());
                         cuenta.setAccountNo(cyf1.getAccountNo());
                         cuenta.setAccountActive(cyf1.getAccountActive());
                         cuenta.setAccountInactive(cyf1.getAccountInactive());
                         cuenta.setAccountType(cyf1.getAccountType());
                         cuenta.setAgreementID(cyf1.getAgreementID());
                         cuenta.setAccountAssoc(cyf1.getAccountAssoc());            
                         cuenta.setCurrency(cyf1.getCurrency());
                         cuenta.setWorkingBal(cyf1.getWorkingBal());
                         cuenta.setAcctBal(cyf1.getAcctBal());
                         cuenta.setWorkingBalUSD(cyf1.getWorkingBalUSD());
                         cuenta.setAcctBalUSD(cyf1.getAcctBalUSD());
                         cuenta.setOLBActive(cyf1.getOLBActive());
                         cuenta.setLimit(cyf1.getLimit());
                         cuenta.setLimitAmount(cyf1.getLimitAmount());
                         cuenta.setLimitAmtDisp(cyf1.getLimitAmtDisp());            
                         cuenta.setLimitExpDate(cyf1.getLimitExpDate());
                         cuenta.setCollateralActive(cyf1.getCollateralActive());
                         cuenta.setAccSegment(cyf1.getAccSegment());
                         cuenta.setSignRelation(cyf1.getSignRelation());
                         cuenta.setSignGroup(cyf1.getSignGroup());
                         cuenta.setSignCondition(cyf1.getSignCondition());      
                         cuenta.setSignConditionT24(cyf1.getSignConditionT24());          
                         cuenta.setSignLink(cyf1.getSignLink());          
                         cuenta.setPortfolio(cyf1.getPortfolio()); 
                         cuenta.setIdPortfolio(cyf1.getIdPortfolio());  
                         cuenta.setNombreMoneda(cyf1.getNombreMoneda());   
                         cuenta.setSimboloMoneda(cyf1.getSimboloMoneda());   
                          
                         for (FCCuenta cyf2 : CuenFirPortaAssoc) 
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
                        FCCuenta lista = new FCCuenta();     
                        lista.setAccountNo("");
                        lista.setWorkingBal(0.00);
                        lista.setAcctBal(0.00);                       
                        lista.setLimitAmount(0.00);
                        lista.setLimitAmtDisp(0.00);                       
                        
                        lista.setErrcod(errcod);
                        lista.setDetcod(detcod);
                        lista.setDefcod(defcod);                 
                        CuenFirPortaAssocMoney.add(lista);    
                        
                    }         
                   
                  }
        catch (Exception e) {
            LOG.error( "ERROR: " + e.getMessage());
            System.err.println(e.getMessage()); 
            FCCuenta lista = new FCCuenta();    
             lista.setAccountNo("");
            lista.setWorkingBal(0.00);
            lista.setAcctBal(0.00);        
            lista.setWorkingBalUSD(0.00);
            lista.setAcctBalUSD(0.00);                       
            lista.setLimitAmount(0.00);
            lista.setLimitAmtDisp(0.00);                       

            lista.setErrcod(Constantes.HTTP_RESPUESTA_BADREQUEST.toString());
            lista.setDetcod(e.getCause().toString());
            lista.setDefcod(e.getMessage());                 

            CuenFirPortaAssocMoney.add(lista);                    
      }
        
        return CuenFirPortaAssocMoney;
    }
    
     @Override
    public List<FC01_ACLIST> ConsultaSaldo(String xmlString , String customerNo , String numCuenta,List<dto.sql.Moneda>  listMonedas) {
        
        List<FC01_ACLIST> list = null;
        list = new ArrayList<>();

        List<FC01_ACLIST> acList = null;
        acList = new ArrayList<>();

        try {
            list = FC01ACList(xmlString, customerNo,listMonedas);
            acList = list.stream().filter(x -> x.getAccountNo().trim().equals(numCuenta)).collect(Collectors.toList());

        } catch (Exception e) {
            LOG.error( "ERROR: " + e.getMessage());
        }
        return acList;
     }
       
         
}