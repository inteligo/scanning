package com.t24.services.impl;

import com.java.Constantes;
//import com.t24.services.input.IbaQuery;
import com.tws.wsdl.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
//import static com.java.Constantes.*;
//import com.java.GeneraUUID;
import dto.t24.services.FCResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.ws.Holder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CWServiceTWS_Tipo2HiloImpl extends Thread  {
    private static final Logger LOG = LogManager.getLogger(CWServiceTWS_Tipo2HiloImpl.class);

        private String result = "";  
        private String successIndicator="";
        private String FC="";
        private com.tws.wsdl.WebRequestCommon webRequestCommon=new com.tws.wsdl.WebRequestCommon();
        private  com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
        private Holder<com.tws.wsdl.Status> status=new Holder<com.tws.wsdl.Status>();
        private Holder<List<BRINTBASSETLISTType>> ASSETLIST=new Holder<List<BRINTBASSETLISTType>>();
        private Holder<List<BRINTBPORTDETType>> PORTDET=new Holder<List<BRINTBPORTDETType>>();
        private Holder<List<BRINTBPORTLISTType>> PORTLIST=new Holder<List<BRINTBPORTLISTType>>();
        private Holder<List<BRINVASSETDETType>> ASSETDET=new Holder<List<BRINVASSETDETType>>();
        private Holder<List<ITLGINTSECMASTLISTType>> SECMASTLIST=new Holder<List<ITLGINTSECMASTLISTType>>();
        private Holder<List<TMSBRINTLDEPODETType>> DEPODET=new Holder<List<TMSBRINTLDEPODETType>>();
        private Holder<List<TMSBRINTENQLOANDETSType>> LOANDETS=new Holder<List<TMSBRINTENQLOANDETSType>>();
        
         private Holder<List<TMSBRINTENQLOANDETAILSType>> LOANDETAILS=new Holder<List<TMSBRINTENQLOANDETAILSType>>();  //FC45
         private Holder<List<TMSAMPERFPRTYMType>> SAMPERFPRTYM=new Holder<List<TMSAMPERFPRTYMType>>();  //FC46
         private Holder<List<TMSAABILLSSCHEDULESType>> AABILLSSCHEDULES=new Holder<List<TMSAABILLSSCHEDULESType>>();  //FC47
         private Holder<List<TMSSTMTENTBOOKType>> STMTENTBOOK=new Holder<List<TMSSTMTENTBOOKType>>();  //FC48
         
        Gson gson =new GsonBuilder().serializeNulls().create();
        String json="";
      
  	
        public CWServiceTWS_Tipo2HiloImpl(String FC, EnquiryInput enquiryInput)  {
              this.FC=FC;            
              this.enquiryInput=enquiryInput;
              result = new String();                             
	}
        
        @Override
        public void run()
                {                         
                    try 
                      {
                                  
                        json= gson.toJson(enquiryInput);

                        com.tws.wsdl.T24WebServicesImplService servicio = new com.tws.wsdl.T24WebServicesImplService();
                        List  Lista= new ArrayList<String>();         
                        List  ListaResult= new ArrayList<String>();         

                        String respuesta="";
                        WebRequestCommonImpl wrc=new WebRequestCommonImpl();
                        webRequestCommon=wrc.Encabezado();                                      

                        switch ( FC){ 

                            case Constantes.INTEGRADOR_FC10:
                                        servicio.getT24WebServicesImplPort().tmnV360CustSummaryPosition(webRequestCommon, enquiryInput, status, ASSETLIST);
                                        successIndicator=status.value.getSuccessIndicator().toString().toUpperCase();
                                        if (successIndicator.equals("SUCCESS")) {
                                             respuesta =gson.toJson(ASSETLIST.value);                                                                   
                                            }
                                       else{
                                               respuesta =RespuestaError(status);                                                                                   
                                               } 
                                        break;

                            case Constantes.INTEGRADOR_FC12:
                                        servicio.getT24WebServicesImplPort().tmnV360PortfolioDetails(webRequestCommon, enquiryInput, status, PORTDET);
                                        successIndicator=status.value.getSuccessIndicator().toString().toUpperCase();
                                        if (successIndicator.equals("SUCCESS")) {
                                             respuesta =gson.toJson(PORTDET.value);                                                                   
                                            }
                                       else{
                                               respuesta =RespuestaError(status);                                                                    
                                               } 
                                        break;

                            case Constantes.INTEGRADOR_FC13:
                                        servicio.getT24WebServicesImplPort().tmnV360GlobalInvestmentDetail(webRequestCommon, enquiryInput, status, ASSETDET);
                                         successIndicator=status.value.getSuccessIndicator().toString().toUpperCase();
                                        if (successIndicator.equals("SUCCESS")) {
                                             respuesta =gson.toJson(ASSETDET.value);                                                                   
                                            }
                                       else{
                                               respuesta =RespuestaError(status);                                                        
                                               } 
                                        break;

                            case Constantes.INTEGRADOR_FC14:
                                        servicio.getT24WebServicesImplPort().tmnV360PortfolioList(webRequestCommon, enquiryInput, status, PORTLIST);
                                        successIndicator=status.value.getSuccessIndicator().toString().toUpperCase();
                                       if (successIndicator.equals("SUCCESS")) {
                                             respuesta = gson.toJson(PORTLIST.value);                                                                   
                                            }
                                       else{
                                               respuesta =RespuestaError(status);                                                             
                                               } 

                                        break;

                            case Constantes.INTEGRADOR_FC43:
                                        servicio.getT24WebServicesImplPort().itlgintsecmastlist(webRequestCommon, enquiryInput, status, SECMASTLIST);
                                          successIndicator=status.value.getSuccessIndicator().toString().toUpperCase();
                                        if (successIndicator.equals("SUCCESS")) {    
                                             respuesta =gson.toJson( SECMASTLIST.value);              
                                            }
                                       else{
                                               respuesta = RespuestaError(status);                                                                          
                                               } 
                                        break;                                                       

                            case Constantes.INTEGRADOR_FC44:
                                        servicio.getT24WebServicesImplPort().wstmsbrintldepodet(webRequestCommon, enquiryInput, status, DEPODET);
                                          successIndicator=status.value.getSuccessIndicator().toString().toUpperCase();
                                        if (successIndicator.equals("SUCCESS")) {    
                                             respuesta =gson.toJson( DEPODET.value);              
                                            }
                                       else{
                                               respuesta = RespuestaError(status);                                                                          
                                               } 
                                        break;

                              case Constantes.INTEGRADOR_FC45:
                                        servicio.getT24WebServicesImplPort().tmsbrintenqloandetails(webRequestCommon, enquiryInput, status, LOANDETAILS);
                                          successIndicator=status.value.getSuccessIndicator().toString().toUpperCase();
                                        if (successIndicator.equals("SUCCESS")) {    
                                             respuesta =gson.toJson( LOANDETAILS.value);              
                                            }
                                       else{
                                               respuesta = RespuestaError(status);                                                                          
                                               } 
                                        break;
                               case Constantes.INTEGRADOR_FC46:
                                        servicio.getT24WebServicesImplPort().wstmsamperfprtym(webRequestCommon, enquiryInput, status, SAMPERFPRTYM);
                                          successIndicator=status.value.getSuccessIndicator().toString().toUpperCase();
                                        if (successIndicator.equals("SUCCESS")) {    
                                             respuesta =gson.toJson( SAMPERFPRTYM.value);              
                                            }
                                       else{
                                               respuesta = RespuestaError(status);                                                                          
                                               } 
                                        break;

                                case Constantes.INTEGRADOR_FC47:
                                        servicio.getT24WebServicesImplPort().wstmsaabillsschedules(webRequestCommon, enquiryInput, status, AABILLSSCHEDULES);
                                          successIndicator=status.value.getSuccessIndicator().toString().toUpperCase();
                                        if (successIndicator.equals("SUCCESS")) {    
                                             respuesta =gson.toJson( AABILLSSCHEDULES.value);              
                                            }
                                       else{
                                               respuesta = RespuestaError(status);                                                                          
                                               } 
                                        break;

                               case Constantes.INTEGRADOR_FC48:
                                        servicio.getT24WebServicesImplPort().wstmsstmtentbook(webRequestCommon, enquiryInput, status, STMTENTBOOK);
                                          successIndicator=status.value.getSuccessIndicator().toString().toUpperCase();
                                        if (successIndicator.equals("SUCCESS")) {    
                                             respuesta =gson.toJson( STMTENTBOOK.value);              
                                            }
                                       else{
                                               respuesta = RespuestaError(status);                                                                          
                                               } 
                                        break;

                              case Constantes.INTEGRADOR_FC49:
                                        servicio.getT24WebServicesImplPort().tmsbrintenqloandets(webRequestCommon, enquiryInput, status, LOANDETS);
                                          successIndicator=status.value.getSuccessIndicator().toString().toUpperCase();
                                        if (successIndicator.equals("SUCCESS")) {    
                                             respuesta =gson.toJson( LOANDETS.value);              
                                            }
                                       else{
                                               respuesta = RespuestaError(status);                                                                          
                                               } 
                                        break;

                                default:
                                     break;   

                        }    

                                 result=respuesta;    

                                System.err.println("###########Calling Servicio CWServiceTWS_Tipo2HiloImpl##################  hora: " + new Date() );          
                                System.out.println(result);          
                        }catch (Exception  e) 
                           {
                                LOG.error( "ERROR: " + e.getMessage()); 
                                String respuesta="";                               
                                System.out.println("Error CWServiceTWS_Tipo2HiloImpl : " + e.getMessage());

                                List<FCResponse> list = null;
                                list = new ArrayList<>();

                                FCResponse lista = new FCResponse();

                                lista.setZerorec(Constantes.HTTP_RESPUESTA_NOTFOUND.toString());
                                lista.setMessages(Constantes.MENSAJE_ERRORCONEXIONFUNCTIONCODE);  
                                lista.setException(e.getMessage());
                                lista.setSuccessIndicator("T_24_ERROR");

                                list.add(lista);  
                                respuesta=gson.toJson(list);       

                                result= respuesta;          

                            }
                } 
                        
        public String getResult()
            {
                      String resultado=null;
                    try {
                            resultado= result;
                         } catch (NullPointerException e)
                        {
                            LOG.error( "ERROR: " + e.getMessage()); 
                            System.out.println("resultado CWServiceTWS_Tipo2HiloImpl: " + e.getMessage());

                        } catch (Exception  e) {
                            LOG.error( "ERROR: " + e.getMessage()); 
                            System.out.println("resultado CWServiceTWS_Tipo2HiloImpl: " + e.getMessage());

                        }
                    return resultado;
             } 
        
        public String RespuestaError (Holder<com.tws.wsdl.Status> status){ 
                        List<FCResponse> list = null;
                        list = new ArrayList<>();

                        FCResponse lista = new FCResponse();

                        lista.setZerorec(Constantes.HTTP_RESPUESTA_NOCONTENT.toString());
                        lista.setMessages(status.value.getMessages().toString());  
                        lista.setException(status.value.getMessages().toString());
                        lista.setSuccessIndicator(status.value.getSuccessIndicator().toString());

                        list.add(lista);  
                         
                        return gson.toJson(list);          
        }	

}