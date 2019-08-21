
package com.t24.services.impl;

import com.java.Constantes;
import com.t24.services.input.InputCollection;
import java.util.ArrayList;
import java.util.List;

public class InputCollectionTipo2Impl {
//    private final com.tws.wsdl.WebRequestCommon webRequestCommon=new com.tws.wsdl.WebRequestCommon();
    private com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();  
    private final  com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();
    
    public com.tws.wsdl.EnquiryInput   Input( InputCollection ic)
    {        
//         InputCollection ic = new InputCollection();
        try { 
              List  Lista= new ArrayList<>();         
              if (ic.getCUSTOMERID()!=null) {     
                    enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();    
                    enquiryInputCollection.setColumnName("CUSTOMER.ID");
                    enquiryInputCollection.setCriteriaValue(ic.getCUSTOMERID());
                    enquiryInputCollection.setOperand(Constantes.TWS_OPERAND);
                    Lista.add( enquiryInputCollection);         
                  }

               if (ic.getPORTFOLIOID()!=null) {
                   enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();    
                    enquiryInputCollection.setColumnName("PORTFOLIO.ID");
                    enquiryInputCollection.setCriteriaValue(ic.getPORTFOLIOID());
                    enquiryInputCollection.setOperand(Constantes.TWS_OPERAND);
                    Lista.add( enquiryInputCollection);         
                  }
               if (ic.getPRODUCTID()!=null) {
                   enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();    
                    enquiryInputCollection.setColumnName("PRODUCT.ID");
                    enquiryInputCollection.setCriteriaValue(ic.getPRODUCTID());
                    enquiryInputCollection.setOperand(Constantes.TWS_OPERAND);
                    Lista.add( enquiryInputCollection);         
                  }
                if (ic.getID()!=null) {
                    enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();    
                    enquiryInputCollection.setColumnName("@ID");
                    enquiryInputCollection.setCriteriaValue(ic.getID());
                    enquiryInputCollection.setOperand(Constantes.TWS_OPERAND);
                    Lista.add( enquiryInputCollection);         
                  }          
                 if (ic.getARRANGEMENTID()!=null) {
                    enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();    
                    enquiryInputCollection.setColumnName("ARRANGEMENT.ID");
                    enquiryInputCollection.setCriteriaValue(ic.getARRANGEMENTID());
                    enquiryInputCollection.setOperand(Constantes.TWS_OPERAND);
                    Lista.add( enquiryInputCollection);         
                  }                 
                 if (ic.getACCOUNT()!=null) {
                    enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();    
                    enquiryInputCollection.setColumnName("ACCOUNT");
                    enquiryInputCollection.setCriteriaValue(ic.getACCOUNT());
                    enquiryInputCollection.setOperand(Constantes.TWS_OPERAND);
                    Lista.add( enquiryInputCollection);         
                  }        
                 if (ic.getBOOKINGDATE()!=null) {
                    enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();    
                    enquiryInputCollection.setColumnName("BOOKING.DATE");
                    enquiryInputCollection.setCriteriaValue(ic.getBOOKINGDATE());
                    enquiryInputCollection.setOperand(Constantes.TWS_OPERAND);
                    Lista.add( enquiryInputCollection);         
                  }       
                   if (ic.getSAMNO()!=null) {
                    enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();    
                    enquiryInputCollection.setColumnName("SAM.NO");
                    enquiryInputCollection.setCriteriaValue(ic.getSAMNO());
                    enquiryInputCollection.setOperand(Constantes.TWS_OPERAND);
                    Lista.add( enquiryInputCollection);         
                  }                 
                
                enquiryInput.getEnquiryInputCollection().addAll(Lista);           
            }
        catch (Exception e) {         
                System.err.println(e.getMessage());  
      }
        return enquiryInput;
    }
    
}