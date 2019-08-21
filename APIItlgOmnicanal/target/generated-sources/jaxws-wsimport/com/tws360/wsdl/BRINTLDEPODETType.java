
package com.tws360.wsdl;

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
 * <p>Clase Java para BRINTLDEPODETType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BRINTLDEPODETType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZEROREC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gBRINTLDEPODETDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBRINTLDEPODETDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DepositNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccountingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TermDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InterestFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NextPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccruedInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GuaranteedAccountingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InstructionsatMaturity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BRINTLDEPODETType", propOrder = {
    "zerorec",
    "gbrintldepodetDetailType"
})
public class BRINTLDEPODETType {

    @XmlElement(name = "ZEROREC")
    protected String zerorec;
    @XmlElement(name = "gBRINTLDEPODETDetailType")
    protected BRINTLDEPODETType.GBRINTLDEPODETDetailType gbrintldepodetDetailType;

    /**
     * Obtiene el valor de la propiedad zerorec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEROREC() {
        return zerorec;
    }

    /**
     * Define el valor de la propiedad zerorec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEROREC(String value) {
        this.zerorec = value;
    }

    /**
     * Obtiene el valor de la propiedad gbrintldepodetDetailType.
     * 
     * @return
     *     possible object is
     *     {@link BRINTLDEPODETType.GBRINTLDEPODETDetailType }
     *     
     */
    public BRINTLDEPODETType.GBRINTLDEPODETDetailType getGBRINTLDEPODETDetailType() {
        return gbrintldepodetDetailType;
    }

    /**
     * Define el valor de la propiedad gbrintldepodetDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link BRINTLDEPODETType.GBRINTLDEPODETDetailType }
     *     
     */
    public void setGBRINTLDEPODETDetailType(BRINTLDEPODETType.GBRINTLDEPODETDetailType value) {
        this.gbrintldepodetDetailType = value;
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
     *         &lt;element name="mBRINTLDEPODETDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DepositNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccountingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TermDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InterestFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NextPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccruedInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GuaranteedAccountingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InstructionsatMaturity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbrintldepodetDetailType"
    })
    public static class GBRINTLDEPODETDetailType {

        @XmlElement(name = "mBRINTLDEPODETDetailType")
        protected List<BRINTLDEPODETType.GBRINTLDEPODETDetailType.MBRINTLDEPODETDetailType> mbrintldepodetDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbrintldepodetDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbrintldepodetDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBRINTLDEPODETDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BRINTLDEPODETType.GBRINTLDEPODETDetailType.MBRINTLDEPODETDetailType }
         * 
         * 
         */
        public List<BRINTLDEPODETType.GBRINTLDEPODETDetailType.MBRINTLDEPODETDetailType> getMBRINTLDEPODETDetailType() {
            if (mbrintldepodetDetailType == null) {
                mbrintldepodetDetailType = new ArrayList<BRINTLDEPODETType.GBRINTLDEPODETDetailType.MBRINTLDEPODETDetailType>();
            }
            return this.mbrintldepodetDetailType;
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
         *         &lt;element name="DepositNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccountingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TermDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InterestFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NextPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccruedInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GuaranteedAccountingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InstructionsatMaturity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "depositNumber",
            "accountingBalance",
            "rate",
            "startDate",
            "maturityDate",
            "termDays",
            "interestFrequency",
            "nextPayment",
            "paymentAmount",
            "accruedInterest",
            "guaranteedAccountingBalance",
            "instructionsatMaturity",
            "currency"
        })
        public static class MBRINTLDEPODETDetailType {

            @XmlElement(name = "DepositNumber")
            protected String depositNumber;
            @XmlElement(name = "AccountingBalance")
            protected String accountingBalance;
            @XmlElement(name = "Rate")
            protected String rate;
            @XmlElement(name = "StartDate")
            protected String startDate;
            @XmlElement(name = "MaturityDate")
            protected String maturityDate;
            @XmlElement(name = "TermDays")
            protected String termDays;
            @XmlElement(name = "InterestFrequency")
            protected String interestFrequency;
            @XmlElement(name = "NextPayment")
            protected String nextPayment;
            @XmlElement(name = "PaymentAmount")
            protected String paymentAmount;
            @XmlElement(name = "AccruedInterest")
            protected String accruedInterest;
            @XmlElement(name = "GuaranteedAccountingBalance")
            protected String guaranteedAccountingBalance;
            @XmlElement(name = "InstructionsatMaturity")
            protected String instructionsatMaturity;
            @XmlElement(name = "Currency")
            protected String currency;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad depositNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepositNumber() {
                return depositNumber;
            }

            /**
             * Define el valor de la propiedad depositNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepositNumber(String value) {
                this.depositNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad accountingBalance.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountingBalance() {
                return accountingBalance;
            }

            /**
             * Define el valor de la propiedad accountingBalance.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountingBalance(String value) {
                this.accountingBalance = value;
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
             * Obtiene el valor de la propiedad startDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStartDate() {
                return startDate;
            }

            /**
             * Define el valor de la propiedad startDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStartDate(String value) {
                this.startDate = value;
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
             * Obtiene el valor de la propiedad termDays.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTermDays() {
                return termDays;
            }

            /**
             * Define el valor de la propiedad termDays.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTermDays(String value) {
                this.termDays = value;
            }

            /**
             * Obtiene el valor de la propiedad interestFrequency.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInterestFrequency() {
                return interestFrequency;
            }

            /**
             * Define el valor de la propiedad interestFrequency.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInterestFrequency(String value) {
                this.interestFrequency = value;
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
             * Obtiene el valor de la propiedad paymentAmount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentAmount() {
                return paymentAmount;
            }

            /**
             * Define el valor de la propiedad paymentAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentAmount(String value) {
                this.paymentAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad accruedInterest.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccruedInterest() {
                return accruedInterest;
            }

            /**
             * Define el valor de la propiedad accruedInterest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccruedInterest(String value) {
                this.accruedInterest = value;
            }

            /**
             * Obtiene el valor de la propiedad guaranteedAccountingBalance.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGuaranteedAccountingBalance() {
                return guaranteedAccountingBalance;
            }

            /**
             * Define el valor de la propiedad guaranteedAccountingBalance.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGuaranteedAccountingBalance(String value) {
                this.guaranteedAccountingBalance = value;
            }

            /**
             * Obtiene el valor de la propiedad instructionsatMaturity.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInstructionsatMaturity() {
                return instructionsatMaturity;
            }

            /**
             * Define el valor de la propiedad instructionsatMaturity.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInstructionsatMaturity(String value) {
                this.instructionsatMaturity = value;
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
