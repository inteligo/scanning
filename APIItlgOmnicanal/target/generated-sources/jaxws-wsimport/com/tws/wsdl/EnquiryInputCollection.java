
package com.tws.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para enquiryInputCollection complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="enquiryInputCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="criteriaValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enquiryInputCollection", propOrder = {
    "columnName",
    "criteriaValue",
    "operand"
})
public class EnquiryInputCollection {

    protected String columnName;
    protected String criteriaValue;
    protected String operand;

    /**
     * Obtiene el valor de la propiedad columnName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Define el valor de la propiedad columnName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnName(String value) {
        this.columnName = value;
    }

    /**
     * Obtiene el valor de la propiedad criteriaValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteriaValue() {
        return criteriaValue;
    }

    /**
     * Define el valor de la propiedad criteriaValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteriaValue(String value) {
        this.criteriaValue = value;
    }

    /**
     * Obtiene el valor de la propiedad operand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperand() {
        return operand;
    }

    /**
     * Define el valor de la propiedad operand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperand(String value) {
        this.operand = value;
    }

}
