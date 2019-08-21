
package com.tws.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TMSBRINTENQLOANDETS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMSBRINTENQLOANDETS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebRequestCommon" type="{T24WebServicesImpl}webRequestCommon" minOccurs="0"/>
 *         &lt;element name="TMSBRINTENQLOANDETSType" type="{T24WebServicesImpl}enquiryInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMSBRINTENQLOANDETS", propOrder = {
    "webRequestCommon",
    "tmsbrintenqloandetsType"
})
public class TMSBRINTENQLOANDETS {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "TMSBRINTENQLOANDETSType")
    protected EnquiryInput tmsbrintenqloandetsType;

    /**
     * Obtiene el valor de la propiedad webRequestCommon.
     * 
     * @return
     *     possible object is
     *     {@link WebRequestCommon }
     *     
     */
    public WebRequestCommon getWebRequestCommon() {
        return webRequestCommon;
    }

    /**
     * Define el valor de la propiedad webRequestCommon.
     * 
     * @param value
     *     allowed object is
     *     {@link WebRequestCommon }
     *     
     */
    public void setWebRequestCommon(WebRequestCommon value) {
        this.webRequestCommon = value;
    }

    /**
     * Obtiene el valor de la propiedad tmsbrintenqloandetsType.
     * 
     * @return
     *     possible object is
     *     {@link EnquiryInput }
     *     
     */
    public EnquiryInput getTMSBRINTENQLOANDETSType() {
        return tmsbrintenqloandetsType;
    }

    /**
     * Define el valor de la propiedad tmsbrintenqloandetsType.
     * 
     * @param value
     *     allowed object is
     *     {@link EnquiryInput }
     *     
     */
    public void setTMSBRINTENQLOANDETSType(EnquiryInput value) {
        this.tmsbrintenqloandetsType = value;
    }

}
