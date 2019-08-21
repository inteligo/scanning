package com.t24.services.impl;

import com.tws.wsdl.*;
import com.java.Constantes;
import java.util.Date;
import java.util.List;
import javax.xml.ws.Holder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.t24.services.CWServiceTWS_Tipo1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CWServiceTWS_Tipo1Impl  implements CWServiceTWS_Tipo1{
    private static final Logger LOG = LogManager.getLogger(CWServiceTWS_Tipo1Impl.class);

                    private String result=""; 
                    private String resultXml="";
                    private com.tws.wsdl.WebRequestCommon webRequestCommon=new com.tws.wsdl.WebRequestCommon();
                    private EnquiryInput enquiryInput=new EnquiryInput();
                    private Holder<Status> status=new Holder<Status>();
                    private Holder<List<TMSENQGENOLBType>> GENOLBType=new Holder<List<TMSENQGENOLBType>>();
                    private T24WebServicesImplService servicio = new T24WebServicesImplService();        
                    Gson gson =new GsonBuilder().serializeNulls().create();
                    String json="";        
	
                    @Override
	public String CallService(com.tws.wsdl.EnquiryInput enquiryInput)  {
            this.enquiryInput=enquiryInput;
            String resultado = "";
            try {
                        json= gson.toJson(enquiryInput);

                        String cadenaXml=""; 
                        String successIndicator="";

                        WebRequestCommonImpl wrc=new WebRequestCommonImpl();
                        webRequestCommon=wrc.Encabezado();     

                        servicio.getT24WebServicesImplPort().intenqtest(webRequestCommon, enquiryInput, status, GENOLBType);

                        successIndicator=status.value.getSuccessIndicator().toString();
//                                    System.out.println(successIndicator);   

                        cadenaXml=GENOLBType.value.get(0).getGTMSENQGENOLBDetailType().getMTMSENQGENOLBDetailType().get(0).getCOL1().trim();
//                                    System.out.println(cadenaXml);  

                        result=cadenaXml;

                        //   resultado = servicio.getConverterPort().traduceFileXmlToOfs(xmlString, "local");   

                        System.err.println("###########Calling Servicio CWServiceTWS_Tipo1Impl##################  hora: " + new Date() );    
		} catch (Exception e) {
                        LOG.error( "ERROR: " + e.getMessage()); 
                        System.out.println("Error ConsumingServiceTWSImpl 1: " + e.getMessage());
                        resultXml="<?xml version=\"1.0\" encoding=\"UTF-8\"?><IbaResult><head><ibaguid></ibaguid>";
                        resultXml=resultXml+"<returncode>"+Constantes.HTTP_RESPUESTA_NOTFOUND.toString()+"</returncode>";
                        resultXml=resultXml+"<returndesc>"+Constantes.MENSAJE_ERRORCONEXIONFUNCTIONCODE+"</returndesc>";
                        resultXml=resultXml+"<message>"+e.getMessage()+"</message>";
                        resultXml=resultXml+"</head><body></body></IbaResult>";

                       result=resultXml;  

		}
		return result;
	}
}