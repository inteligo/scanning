package com.apis.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import com.java.Formatea;
import com.java.GeneraUUID;
import com.java.LeerDataProperties;
import com.t24.services.AccountDetails360;
import com.t24.services.FC14Tipo2;
import com.t24.services.FC01Tipo1Trustee;
import com.t24.services.impl.CWServiceListaMonedasHiloImpl;
import com.t24.services.impl.CWServiceTWS_Tipo1HiloImpl;
import com.t24.services.impl.CWServiceTWS_Tipo2HiloImpl;
import com.t24.services.impl.FC14Tipo2Impl;
import com.t24.services.impl.FC44Tipo2Impl;
import com.t24.services.impl.FC01Tipo1TrusteeImpl;
import com.t24.services.impl.Ibaguid;
import com.t24.services.impl.InputCollectionTipo1Impl;
import com.t24.services.impl.InputCollectionTipo2Impl;
import com.t24.services.input.IbaQuery;
import com.t24.services.input.InputCollection;
import dto.t24.services.FC14_PORTFOLIOLIST;
import dto.t24.services.FC44_DEPODETS;
import dto.t24.services.FCCuentaFirma;
import dto.t24.services.FCDeposito;
import dto.t24.services.FCPortafolio;
import dto.t24.services.FCTotalCash;
import dto.t24.services.FCTotalCliente;
import dto.t24.services.FCTotalDeposito;
import dto.t24.services.FCTotalPortafolio;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.t24.services.FC44Tipo2;
import com.t24.services.impl.AccountDetails360Impl;
import com.t24.services.impl.CWServiceTWS360HiloImpl;
import com.t24.services.impl.InputCollection360Impl;
import dao.sql.DaoListaDepositosCliente;
import dao.sql.impl.DaoListaDepositosClienteImpl;
import dto.t24.services.ACCOUNTDETAILS;
import dto.t24.services.FC01_CUSLIST;

import java.util.stream.Collectors;



public class CuentaPatrimonioTrusteeImpl {
     private  Logger LOG =LogManager.getLogger(CuentaPatrimonioTrusteeImpl.class);
    
																						
	   
    public  String ConsultaCuentasPatrimonio (String CustomerNo) {
        com.tws.wsdl.EnquiryInput enquiryInput14=new com.tws.wsdl.EnquiryInput();
        com.tws.wsdl.EnquiryInput enquiryInput44=new com.tws.wsdl.EnquiryInput();
        com.tws.wsdl.EnquiryInput enquiryInput01=new com.tws.wsdl.EnquiryInput();
        com.tws360.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws360.wsdl.EnquiryInputCollection();  
        com.tws360.wsdl.EnquiryInput enquiryInput=new com.tws360.wsdl.EnquiryInput();
        List  Lista= new ArrayList<String>();         
        List  ListaResult= new ArrayList<String>();  
        DaoListaDepositosCliente listadepositoscliente= new DaoListaDepositosClienteImpl();
         
        Gson gson =new GsonBuilder().serializeNulls().create();
        FC14Tipo2 fc14= new FC14Tipo2Impl();
        
        FC01Tipo1Trustee fc01= new FC01Tipo1TrusteeImpl();
       
        FC44Tipo2 fc44= new FC44Tipo2Impl();
      
        AccountDetails360 ad360= new AccountDetails360Impl();
                        
        String json="";
        

        List<dto.sql.Moneda> listMonedas =null;   
        List<ACCOUNTDETAILS> list = null;
        list = new ArrayList<>();
        
        String errcod="";
        String detcod="";
        String defcod="";
        
         JSONObject TotalPatrimonio =new JSONObject(); 
         JSONObject JOTotalError =new JSONObject();
         
         JSONObject JORaiz =new JSONObject();     
         

         try
        {                          
     
            
                        
           
   
            // ----- HILOS

            InputCollectionTipo1Impl ic01tipo1impl=new InputCollectionTipo1Impl();
            enquiryInput01=ic01tipo1impl.Input("functioncode;" +Constantes.INTEGRADOR_FC01 +"|CustomerNo;"+CustomerNo);
            
            InputCollection ictipo2 =new InputCollection();
            InputCollectionTipo2Impl ictipo2impl=new InputCollectionTipo2Impl();

            ictipo2.setCUSTOMERID(CustomerNo);
            enquiryInput14=ictipo2impl.Input(ictipo2);
            
           enquiryInput44=enquiryInput14;//ictipo2impl.Input(ictipo2);
           
            InputCollection ic =new InputCollection();
            InputCollection360Impl icimpl=new InputCollection360Impl();

            ic.setCUSTOMERID(CustomerNo);
            enquiryInput=icimpl.Input(ic);
           
            IbaQuery cabecera1=null,cabecera2=null,cabecera3=null;
            Ibaguid ibaguid=new Ibaguid();

            cabecera1=ibaguid.Encabezado(GeneraUUID.CodigoUUID(), Constantes.INTEGRADOR_FC01, CustomerNo,"" );           
            cabecera2=ibaguid.Encabezado(GeneraUUID.CodigoUUID(), Constantes.INTEGRADOR_FC14, CustomerNo,"" );  
            cabecera3=ibaguid.Encabezado(GeneraUUID.CodigoUUID(), Constantes.INTEGRADOR_FC44, CustomerNo,"" ); 

            String strFC_return1="";
            String strFC_return2="";
            String strFC_return3="";     
            String resultado="";

                                               
                        
            CWServiceTWS_Tipo1HiloImpl servicio1 = new CWServiceTWS_Tipo1HiloImpl(enquiryInput01);
            CWServiceTWS_Tipo2HiloImpl servicio2= new CWServiceTWS_Tipo2HiloImpl(Constantes.INTEGRADOR_FC14,enquiryInput14);    
            CWServiceTWS_Tipo2HiloImpl servicio3= new CWServiceTWS_Tipo2HiloImpl(Constantes.INTEGRADOR_FC44,enquiryInput44); 
            CWServiceListaMonedasHiloImpl servicio4 = new CWServiceListaMonedasHiloImpl();  
            CWServiceTWS360HiloImpl servicio5 = new CWServiceTWS360HiloImpl(Constantes.TMNV360ACCOUNTDETAILS,enquiryInput); 

            Thread hilo4 = servicio4;
            hilo4.start();

            Thread hilo2 = servicio2;
            hilo2.start();

            Thread hilo3 = servicio3;
            hilo3.start();

            Thread hilo1 = servicio1;
            hilo1.start();

            Thread hilo5 = servicio5;
             hilo5.start();

             while (hilo1.isAlive() || hilo2.isAlive() || hilo3.isAlive() || hilo4.isAlive()  || hilo5.isAlive())
                {
                    listMonedas=servicio4.getResult();
                    strFC_return1=servicio1.getResult();
                    strFC_return2=servicio2.getResult();
                    strFC_return3=servicio3.getResult();   
                    resultado=servicio5.getResult();        
                }  
                                  


            // FIN NUEVO ------ HILOS
            
             List<FC01_CUSLIST> DatosCliente = null;
             DatosCliente = new ArrayList<>();    
            
             List<FCCuentaFirma> CuentaFirma = null;
             CuentaFirma = new ArrayList<>();    
             List<FCCuentaFirma> CuentayFirma = null;
             CuentayFirma = new ArrayList<>();    
             List<ACCOUNTDETAILS> AccountDetailsList=null;   
             AccountDetailsList = new ArrayList<>();    
             
            CuentaFirma =fc01.CuentayFirmaFiltroTyFList(strFC_return1,CustomerNo,listMonedas);  
            DatosCliente =fc01.FC01CUSList(strFC_return1,CustomerNo);   
            AccountDetailsList =ad360.ACCOUNTDETAILS(resultado,CustomerNo,listMonedas);  

             
            json= gson.toJson(DatosCliente);
            System.out.println("DatosCliente");           
            System.out.println(json); 
            
             
            json= gson.toJson(CuentaFirma);
            System.out.println("CuentaFirma");           
            System.out.println(json); 
            
             for (FCCuentaFirma lpf : CuentaFirma) 
            {
                errcod= lpf.getErrcod();
                detcod=lpf.getDetcod();
                defcod=lpf.getDefcod();   
            }      
             
              List<ACCOUNTDETAILS> listAccDetNoUSD = null;
              listAccDetNoUSD= new ArrayList<>(); 
            
              listAccDetNoUSD = AccountDetailsList.stream().filter(x -> ! x.getCurrency().trim().equals("USD")).collect(Collectors.toList());
       
              json= gson.toJson(CuentaFirma);
            System.out.println("CuentaFirma");           
            System.out.println(json); 
              
               for (FCCuentaFirma cyf1 : CuentaFirma) 
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
                         cuenta.setSignConditionT24(cyf1.getSignConditionT24()); 
                         cuenta.setPortfolio(cyf1.getPortfolio()); 
                         cuenta.setIdPortfolio(cyf1.getIdPortfolio());   
                         cuenta.setLimitAmtDisp(cyf1.getLimitAmtDisp());
                         cuenta.setLimitExpDate(cyf1.getLimitExpDate());
                         cuenta.setAccSegment(cyf1.getAccSegment());
                         cuenta.setItlgCustType(cyf1.getItlgCustType());
                         cuenta.setSignGroup(cyf1.getSignGroup());
                         cuenta.setRelationCode(cyf1.getRelationCode());
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

                         CuentayFirma.add(cuenta);
                     } 
              
              

            json= gson.toJson(listAccDetNoUSD);
            System.out.println("listAccDetNoUSD");           
            System.out.println(json); 
            
            json= gson.toJson(CuentayFirma);
            System.out.println("CuentayFirma");           
            System.out.println(json); 
           

               
            if (errcod.equals("0"))
            {
                List<FC14_PORTFOLIOLIST> PortafolioList=null;
                List<FC44_DEPODETS> DepositoList=null;
                
                 
                PortafolioList =fc14.PORTFOLIOLISTACTIVOS(strFC_return2,CustomerNo);    
                // SE VA A TRAER LOS DATOS DEL LISTADO DE DEPOSITOS DEL DWH 
                // 19-02-2019 VROJAS

                  //DepositoList =fc44.DEPODETS(strFC_return3,CustomerNo,listMonedas); 

                  DepositoList =listadepositoscliente.listadepositosclienteQry(CustomerNo);  

                 // FIN
                 
                
                 
                List<FCPortafolio> listPortafolio = null;
                listPortafolio = new ArrayList<>();

                List<FCPortafolio> listPortafolioFirma = null;
                listPortafolioFirma = new ArrayList<>();

                List<FC14_PORTFOLIOLIST> listPortafolioTodo = null;
                listPortafolioTodo = new ArrayList<>();      

                
                List<FCTotalCash> TotalCash = null;
                TotalCash = new ArrayList<>();

                List<FCTotalPortafolio> TotalPortafolio = null;
                TotalPortafolio = new ArrayList<>();

                List<FCTotalPortafolio> TotalPortafolioCuenta = null;
                TotalPortafolioCuenta = new ArrayList<>();

                List<FCTotalCliente> TotalCliente = null;
                TotalCliente = new ArrayList<>();

                List<FCDeposito> DepositoPortafolio = null;
                DepositoPortafolio = new ArrayList<>();

                List<FCTotalDeposito> TotalDepositoPorta = null;
                TotalDepositoPorta = new ArrayList<>();
                
//                List<FCTotalDeposito> TotalDepositoSinPorta = null;
//                TotalDepositoSinPorta = new ArrayList<>();


                Double TotalCashCliente=0.00;
                Double TotalCashDispoCliente=0.00;
                Double TotalPortafolioCliente=0.00;
		Double TotalDepositoSinPorta=0.00;
                Double TotalCuentaIndependiente=0.00;    
                Double TotalCuentaIndependienteDispo=0.00;
				Double suma =0.00;				  
                
                

                for (FCCuentaFirma cyf : CuentayFirma) 
                {
                    if(!cyf.getPortfolio().trim().equals(""))
                    {
                        if(!cyf.getItlgCustType().trim().equals(""))
                        {
                            FCPortafolio lstPrt= new FCPortafolio();
                            lstPrt.setIdClient(cyf.getIdClient());
                            lstPrt.setIdPortfolio(cyf.getPortfolio());
                            lstPrt.setAccCustomer(cyf.getAccCustomer());
                            lstPrt.setAccountNo(cyf.getAccountNo());
                            lstPrt.setWorkingBal(cyf.getWorkingBal());
                            lstPrt.setAcctBal(cyf.getAcctBal());
                            lstPrt.setWorkingBalUSD(cyf.getWorkingBalUSD());
                            lstPrt.setWorkingBalinUSD(cyf.getWorkingBalinUSD());
                            lstPrt.setAcctBalUSD(cyf.getAcctBalUSD());
                            lstPrt.setNombreMoneda(cyf.getNombreMoneda());
                            lstPrt.setSimboloMoneda(cyf.getSimboloMoneda());
                            lstPrt.setItlgCustType(cyf.getItlgCustType());
                            lstPrt.setRentabilidad("");
                            listPortafolio.add(lstPrt);
                        }
                    }
                } 
                   
//            json= gson.toJson(CuentayFirma);
//            System.out.println("CuentayFirma1");           
//            System.out.println(json);                   

            json= gson.toJson(DepositoList);
            System.out.println("DepositoList");           
            System.out.println(json); 		
			                    
                for (FC44_DEPODETS dl1 : DepositoList) 
                {
                    FCDeposito deposito = new FCDeposito();               
                    deposito.setIdClient(dl1.getIdClient());
                    deposito.setCliente(dl1.getCliente());
                    deposito.setDepositNumber(dl1.getDepositNumber());
                    deposito.setCurrency(dl1.getCurrency());
                    deposito.setAccountingBalance(dl1.getAccountingBalance());
                    deposito.setAccountingBalanceUSD(dl1.getAccountingBalanceUSD());
                    deposito.setRate(dl1.getRate());
                    deposito.setStartDate(dl1.getStartDate());
                    deposito.setMaturityDate(dl1.getMaturityDate());            
                    deposito.setTermDays(dl1.getTermDays());
                    deposito.setInterestFrequency(dl1.getInterestFrequency());
                    deposito.setNextPayment(dl1.getNextPayment());
                    deposito.setPaymentAmount(dl1.getPaymentAmount());
                    deposito.setAccruedInterest(dl1.getAccruedInterest());
                    deposito.setGuaranteedAccountingBalance(dl1.getGuaranteedAccountingBalance());
                    deposito.setInstructionsAtMaturity(dl1.getInstructionsAtMaturity());            
                    deposito.setDrawdownAccount(dl1.getDrawdownAccount());     
                    deposito.setNombreMoneda(dl1.getNombreMoneda());
                    deposito.setSimboloMoneda(dl1.getSimboloMoneda());
                    deposito.setTipoDeposito(dl1.getTipoDeposito());
                    
                    for (FCCuentaFirma cyf2 : CuentayFirma) 
                    {                 
                        if (dl1.getDrawdownAccount().equals(cyf2.getAccountNo()))
                        {                                
                            deposito.setIdPortafolio(cyf2.getIdPortfolio());   
                        } 
                        else
                        {
                            deposito.setIdPortafolio(""); 
                        }
                    }             
                    DepositoPortafolio.add(deposito);
                }
                
//                json= gson.toJson(DepositoPortafolio);
//                System.out.println("DepositoPortafolio");           
//                System.out.println(json); 
				
												  
																
										  

                for (FCPortafolio dp1 : listPortafolio) 
                {
                   FCTotalDeposito total = new FCTotalDeposito();  
                   total.setIdPortfolio(dp1.getIdPortfolio());     
				   total.setIdClient(dp1.getIdClient());  														
                   suma =0.00;
                   for (FCDeposito dp2 : DepositoPortafolio) 
                    {                  
                        if (dp1.getIdPortfolio().equals(dp2.getIdPortafolio()))
                        {
                            suma=suma+dp2.getAccountingBalanceUSD();
                        }
                    }
                   total.setSumaDeposito(suma);
                   TotalDepositoPorta.add(total);  
                }

                //fin obtenemos el portafolio asociado del cliente crzando la cuenta y el deposito

                suma =0.00;
                for (FCDeposito dp2 : DepositoPortafolio) 
														   
                 {                  
                     if (dp2.getIdPortafolio().equals(""))
                     {
                         suma=suma+dp2.getAccountingBalanceUSD();
																	 
                     }
                 }
                  
                TotalDepositoSinPorta=suma;
			
				
                for (FCPortafolio cyf4 : listPortafolio) 
                {
                   FCTotalCash total = new FCTotalCash();  
                   total.setIdPortfolio(cyf4.getIdPortfolio());     
                   suma =0.00;
                   Double sumaDispo =0.00;
                   for (FCCuentaFirma cyf5 : CuentayFirma) 
                    { 
                        if (cyf4.getIdPortfolio().equals(cyf5.getIdPortfolio()))
                        {
                            suma=suma+cyf5.getWorkingBalinUSD();
                            sumaDispo=sumaDispo+cyf5.getAcctBalUSD();
                        }
                    }
                   total.setSumaCashContPortafolio(suma);
                   total.setSumaCashDispoPortafolio(sumaDispo);
                   
                   TotalCash.add(total);  
                }
	 


                for (FCPortafolio lstPrt : listPortafolio) 
                {
                    for (FC14_PORTFOLIOLIST PortaList : PortafolioList) 
                    {
                        if (lstPrt.getIdPortfolio().equals(PortaList.getPortfolioID()))
                        {
                        FC14_PORTFOLIOLIST lstPorTodo = new FC14_PORTFOLIOLIST();
                        lstPorTodo.setIdClient(PortaList.getIdClient());
                        lstPorTodo.setOwner(PortaList.getOwner());
                        lstPorTodo.setClientType(PortaList.getClientType());
                        lstPorTodo.setDescription(PortaList.getDescription());
                        Double balance =PortaList.getBalance() - lstPrt.getWorkingBalinUSD();
                        lstPorTodo.setBalance(balance);                      
                        lstPorTodo.setJointHolder(PortaList.getJointHolder());               
                        lstPorTodo.setPortfolioID(PortaList.getPortfolioID());
                        listPortafolioTodo.add(lstPorTodo);
                        }
                    }           
                }


                for (FCPortafolio cyf4 : listPortafolio) 
                {
                   FCTotalPortafolio total = new FCTotalPortafolio();  
                   total.setIdPortfolio(cyf4.getIdPortfolio());     
                   suma =0.00;
                   for (FC14_PORTFOLIOLIST cyf5 : listPortafolioTodo) 
                    {                  
                        if (cyf4.getIdPortfolio().equals(cyf5.getPortfolioID()))
                        {
                            suma=suma+cyf5.getBalance();
                        }
                    }
                   total.setSumaPortafolio(suma);
                   TotalPortafolio.add(total);  
                }


                for (FCPortafolio cyf4 : listPortafolio) 
                {
                   FCTotalPortafolio total = new FCTotalPortafolio();  
                   total.setIdPortfolio(cyf4.getIdPortfolio());     
                   suma =0.00;
                   Double sumaDispo =0.00;
                   for (FCTotalCash cyf5 : TotalCash) 
                    {                  
                        if (cyf4.getIdPortfolio().equals(cyf5.getIdPortfolio()))
                        {
                            suma=suma+cyf5.getSumaCashContPortafolio();
                            sumaDispo=sumaDispo+cyf5.getSumaCashDispoPortafolio();
                        }
                    }
                    for (FCTotalDeposito cyf5 : TotalDepositoPorta) 
                    {                  
                        if (cyf4.getIdPortfolio().equals(cyf5.getIdPortfolio()))
                        {
                            suma=suma+cyf5.getSumaDeposito();
                        }
                    }
                    for (FCTotalPortafolio cyf5 : TotalPortafolio) 
                    {                  
                        if (cyf4.getIdPortfolio().equals(cyf5.getIdPortfolio()))
                        {
                            suma=suma+cyf5.getSumaPortafolio();
                        }
                    }
                   total.setSumaPortafolio(suma);
                   TotalPortafolioCuenta.add(total);  
                }

                TotalCashCliente=0.00;
                TotalCashDispoCliente=0.00;
                for (FCTotalCash cyf4 : TotalCash) 
                {            
                     TotalCashCliente=TotalCashCliente+cyf4.getSumaCashContPortafolio();       
                     TotalCashDispoCliente=TotalCashDispoCliente+cyf4.getSumaCashDispoPortafolio();       
                }

                TotalCuentaIndependiente=0.00;
                 TotalCuentaIndependienteDispo=0.00;

                for (FCCuentaFirma cyfp3 : CuentayFirma) 
                {
                    if (cyfp3.getIdPortfolio().equals(""))
                            {
                               TotalCuentaIndependiente=TotalCuentaIndependiente+ cyfp3.getWorkingBalinUSD();
                               TotalCuentaIndependienteDispo=TotalCuentaIndependienteDispo+ cyfp3.getAcctBalUSD();
                            }
                }
				TotalCuentaIndependiente=TotalCuentaIndependiente+TotalDepositoSinPorta;
                TotalPortafolioCliente=0.00;

                for (FCTotalPortafolio cyf4 : TotalPortafolioCuenta) 
                {
                    TotalPortafolioCliente=TotalPortafolioCliente+cyf4.getSumaPortafolio();            
                }

                TotalPortafolioCliente=TotalPortafolioCliente+TotalCuentaIndependiente;


                for (FCPortafolio lstPrt : listPortafolio) 
                {
                    for (FC14_PORTFOLIOLIST PortaList : PortafolioList) 
                    {
                        if (lstPrt.getIdPortfolio().equals(PortaList.getPortfolioID()))
                        {
                        FCPortafolio lstPortaFirma = new FCPortafolio();
                        lstPortaFirma.setIdClient(PortaList.getIdClient());
                        lstPortaFirma.setAccCustomer(lstPrt.getAccCustomer());
                        lstPortaFirma.setAccountNo(lstPrt.getAccountNo());
                        lstPortaFirma.setFirma(PortaList.getClientType());                
                        lstPortaFirma.setIdPortfolio(lstPrt.getIdPortfolio());
                        lstPortaFirma.setDescPortafolio(PortaList.getDescription());
                        lstPortaFirma.setRentabilidad(lstPrt.getRentabilidad());               
                        lstPortaFirma.setWorkingBal(lstPrt.getWorkingBal());
                        lstPortaFirma.setAcctBal(lstPrt.getAcctBal());
                        lstPortaFirma.setWorkingBalUSD(lstPrt.getWorkingBalUSD());
                        lstPortaFirma.setWorkingBalinUSD(lstPrt.getWorkingBalinUSD());
                        lstPortaFirma.setAcctBal(lstPrt.getAcctBalUSD());
                        lstPortaFirma.setNombreMoneda(lstPrt.getNombreMoneda());
                        lstPortaFirma.setSimboloMoneda(lstPrt.getSimboloMoneda());
                        lstPortaFirma.setItlgCustType(lstPrt.getItlgCustType());
                         
                        listPortafolioFirma.add(lstPortaFirma);
                        }
                    }           
                }
                
                json= gson.toJson(listPortafolio);
                System.out.println("listPortafolio");           
                System.out.println(json);   
                
                json= gson.toJson(PortafolioList);
                System.out.println("PortafolioList");           
                System.out.println(json);   

                JSONObject JOTotPatrim =new JSONObject();
                JSONObject JOListPorta =new JSONObject();

                JSONArray Total =new JSONArray();
                JSONArray JACtaPorta =new JSONArray(); 

                Integer lvintIndicaDatosPorta=0; //Si es = no hay datos si es 1 hay datos con portafolio
                Integer lvintIndicaDatosSinPorta=0; //Si es = no hay datos si es 1 hay datos sin portafolio

                JOTotPatrim.put("baltot", Formatea.Redondear(TotalPortafolioCliente,2)); 
              
                JOTotalError.put("errcod", Integer.parseInt(errcod));
                JOTotalError.put("detcod", detcod);
                JOTotalError.put("defcod", defcod);          

                for (FCPortafolio lp1:listPortafolioFirma)
                    {   
                        JSONObject JOListCta =new JSONObject(); 
                        JSONObject JODeposPorta =new JSONObject();
                        JSONObject JODetCashsh =new JSONObject(); 

                        Double SumaPortafolioCuenta=0.00;
                        lvintIndicaDatosPorta=1;
                           for (FCTotalPortafolio lp2:TotalPortafolioCuenta)
                            {   
                                if (lp1.getIdPortfolio().equals(lp2.getIdPortfolio()))
                                {
                                    SumaPortafolioCuenta=SumaPortafolioCuenta+lp2.getSumaPortafolio();
                                }                    
                            }

                        // ACA EMPIEZAN CUENTAS 
                        
                        json= gson.toJson(listPortafolioFirma);
                        System.out.println("listPortafolioFirma");           
                        System.out.println(json);   
                        
                        json= gson.toJson(TotalCash);
                        System.out.println("TotalCash");           
                        System.out.println(json);   
                        
                        json= gson.toJson(CuentayFirma);
                        System.out.println("CuentayFirma");           
                        System.out.println(json);   
                        
                        for (FCTotalCash tcash1:TotalCash)
                            {   
                            if (tcash1.getIdPortfolio().equals(lp1.getIdPortfolio()))
                                { 
                                    JODetCashsh.put("tocash",Formatea.Redondear(tcash1.getSumaCashContPortafolio(),2));                        
                                    JSONArray JADetCash =new JSONArray();  

                                    for (FCCuentaFirma cfp1:CuentayFirma)
                                    {  
                                        JSONObject JODetCash =new JSONObject();                             
                                        if (lp1.getIdPortfolio().equals(cfp1.getIdPortfolio()))
                                        {
                                            String estcta="";
                                            if (cfp1.getAccountActive().equals("SI"))
                                            {
                                                estcta="A";
                                            }
                                            if (cfp1.getAccountInactive().equals("SI"))
                                            {
                                                estcta="B";
                                            }
                                            
                                            String estitun="";
                                            if (lp1.getItlgCustType().equals("Trustee"))
                                                 {  
                                                     estitun="T";                                       
                                                 }
                                            else if (lp1.getItlgCustType().equals("Signatorie"))
                                                 {                                        
                                                     estitun="F";
                                                 }
                                            else
                                            {
                                                estitun="";
                                            }
                                            JOListCta.put("estitu",Convierte.NullaVacio(estitun)); 
//                                            JOListCta.put("estitu",Convierte.NullaVacio(cfp1.getTitular())); 
                                            JOListCta.put("estcta", Convierte.NullaVacio(estcta)); 
                                            JOListCta.put("nomcta", Convierte.NullaVacio(cfp1.getIdPortfolio()));  
                                            JOListCta.put("desporta", Convierte.NullaVacio(lp1.getDescPortafolio())); 
																											 
                                            JOListCta.put("totcta",Formatea.Redondear(SumaPortafolioCuenta,2));

                                           
                                            JODetCash.put("ctaaso",Convierte.NullaVacio(cfp1.getAccountAssoc()));
                                            JODetCash.put("monctaaso",Convierte.NullaVacio(cfp1.getCurrencyAssoc()));
                                            JODetCash.put("numcta",Convierte.NullaVacio(cfp1.getAccountNo()));
                                            JODetCash.put("moncta",Convierte.NullaVacio(cfp1.getCurrency()));
                                            JODetCash.put("salcta", Formatea.Redondear(cfp1.getWorkingBal(),2));
                                            JODetCash.put("salctaUSD", Formatea.Redondear(cfp1.getWorkingBalinUSD(),2));
                                            JODetCash.put("saldispo", Formatea.Redondear(cfp1.getAcctBal(),2));                                            
                                            JODetCash.put("tipcta", Convierte.NullaVacio(cfp1.getAccountType()));
                                            
                                            estitun="";
                                            if (cfp1.getRelationCode().equals(Constantes.T24_RELATIONCODE_SECUNDARY))    // 10: Secundary
                                                 {  
                                                     estitun="T";                                       
                                                 }
                                            else if (cfp1.getRelationCode().equals(Constantes.T24_RELATIONCODE_POWEROFATHOLDER))  // 6: Power of Atorney Holder
                                                 {                                        
                                                     estitun="F";
                                                 }
                                            else
                                            {
                                                estitun="";
                                            }
                                            JODetCash.put("estitu", Convierte.NullaVacio(estitun));
//                                            JODetCash.put("estitu", Convierte.NullaVacio(cfp1.getTitular()));
                                            JODetCash.put("estcta", Convierte.NullaVacio(estcta));    
                                            JODetCash.put("signcondition",Convierte.NullaVacio(cfp1.getSignCondition()));
                                            JODetCash.put("signconditionT24",Convierte.NullaVacio(cfp1.getSignConditionT24()));
                                            JODetCash.put("signrelation",Convierte.NullaVacio(cfp1.getSignRelation()));
                                            JODetCash.put("signgroup",Convierte.NullaVacio(cfp1.getSignGroup()));
                                            if (cfp1.getSignCondition().trim().equals("1A"))
                                            {
                                                JODetCash.put("sign1A","1");
                                            }
                                            else
                                            {
                                                 JODetCash.put("sign1A","0");
                                            }
                                            
                                            JODetCash.put("trustee",Convierte.NullaVacio(cfp1.getItlgCustType()));
                                            JADetCash.add(JODetCash);   


                                            JOTotalError.put("errcod", Integer.parseInt(cfp1.getErrcod()));
                                            JOTotalError.put("detcod", cfp1.getDetcod());
                                            JOTotalError.put("defcod", cfp1.getDefcod());
                                        }                                
                                             JODetCashsh.put("data",JADetCash);                                 
                                    }                       
                                }
                            }                 

                        // ACA ACABAN CUENTAS



                        // ACA VAN DEPOSITOS DEL PORTAFOLIO  

                        for (FCTotalDeposito tport1:TotalDepositoPorta)
                                { 
                                    JSONArray JADetDeposPorta =new JSONArray();                             
                                    if (tport1.getIdPortfolio().equals(lp1.getIdPortfolio()))
                                    {  
                                        JODeposPorta.put("totdep",Formatea.Redondear(tport1.getSumaDeposito(),2));                                

                                        for (FCDeposito ldp:DepositoPortafolio)
                                        { 
                                            if (tport1.getIdPortfolio().equals(ldp.getIdPortafolio()))
                                            {                            
                                            JSONObject JODetDeposPorta =new JSONObject();         
                                            JODetDeposPorta.put("coddep", Convierte.NullaVacio(ldp.getDepositNumber()));
                                            JODetDeposPorta.put("tipdep", Convierte.NullaVacio(ldp.getTipoDeposito())); 
                                            JODetDeposPorta.put("saldep", Formatea.Redondear(ldp.getAccountingBalance(),2));
                                            JADetDeposPorta.add(JODetDeposPorta); 
                                        }
                                          JODeposPorta.put("data",JADetDeposPorta); 
                                    } 
                                }   
                        }                              

                        // FIN DEPOSITOS DEL PORTAFOLIO                              


                        // ACA VAN VALORES DEL PORTAFOLIO                

                        JSONObject JODetPorta =new JSONObject();        
                        JSONArray JADetPorta =new JSONArray(); 

                        for (FCTotalPortafolio tport1:TotalPortafolio)
                            {  
                                if (tport1.getIdPortfolio().equals(lp1.getIdPortfolio()))
                                {                                   
                                    JODetPorta.put("numpor", Convierte.NullaVacio(lp1.getIdPortfolio()));
                                    JODetPorta.put("owner",Convierte.NullaVacio(lp1.getAccCustomer()));
                                    JODetPorta.put("totpor",Formatea.Redondear(tport1.getSumaPortafolio(),2));
                                    JODetPorta.put("rentabi","+1.8");
                                    JODetPorta.put("data",JADetPorta);
                                }   
                            }                               

                        // FIN VALORES DEL PORTAFOLIO


                    JOListCta.put("cash",JODetCashsh); 
                    JOListCta.put("depositos", JODeposPorta);
                    JOListCta.put("portafolio", JODetPorta);            
                    JACtaPorta.add(JOListCta);  

                    }  

                    // si no hay datos
                    if (lvintIndicaDatosPorta==0)
                    {
                        JSONObject JOListCta =new JSONObject();
                        JSONObject JODetPorta =new JSONObject();
                        JSONObject JODeposPorta =new JSONObject();
                        JSONObject JODetCashsh =new JSONObject();
                        JSONArray JADetDeposPorta =new JSONArray();                   
                        JODeposPorta.put("totdep",0);    
                        JODeposPorta.put("data",JADetDeposPorta); 
                        JODetCashsh.put("tocash",0);    
                        JODetCashsh.put("data",JADetDeposPorta); 
                        JODetPorta.put("totpor",0);    
                        JODetPorta.put("numpor", "");
                        JODetPorta.put("owner","");                      
                        JODetPorta.put("rentabi","");
                         JODetPorta.put("data",JADetDeposPorta); 
                        JOListCta.put("cash",JODetCashsh); 
                        JOListCta.put("depositos", JODeposPorta);
                        JOListCta.put("portafolio", JODetPorta); 
                        JACtaPorta.add(JOListCta);  
                    }            

                    JOTotPatrim.put("grupocuentas", JACtaPorta);   

                    JSONObject JOListSinPorta =new JSONObject();
                    JSONObject JOCtaIndep =new JSONObject(); 
                    JSONObject JOListSinPortaCta =new JSONObject();   

                    JSONArray JACtaIndep =new JSONArray(); 
                    JSONArray JASinPorta =new JSONArray(); 
                    JSONArray JADetSinPortaCta =new JSONArray(); 

                    JOListSinPorta.put("tocuen",Formatea.Redondear(TotalCuentaIndependiente,2)); 
                    for (FCCuentaFirma cyfp3 : CuentayFirma) 
							
						   
							
                        {   JSONObject JODetSinPorta =new JSONObject();       
							JSONObject JODeposSinPorta =new JSONObject();											 
						   
                            if (cyfp3.getIdPortfolio().equals(""))
                                {
									 lvintIndicaDatosSinPorta=1; 							
									
                                    JODetSinPorta.put("numcta",Convierte.NullaVacio(cyfp3.getAccountNo()));
                                    JODetSinPorta.put("salcta", Formatea.Redondear(cyfp3.getWorkingBal(),2));
                                    JODetSinPorta.put("moncta",Convierte.NullaVacio(cyfp3.getCurrency()));
                                     JODetSinPorta.put("salctaUSD", Formatea.Redondear(cyfp3.getWorkingBalinUSD(),2));
                                    JODetSinPorta.put("saldispo", Formatea.Redondear(cyfp3.getAcctBal(),2));
                                    JODetSinPorta.put("tipcta", Convierte.NullaVacio(cyfp3.getAccountType()));
                                    
                                    
                                    String estitun="";
                                    if (cyfp3.getRelationCode().equals(Constantes.T24_RELATIONCODE_SECUNDARY))    // 10: Secundary
                                          {  
                                              estitun="T";                                       
                                          }
                                     else if (cyfp3.getRelationCode().equals(Constantes.T24_RELATIONCODE_POWEROFATHOLDER))  // 6: Power of Atorney Holder
                                          {                                        
                                              estitun="F";
                                          }
                                     else
                                     {
                                         estitun="";
                                     }
                                      JODetSinPorta.put("estitu",estitun);                                           
//                                     JODetSinPorta.put("estitu",cyfp3.getTitular());                                     
                                    JACtaIndep.add(JODetSinPorta); 
                                }  									   
                           
                
                       
                            JSONArray JADetDeposSinPorta =new JSONArray(); 
                            JODeposSinPorta.put("totdep",Formatea.Redondear(TotalDepositoSinPorta,2)); 
                            for (FCDeposito ldp:DepositoPortafolio)
                            { 
                                if (ldp.getIdPortafolio().equals(""))
                                {                            
                                JSONObject JODetDeposSinPorta =new JSONObject();         
                                JODetDeposSinPorta.put("coddep", Convierte.NullaVacio(ldp.getDepositNumber()));
                                JODetDeposSinPorta.put("tipdep", Convierte.NullaVacio(ldp.getTipoDeposito())); 
                                JODetDeposSinPorta.put("saldep", Formatea.Redondear(ldp.getAccountingBalance(),2));
                                JADetDeposSinPorta.add(JODetDeposSinPorta); 
                                }
                              JODeposSinPorta.put("data",JADetDeposSinPorta); 
                            } 
                                   
                                           
                            
                            
                            JOListSinPorta.put("data",JACtaIndep);
                            JOListSinPorta.put("depositos",JODeposSinPorta);										 
                            
                        }
					
					 // si no hay datos
                    if (lvintIndicaDatosSinPorta==0)
                    {
//                        JSONObject JOListCta =new JSONObject();
//                        JSONObject JOListSinPorta =new JSONObject();
                        JSONObject JODeposSinPorta =new JSONObject();
//                        JSONObject JODetCashsh =new JSONObject();
                        JSONArray JADetDeposSinPorta =new JSONArray();                   
                        JODeposSinPorta.put("totdep",0);    
                        JODeposSinPorta.put("data",JADetDeposSinPorta); 
//                        JODetCashsh.put("tocash",0);    
//                        JODetCashsh.put("data",JADetDeposSinPorta); 
//                        JODetSinPorta.put("totpor",0);    
//                        JODetSinPorta.put("numpor", "");
//                        JODetSinPorta.put("owner","");                      
//                        JODetSinPorta.put("rentabi","");
//                        JODetSinPorta.put("data",JADetDeposSinPorta); 
//                        JOListCta.put("cash",JODetCashsh); 
                        JOListSinPorta.put("depositos", JODeposSinPorta);
//                        JOListCta.put("portafolio", JODetSinPorta); 
//                        JADetSinPortaCta.add(JOListSinPorta);  
                    }          				   
					
                    JADetSinPortaCta.add(JOListSinPorta);

                    JOTotPatrim.put("grupocuentas", JACtaPorta);   
                    JOTotPatrim.put("grupocuentasindependientes", JADetSinPortaCta);   

                    Total.add(JOTotPatrim);   
                    TotalPatrimonio.put("patrimonio", Total);      
                 
             }
            else
            {
                JOTotalError.put("errcod", Integer.parseInt(errcod));
                JOTotalError.put("detcod", detcod);
                JOTotalError.put("defcod", defcod);                     
            }
            
            }
    catch (NumberFormatException e) {
        JOTotalError.put("errcod", Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
        JOTotalError.put("detcod", e.getCause());
        JOTotalError.put("defcod", e.getMessage());           
        LOG.error( "ERROR: " + e.getMessage());
    }
    catch (Exception e) {
        JOTotalError.put("errcod", Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
        JOTotalError.put("detcod", e.getCause());
        JOTotalError.put("defcod", e.getMessage());           
        LOG.error( "ERROR: " + e.getMessage());
    }     

        JORaiz.put("datos", TotalPatrimonio);
        JORaiz.put("error",JOTotalError); 
        return JORaiz.toString();       
     }          
    
}
