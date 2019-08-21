package com.bzgws.services.impl;

import com.BizagiWS.wsdl.EntityManagerSOA;
import com.bzg.services.input.BizAgiWSParam;
import com.java.Constantes;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.util.Date;


public class ConsumingServiceBzgWSImpl   {
        private String resultXml="";

        public String getEntitiesUsingSchemaAsString( String Guid )  {
		
                    String resultado = "";
                    String ErrorCode  = "";      
                    String ErrorMessage = "";   
                    String Respuesta = "";       
//                     String Guid = "";       

                    String respuesta="";
		try {
                                                       
//                                                String xmlString = ObjectToXML(bizagiwsparam);        
                                                    
                                                
                                               String xmlStr="<BizAgiWSParam><EntityData><EntityName>tblTransferenciaOC</EntityName><Filters>GuidRegistro = '"+ Guid + "'</Filters></EntityData></BizAgiWSParam>";
                                               String xmlSchema="<xs:schema attributeFormDefault=\"qualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">\n" +
"         <xs:element name=\"tblTransferenciaOC\">\n" +
"                 <xs:complexType>\n" +
"                         <xs:sequence>\n" +
"                                 <xs:element minOccurs=\"0\" maxOccurs=\"1\" name=\"NumeroCaso\"/>\n" +
"                                 <xs:element minOccurs=\"0\" maxOccurs=\"1\" name=\"GuidRegistro\" />\n" +
"                                 <xs:element minOccurs=\"0\" maxOccurs=\"1\" name=\"CodigoRespuesta\" />\n" +
"                                 <xs:element minOccurs=\"0\" maxOccurs=\"1\" name=\"ComentarioRespuesta\" />\n" +
"                                 <xs:element minOccurs=\"0\" maxOccurs=\"1\" name=\"Comision\" />\n" +
"                                 <xs:element minOccurs=\"0\" maxOccurs=\"1\" name=\"TransaccionT24\" />\n" +
"                         </xs:sequence>\n" +
"                 </xs:complexType>\n" +
"         </xs:element>\n" +
" </xs:schema>";
                                                EntityManagerSOA servicio = new EntityManagerSOA();
                                                respuesta = servicio.getEntityManagerSOASoap().getEntitiesUsingSchemaAsString(xmlStr,xmlSchema);   
                                                
                                               System.out.println(xmlStr);
                                                System.out.println(xmlSchema);
                                                  
                                                System.out.println(respuesta);        

//                                                ErrorCode=Convierte.NullaVacio(respuesta.getErrorCode());       
//                                                ErrorMessage=Convierte.NullaVacio(respuesta.getErrorMessage());
//                                                Respuesta=Convierte.NullaVacio(respuesta.getRespuesta());       
                                            
                                                if (respuesta.trim()!="")
                                                {
//                                                        resultXml="";                                    
//                                                        resultXml=resultXml+"<Resultado>";
//                                                        resultXml=resultXml+"<returncode>"+Constantes.RETORNO_OKSQL+"</returncode>";
//                                                        resultXml=resultXml+"<returndesc>"+Constantes.MENSAJE_OKSQL_DET+"</returndesc>";
//                                                        resultXml=resultXml+"<message>"+Constantes.MENSAJE_OKSQL_DEF+"</message>";
//                                                        resultXml=resultXml+"</Resultado>";
//                                                        resultado =resultXml + Respuesta;             
                                                        resultado = respuesta;               
                                                }
                                                else
                                                {
                                                        resultXml="";                                                      
                                                        resultXml="<?xml version=\"1.0\" encoding=\"UTF-8\"?><Resultado>";                                                        
                                                        resultXml=resultXml+"<returncode>"+Constantes.HTTP_RESPUESTA_NOTFOUND.toString()+"</returncode>";
                                                        resultXml=resultXml+"<returndesc>"+Constantes.MENSAJE_ERRORCONEXIONFUNCTIONCODE+"</returndesc>";
                                                        resultXml=resultXml+"<message>"+Constantes.MENSAJE_ERRORCONEXIONFUNCTIONCODE+"</message>";
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
//////                                                    System.out.println("resultado ConsumingServiceBzgImpl ObjectToXML: " + e.getMessage());
//////		}
//////
//////		return xmlString;
//////	}
}