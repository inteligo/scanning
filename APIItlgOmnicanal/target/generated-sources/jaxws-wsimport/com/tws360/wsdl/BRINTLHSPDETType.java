
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
 * <p>Clase Java para BRINTLHSPDETType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BRINTLHSPDETType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZERODISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gBRINTLHSPDETDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBRINTLHSPDETDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NominalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LastPurchaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AveragePurchasePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TotalInvestments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MarketValueinUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Pledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InterestFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NextPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InvestmentCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TotalInvestmentsinUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MarketPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MarketPriceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="UnrealizedProfitLoss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccruedInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BRINTLHSPDETType", propOrder = {
    "zerodisplay",
    "gbrintlhspdetDetailType"
})
public class BRINTLHSPDETType {

    @XmlElement(name = "ZERODISPLAY")
    protected String zerodisplay;
    @XmlElement(name = "gBRINTLHSPDETDetailType")
    protected BRINTLHSPDETType.GBRINTLHSPDETDetailType gbrintlhspdetDetailType;

    /**
     * Obtiene el valor de la propiedad zerodisplay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZERODISPLAY() {
        return zerodisplay;
    }

    /**
     * Define el valor de la propiedad zerodisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZERODISPLAY(String value) {
        this.zerodisplay = value;
    }

    /**
     * Obtiene el valor de la propiedad gbrintlhspdetDetailType.
     * 
     * @return
     *     possible object is
     *     {@link BRINTLHSPDETType.GBRINTLHSPDETDetailType }
     *     
     */
    public BRINTLHSPDETType.GBRINTLHSPDETDetailType getGBRINTLHSPDETDetailType() {
        return gbrintlhspdetDetailType;
    }

    /**
     * Define el valor de la propiedad gbrintlhspdetDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link BRINTLHSPDETType.GBRINTLHSPDETDetailType }
     *     
     */
    public void setGBRINTLHSPDETDetailType(BRINTLHSPDETType.GBRINTLHSPDETDetailType value) {
        this.gbrintlhspdetDetailType = value;
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
     *         &lt;element name="mBRINTLHSPDETDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NominalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LastPurchaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AveragePurchasePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TotalInvestments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MarketValueinUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Pledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InterestFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NextPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InvestmentCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TotalInvestmentsinUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MarketPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MarketPriceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="UnrealizedProfitLoss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccruedInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbrintlhspdetDetailType"
    })
    public static class GBRINTLHSPDETDetailType {

        @XmlElement(name = "mBRINTLHSPDETDetailType")
        protected List<BRINTLHSPDETType.GBRINTLHSPDETDetailType.MBRINTLHSPDETDetailType> mbrintlhspdetDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbrintlhspdetDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbrintlhspdetDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBRINTLHSPDETDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BRINTLHSPDETType.GBRINTLHSPDETDetailType.MBRINTLHSPDETDetailType }
         * 
         * 
         */
        public List<BRINTLHSPDETType.GBRINTLHSPDETDetailType.MBRINTLHSPDETDetailType> getMBRINTLHSPDETDetailType() {
            if (mbrintlhspdetDetailType == null) {
                mbrintlhspdetDetailType = new ArrayList<BRINTLHSPDETType.GBRINTLHSPDETDetailType.MBRINTLHSPDETDetailType>();
            }
            return this.mbrintlhspdetDetailType;
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
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NominalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LastPurchaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AveragePurchasePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TotalInvestments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MarketValueinUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Pledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InterestFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NextPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InvestmentCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TotalInvestmentsinUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MarketPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MarketPriceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="UnrealizedProfitLoss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccruedInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "description",
            "nominalValue",
            "units",
            "lastPurchaseDate",
            "averagePurchasePrice",
            "totalInvestments",
            "marketValueinUSD",
            "pledge",
            "interestFrequency",
            "maturityDate",
            "nextPayment",
            "paymentAmount",
            "investmentCurrency",
            "totalInvestmentsinUSD",
            "marketPrice",
            "marketPriceDate",
            "unrealizedProfitLoss",
            "accruedInterest",
            "title"
        })
        public static class MBRINTLHSPDETDetailType {

            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "NominalValue")
            protected String nominalValue;
            @XmlElement(name = "Units")
            protected String units;
            @XmlElement(name = "LastPurchaseDate")
            protected String lastPurchaseDate;
            @XmlElement(name = "AveragePurchasePrice")
            protected String averagePurchasePrice;
            @XmlElement(name = "TotalInvestments")
            protected String totalInvestments;
            @XmlElement(name = "MarketValueinUSD")
            protected String marketValueinUSD;
            @XmlElement(name = "Pledge")
            protected String pledge;
            @XmlElement(name = "InterestFrequency")
            protected String interestFrequency;
            @XmlElement(name = "MaturityDate")
            protected String maturityDate;
            @XmlElement(name = "NextPayment")
            protected String nextPayment;
            @XmlElement(name = "PaymentAmount")
            protected String paymentAmount;
            @XmlElement(name = "InvestmentCurrency")
            protected String investmentCurrency;
            @XmlElement(name = "TotalInvestmentsinUSD")
            protected String totalInvestmentsinUSD;
            @XmlElement(name = "MarketPrice")
            protected String marketPrice;
            @XmlElement(name = "MarketPriceDate")
            protected String marketPriceDate;
            @XmlElement(name = "UnrealizedProfitLoss")
            protected String unrealizedProfitLoss;
            @XmlElement(name = "AccruedInterest")
            protected String accruedInterest;
            @XmlElement(name = "TITLE")
            protected String title;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad description.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Define el valor de la propiedad description.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Obtiene el valor de la propiedad nominalValue.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNominalValue() {
                return nominalValue;
            }

            /**
             * Define el valor de la propiedad nominalValue.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNominalValue(String value) {
                this.nominalValue = value;
            }

            /**
             * Obtiene el valor de la propiedad units.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                return units;
            }

            /**
             * Define el valor de la propiedad units.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

            /**
             * Obtiene el valor de la propiedad lastPurchaseDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastPurchaseDate() {
                return lastPurchaseDate;
            }

            /**
             * Define el valor de la propiedad lastPurchaseDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastPurchaseDate(String value) {
                this.lastPurchaseDate = value;
            }

            /**
             * Obtiene el valor de la propiedad averagePurchasePrice.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAveragePurchasePrice() {
                return averagePurchasePrice;
            }

            /**
             * Define el valor de la propiedad averagePurchasePrice.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAveragePurchasePrice(String value) {
                this.averagePurchasePrice = value;
            }

            /**
             * Obtiene el valor de la propiedad totalInvestments.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalInvestments() {
                return totalInvestments;
            }

            /**
             * Define el valor de la propiedad totalInvestments.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalInvestments(String value) {
                this.totalInvestments = value;
            }

            /**
             * Obtiene el valor de la propiedad marketValueinUSD.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarketValueinUSD() {
                return marketValueinUSD;
            }

            /**
             * Define el valor de la propiedad marketValueinUSD.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarketValueinUSD(String value) {
                this.marketValueinUSD = value;
            }

            /**
             * Obtiene el valor de la propiedad pledge.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPledge() {
                return pledge;
            }

            /**
             * Define el valor de la propiedad pledge.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPledge(String value) {
                this.pledge = value;
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
             * Obtiene el valor de la propiedad totalInvestmentsinUSD.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalInvestmentsinUSD() {
                return totalInvestmentsinUSD;
            }

            /**
             * Define el valor de la propiedad totalInvestmentsinUSD.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalInvestmentsinUSD(String value) {
                this.totalInvestmentsinUSD = value;
            }

            /**
             * Obtiene el valor de la propiedad marketPrice.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarketPrice() {
                return marketPrice;
            }

            /**
             * Define el valor de la propiedad marketPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarketPrice(String value) {
                this.marketPrice = value;
            }

            /**
             * Obtiene el valor de la propiedad marketPriceDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarketPriceDate() {
                return marketPriceDate;
            }

            /**
             * Define el valor de la propiedad marketPriceDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarketPriceDate(String value) {
                this.marketPriceDate = value;
            }

            /**
             * Obtiene el valor de la propiedad unrealizedProfitLoss.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnrealizedProfitLoss() {
                return unrealizedProfitLoss;
            }

            /**
             * Define el valor de la propiedad unrealizedProfitLoss.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnrealizedProfitLoss(String value) {
                this.unrealizedProfitLoss = value;
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
