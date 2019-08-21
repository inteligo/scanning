/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bzg.services.input;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


//@XmlRootElement
//@XmlType(propOrder={})
//@XmlJavaTypeAdapter(AdapterCDATA.class)
  @XmlRootElement(name="BizAgiWSParam")
public class BizAgiWSParam {
	
        private String domain;
        private String userName;
        private Cases cases;

    /**
     * @return the domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * @param domain the domain to set
     */
        @XmlElement(name="domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
        @XmlElement(name="userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the cases
     */
    public Cases getCases() {
        return cases;
    }

    /**
     * @param cases the cases to set
     */
        @XmlElement(name="Cases")
    public void setCases(Cases cases) {
        this.cases = cases;
    }
        
        
        


    
}