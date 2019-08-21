
package com.tws.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para callOfs complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="callOfs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfsRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callOfs", propOrder = {
    "ofsRequest"
})
public class CallOfs {

    @XmlElement(name = "OfsRequest")
    protected String ofsRequest;

    /**
     * Obtiene el valor de la propiedad ofsRequest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfsRequest() {
        return ofsRequest;
    }

    /**
     * Define el valor de la propiedad ofsRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfsRequest(String value) {
        this.ofsRequest = value;
    }

}
