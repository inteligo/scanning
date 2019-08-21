/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bzg.services.input;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
//@XmlType(propOrder={"ibaguid", "functioncode", "channel","agentId","customerNo","portfolioNo"})
//propOrder={"company", "scheme", "agreementNumber"})
public class Cases {

        private Case cases;

    /**
     * @return the cases
     */
    public Case getCases() {
        return cases;
    }

    /**
     * @param cases the cases to set
     */
        @XmlElement(name="Case")
    public void setCases(Case cases) {
        this.cases = cases;
    }
        
        
        
      	
	
}