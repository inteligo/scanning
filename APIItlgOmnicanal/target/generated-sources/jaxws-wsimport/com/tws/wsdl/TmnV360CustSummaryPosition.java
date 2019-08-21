
package com.tws.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TmnV360CustSummaryPosition complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TmnV360CustSummaryPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebRequestCommon" type="{T24WebServicesImpl}webRequestCommon" minOccurs="0"/>
 *         &lt;element name="BRINTBASSETLISTType" type="{T24WebServicesImpl}enquiryInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TmnV360CustSummaryPosition", propOrder = {
    "webRequestCommon",
    "brintbassetlistType"
})
public class TmnV360CustSummaryPosition {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "BRINTBASSETLISTType")
    protected EnquiryInput brintbassetlistType;

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
     * Obtiene el valor de la propiedad brintbassetlistType.
     * 
     * @return
     *     possible object is
     *     {@link EnquiryInput }
     *     
     */
    public EnquiryInput getBRINTBASSETLISTType() {
        return brintbassetlistType;
    }

    /**
     * Define el valor de la propiedad brintbassetlistType.
     * 
     * @param value
     *     allowed object is
     *     {@link EnquiryInput }
     *     
     */
    public void setBRINTBASSETLISTType(EnquiryInput value) {
        this.brintbassetlistType = value;
    }

}
