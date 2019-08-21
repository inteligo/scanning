package com.bzg.services.impl;

import com.Bizagi.wsdl.Response;
import com.Bizagi.wsdl.RegBizagiOC;
import com.bzg.services.input.BizAgiWSParam;
import com.java.Constantes;
import com.java.Convierte;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.util.Date;


public class ConsumingServiceBzgImpl   {
        private String resultXml="";

        public String callServiceConverter(BizAgiWSParam bizagiwsparam)  {
		
                    String resultado = "";
                    String ErrorCode  = "";      
                    String ErrorMessage = "";   
                   String Respuesta = ""; 
                    

                    Response respuesta=new Response();
		try {
                                                       
                                                String xmlString = ObjectToXML(bizagiwsparam);        
                                                System.out.println(xmlString);            

                                                RegBizagiOC servicio = new RegBizagiOC();
                                                respuesta = servicio.getBasicHttpBindingIRegBizagiOC1().registrarTransferencia(xmlString);   
                                                
//                                                 System.out.println(respuesta);

                                                ErrorCode=Convierte.NullaVacio(respuesta.getErrorCode().getValue());       
                                                ErrorMessage=Convierte.NullaVacio(respuesta.getErrorMessage().getValue());
                                                Respuesta=Convierte.NullaVacio(respuesta.getRespuesta().getValue());       
                                            
//                                                System.out.println(ErrorCode);
//                                                 System.out.println(ErrorMessage);
//                                                  System.out.println(Respuesta);
                                                
                                                if (ErrorCode.trim()=="")
                                                {
//                                                        resultXml="";                                    
//                                                        resultXml=resultXml+"<Resultado>";
//                                                        resultXml=resultXml+"<returncode>"+Constantes.RETORNO_OKSQL+"</returncode>";
//                                                        resultXml=resultXml+"<returndesc>"+Constantes.MENSAJE_OKSQL_DET+"</returndesc>";
//                                                        resultXml=resultXml+"<message>"+Constantes.MENSAJE_OKSQL_DEF+"</message>";
//                                                        resultXml=resultXml+"</Resultado>";
//                                                        resultado =resultXml + Respuesta;             
                                                        resultado = Respuesta;               
                                                }
                                                else
                                                {
                                                        resultXml="";                                                      
                                                        resultXml="<?xml version=\"1.0\" encoding=\"UTF-8\"?><Resultado>";                                                        
                                                        resultXml=resultXml+"<returncode>"+ErrorCode+"</returncode>";
                                                        resultXml=resultXml+"<returndesc>"+ErrorMessage+"</returndesc>";
                                                        resultXml=resultXml+"<message>"+ErrorMessage+"</message>";
                                                        resultXml=resultXml+"</Resultado>";   
                                                        resultado=resultXml;                 
                                                }      
                                                
                                                System.err.println("###########Calling Servicio ConsumingServiceBzgImpl##################  hora: " + new Date() );               
		} catch (Exception e) {
                                                System.out.println("Error ConsumingServiceBzgImpl 1: " + e.getMessage());
                                                resultXml="";                             
                                                resultXml="<?xml version=\"1.0\" encoding=\"UTF-8\"?><Resultado>";
                                                resultXml=resultXml+"<returncode>"+Constantes.HTTP_RESPUESTA_NOTFOUND.toString()+"</returncode>";
                                                resultXml=resultXml+"<returndesc>"+Constantes.MENSAJE_ERRORCONEXIONFUNCTIONCODE+"</returndesc>";
                                                resultXml=resultXml+"<message>"+e.getMessage()+"</message>";
                                                resultXml=resultXml+"</Resultado>";  
                                                resultado=resultXml;                 
		}
		return resultado;
	}
	
	public String ObjectToXML(BizAgiWSParam bizagiwsparam) {
		String xmlString = "";
		try {
                                                JAXBContext jaxbContext = JAXBContext.newInstance(BizAgiWSParam.class);                                                
                                                Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

//                                                jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT,true);
                                                  jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
;

                                                StringWriter sw = new StringWriter();
                                                jaxbMarshaller.marshal(bizagiwsparam, sw);
                                                xmlString = sw.toString();

		} catch (JAXBException e) {
                                                    System.out.println("resultado ConsumingServiceImpl ObjectToXML: " + e.getMessage());
		}

		return xmlString;
	}
                
//////                public String ResultadoToXML(String bizagiwsresponse) {
//////		String xmlString = "";
//////		try {
//////                                                JAXBContext jaxbContext = JAXBContext.newInstance(BizAgiWSResponse.class);                                                
//////                                                Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//////
//////                                                jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT,true);
////////                                                 jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//////;
//////
//////                                                StringWriter sw = new StringWriter();
//////                                                jaxbMarshaller.marshal(bizagiwsresponse, sw);
//////                                                xmlString = sw.toString();
//////
//////		} catch (JAXBException e) {
//////                                                    e.printStackTrace();
//////                                                    System.out.println("resultado ConsumingServiceBzgWSImpl ObjectToXML: " + e.getMessage());
//////		}
//////
//////		return xmlString;
//////	}
}