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

//@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="InputXML")
//@XmlRootElement
//@XmlType(propOrder={"bizagiwsparam"})
public class InputXML {
//        @XmlJavaTypeAdapter(value=CDATAAdapter.class)
        
        private BizAgiWSParam bizagiwsparam;
////        @XmlElement(name="BizAgiWSResponse")
//        private String bizagiwsparam;
//
//    /**
//     * @return the bizagiwsparam
//     */
//    public String getBizagiwsparam() {
//        return bizagiwsparam;
//    }
//
//    /**
//     * @param bizagiwsparam the bizagiwsparam to set
//     */
//    public void setBizagiwsparam(String bizagiwsparam) {
//        this.bizagiwsparam = bizagiwsparam;
//    }


              
        

//    /**
//     * @return the bizagiwsparam
//     */
//    public BizAgiWSResponse getBizagiwsparam() {
//        return bizagiwsparam;
//    }
//
//    /**
//     * @param bizagiwsparam the bizagiwsparam to set
//     */
////    @XmlElement(name="BizAgiWSResponse")
////    @XmlJavaTypeAdapter(value=CDATAAdapter.class)
//    public void setBizagiwsparam(BizAgiWSResponse bizagiwsparam) {
//        this.bizagiwsparam = bizagiwsparam;
//    }
//
//     @XmlJavaTypeAdapter(value=CDATAAdapter.class)
////    private String bizagiwsparam;
////
////    /**
////     * @return the bizagiwsparam
////     */
////    public String getBizagiwsparam() {
////        return bizagiwsparam;
////    }
////
////    /**
////     * @param bizagiwsparam the bizagiwsparam to set
////     */
////  
////    @XmlJavaTypeAdapter(value=CDATAAdapter.class)
////      @XmlElement(name="BizAgiWSResponse")
////    public void setBizagiwsparam(String bizagiwsparam) {
////        this.bizagiwsparam = bizagiwsparam;
////    }
////    

    /**
     * @return the bizagiwsparam
     */
    public BizAgiWSParam getBizagiwsparam() {
        return bizagiwsparam;
    }

    /**
     * @param bizagiwsparam the bizagiwsparam to set
     */
     @XmlElement(name="BizAgiWSParam")
    public void setBizagiwsparam(BizAgiWSParam bizagiwsparam) {
        this.bizagiwsparam = bizagiwsparam;
    }
    
	
	
}