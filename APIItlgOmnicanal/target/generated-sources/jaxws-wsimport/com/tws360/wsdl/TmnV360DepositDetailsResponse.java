
package com.tws360.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TmnV360DepositDetailsResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TmnV360DepositDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{T24WebServicesImpl}Status" minOccurs="0"/>
 *         &lt;element name="BRINTLDEPODETType" type="{T24WebServicesImpl}BRINTLDEPODETType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TmnV360DepositDetailsResponse", propOrder = {
    "status",
    "brintldepodetType"
})
public class TmnV360DepositDetailsResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "BRINTLDEPODETType")
    protected List<BRINTLDEPODETType> brintldepodetType;

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
     * Gets the value of the brintldepodetType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brintldepodetType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBRINTLDEPODETType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BRINTLDEPODETType }
     * 
     * 
     */
    public List<BRINTLDEPODETType> getBRINTLDEPODETType() {
        if (brintldepodetType == null) {
            brintldepodetType = new ArrayList<BRINTLDEPODETType>();
        }
        return this.brintldepodetType;
    }

}
