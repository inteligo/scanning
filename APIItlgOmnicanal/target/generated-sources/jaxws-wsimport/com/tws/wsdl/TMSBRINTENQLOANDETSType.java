
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
 * <p>Clase Java para TMSBRINTENQLOANDETSType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMSBRINTENQLOANDETSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gTMSBRINTENQLOANDETSDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mTMSBRINTENQLOANDETSDetailType" maxOccurs="unbounded" minOccurs="0">
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
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccountOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccountReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DisburseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SignRelation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SignCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ClientType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RelationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ItlgCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "TMSBRINTENQLOANDETSType", propOrder = {
    "gtmsbrintenqloandetsDetailType"
})
public class TMSBRINTENQLOANDETSType {

    @XmlElement(name = "gTMSBRINTENQLOANDETSDetailType")
    protected TMSBRINTENQLOANDETSType.GTMSBRINTENQLOANDETSDetailType gtmsbrintenqloandetsDetailType;

    /**
     * Obtiene el valor de la propiedad gtmsbrintenqloandetsDetailType.
     * 
     * @return
     *     possible object is
     *     {@link TMSBRINTENQLOANDETSType.GTMSBRINTENQLOANDETSDetailType }
     *     
     */
    public TMSBRINTENQLOANDETSType.GTMSBRINTENQLOANDETSDetailType getGTMSBRINTENQLOANDETSDetailType() {
        return gtmsbrintenqloandetsDetailType;
    }

    /**
     * Define el valor de la propiedad gtmsbrintenqloandetsDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSBRINTENQLOANDETSType.GTMSBRINTENQLOANDETSDetailType }
     *     
     */
    public void setGTMSBRINTENQLOANDETSDetailType(TMSBRINTENQLOANDETSType.GTMSBRINTENQLOANDETSDetailType value) {
        this.gtmsbrintenqloandetsDetailType = value;
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
     *         &lt;element name="mTMSBRINTENQLOANDETSDetailType" maxOccurs="unbounded" minOccurs="0">
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
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccountOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccountReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DisburseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SignRelation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SignCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ClientType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RelationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ItlgCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mtmsbrintenqloandetsDetailType"
    })
    public static class GTMSBRINTENQLOANDETSDetailType {

        @XmlElement(name = "mTMSBRINTENQLOANDETSDetailType")
        protected List<TMSBRINTENQLOANDETSType.GTMSBRINTENQLOANDETSDetailType.MTMSBRINTENQLOANDETSDetailType> mtmsbrintenqloandetsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mtmsbrintenqloandetsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtmsbrintenqloandetsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTMSBRINTENQLOANDETSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TMSBRINTENQLOANDETSType.GTMSBRINTENQLOANDETSDetailType.MTMSBRINTENQLOANDETSDetailType }
         * 
         * 
         */
        public List<TMSBRINTENQLOANDETSType.GTMSBRINTENQLOANDETSDetailType.MTMSBRINTENQLOANDETSDetailType> getMTMSBRINTENQLOANDETSDetailType() {
            if (mtmsbrintenqloandetsDetailType == null) {
                mtmsbrintenqloandetsDetailType = new ArrayList<TMSBRINTENQLOANDETSType.GTMSBRINTENQLOANDETSDetailType.MTMSBRINTENQLOANDETSDetailType>();
            }
            return this.mtmsbrintenqloandetsDetailType;
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
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccountOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccountReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DisburseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SignRelation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SignCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ClientType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RelationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ItlgCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "id",
            "accountOfficer",
            "accountReference",
            "disburseAcct",
            "signRelation",
            "signCondition",
            "clientType",
            "cliente",
            "relationCode",
            "itlgCustType"
        })
        public static class MTMSBRINTENQLOANDETSDetailType {

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
            @XmlElement(name = "ID")
            protected String id;
            @XmlElement(name = "AccountOfficer")
            protected String accountOfficer;
            @XmlElement(name = "AccountReference")
            protected String accountReference;
            @XmlElement(name = "DisburseAcct")
            protected String disburseAcct;
            @XmlElement(name = "SignRelation")
            protected String signRelation;
            @XmlElement(name = "SignCondition")
            protected String signCondition;
            @XmlElement(name = "ClientType")
            protected String clientType;
            @XmlElement(name = "Cliente")
            protected String cliente;
            @XmlElement(name = "RelationCode")
            protected String relationCode;
            @XmlElement(name = "ItlgCustType")
            protected String itlgCustType;
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
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
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
             * Obtiene el valor de la propiedad disburseAcct.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisburseAcct() {
                return disburseAcct;
            }

            /**
             * Define el valor de la propiedad disburseAcct.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisburseAcct(String value) {
                this.disburseAcct = value;
            }

            /**
             * Obtiene el valor de la propiedad signRelation.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSignRelation() {
                return signRelation;
            }

            /**
             * Define el valor de la propiedad signRelation.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSignRelation(String value) {
                this.signRelation = value;
            }

            /**
             * Obtiene el valor de la propiedad signCondition.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSignCondition() {
                return signCondition;
            }

            /**
             * Define el valor de la propiedad signCondition.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSignCondition(String value) {
                this.signCondition = value;
            }

            /**
             * Obtiene el valor de la propiedad clientType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClientType() {
                return clientType;
            }

            /**
             * Define el valor de la propiedad clientType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClientType(String value) {
                this.clientType = value;
            }

            /**
             * Obtiene el valor de la propiedad cliente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCliente() {
                return cliente;
            }

            /**
             * Define el valor de la propiedad cliente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCliente(String value) {
                this.cliente = value;
            }

            /**
             * Obtiene el valor de la propiedad relationCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelationCode() {
                return relationCode;
            }

            /**
             * Define el valor de la propiedad relationCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelationCode(String value) {
                this.relationCode = value;
            }

            /**
             * Obtiene el valor de la propiedad itlgCustType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItlgCustType() {
                return itlgCustType;
            }

            /**
             * Define el valor de la propiedad itlgCustType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItlgCustType(String value) {
                this.itlgCustType = value;
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
