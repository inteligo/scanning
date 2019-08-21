package com.t24.services.impl;

import com.java.Constantes;
import java.util.Date;
import java.util.List;
import javax.xml.ws.Holder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import com.t24.services.*;
import com.tws360.wsdl.*;
import dto.t24.services.FCResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CWServiceTWS360Impl  implements CWServiceTWS360{
    private static final Logger LOG = LogManager.getLogger(CWServiceTWS360Impl.class);

                    private String result = "";  
                    private String successIndicator="";
                    private String FC="";
                    private com.tws360.wsdl.WebRequestCommon webRequestCommon=new com.tws360.wsdl.WebRequestCommon();
                    private  com.tws360.wsdl.EnquiryInput enquiryInput=new com.tws360.wsdl.EnquiryInput();
                    private Holder<com.tws360.wsdl.Status> status=new Holder<com.tws360.wsdl.Status>();
                    private Holder<List<BRINTBCURACCDETType>> CURACCDET=new Holder<List<BRINTBCURACCDETType>>();
                    private Holder<List<BRINTBTRADEACCDETType>> TRADEACCDET=new Holder<List<BRINTBTRADEACCDETType>>();
                   
//                    private Holder<List<ITLGINTSECMASTLISTType>> SECMASTLIST=new Holder<List<ITLGINTSECMASTLISTType>>();
//                    private Holder<List<TMSBRINTLDEPODETType>> DEPODET=new Holder<List<TMSBRINTLDEPODETType>>();
//                    private Holder<List<TMSBRINTENQLOANDETSType>> LOANDETS=new Holder<List<TMSBRINTENQLOANDETSType>>();
                    Gson gson =new GsonBuilder().serializeNulls().create();
                    String json="";
	
                    @Override
	public String CallService(String FC, EnquiryInput enquiryInput)  {
                        this.FC=FC;            
                        this.enquiryInput=enquiryInput;
                        result = new String();                   
		try {
                        json= gson.toJson(enquiryInput);

                       com.tws360.wsdl.T24WebServicesImplService servicio = new com.tws360.wsdl.T24WebServicesImplService();
                       List  Lista= new ArrayList<String>();         
                       List  ListaResult= new ArrayList<String>();         

                       String respuesta="";
                       WebRequestCommon360Impl wrc=new WebRequestCommon360Impl();
                       webRequestCommon=wrc.Encabezado();                                      

                       switch ( FC){ 

                           case Constantes.TMNV360ACCOUNTDETAILS:
                                       servicio.getT24WebServicesImplPort().tmnV360AccountDetails(webRequestCommon, enquiryInput, status, CURACCDET);
                                       successIndicator=status.value.getSuccessIndicator().toString().toUpperCase();
                                       if (successIndicator.equals("SUCCESS")) {
                                            respuesta =gson.toJson(CURACCDET.value);                                                                   
                                           }
                                      else{
                                              respuesta =RespuestaError(status);                                                                                   
                                              } 
                                       break;

                           case Constantes.TMNV360TRADINGACCOUNTDETAILS:
                                       servicio.getT24WebServicesImplPort().tmnV360TradingAccountDetails(webRequestCommon, enquiryInput, status, TRADEACCDET);
                                       successIndicator=status.value.getSuccessIndicator().toString().toUpperCase();
                                       if (successIndicator.equals("SUCCESS")) {
                                            respuesta =gson.toJson(TRADEACCDET.value);                                                                   
                                           }
                                      else{
                                              respuesta =RespuestaError(status);                                                                    
                                              } 
                                       break;


                               default:
                                    break;                                 

                                 }                                        

                                result=respuesta;    

                               System.err.println("###########Calling Servicio CWServiceTWS360Impl ##################  hora: " + new Date() );          
                               System.out.println(result);          
		} catch (Exception e) {
                        LOG.error( "ERROR: " + e.getMessage()); 
                        String respuesta="";                               
                        System.out.println("Error CWServiceTWS360Impl : " + e.getMessage());

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
		return result;
	}
	
        public String RespuestaError (Holder<com.tws360.wsdl.Status> status){ 
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