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
public class Entities {
     
        private tblTransferencia tbltransferencia;

    /**
     * @return the tbltransferencia
     */
    public tblTransferencia getTbltransferencia() {
        return tbltransferencia;
    }

    /**
     * @param tbltransferencia the tbltransferencia to set
     */
    @XmlElement(name="tblTransferencia")
    public void setTbltransferencia(tblTransferencia tbltransferencia) {
        this.tbltransferencia = tbltransferencia;
    }
        
	
}