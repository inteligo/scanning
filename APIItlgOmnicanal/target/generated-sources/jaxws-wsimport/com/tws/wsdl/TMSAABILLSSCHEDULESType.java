
package com.tws.wsdl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TMSAABILLSSCHEDULESType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMSAABILLSSCHEDULESType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gTMSAABILLSSCHEDULESDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mTMSAABILLSSCHEDULESDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TotalDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TotalCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Charge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Interest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TotalPymt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Principal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TotalPrincipalInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Outstanding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BillReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BillAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BillOutstandingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BillStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BillStatusDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
@XmlType(name = "TMSAABILLSSCHEDULESType", propOrder = {
    "gtmsaabillsschedulesDetailType"
})
public class TMSAABILLSSCHEDULESType {

    @XmlElement(name = "gTMSAABILLSSCHEDULESDetailType")
    protected TMSAABILLSSCHEDULESType.GTMSAABILLSSCHEDULESDetailType gtmsaabillsschedulesDetailType;

    /**
     * Obtiene el valor de la propiedad gtmsaabillsschedulesDetailType.
     * 
     * @return
     *     possible object is
     *     {@link TMSAABILLSSCHEDULESType.GTMSAABILLSSCHEDULESDetailType }
     *     
     */
    public TMSAABILLSSCHEDULESType.GTMSAABILLSSCHEDULESDetailType getGTMSAABILLSSCHEDULESDetailType() {
        return gtmsaabillsschedulesDetailType;
    }

    /**
     * Define el valor de la propiedad gtmsaabillsschedulesDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSAABILLSSCHEDULESType.GTMSAABILLSSCHEDULESDetailType }
     *     
     */
    public void setGTMSAABILLSSCHEDULESDetailType(TMSAABILLSSCHEDULESType.GTMSAABILLSSCHEDULESDetailType value) {
        this.gtmsaabillsschedulesDetailType = value;
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
     *         &lt;element name="mTMSAABILLSSCHEDULESDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TotalDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TotalCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Charge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Interest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TotalPymt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Principal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TotalPrincipalInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Outstanding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BillReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BillAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BillOutstandingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BillStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BillStatusDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mtmsaabillsschedulesDetailType"
    })
    public static class GTMSAABILLSSCHEDULESDetailType {

        @XmlElement(name = "mTMSAABILLSSCHEDULESDetailType")
        protected List<TMSAABILLSSCHEDULESType.GTMSAABILLSSCHEDULESDetailType.MTMSAABILLSSCHEDULESDetailType> mtmsaabillsschedulesDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mtmsaabillsschedulesDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtmsaabillsschedulesDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTMSAABILLSSCHEDULESDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TMSAABILLSSCHEDULESType.GTMSAABILLSSCHEDULESDetailType.MTMSAABILLSSCHEDULESDetailType }
         * 
         * 
         */
        public List<TMSAABILLSSCHEDULESType.GTMSAABILLSSCHEDULESDetailType.MTMSAABILLSSCHEDULESDetailType> getMTMSAABILLSSCHEDULESDetailType() {
            if (mtmsaabillsschedulesDetailType == null) {
                mtmsaabillsschedulesDetailType = new ArrayList<TMSAABILLSSCHEDULESType.GTMSAABILLSSCHEDULESDetailType.MTMSAABILLSSCHEDULESDetailType>();
            }
            return this.mtmsaabillsschedulesDetailType;
        }

        /**
         * Obtiene el valor de la propiedad g.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getG() {
            return g;
        }

        /**
         * Define el valor de la propiedad g.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setG(BigInteger value) {
            this.g = value;
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
         *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TotalDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TotalCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Charge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Interest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TotalPymt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Principal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TotalPrincipalInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Outstanding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BillReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BillAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BillOutstandingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BillStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BillStatusDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "title",
            "paymentDate",
            "totalDue",
            "totalCap",
            "charge",
            "interest",
            "tax",
            "totalPymt",
            "principal",
            "totalPrincipalInterest",
            "outstanding",
            "billReference",
            "dueDate",
            "billType",
            "billAmount",
            "billOutstandingAmount",
            "billStatus",
            "billStatusDate"
        })
        public static class MTMSAABILLSSCHEDULESDetailType {

            @XmlElement(name = "TITLE")
            protected String title;
            @XmlElement(name = "PaymentDate")
            protected String paymentDate;
            @XmlElement(name = "TotalDue")
            protected String totalDue;
            @XmlElement(name = "TotalCap")
            protected String totalCap;
            @XmlElement(name = "Charge")
            protected String charge;
            @XmlElement(name = "Interest")
            protected String interest;
            @XmlElement(name = "Tax")
            protected String tax;
            @XmlElement(name = "TotalPymt")
            protected String totalPymt;
            @XmlElement(name = "Principal")
            protected String principal;
            @XmlElement(name = "TotalPrincipalInterest")
            protected String totalPrincipalInterest;
            @XmlElement(name = "Outstanding")
            protected String outstanding;
            @XmlElement(name = "BillReference")
            protected String billReference;
            @XmlElement(name = "DueDate")
            protected String dueDate;
            @XmlElement(name = "BillType")
            protected String billType;
            @XmlElement(name = "BillAmount")
            protected String billAmount;
            @XmlElement(name = "BillOutstandingAmount")
            protected String billOutstandingAmount;
            @XmlElement(name = "BillStatus")
            protected String billStatus;
            @XmlElement(name = "BillStatusDate")
            protected String billStatusDate;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad title.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTITLE() {
                return title;
            }

            /**
             * Define el valor de la propiedad title.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTITLE(String value) {
                this.title = value;
            }

            /**
             * Obtiene el valor de la propiedad paymentDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentDate() {
                return paymentDate;
            }

            /**
             * Define el valor de la propiedad paymentDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentDate(String value) {
                this.paymentDate = value;
            }

            /**
             * Obtiene el valor de la propiedad totalDue.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalDue() {
                return totalDue;
            }

            /**
             * Define el valor de la propiedad totalDue.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalDue(String value) {
                this.totalDue = value;
            }

            /**
             * Obtiene el valor de la propiedad totalCap.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalCap() {
                return totalCap;
            }

            /**
             * Define el valor de la propiedad totalCap.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalCap(String value) {
                this.totalCap = value;
            }

            /**
             * Obtiene el valor de la propiedad charge.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCharge() {
                return charge;
            }

            /**
             * Define el valor de la propiedad charge.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCharge(String value) {
                this.charge = value;
            }

            /**
             * Obtiene el valor de la propiedad interest.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInterest() {
                return interest;
            }

            /**
             * Define el valor de la propiedad interest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInterest(String value) {
                this.interest = value;
            }

            /**
             * Obtiene el valor de la propiedad tax.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTax() {
                return tax;
            }

            /**
             * Define el valor de la propiedad tax.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTax(String value) {
                this.tax = value;
            }

            /**
             * Obtiene el valor de la propiedad totalPymt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalPymt() {
                return totalPymt;
            }

            /**
             * Define el valor de la propiedad totalPymt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalPymt(String value) {
                this.totalPymt = value;
            }

            /**
             * Obtiene el valor de la propiedad principal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrincipal() {
                return principal;
            }

            /**
             * Define el valor de la propiedad principal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrincipal(String value) {
                this.principal = value;
            }

            /**
             * Obtiene el valor de la propiedad totalPrincipalInterest.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalPrincipalInterest() {
                return totalPrincipalInterest;
            }

            /**
             * Define el valor de la propiedad totalPrincipalInterest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalPrincipalInterest(String value) {
                this.totalPrincipalInterest = value;
            }

            /**
             * Obtiene el valor de la propiedad outstanding.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOutstanding() {
                return outstanding;
            }

            /**
             * Define el valor de la propiedad outstanding.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOutstanding(String value) {
                this.outstanding = value;
            }

            /**
             * Obtiene el valor de la propiedad billReference.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBillReference() {
                return billReference;
            }

            /**
             * Define el valor de la propiedad billReference.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBillReference(String value) {
                this.billReference = value;
            }

            /**
             * Obtiene el valor de la propiedad dueDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDueDate() {
                return dueDate;
            }

            /**
             * Define el valor de la propiedad dueDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDueDate(String value) {
                this.dueDate = value;
            }

            /**
             * Obtiene el valor de la propiedad billType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBillType() {
                return billType;
            }

            /**
             * Define el valor de la propiedad billType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBillType(String value) {
                this.billType = value;
            }

            /**
             * Obtiene el valor de la propiedad billAmount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBillAmount() {
                return billAmount;
            }

            /**
             * Define el valor de la propiedad billAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBillAmount(String value) {
                this.billAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad billOutstandingAmount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBillOutstandingAmount() {
                return billOutstandingAmount;
            }

            /**
             * Define el valor de la propiedad billOutstandingAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBillOutstandingAmount(String value) {
                this.billOutstandingAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad billStatus.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBillStatus() {
                return billStatus;
            }

            /**
             * Define el valor de la propiedad billStatus.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBillStatus(String value) {
                this.billStatus = value;
            }

            /**
             * Obtiene el valor de la propiedad billStatusDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBillStatusDate() {
                return billStatusDate;
            }

            /**
             * Define el valor de la propiedad billStatusDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBillStatusDate(String value) {
                this.billStatusDate = value;
            }

            /**
             * Obtiene el valor de la propiedad m.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getM() {
                return m;
            }

            /**
             * Define el valor de la propiedad m.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setM(BigInteger value) {
                this.m = value;
            }

        }

    }

}
