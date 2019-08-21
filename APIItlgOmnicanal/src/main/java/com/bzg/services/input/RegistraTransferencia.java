/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bzg.services.input;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="tem:RegistrarTransferencia")
//@XmlType(propOrder={"bizagiwsparam"})
public class RegistraTransferencia {
        
        @XmlElement(name="tem:InputXML")
        private InputXML InputXML;
              
        

  
//    @XmlElement(name="BizAgiWSParam")
//    @XmlJavaTypeAdapter(value=CDATAAdapter.class)

    /**
     * @return the InputXML
     */
    public InputXML getInputXML() {
        return InputXML;
    }

    /**
     * @param InputXML the InputXML to set
     */
      
    public void setInputXML(InputXML InputXML) {
        this.InputXML = InputXML;
    }

    
	
	
}