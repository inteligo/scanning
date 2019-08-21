
package com.t24.services;
import com.tws360.wsdl.EnquiryInput;
import javax.xml.ws.Holder;


public interface CWServiceTWS360 {	
       public String CallService(String FC, EnquiryInput enquiryInput);
       public String RespuestaError (Holder<com.tws360.wsdl.Status> status);
//        public String ObjectToXML(String status);
     
}
