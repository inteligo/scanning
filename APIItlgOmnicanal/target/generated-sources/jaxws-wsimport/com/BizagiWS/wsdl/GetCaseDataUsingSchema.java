
package com.BizagiWS.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlMixed;
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
 *         &lt;element name="xsd" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "xsd"
})
@XmlRootElement(name = "getCaseDataUsingSchema")
public class GetCaseDataUsingSchema {

    protected String idCase;
    protected String idWorkItem;
    protected GetCaseDataUsingSchema.Xsd xsd;

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
     * Obtiene el valor de la propiedad xsd.
     * 
     * @return
     *     possible object is
     *     {@link GetCaseDataUsingSchema.Xsd }
     *     
     */
    public GetCaseDataUsingSchema.Xsd getXsd() {
        return xsd;
    }

    /**
     * Define el valor de la propiedad xsd.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCaseDataUsingSchema.Xsd }
     *     
     */
    public void setXsd(GetCaseDataUsingSchema.Xsd value) {
        this.xsd = value;
    }


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
     *         &lt;any/>
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
        "content"
    })
    public static class Xsd {

        @XmlMixed
        @XmlAnyElement(lax = true)
        protected List<Object> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link String }
         * 
         * 
         */
        public List<Object> getContent() {
            if (content == null) {
                content = new ArrayList<Object>();
            }
            return this.content;
        }

    }

}
