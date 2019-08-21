
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
 * <p>Clase Java para BRINTBTRADEACCDETType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BRINTBTRADEACCDETType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gBRINTBTRADEACCDETDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBRINTBTRADEACCDETDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WorkingBalanceinUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccountNickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccountingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AvailableBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Overdraft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SaldoNeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SaldoNetoUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BRINTBTRADEACCDETType", propOrder = {
    "gbrintbtradeaccdetDetailType"
})
public class BRINTBTRADEACCDETType {

    @XmlElement(name = "gBRINTBTRADEACCDETDetailType")
    protected BRINTBTRADEACCDETType.GBRINTBTRADEACCDETDetailType gbrintbtradeaccdetDetailType;

    /**
     * Obtiene el valor de la propiedad gbrintbtradeaccdetDetailType.
     * 
     * @return
     *     possible object is
     *     {@link BRINTBTRADEACCDETType.GBRINTBTRADEACCDETDetailType }
     *     
     */
    public BRINTBTRADEACCDETType.GBRINTBTRADEACCDETDetailType getGBRINTBTRADEACCDETDetailType() {
        return gbrintbtradeaccdetDetailType;
    }

    /**
     * Define el valor de la propiedad gbrintbtradeaccdetDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link BRINTBTRADEACCDETType.GBRINTBTRADEACCDETDetailType }
     *     
     */
    public void setGBRINTBTRADEACCDETDetailType(BRINTBTRADEACCDETType.GBRINTBTRADEACCDETDetailType value) {
        this.gbrintbtradeaccdetDetailType = value;
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
     *         &lt;element name="mBRINTBTRADEACCDETDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WorkingBalanceinUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccountNickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccountingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AvailableBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Overdraft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SaldoNeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SaldoNetoUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbrintbtradeaccdetDetailType"
    })
    public static class GBRINTBTRADEACCDETDetailType {

        @XmlElement(name = "mBRINTBTRADEACCDETDetailType")
        protected List<BRINTBTRADEACCDETType.GBRINTBTRADEACCDETDetailType.MBRINTBTRADEACCDETDetailType> mbrintbtradeaccdetDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbrintbtradeaccdetDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbrintbtradeaccdetDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBRINTBTRADEACCDETDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BRINTBTRADEACCDETType.GBRINTBTRADEACCDETDetailType.MBRINTBTRADEACCDETDetailType }
         * 
         * 
         */
        public List<BRINTBTRADEACCDETType.GBRINTBTRADEACCDETDetailType.MBRINTBTRADEACCDETDetailType> getMBRINTBTRADEACCDETDetailType() {
            if (mbrintbtradeaccdetDetailType == null) {
                mbrintbtradeaccdetDetailType = new ArrayList<BRINTBTRADEACCDETType.GBRINTBTRADEACCDETDetailType.MBRINTBTRADEACCDETDetailType>();
            }
            return this.mbrintbtradeaccdetDetailType;
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
         *         &lt;element name="HDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WorkingBalanceinUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccountNickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccountingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AvailableBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Overdraft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SaldoNeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SaldoNetoUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "hdr",
            "accountNumber",
            "currency",
            "customerType",
            "workingBalanceinUSD",
            "accountNickname",
            "accountingBalance",
            "availableBalance",
            "overdraft",
            "saldoNeto",
            "saldoNetoUSD"
        })
        public static class MBRINTBTRADEACCDETDetailType {

            @XmlElement(name = "HDR")
            protected String hdr;
            @XmlElement(name = "AccountNumber")
            protected String accountNumber;
            @XmlElement(name = "Currency")
            protected String currency;
            @XmlElement(name = "CustomerType")
            protected String customerType;
            @XmlElement(name = "WorkingBalanceinUSD")
            protected String workingBalanceinUSD;
            @XmlElement(name = "AccountNickname")
            protected String accountNickname;
            @XmlElement(name = "AccountingBalance")
            protected String accountingBalance;
            @XmlElement(name = "AvailableBalance")
            protected String availableBalance;
            @XmlElement(name = "Overdraft")
            protected String overdraft;
            @XmlElement(name = "SaldoNeto")
            protected String saldoNeto;
            @XmlElement(name = "SaldoNetoUSD")
            protected String saldoNetoUSD;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad hdr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHDR() {
                return hdr;
            }

            /**
             * Define el valor de la propiedad hdr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHDR(String value) {
                this.hdr = value;
            }

            /**
             * Obtiene el valor de la propiedad accountNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountNumber() {
                return accountNumber;
            }

            /**
             * Define el valor de la propiedad accountNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountNumber(String value) {
                this.accountNumber = value;
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
             * Obtiene el valor de la propiedad customerType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerType() {
                return customerType;
            }

            /**
             * Define el valor de la propiedad customerType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerType(String value) {
                this.customerType = value;
            }

            /**
             * Obtiene el valor de la propiedad workingBalanceinUSD.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWorkingBalanceinUSD() {
                return workingBalanceinUSD;
            }

            /**
             * Define el valor de la propiedad workingBalanceinUSD.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWorkingBalanceinUSD(String value) {
                this.workingBalanceinUSD = value;
            }

            /**
             * Obtiene el valor de la propiedad accountNickname.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountNickname() {
                return accountNickname;
            }

            /**
             * Define el valor de la propiedad accountNickname.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountNickname(String value) {
                this.accountNickname = value;
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
             * Obtiene el valor de la propiedad availableBalance.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAvailableBalance() {
                return availableBalance;
            }

            /**
             * Define el valor de la propiedad availableBalance.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAvailableBalance(String value) {
                this.availableBalance = value;
            }

            /**
             * Obtiene el valor de la propiedad overdraft.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOverdraft() {
                return overdraft;
            }

            /**
             * Define el valor de la propiedad overdraft.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOverdraft(String value) {
                this.overdraft = value;
            }

            /**
             * Obtiene el valor de la propiedad saldoNeto.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSaldoNeto() {
                return saldoNeto;
            }

            /**
             * Define el valor de la propiedad saldoNeto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSaldoNeto(String value) {
                this.saldoNeto = value;
            }

            /**
             * Obtiene el valor de la propiedad saldoNetoUSD.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSaldoNetoUSD() {
                return saldoNetoUSD;
            }

            /**
             * Define el valor de la propiedad saldoNetoUSD.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSaldoNetoUSD(String value) {
                this.saldoNetoUSD = value;
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
