
package com.t24.services;
import com.tws.wsdl.EnquiryInput;
import javax.xml.ws.Holder;


public interface CWServiceTWS {	
       public String CallService(String FC, EnquiryInput enquiryInput);
       public String RespuestaError (Holder<com.tws.wsdl.Status> status);
//        public String ObjectToXML(String status);
     
}
