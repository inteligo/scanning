
package com.BizagiWS.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="idCase" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sxsd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idCase",
    "sxsd"
})
@XmlRootElement(name = "getCaseDataUsingSchemaLiteAsString")
public class GetCaseDataUsingSchemaLiteAsString {

    protected int idCase;
    protected String sxsd;

    /**
     * Obtiene el valor de la propiedad idCase.
     * 
     */
    public int getIdCase() {
        return idCase;
    }

    /**
     * Define el valor de la propiedad idCase.
     * 
     */
    public void setIdCase(int value) {
        this.idCase = value;
    }

    /**
     * Obtiene el valor de la propiedad sxsd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSxsd() {
        return sxsd;
    }

    /**
     * Define el valor de la propiedad sxsd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSxsd(String value) {
        this.sxsd = value;
    }

}
