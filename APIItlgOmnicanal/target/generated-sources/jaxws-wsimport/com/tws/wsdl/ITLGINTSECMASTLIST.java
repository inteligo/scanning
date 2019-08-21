
package com.tws.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ITLGINTSECMASTLIST complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ITLGINTSECMASTLIST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebRequestCommon" type="{T24WebServicesImpl}webRequestCommon" minOccurs="0"/>
 *         &lt;element name="ITLGINTSECMASTLISTType" type="{T24WebServicesImpl}enquiryInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ITLGINTSECMASTLIST", propOrder = {
    "webRequestCommon",
    "itlgintsecmastlistType"
})
public class ITLGINTSECMASTLIST {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "ITLGINTSECMASTLISTType")
    protected EnquiryInput itlgintsecmastlistType;

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
     * Obtiene el valor de la propiedad itlgintsecmastlistType.
     * 
     * @return
     *     possible object is
     *     {@link EnquiryInput }
     *     
     */
    public EnquiryInput getITLGINTSECMASTLISTType() {
        return itlgintsecmastlistType;
    }

    /**
     * Define el valor de la propiedad itlgintsecmastlistType.
     * 
     * @param value
     *     allowed object is
     *     {@link EnquiryInput }
     *     
     */
    public void setITLGINTSECMASTLISTType(EnquiryInput value) {
        this.itlgintsecmastlistType = value;
    }

}
