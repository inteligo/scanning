
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
 * <p>Clase Java para BRINTBOUTSTANDINGTRANSType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BRINTBOUTSTANDINGTRANSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ERRMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gBRINTBOUTSTANDINGTRANSDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBRINTBOUTSTANDINGTRANSDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="IHDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CRHDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DRHDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Transaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CRAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DRAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TradeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SettlementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InvestmentCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NominalUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TransactionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BRINTBOUTSTANDINGTRANSType", propOrder = {
    "errmsg",
    "gbrintboutstandingtransDetailType"
})
public class BRINTBOUTSTANDINGTRANSType {

    @XmlElement(name = "ERRMSG")
    protected String errmsg;
    @XmlElement(name = "gBRINTBOUTSTANDINGTRANSDetailType")
    protected BRINTBOUTSTANDINGTRANSType.GBRINTBOUTSTANDINGTRANSDetailType gbrintboutstandingtransDetailType;

    /**
     * Obtiene el valor de la propiedad errmsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRMSG() {
        return errmsg;
    }

    /**
     * Define el valor de la propiedad errmsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRMSG(String value) {
        this.errmsg = value;
    }

    /**
     * Obtiene el valor de la propiedad gbrintboutstandingtransDetailType.
     * 
     * @return
     *     possible object is
     *     {@link BRINTBOUTSTANDINGTRANSType.GBRINTBOUTSTANDINGTRANSDetailType }
     *     
     */
    public BRINTBOUTSTANDINGTRANSType.GBRINTBOUTSTANDINGTRANSDetailType getGBRINTBOUTSTANDINGTRANSDetailType() {
        return gbrintboutstandingtransDetailType;
    }

    /**
     * Define el valor de la propiedad gbrintboutstandingtransDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link BRINTBOUTSTANDINGTRANSType.GBRINTBOUTSTANDINGTRANSDetailType }
     *     
     */
    public void setGBRINTBOUTSTANDINGTRANSDetailType(BRINTBOUTSTANDINGTRANSType.GBRINTBOUTSTANDINGTRANSDetailType value) {
        this.gbrintboutstandingtransDetailType = value;
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
     *         &lt;element name="mBRINTBOUTSTANDINGTRANSDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="IHDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CRHDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DRHDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Transaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CRAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DRAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TradeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SettlementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InvestmentCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NominalUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TransactionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbrintboutstandingtransDetailType"
    })
    public static class GBRINTBOUTSTANDINGTRANSDetailType {

        @XmlElement(name = "mBRINTBOUTSTANDINGTRANSDetailType")
        protected List<BRINTBOUTSTANDINGTRANSType.GBRINTBOUTSTANDINGTRANSDetailType.MBRINTBOUTSTANDINGTRANSDetailType> mbrintboutstandingtransDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbrintboutstandingtransDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbrintboutstandingtransDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBRINTBOUTSTANDINGTRANSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BRINTBOUTSTANDINGTRANSType.GBRINTBOUTSTANDINGTRANSDetailType.MBRINTBOUTSTANDINGTRANSDetailType }
         * 
         * 
         */
        public List<BRINTBOUTSTANDINGTRANSType.GBRINTBOUTSTANDINGTRANSDetailType.MBRINTBOUTSTANDINGTRANSDetailType> getMBRINTBOUTSTANDINGTRANSDetailType() {
            if (mbrintboutstandingtransDetailType == null) {
                mbrintboutstandingtransDetailType = new ArrayList<BRINTBOUTSTANDINGTRANSType.GBRINTBOUTSTANDINGTRANSDetailType.MBRINTBOUTSTANDINGTRANSDetailType>();
            }
            return this.mbrintboutstandingtransDetailType;
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
         *         &lt;element name="IHDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CRHDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DRHDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Transaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CRAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DRAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TradeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SettlementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InvestmentCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NominalUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TransactionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "ihdr",
            "crhdr",
            "drhdr",
            "accountNumber",
            "transaction",
            "cramt",
            "dramt",
            "tradeDate",
            "settlementDate",
            "product",
            "investmentCurrency",
            "nominalUnits",
            "transactionAmount"
        })
        public static class MBRINTBOUTSTANDINGTRANSDetailType {

            @XmlElement(name = "IHDR")
            protected String ihdr;
            @XmlElement(name = "CRHDR")
            protected String crhdr;
            @XmlElement(name = "DRHDR")
            protected String drhdr;
            @XmlElement(name = "AccountNumber")
            protected String accountNumber;
            @XmlElement(name = "Transaction")
            protected String transaction;
            @XmlElement(name = "CRAMT")
            protected String cramt;
            @XmlElement(name = "DRAMT")
            protected String dramt;
            @XmlElement(name = "TradeDate")
            protected String tradeDate;
            @XmlElement(name = "SettlementDate")
            protected String settlementDate;
            @XmlElement(name = "Product")
            protected String product;
            @XmlElement(name = "InvestmentCurrency")
            protected String investmentCurrency;
            @XmlElement(name = "NominalUnits")
            protected String nominalUnits;
            @XmlElement(name = "TransactionAmount")
            protected String transactionAmount;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad ihdr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIHDR() {
                return ihdr;
            }

            /**
             * Define el valor de la propiedad ihdr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIHDR(String value) {
                this.ihdr = value;
            }

            /**
             * Obtiene el valor de la propiedad crhdr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCRHDR() {
                return crhdr;
            }

            /**
             * Define el valor de la propiedad crhdr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCRHDR(String value) {
                this.crhdr = value;
            }

            /**
             * Obtiene el valor de la propiedad drhdr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDRHDR() {
                return drhdr;
            }

            /**
             * Define el valor de la propiedad drhdr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDRHDR(String value) {
                this.drhdr = value;
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
             * Obtiene el valor de la propiedad transaction.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransaction() {
                return transaction;
            }

            /**
             * Define el valor de la propiedad transaction.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTransaction(String value) {
                this.transaction = value;
            }

            /**
             * Obtiene el valor de la propiedad cramt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCRAMT() {
                return cramt;
            }

            /**
             * Define el valor de la propiedad cramt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCRAMT(String value) {
                this.cramt = value;
            }

            /**
             * Obtiene el valor de la propiedad dramt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDRAMT() {
                return dramt;
            }

            /**
             * Define el valor de la propiedad dramt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDRAMT(String value) {
                this.dramt = value;
            }

            /**
             * Obtiene el valor de la propiedad tradeDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTradeDate() {
                return tradeDate;
            }

            /**
             * Define el valor de la propiedad tradeDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTradeDate(String value) {
                this.tradeDate = value;
            }

            /**
             * Obtiene el valor de la propiedad settlementDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSettlementDate() {
                return settlementDate;
            }

            /**
             * Define el valor de la propiedad settlementDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSettlementDate(String value) {
                this.settlementDate = value;
            }

            /**
             * Obtiene el valor de la propiedad product.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProduct() {
                return product;
            }

            /**
             * Define el valor de la propiedad product.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProduct(String value) {
                this.product = value;
            }

            /**
             * Obtiene el valor de la propiedad investmentCurrency.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvestmentCurrency() {
                return investmentCurrency;
            }

            /**
             * Define el valor de la propiedad investmentCurrency.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvestmentCurrency(String value) {
                this.investmentCurrency = value;
            }

            /**
             * Obtiene el valor de la propiedad nominalUnits.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNominalUnits() {
                return nominalUnits;
            }

            /**
             * Define el valor de la propiedad nominalUnits.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNominalUnits(String value) {
                this.nominalUnits = value;
            }

            /**
             * Obtiene el valor de la propiedad transactionAmount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransactionAmount() {
                return transactionAmount;
            }

            /**
             * Define el valor de la propiedad transactionAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTransactionAmount(String value) {
                this.transactionAmount = value;
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
