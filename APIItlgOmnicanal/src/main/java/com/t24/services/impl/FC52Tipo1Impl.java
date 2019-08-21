package com.t24.services.impl;

import com.java.Constantes;
import com.java.Convierte;
import com.t24.services.FCRetorno;
import dto.t24.services.FC52_LOANDET;
import dto.t24.services.FCReturn;
import java.util.List;
import org.jdom2.input.SAXBuilder;
import java.io.StringReader;
import java.util.ArrayList;
import com.t24.services.CWServiceTWS_Tipo1;
import com.t24.services.FC52Tipo1;
import java.io.IOException;
import org.jdom2.JDOMException;


public class FC52Tipo1Impl implements FC52Tipo1 {  
   
    
    @Override
    public String FC52Str(String CustomerNo)   {
        com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
        CWServiceTWS_Tipo1  consumingservice= new CWServiceTWS_Tipo1Impl();
        InputCollectionTipo1Impl icimpl=new InputCollectionTipo1Impl();

        enquiryInput=icimpl.Input("functioncode;" +Constantes.INTEGRADOR_FC52 +"|CustomerNo;"+CustomerNo);
      
        String strFC_return = consumingservice.CallService(enquiryInput);

        return strFC_return;
        }
    
    @Override
    public List<FC52_LOANDET> LOANDET (String xmlString,String CustomerNo) {
        SAXBuilder builder = new SAXBuilder();        
        String errcod="";
        String detcod="";
        String defcod="";
        FCRetorno fcretorno= new FCRetornoImpl();
        List list = new ArrayList<>();        
        
        
  
        try {
                             
                    List<FCReturn> listaRetorno =fcretorno.ListaRetorno(xmlString);       

                    for (FCReturn lpf : listaRetorno) 
                    {                         
                         errcod= lpf.getErrcod();
                        detcod=lpf.getDetcod();
                        defcod=lpf.getDefcod();      
                    }     
                    
//                    System.out.println("errcod: " + errcod); 
//                    System.out.println("detcod: " + detcod); 
//                    System.out.println("defcod: " + defcod); 
           
                   if (errcod.equals("0"))
                    {               
                        org.jdom2.Document dc02 = (org.jdom2.Document) builder.build(new StringReader(xmlString));   
                        org.jdom2.Element rootE01 = dc02.getRootElement();     
                        org.jdom2.Element head01= rootE01.getChild("head");
                        org.jdom2.Element body01 = rootE01.getChild("body");

                        org.jdom2.Element lstElement01 = body01.getChild("tables");
                        List<org.jdom2.Element> lst01table =  lstElement01.getChildren();

                        for (org.jdom2.Element element01 : lst01table) {
                            List<org.jdom2.Element> tablee = element01.getChildren();						
                            if (element01.getAttributeValue("name").equalsIgnoreCase("LOAN.DET")) {
                                for (org.jdom2.Element element1 : tablee) {

                                    FC52_LOANDET lista = new FC52_LOANDET();
                                    lista.setIdClient(CustomerNo);
                                    lista.setCliente(CustomerNo);
                                    lista.setLoanNumber((String) element1.getChildText("LoanNumber").trim());    
                                    lista.setID((String) element1.getChildText("ID").trim()); 
                                    lista.setCreditAmount(Convierte.NumStringaDouble(element1.getChildText("CreditAmount").trim()));               
                                    lista.setLoanType ((String) element1.getChildText("LoanType").trim());                                    
                                   lista.setClientType((String) element1.getChildText("ClientType").trim());      

                                    lista.setErrcod(errcod);
                                    lista.setDetcod(detcod);
                                    lista.setDefcod(defcod);

                                    list.add(lista);         

                                    }     
                                }
                            }        
                }
            else
            {                   
                FC52_LOANDET lista = new FC52_LOANDET();
                 lista.setIdClient(CustomerNo);
                lista.setCliente(CustomerNo);
                lista.setCreditAmount(0.00);                
                lista.setErrcod(errcod);
                lista.setDetcod(detcod);
                lista.setDefcod(defcod);
                list.add(lista);   
            }          
            }

        catch (IOException | JDOMException e) {
                System.err.println(e.getMessage()); 
                FC52_LOANDET lista = new FC52_LOANDET();
                 lista.setIdClient(CustomerNo);
                lista.setCliente(CustomerNo);
                lista.setCreditAmount(0.00); 
                            
                lista.setErrcod(Constantes.HTTP_RESPUESTA_BADREQUEST.toString());
                lista.setDetcod(e.getCause().toString());
                lista.setDefcod(e.getMessage());
                list.add(lista);   
                   
                
      }
       
        return list;
    
    }
      
}
