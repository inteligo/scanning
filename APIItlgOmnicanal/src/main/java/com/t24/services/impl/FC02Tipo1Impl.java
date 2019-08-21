package com.t24.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import com.t24.services.FCRetorno;
import dto.t24.services.FCCuenta;
import dto.t24.services.FC02_ACCCUST;

import java.util.List;
import org.jdom2.input.SAXBuilder;

import dto.t24.services.FCReturn;
import java.io.StringReader;
import java.util.ArrayList;
import com.t24.services.CWServiceTWS_Tipo1;
import com.t24.services.FC02Tipo1;

import java.io.IOException;
import org.jdom2.JDOMException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.jdom2.*;

public class FC02Tipo1Impl implements FC02Tipo1   {  

    private static final Logger LOG = LogManager.getLogger(FC02Tipo1Impl.class);
    
    @Override
    public String FC02Str(String AccountNo)   {
        com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
        CWServiceTWS_Tipo1  consumingservice= new CWServiceTWS_Tipo1Impl();
        InputCollectionTipo1Impl icimpl=new InputCollectionTipo1Impl();

        enquiryInput=icimpl.Input("functioncode;" +Constantes.INTEGRADOR_FC02 +"|AccountNo;"+AccountNo);
      
        String strFC_return = consumingservice.CallService(enquiryInput);

        return strFC_return;
        }
    
    @Override
    public List<FC02_ACCCUST> FC02ACCCUST  (String xmlString,String AccountNo) {
        SAXBuilder builder = new SAXBuilder();        
        String errcod="";
        String detcod="";
        String defcod="";
        FCRetorno fcretorno= new FCRetornoImpl();
        List list = new ArrayList<>();          
               
        Integer i=0;
        
        try {
       
                   List<FCReturn> listaRetorno =fcretorno.ListaRetorno(xmlString);       

                    for (FCReturn lpf : listaRetorno) 
                    {
                        errcod= lpf.getErrcod();
                        detcod=lpf.getDetcod();
                        defcod=lpf.getDefcod();      
                    }            
           
                   if (errcod.equals("0"))
                    {               
//////                     
                        org.jdom2.Document dc02 = (org.jdom2.Document) builder.build(new StringReader(xmlString));   
                        org.jdom2.Element rootE02 = dc02.getRootElement(); 
                        org.jdom2.Element body02 = rootE02.getChild("body");
                        org.jdom2.Element lstElement02 = body02.getChild("singlefields");
                        List<org.jdom2.Element> lst02table =  lstElement02.getChildren();
                        int j;
                        FC02_ACCCUST lista = new FC02_ACCCUST();
                        lista.setAccCustomer(AccountNo);
                        lista.setErrcod(errcod);
                        lista.setDetcod(detcod);
                        lista.setDefcod(defcod);                        
                        for ( j= 0;  j<lst02table.size() ; j++ )
                        {
                        String name =lst02table.get(j).getAttributeValue("name");
                        String valor=lst02table.get(j).getText();                            
                            if ("CustomerName".equals(name))
                            {
                                lista.setCustomerName((String) valor);  
                                lista.setCustomerNameMask(Convierte.EnmascaraNombre((String) valor,Constantes.NAMECLI_STARTLENMASK,Constantes.NAMECLI_ENDLENMASK));
                                continue;
                            }
                            
                            if ("DocumentType".equals(name))
                            {
                                lista.setDocumentType((String) valor);                               
                                 continue;
                            }
                            if ("DocumentNo".equals(name))
                            {
                                 lista.setDocumentNo((String) valor);                                
                                  continue;
                            }
                            if ("AvailBal".equals(name))
                            {
                                lista.setAvailBal(Convierte.NumStringaDouble(valor));                              
                                 continue;
                            }
                            if ("AccountActive".equals(name))
                            {
                                lista.setAccountActive((String) valor);                               
                                 continue;
                            }
                            if ("AccType".equals(name))
                            {
                                lista.setAccType((String) valor);
                                 continue;
                            }
                            if ("Currency".equals(name))
                            {
                                lista.setCurrency((String) valor);                                 
                            } 
                        }
                        
                        list.add(lista);
                }

            else
            {   
                FC02_ACCCUST lista = new FC02_ACCCUST();                
                lista.setErrcod(errcod);
                lista.setDetcod(detcod);
                lista.setDefcod(defcod);
                list.add(lista);   
            }                                            
            }
        
        catch (IOException | JDOMException e) {
            LOG.error( "ERROR: " + e.getMessage());
            System.err.println(e.getMessage()); 
            FC02_ACCCUST lista = new FC02_ACCCUST();                          

            lista.setErrcod(Constantes.HTTP_RESPUESTA_BADREQUEST.toString());
            lista.setDetcod(e.getCause().toString());
            lista.setDefcod(e.getMessage());  

            list.add(lista);       
      
      }
        System.out.println(i);
        return list;
    }
      
       
         
}