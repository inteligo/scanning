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
public class tblTransferencia {
     	
	private String EsAutomaticoTransferOC;
                   private tblTransferenciaOC tbltransferenciaoc;

    /**
     * @return the EsAutomaticoTransferOC
     */
    public String getEsAutomaticoTransferOC() {
        return EsAutomaticoTransferOC;
    }

    /**
     * @param EsAutomaticoTransferOC the EsAutomaticoTransferOC to set
     */
        @XmlElement(name="EsAutomaticoTransferOC")
    public void setEsAutomaticoTransferOC(String EsAutomaticoTransferOC) {
        this.EsAutomaticoTransferOC = EsAutomaticoTransferOC;
    }

    /**
     * @return the tbltransferenciaoc
     */
    public tblTransferenciaOC getTbltransferenciaoc() {
        return tbltransferenciaoc;
    }

    /**
     * @param tbltransferenciaoc the tbltransferenciaoc to set
     */
    @XmlElement(name="tblTransferenciaOC")
    public void setTbltransferenciaoc(tblTransferenciaOC tbltransferenciaoc) {
        this.tbltransferenciaoc = tbltransferenciaoc;
    }
                   
                   
}