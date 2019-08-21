
package com.tws.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TmnV360PortfolioDetailsResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TmnV360PortfolioDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{T24WebServicesImpl}Status" minOccurs="0"/>
 *         &lt;element name="BRINTBPORTDETType" type="{T24WebServicesImpl}BRINTBPORTDETType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TmnV360PortfolioDetailsResponse", propOrder = {
    "status",
    "brintbportdetType"
})
public class TmnV360PortfolioDetailsResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "BRINTBPORTDETType")
    protected List<BRINTBPORTDETType> brintbportdetType;

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the brintbportdetType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brintbportdetType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBRINTBPORTDETType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BRINTBPORTDETType }
     * 
     * 
     */
    public List<BRINTBPORTDETType> getBRINTBPORTDETType() {
        if (brintbportdetType == null) {
            brintbportdetType = new ArrayList<BRINTBPORTDETType>();
        }
        return this.brintbportdetType;
    }

}
