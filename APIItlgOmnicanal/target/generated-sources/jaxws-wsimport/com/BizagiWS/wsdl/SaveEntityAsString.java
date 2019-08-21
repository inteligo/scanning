
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
 *         &lt;element name="entityInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "entityInfo"
})
@XmlRootElement(name = "saveEntityAsString")
public class SaveEntityAsString {

    protected String entityInfo;

    /**
     * Obtiene el valor de la propiedad entityInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityInfo() {
        return entityInfo;
    }

    /**
     * Define el valor de la propiedad entityInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityInfo(String value) {
        this.entityInfo = value;
    }

}
