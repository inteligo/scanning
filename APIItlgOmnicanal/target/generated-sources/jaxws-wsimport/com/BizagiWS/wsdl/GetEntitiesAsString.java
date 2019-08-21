
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
 *         &lt;element name="entitiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "entitiesInfo"
})
@XmlRootElement(name = "getEntitiesAsString")
public class GetEntitiesAsString {

    protected String entitiesInfo;

    /**
     * Obtiene el valor de la propiedad entitiesInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitiesInfo() {
        return entitiesInfo;
    }

    /**
     * Define el valor de la propiedad entitiesInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitiesInfo(String value) {
        this.entitiesInfo = value;
    }

}
