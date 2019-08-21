
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
 * <p>Clase Java para TMSBRINTENQLOANDETAILSType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMSBRINTENQLOANDETAILSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gTMSBRINTENQLOANDETAILSDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mTMSBRINTENQLOANDETAILSDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LoanNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DisbursementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CreditAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NextPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FrequencyCapitalInterests" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccruedInterests" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ArrangementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccountOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccountReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DisburseAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "TMSBRINTENQLOANDETAILSType", propOrder = {
    "gtmsbrintenqloandetailsDetailType"
})
public class TMSBRINTENQLOANDETAILSType {

    @XmlElement(name = "gTMSBRINTENQLOANDETAILSDetailType")
    protected TMSBRINTENQLOANDETAILSType.GTMSBRINTENQLOANDETAILSDetailType gtmsbrintenqloandetailsDetailType;

    /**
     * Obtiene el valor de la propiedad gtmsbrintenqloandetailsDetailType.
     * 
     * @return
     *     possible object is
     *     {@link TMSBRINTENQLOANDETAILSType.GTMSBRINTENQLOANDETAILSDetailType }
     *     
     */
    public TMSBRINTENQLOANDETAILSType.GTMSBRINTENQLOANDETAILSDetailType getGTMSBRINTENQLOANDETAILSDetailType() {
        return gtmsbrintenqloandetailsDetailType;
    }

    /**
     * Define el valor de la propiedad gtmsbrintenqloandetailsDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSBRINTENQLOANDETAILSType.GTMSBRINTENQLOANDETAILSDetailType }
     *     
     */
    public void setGTMSBRINTENQLOANDETAILSDetailType(TMSBRINTENQLOANDETAILSType.GTMSBRINTENQLOANDETAILSDetailType value) {
        this.gtmsbrintenqloandetailsDetailType = value;
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
     *         &lt;element name="mTMSBRINTENQLOANDETAILSDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LoanNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DisbursementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CreditAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NextPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FrequencyCapitalInterests" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccruedInterests" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ArrangementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccountOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccountReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DisburseAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mtmsbrintenqloandetailsDetailType"
    })
    public static class GTMSBRINTENQLOANDETAILSDetailType {

        @XmlElement(name = "mTMSBRINTENQLOANDETAILSDetailType")
        protected List<TMSBRINTENQLOANDETAILSType.GTMSBRINTENQLOANDETAILSDetailType.MTMSBRINTENQLOANDETAILSDetailType> mtmsbrintenqloandetailsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mtmsbrintenqloandetailsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtmsbrintenqloandetailsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTMSBRINTENQLOANDETAILSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TMSBRINTENQLOANDETAILSType.GTMSBRINTENQLOANDETAILSDetailType.MTMSBRINTENQLOANDETAILSDetailType }
         * 
         * 
         */
        public List<TMSBRINTENQLOANDETAILSType.GTMSBRINTENQLOANDETAILSDetailType.MTMSBRINTENQLOANDETAILSDetailType> getMTMSBRINTENQLOANDETAILSDetailType() {
            if (mtmsbrintenqloandetailsDetailType == null) {
                mtmsbrintenqloandetailsDetailType = new ArrayList<TMSBRINTENQLOANDETAILSType.GTMSBRINTENQLOANDETAILSDetailType.MTMSBRINTENQLOANDETAILSDetailType>();
            }
            return this.mtmsbrintenqloandetailsDetailType;
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
         *         &lt;element name="LoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LoanNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DisbursementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CreditAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NextPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FrequencyCapitalInterests" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccruedInterests" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ArrangementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccountOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccountReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DisburseAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "loanType",
            "loanNumber",
            "disbursementDate",
            "creditAmount",
            "rate",
            "balance",
            "nextPayment",
            "nextPaymentDate",
            "maturityDate",
            "frequencyCapitalInterests",
            "accruedInterests",
            "currency",
            "arrangementId",
            "customerId",
            "accountOfficer",
            "accountReference",
            "disburseAccount"
        })
        public static class MTMSBRINTENQLOANDETAILSDetailType {

            @XmlElement(name = "LoanType")
            protected String loanType;
            @XmlElement(name = "LoanNumber")
            protected String loanNumber;
            @XmlElement(name = "DisbursementDate")
            protected String disbursementDate;
            @XmlElement(name = "CreditAmount")
            protected String creditAmount;
            @XmlElement(name = "Rate")
            protected String rate;
            @XmlElement(name = "Balance")
            protected String balance;
            @XmlElement(name = "NextPayment")
            protected String nextPayment;
            @XmlElement(name = "NextPaymentDate")
            protected String nextPaymentDate;
            @XmlElement(name = "MaturityDate")
            protected String maturityDate;
            @XmlElement(name = "FrequencyCapitalInterests")
            protected String frequencyCapitalInterests;
            @XmlElement(name = "AccruedInterests")
            protected String accruedInterests;
            @XmlElement(name = "Currency")
            protected String currency;
            @XmlElement(name = "ArrangementId")
            protected String arrangementId;
            @XmlElement(name = "CustomerId")
            protected String customerId;
            @XmlElement(name = "AccountOfficer")
            protected String accountOfficer;
            @XmlElement(name = "AccountReference")
            protected String accountReference;
            @XmlElement(name = "DisburseAccount")
            protected String disburseAccount;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad loanType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLoanType() {
                return loanType;
            }

            /**
             * Define el valor de la propiedad loanType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLoanType(String value) {
                this.loanType = value;
            }

            /**
             * Obtiene el valor de la propiedad loanNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLoanNumber() {
                return loanNumber;
            }

            /**
             * Define el valor de la propiedad loanNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLoanNumber(String value) {
                this.loanNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad disbursementDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisbursementDate() {
                return disbursementDate;
            }

            /**
             * Define el valor de la propiedad disbursementDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisbursementDate(String value) {
                this.disbursementDate = value;
            }

            /**
             * Obtiene el valor de la propiedad creditAmount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreditAmount() {
                return creditAmount;
            }

            /**
             * Define el valor de la propiedad creditAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreditAmount(String value) {
                this.creditAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad rate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRate() {
                return rate;
            }

            /**
             * Define el valor de la propiedad rate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRate(String value) {
                this.rate = value;
            }

            /**
             * Obtiene el valor de la propiedad balance.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBalance() {
                return balance;
            }

            /**
             * Define el valor de la propiedad balance.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBalance(String value) {
                this.balance = value;
            }

            /**
             * Obtiene el valor de la propiedad nextPayment.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNextPayment() {
                return nextPayment;
            }

            /**
             * Define el valor de la propiedad nextPayment.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNextPayment(String value) {
                this.nextPayment = value;
            }

            /**
             * Obtiene el valor de la propiedad nextPaymentDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNextPaymentDate() {
                return nextPaymentDate;
            }

            /**
             * Define el valor de la propiedad nextPaymentDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNextPaymentDate(String value) {
                this.nextPaymentDate = value;
            }

            /**
             * Obtiene el valor de la propiedad maturityDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaturityDate() {
                return maturityDate;
            }

            /**
             * Define el valor de la propiedad maturityDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaturityDate(String value) {
                this.maturityDate = value;
            }

            /**
             * Obtiene el valor de la propiedad frequencyCapitalInterests.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrequencyCapitalInterests() {
                return frequencyCapitalInterests;
            }

            /**
             * Define el valor de la propiedad frequencyCapitalInterests.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrequencyCapitalInterests(String value) {
                this.frequencyCapitalInterests = value;
            }

            /**
             * Obtiene el valor de la propiedad accruedInterests.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccruedInterests() {
                return accruedInterests;
            }

            /**
             * Define el valor de la propiedad accruedInterests.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccruedInterests(String value) {
                this.accruedInterests = value;
            }

            /**
             * Obtiene el valor de la propiedad currency.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrency() {
                return currency;
            }

            /**
             * Define el valor de la propiedad currency.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrency(String value) {
                this.currency = value;
            }

            /**
             * Obtiene el valor de la propiedad arrangementId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArrangementId() {
                return arrangementId;
            }

            /**
             * Define el valor de la propiedad arrangementId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArrangementId(String value) {
                this.arrangementId = value;
            }

            /**
             * Obtiene el valor de la propiedad customerId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerId() {
                return customerId;
            }

            /**
             * Define el valor de la propiedad customerId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerId(String value) {
                this.customerId = value;
            }

            /**
             * Obtiene el valor de la propiedad accountOfficer.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountOfficer() {
                return accountOfficer;
            }

            /**
             * Define el valor de la propiedad accountOfficer.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountOfficer(String value) {
                this.accountOfficer = value;
            }

            /**
             * Obtiene el valor de la propiedad accountReference.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountReference() {
                return accountReference;
            }

            /**
             * Define el valor de la propiedad accountReference.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountReference(String value) {
                this.accountReference = value;
            }

            /**
             * Obtiene el valor de la propiedad disburseAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisburseAccount() {
                return disburseAccount;
            }

            /**
             * Define el valor de la propiedad disburseAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisburseAccount(String value) {
                this.disburseAccount = value;
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
