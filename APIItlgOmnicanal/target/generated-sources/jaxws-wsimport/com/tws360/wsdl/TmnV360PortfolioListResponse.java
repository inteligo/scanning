
package com.tws360.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TmnV360PortfolioListResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TmnV360PortfolioListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{T24WebServicesImpl}Status" minOccurs="0"/>
 *         &lt;element name="BRINTBPORTLISTType" type="{T24WebServicesImpl}BRINTBPORTLISTType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TmnV360PortfolioListResponse", propOrder = {
    "status",
    "brintbportlistType"
})
public class TmnV360PortfolioListResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "BRINTBPORTLISTType")
    protected List<BRINTBPORTLISTType> brintbportlistType;

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
     * Gets the value of the brintbportlistType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brintbportlistType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBRINTBPORTLISTType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BRINTBPORTLISTType }
     * 
     * 
     */
    public List<BRINTBPORTLISTType> getBRINTBPORTLISTType() {
        if (brintbportlistType == null) {
            brintbportlistType = new ArrayList<BRINTBPORTLISTType>();
        }
        return this.brintbportlistType;
    }

}
