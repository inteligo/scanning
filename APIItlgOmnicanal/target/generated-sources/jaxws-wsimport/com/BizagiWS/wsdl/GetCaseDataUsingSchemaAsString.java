
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
 *         &lt;element name="idCase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idWorkItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idWorkItem",
    "sxsd"
})
@XmlRootElement(name = "getCaseDataUsingSchemaAsString")
public class GetCaseDataUsingSchemaAsString {

    protected String idCase;
    protected String idWorkItem;
    protected String sxsd;

    /**
     * Obtiene el valor de la propiedad idCase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCase() {
        return idCase;
    }

    /**
     * Define el valor de la propiedad idCase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCase(String value) {
        this.idCase = value;
    }

    /**
     * Obtiene el valor de la propiedad idWorkItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdWorkItem() {
        return idWorkItem;
    }

    /**
     * Define el valor de la propiedad idWorkItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdWorkItem(String value) {
        this.idWorkItem = value;
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
