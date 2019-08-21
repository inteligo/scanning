
package com.Bizagi.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegistrarTransferenciaResult" type="{http://schemas.datacontract.org/2004/07/WcfRegistroTransfe}Response" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registrarTransferenciaResult"
})
@XmlRootElement(name = "RegistrarTransferenciaResponse")
public class RegistrarTransferenciaResponse {

    @XmlElementRef(name = "RegistrarTransferenciaResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Response> registrarTransferenciaResult;

    /**
     * Obtiene el valor de la propiedad registrarTransferenciaResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Response }{@code >}
     *     
     */
    public JAXBElement<Response> getRegistrarTransferenciaResult() {
        return registrarTransferenciaResult;
    }

    /**
     * Define el valor de la propiedad registrarTransferenciaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Response }{@code >}
     *     
     */
    public void setRegistrarTransferenciaResult(JAXBElement<Response> value) {
        this.registrarTransferenciaResult = value;
    }

}
