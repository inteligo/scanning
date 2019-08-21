package com.bzg.services.input;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="RegistrarTransferenciaResult")
//@XmlType(propOrder={"ibaguid", "functioncode", "channel","agentId","customerNo","portfolioNo"})
//propOrder={"company", "scheme", "agreementNumber"})
public class RegistrarTransferenciaResult {
    private String ErrorCode;
    private String ErrorMessage;
    private String Respuesta;

    /**
     * @return the ErrorCode
     */
    public String getErrorCode() {
        return ErrorCode;
    }

    /**
     * @param ErrorCode the ErrorCode to set
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * @return the ErrorMessage
     */
    public String getErrorMessage() {
        return ErrorMessage;
    }

    /**
     * @param ErrorMessage the ErrorMessage to set
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * @return the Respuesta
     */
    public String getRespuesta() {
        return Respuesta;
    }

    /**
     * @param Respuesta the Respuesta to set
     */
    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }

   
     	
	
}