package com.apis.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import com.java.Formatea;
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
import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class DetalleCashImpl {
    
    
private static final Logger LOG = LogManager.getLogger(AlertaCalendarioImpl.class);
    
    public String ConsultaDetalleCash (String CustomerNo,String CashNo) {   
        com.tws.wsdl.EnquiryInput enquiryInput1=new com.tws.wsdl.EnquiryInput();
        com.tws360.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws360.wsdl.EnquiryInputCollection();  
        com.tws360.wsdl.EnquiryInput enquiryInput=new com.tws360.wsdl.EnquiryInput();
        FC53Tipo1 fc53=new FC53Tipo1Impl(); 
               
        AccountDetails360 ad360= new AccountDetails360Impl();
        Gson gson =new GsonBuilder().serializeNulls().create();    
        String json="";  
        

        List<dto.sql.Moneda> listMonedas =null;  
        List<ACCOUNTDETAILS> list = null;
        list = new ArrayList<>();

        int cantidadDatosLista=0;
        
        String errcod="";
        String detcod="";
        String defcod="";
        
        
        JSONObject JOTotalCash =new JSONObject();        
        JSONObject JOTotalError =new JSONObject();
        JSONObject JODetCash =new JSONObject(); 
        
        JSONObject JORaiz =new JSONObject();
        
        IbaQuery ibaguid1 = new IbaQuery();
        Head hd1 = new Head();
        Body bd1 = new Body();

        try
        {  
                        
           
            
            InputCollectionTipo1Impl ictipo1impl=new InputCollectionTipo1Impl();
            InputCollection ic =new InputCollection();
            InputCollection360Impl icimpl=new InputCollection360Impl();
            
            ic.setCUSTOMERID(CustomerNo);
            enquiryInput=icimpl.Input(ic);
            
            enquiryInput1=ictipo1impl.Input("functioncode;" +Constantes.INTEGRADOR_FC53 +"|CustomerNo;"+CustomerNo);

            String strFC_return1=null;   
            String resultado="";
                                  

            CWServiceTWS_Tipo1HiloImpl servicio1 = new CWServiceTWS_Tipo1HiloImpl(enquiryInput1);
            CWServiceListaMonedasHiloImpl servicio4 = new CWServiceListaMonedasHiloImpl();  
            CWServiceTWS360HiloImpl servicio5 = new CWServiceTWS360HiloImpl(Constantes.TMNV360ACCOUNTDETAILS,enquiryInput); 

            Thread hilo4 = servicio4;
            hilo4.start();

            Thread hilo1 = servicio1;
            hilo1.start();           

             Thread hilo5 = servicio5;
             hilo5.start();


            while (hilo1.isAlive() || hilo4.isAlive()  || hilo5.isAlive() )
            {
                strFC_return1=servicio1.getResult();
                listMonedas=servicio4.getResult();
                resultado=servicio5.getResult();   
            }   

            
             List<FCCuentaFirma> listDetCash = null;
             List<FCCuentaFirma> CuentayFirma = null;
             CuentayFirma = new ArrayList<>();    
             List<ACCOUNTDETAILS> AccountDetailsList=null;          
             
             
            listDetCash =fc53.CuentayFirmaList(strFC_return1, CustomerNo,listMonedas);  
            AccountDetailsList =ad360.ACCOUNTDETAILS(resultado,CustomerNo,listMonedas);  
                  
             
            
             for (FCCuentaFirma lpf : listDetCash) 
            {
                errcod= lpf.getErrcod();
                detcod=lpf.getDetcod();
                defcod=lpf.getDefcod();   
            }               
                         
            if (errcod.equals("0"))
            {
                List<FCCuentaFirma> listDetCashFiltrado = null;
                listDetCashFiltrado= new ArrayList<>();   
                listDetCashFiltrado = listDetCash.stream().filter(x -> x.getAccountNo().toString().trim().equals(CashNo.trim())).collect(Collectors.toList());
                
                cantidadDatosLista= listDetCashFiltrado.size();
                
                List<ACCOUNTDETAILS> listAccDetNoUSD = null;
                listAccDetNoUSD= new ArrayList<>();   
                listAccDetNoUSD = AccountDetailsList.stream().filter(x -> ! x.getCurrency().trim().equals("USD")).collect(Collectors.toList());
                
                
                for (FCCuentaFirma cyf1 : listDetCashFiltrado) 
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

                         CuentayFirma.add(cuenta);
                     } 
              
                
                

                if (cantidadDatosLista>0 )
                   {
                
                            for (FCCuentaFirma lpf:CuentayFirma)
                            {                                    
                                    JODetCash.put("numcta", Convierte.NullaVacio(lpf.getAccountNo()));
                                    JODetCash.put("moneda", Convierte.NullaVacio(lpf.getCurrency()));
                                    JODetCash.put("salctble", Formatea.Redondear(lpf.getWorkingBal(),2));
                                    JODetCash.put("saldispo", Formatea.Redondear(lpf.getAcctBal(),2));
                                    JODetCash.put("saldousd", Formatea.Redondear(lpf.getWorkingBalinUSD(),2));                                  
                                    JODetCash.put("lineasob", Formatea.Redondear(lpf.getLimitAmtDisp(),2));
                                    JODetCash.put("tipcta", Convierte.NullaVacio(lpf.getAccountType()));
                                    JODetCash.put("estitu", Convierte.NullaVacio(lpf.getTitular()));  

                                    JOTotalError.put("errcod", Integer.parseInt(lpf.getErrcod()));
                                    JOTotalError.put("detcod", lpf.getDetcod());
                                    JOTotalError.put("defcod", lpf.getDefcod());
                               }
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
        catch (NumberFormatException e){
            JOTotalError.put("errcod", Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage());  
            LOG.error( "ERROR: " + e.getMessage());
        }     
        catch (Exception e){
            JOTotalError.put("errcod", Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage());  
            LOG.error( "ERROR: " + e.getMessage());
        }        
  
        JOTotalCash.put("cash",JODetCash);
        
        JORaiz.put("datos",JOTotalCash);
        JORaiz.put("error",JOTotalError); 
        
        json= gson.toJson(JORaiz);           
        return JORaiz.toString();
     }
    
}
