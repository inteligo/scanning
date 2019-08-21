
package com.t24.services.impl;

import com.java.Constantes;
import com.java.GeneraUUID;
import java.util.ArrayList;
import java.util.List;

public class InputCollectionTipo1Impl {
    private com.tws.wsdl.WebRequestCommon webRequestCommon=new com.tws.wsdl.WebRequestCommon();
    private com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();  
    private  com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
    
    public com.tws.wsdl.EnquiryInput   Input( String parametros)
    {        
        try { 
                    List  Lista= new ArrayList<String>();         
           
                    enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();    
                    enquiryInputCollection.setColumnName(Constantes.TWS_COLUMNAMECHANNEL);
                    enquiryInputCollection.setCriteriaValue(Constantes.TWS_COLUMNAMEBZG);
                    enquiryInputCollection.setOperand(Constantes.TWS_OPERAND);
                    Lista.add( enquiryInputCollection);         
                
                   enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();    
                    enquiryInputCollection.setColumnName(Constantes.TWS_COLUMNAMEDATA);
                    enquiryInputCollection.setCriteriaValue("ibaguid;"+ GeneraUUID.CodigoUUID() +"|"+ parametros);
                    enquiryInputCollection.setOperand(Constantes.TWS_OPERAND);
                    Lista.add( enquiryInputCollection);                       
                
                enquiryInput.getEnquiryInputCollection().addAll(Lista);           
            }
        catch (Exception e) {         
                System.err.println(e.getMessage());  
      }
        return enquiryInput;
    }
    
}