
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
 * <p>Clase Java para BRINTBCURACCDETType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BRINTBCURACCDETType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gBRINTBCURACCDETDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBRINTBCURACCDETDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccountingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RetainedBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AvailableBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Overdraft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="JointHolders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WorkingBalanceinUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Nickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BRINTBCURACCDETType", propOrder = {
    "gbrintbcuraccdetDetailType"
})
public class BRINTBCURACCDETType {

    @XmlElement(name = "gBRINTBCURACCDETDetailType")
    protected BRINTBCURACCDETType.GBRINTBCURACCDETDetailType gbrintbcuraccdetDetailType;

    /**
     * Obtiene el valor de la propiedad gbrintbcuraccdetDetailType.
     * 
     * @return
     *     possible object is
     *     {@link BRINTBCURACCDETType.GBRINTBCURACCDETDetailType }
     *     
     */
    public BRINTBCURACCDETType.GBRINTBCURACCDETDetailType getGBRINTBCURACCDETDetailType() {
        return gbrintbcuraccdetDetailType;
    }

    /**
     * Define el valor de la propiedad gbrintbcuraccdetDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link BRINTBCURACCDETType.GBRINTBCURACCDETDetailType }
     *     
     */
    public void setGBRINTBCURACCDETDetailType(BRINTBCURACCDETType.GBRINTBCURACCDETDetailType value) {
        this.gbrintbcuraccdetDetailType = value;
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
     *         &lt;element name="mBRINTBCURACCDETDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccountingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RetainedBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AvailableBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Overdraft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="JointHolders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WorkingBalanceinUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Nickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbrintbcuraccdetDetailType"
    })
    public static class GBRINTBCURACCDETDetailType {

        @XmlElement(name = "mBRINTBCURACCDETDetailType")
        protected List<BRINTBCURACCDETType.GBRINTBCURACCDETDetailType.MBRINTBCURACCDETDetailType> mbrintbcuraccdetDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbrintbcuraccdetDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbrintbcuraccdetDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBRINTBCURACCDETDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BRINTBCURACCDETType.GBRINTBCURACCDETDetailType.MBRINTBCURACCDETDetailType }
         * 
         * 
         */
        public List<BRINTBCURACCDETType.GBRINTBCURACCDETDetailType.MBRINTBCURACCDETDetailType> getMBRINTBCURACCDETDetailType() {
            if (mbrintbcuraccdetDetailType == null) {
                mbrintbcuraccdetDetailType = new ArrayList<BRINTBCURACCDETType.GBRINTBCURACCDETDetailType.MBRINTBCURACCDETDetailType>();
            }
            return this.mbrintbcuraccdetDetailType;
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
         *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccountingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RetainedBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AvailableBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Overdraft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="JointHolders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WorkingBalanceinUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Nickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "accountNumber",
            "owner",
            "customerType",
            "accountingBalance",
            "retainedBalance",
            "availableBalance",
            "overdraft",
            "jointHolders",
            "currency",
            "workingBalanceinUSD",
            "nickname"
        })
        public static class MBRINTBCURACCDETDetailType {

            @XmlElement(name = "AccountNumber")
            protected String accountNumber;
            @XmlElement(name = "Owner")
            protected String owner;
            @XmlElement(name = "CustomerType")
            protected String customerType;
            @XmlElement(name = "AccountingBalance")
            protected String accountingBalance;
            @XmlElement(name = "RetainedBalance")
            protected String retainedBalance;
            @XmlElement(name = "AvailableBalance")
            protected String availableBalance;
            @XmlElement(name = "Overdraft")
            protected String overdraft;
            @XmlElement(name = "JointHolders")
            protected String jointHolders;
            @XmlElement(name = "Currency")
            protected String currency;
            @XmlElement(name = "WorkingBalanceinUSD")
            protected String workingBalanceinUSD;
            @XmlElement(name = "Nickname")
            protected String nickname;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

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
             * Obtiene el valor de la propiedad owner.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwner() {
                return owner;
            }

            /**
             * Define el valor de la propiedad owner.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwner(String value) {
                this.owner = value;
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
             * Obtiene el valor de la propiedad retainedBalance.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRetainedBalance() {
                return retainedBalance;
            }

            /**
             * Define el valor de la propiedad retainedBalance.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRetainedBalance(String value) {
                this.retainedBalance = value;
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
             * Obtiene el valor de la propiedad jointHolders.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJointHolders() {
                return jointHolders;
            }

            /**
             * Define el valor de la propiedad jointHolders.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJointHolders(String value) {
                this.jointHolders = value;
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
             * Obtiene el valor de la propiedad nickname.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNickname() {
                return nickname;
            }

            /**
             * Define el valor de la propiedad nickname.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNickname(String value) {
                this.nickname = value;
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
