package com.apis.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Formatea;
import com.java.GeneraUUID;
import com.java.LeerDataProperties;
import com.t24.services.AccountDetails360;
import com.t24.services.FC53Tipo1;
import com.t24.services.impl.AccountDetails360Impl;

import com.t24.services.impl.CWServiceListaMonedasHiloImpl;
import com.t24.services.impl.CWServiceTWS360HiloImpl;
import com.t24.services.impl.CWServiceTWS_Tipo1HiloImpl;
import com.t24.services.impl.FC53Tipo1Impl;
import com.t24.services.impl.InputCollection360Impl;
import com.t24.services.impl.InputCollectionTipo1Impl;
import com.t24.services.input.Body;
import com.t24.services.input.Head;
import com.t24.services.input.IbaQuery;
import com.t24.services.input.InputCollection;


import dto.t24.services.ACCOUNTDETAILS;
import dto.t24.services.FCCuentaFirma;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;


public class SaldoCuentasImpl {
    private static final Logger LOG = LogManager.getLogger(SaldoCuentasImpl.class);
    
    public String ConsultaSaldoCuentas (String CustomerNo,String CtaOri, String CtaDes) {    
          
        com.tws.wsdl.EnquiryInput enquiryInput53=new com.tws.wsdl.EnquiryInput();
         com.tws360.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws360.wsdl.EnquiryInputCollection();  
        com.tws360.wsdl.EnquiryInput enquiryInput=new com.tws360.wsdl.EnquiryInput();
        FC53Tipo1 fc53= new FC53Tipo1Impl();
              
        AccountDetails360 ad360= new AccountDetails360Impl();
        
        Gson gson =new GsonBuilder().serializeNulls().create();    
        String json="";  
        
        String CtaCte="";
        String CtaTra="";
        
        Double SaldoCtaCte=0.00;
        Double SaldoCtaTra=0.00;
        Double SalDispoTra=0.00;
        Double SalDispoCte=0.00;
        
        Double SaldoCtaCteUSD=0.00;
        Double SaldoCtaTraUSD=0.00;
        Double SalDispoTraUSD=0.00;
        Double SalDispoCteUSD=0.00;
        
        String montra="";
        String moncte="";
        
        int cantidadDatosLista=0;
        

        List<dto.sql.Moneda> listMonedas =null;           
        String errcod="";
        String detcod="";
        String defcod="";        
        
        JSONObject JOTotalCash =new JSONObject();        
        JSONObject JOTotalError =new JSONObject();        
        JSONObject JORaiz =new JSONObject();        
        IbaQuery ibaguid1 = new IbaQuery();
        Head hd1 = new Head();
        Body bd1 = new Body();

        try
        {  
                        
           
            
            hd1.setIbaguid(GeneraUUID.CodigoUUID());       
            hd1.setFunctioncode(Constantes.INTEGRADOR_FC53);
            hd1.setChannel(Constantes.INTEGRADOR_CHANNEL);
            hd1.setAgentId(Constantes.INTEGRADOR_AGENTID);
            hd1.setCustomerNo(CustomerNo);       

            ibaguid1.setHead(hd1);
            bd1.setCustomerNo(CustomerNo);        
            ibaguid1.setBody(bd1);
            
            InputCollectionTipo1Impl ictipo1impl=new InputCollectionTipo1Impl();
            enquiryInput53=ictipo1impl.Input("functioncode;" +Constantes.INTEGRADOR_FC53 +"|CustomerNo;"+CustomerNo);
             
            InputCollection360Impl icimpl=new InputCollection360Impl();
            InputCollection ic =new InputCollection();
            ic.setCUSTOMERID(CustomerNo);
            enquiryInput=icimpl.Input(ic);

            String strFC_return1=null;
            String resultado="";

            
            CWServiceTWS_Tipo1HiloImpl servicio1 = new CWServiceTWS_Tipo1HiloImpl(enquiryInput53);                        
            CWServiceListaMonedasHiloImpl servicio4 = new CWServiceListaMonedasHiloImpl();
            CWServiceTWS360HiloImpl servicio5 = new CWServiceTWS360HiloImpl(Constantes.TMNV360ACCOUNTDETAILS,enquiryInput); 

            Thread hilo4 = servicio4;
            hilo4.start();

            Thread hilo1 = servicio1;
            hilo1.start();

             Thread hilo5 = servicio5;
             hilo5.start();

            while (hilo1.isAlive() || hilo4.isAlive()  || hilo5.isAlive())
            {
                listMonedas=servicio4.getResult();
                strFC_return1=servicio1.getResult();       
                resultado=servicio5.getResult();        
            }   

            
            List<FCCuentaFirma> listDetCash =null;
            List<FCCuentaFirma> listDetalleCash = null;
            listDetalleCash = new ArrayList<>();  
            List<ACCOUNTDETAILS> AccountDetailsList=null;          
            
           
            listDetCash =fc53.CuentayFirmaList(strFC_return1, CustomerNo, listMonedas);
            AccountDetailsList =ad360.ACCOUNTDETAILS(resultado,CustomerNo,listMonedas);  
                
            
             for (FCCuentaFirma lpf : listDetCash) 
            {
                errcod= lpf.getErrcod();
                detcod=lpf.getDetcod();
                defcod=lpf.getDefcod();   
            }               
                         
            if (errcod.equals("0"))
            {
                
                  List<ACCOUNTDETAILS> listAccDetNoUSD = null;
              listAccDetNoUSD= new ArrayList<>(); 
            
              listAccDetNoUSD = AccountDetailsList.stream().filter(x -> ! x.getCurrency().trim().equals("USD")).collect(Collectors.toList());
       
              json= gson.toJson(listDetCash);
            System.out.println("listDetCash");           
            System.out.println(json); 
              
               for (FCCuentaFirma cyf1 : listDetCash) 
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
                         cuenta.setCurrencyAssoc(cyf1.getCurrencyAssoc());
                         cuenta.setWorkingBal(cyf1.getWorkingBal());
                         cuenta.setAcctBal(cyf1.getAcctBal());        
                         cuenta.setWorkingBalUSD(cyf1.getWorkingBalUSD());
                         cuenta.setAcctBalUSD(cyf1.getAcctBalUSD());        
                         cuenta.setSignRelation(cyf1.getSignRelation());
                         cuenta.setSignCondition(cyf1.getSignCondition()); 
                         cuenta.setPortfolio(cyf1.getPortfolio()); 
                         cuenta.setIdPortfolio(cyf1.getIdPortfolio());   
                         cuenta.setLimitAmtDisp(cyf1.getLimitAmtDisp());
                         cuenta.setLimitExpDate(cyf1.getLimitExpDate());
                         cuenta.setNombreMoneda(cyf1.getNombreMoneda());
                         cuenta.setSimboloMoneda(cyf1.getSimboloMoneda());
                         
                         if (!cyf1.getCurrency().equals("USD"))
                         {
                             if (cyf1.getAccountType().equals("Current Account"))
                             {
                                for (ACCOUNTDETAILS cyf2 : listAccDetNoUSD) 
                                {
                                   if (cyf1.getAccountNo().trim().equals(cyf2.getAccountNumber().trim()))
                                        {                                
                                            cuenta.setWorkingBalinUSD(cyf2.getWorkingBalanceinUSD());                                
                                        } 
                                }
                             }
                             else
                             {
                                      cuenta.setWorkingBalinUSD(cyf1.getWorkingBalUSD());
                             }
                         }
                           else
                            {
                                     cuenta.setWorkingBalinUSD(cyf1.getWorkingBalUSD());
                            }
                         
                         
                         cuenta.setTitular(cyf1.getTitular());

                         cuenta.setErrcod(cyf1.getErrcod()); 
                         cuenta.setDetcod(cyf1.getDetcod()); 
                         cuenta.setDefcod(cyf1.getDefcod()); 

                         listDetalleCash.add(cuenta);
                     } 
                
                
                List<FCCuentaFirma> listSaldoCtaOri = null;
                listSaldoCtaOri = listDetalleCash.stream().filter(x -> x.getAccountNo().trim().equals(CtaOri.trim())).collect(Collectors.toList());
                
                 json= gson.toJson(listSaldoCtaOri);
                System.out.println("listSaldoCtaOri");           
                System.out.println(json);           
                
                List<FCCuentaFirma> listSaldoCtaDes = null;
                listSaldoCtaDes = listDetalleCash.stream().filter(x -> x.getAccountNo().trim().equals(CtaDes.trim())).collect(Collectors.toList());
                
                   json= gson.toJson(listSaldoCtaDes);
                System.out.println("listSaldoCtaDes");           
                System.out.println(json);   

                cantidadDatosLista= listSaldoCtaOri.size();

                if (cantidadDatosLista>0 )
                   {                
                            for (FCCuentaFirma lpf:listSaldoCtaOri)
                            {                                  
                                    if (lpf.getAccountType().equals("Trading Account"))
                                    {
                                        CtaTra= lpf.getAccountNo();
                                        SaldoCtaTra= Formatea.Redondear(lpf.getWorkingBal(),2);        
                                        SalDispoTra= Formatea.Redondear(lpf.getAcctBal(),2);        
                                        SaldoCtaTraUSD= Formatea.Redondear(lpf.getWorkingBalinUSD(),2);        
                                        SalDispoTraUSD= Formatea.Redondear(lpf.getAcctBalUSD(),2);        
                                        montra= lpf.getCurrency();        
//                                                                   JOTotalCash.put("moncta",cfp1.getCurrency());
                                    }
                                    else
                                    {
                                        CtaCte= lpf.getAccountNo();
                                        SaldoCtaCte= Formatea.Redondear(lpf.getWorkingBal(),2);
                                        SalDispoCte= Formatea.Redondear(lpf.getAcctBal(),2);      
                                        SaldoCtaCteUSD= Formatea.Redondear(lpf.getWorkingBalinUSD(),2);
                                        SalDispoCteUSD= Formatea.Redondear(lpf.getAcctBalUSD(),2);  
                                         moncte= lpf.getCurrency();        
                                        
                                    }                                   
                                    JOTotalError.put("errcod", Integer.parseInt(lpf.getErrcod()));
                                    JOTotalError.put("detcod", lpf.getDetcod());
                                    JOTotalError.put("defcod", lpf.getDefcod());
                               }
                            
                             for (FCCuentaFirma lpf:listSaldoCtaDes)
                            {                                        
                                 if (lpf.getAccountType().equals("Trading Account"))
                                  {
                                      CtaTra= lpf.getAccountNo();
                                      SaldoCtaTra= Formatea.Redondear(lpf.getWorkingBal(),2);
                                      SalDispoTra= Formatea.Redondear(lpf.getAcctBal(),2);      
                                      SaldoCtaTraUSD= Formatea.Redondear(lpf.getWorkingBalinUSD(),2);
                                      SalDispoTraUSD= Formatea.Redondear(lpf.getAcctBalUSD(),2);       
                                  }
                                  else
                                  {
                                      CtaCte= lpf.getAccountNo();
                                      SaldoCtaCte= Formatea.Redondear(lpf.getWorkingBal(),2);
                                      SalDispoCte= Formatea.Redondear(lpf.getAcctBal(),2);        
                                      SaldoCtaCteUSD= Formatea.Redondear(lpf.getWorkingBalinUSD(),2);
                                      SalDispoCteUSD= Formatea.Redondear(lpf.getAcctBalUSD(),2);        
                                  }                                      
                               }
                            JOTotalCash.put("ctatra",CtaTra);                                 
                            JOTotalCash.put("saltra", Formatea.Redondear(SaldoCtaTra,2));
                             JOTotalCash.put("saldispotra", Formatea.Redondear(SalDispoTra,2));        
                             JOTotalCash.put("saltrausd", Formatea.Redondear(SaldoCtaTraUSD,2));
//                             JOTotalCash.put("saldispotrausd", Formatea.Redondear(SalDispoTraUSD,2));      
                            JOTotalCash.put("ctacte",CtaCte);             
                            JOTotalCash.put("moncte",moncte);
                            JOTotalCash.put("salcte", Formatea.Redondear(SaldoCtaCte,2));  
                            JOTotalCash.put("saldispocte", Formatea.Redondear(SalDispoCte,2));     
                             JOTotalCash.put("salcteusd", Formatea.Redondear(SaldoCtaCteUSD,2));  
//                            JOTotalCash.put("saldispocteusd", Formatea.Redondear(SalDispoCteUSD,2));   
//                            JOTotalCash.put("montra",montra);

                            
                   }
                 else
                    {
                          JOTotalError.put("errcod", Integer.parseInt(Constantes.RETORNO_NODATASQL.toString()));
                           JOTotalError.put("detcod", Constantes.MENSAJE_NODATASQL_DET);
                           JOTotalError.put("defcod", Constantes.MENSAJE_NODATASQL_DEF);       
                    }
                
            }
            else
            {
                JOTotalError.put("errcod", Integer.parseInt(errcod));
                JOTotalError.put("detcod", detcod);
                JOTotalError.put("defcod", defcod);
            }
        }     
         catch ( NumberFormatException e){
            JOTotalError.put("errcod", Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage()); 
            LOG.error( "ERROR: " + e.getMessage());
        }     
        catch ( Exception e){
            JOTotalError.put("errcod", Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage()); 
            LOG.error( "ERROR: " + e.getMessage());
        }        
          
        JORaiz.put("datos",JOTotalCash);
        JORaiz.put("error",JOTotalError); 
       
        return JORaiz.toString();
     }
    
}
