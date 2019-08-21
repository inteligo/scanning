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
public class Case {
    private String Process;
    private Entities entities;

    /**
     * @return the Process
     */
    public String getProcess() {
        return Process;
    }

    /**
     * @param Process the Process to set
     */
    @XmlElement(name="Process")
    public void setProcess(String Process) {
        this.Process = Process;
    }

    /**
     * @return the entities
     */
    public Entities getEntities() {
        return entities;
    }

    /**
     * @param entities the entities to set
     */
    @XmlElement(name="Entities")
    public void setEntities(Entities entities) {
        this.entities = entities;
    }
    
    
     	
	
}