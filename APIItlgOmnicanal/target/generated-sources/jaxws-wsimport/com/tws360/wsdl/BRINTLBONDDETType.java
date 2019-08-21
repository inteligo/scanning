
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
 * <p>Clase Java para BRINTLBONDDETType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BRINTLBONDDETType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZERODISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gBRINTLBONDDETDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBRINTLBONDDETDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NominalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LastPurchase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AveragePurchasePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TotalInvestments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Coupon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InterestFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NextPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MarketValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MarketPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MarketValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InvestmentCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MarketValueonUSDcurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TotalInvestmentsinUSDcurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="UnrealisedPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BRINTLBONDDETType", propOrder = {
    "zerodisplay",
    "gbrintlbonddetDetailType"
})
public class BRINTLBONDDETType {

    @XmlElement(name = "ZERODISPLAY")
    protected String zerodisplay;
    @XmlElement(name = "gBRINTLBONDDETDetailType")
    protected BRINTLBONDDETType.GBRINTLBONDDETDetailType gbrintlbonddetDetailType;

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
     * Obtiene el valor de la propiedad gbrintlbonddetDetailType.
     * 
     * @return
     *     possible object is
     *     {@link BRINTLBONDDETType.GBRINTLBONDDETDetailType }
     *     
     */
    public BRINTLBONDDETType.GBRINTLBONDDETDetailType getGBRINTLBONDDETDetailType() {
        return gbrintlbonddetDetailType;
    }

    /**
     * Define el valor de la propiedad gbrintlbonddetDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link BRINTLBONDDETType.GBRINTLBONDDETDetailType }
     *     
     */
    public void setGBRINTLBONDDETDetailType(BRINTLBONDDETType.GBRINTLBONDDETDetailType value) {
        this.gbrintlbonddetDetailType = value;
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
     *         &lt;element name="mBRINTLBONDDETDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NominalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LastPurchase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AveragePurchasePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TotalInvestments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Coupon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InterestFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NextPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MarketValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MarketPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MarketValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InvestmentCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MarketValueonUSDcurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TotalInvestmentsinUSDcurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="UnrealisedPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbrintlbonddetDetailType"
    })
    public static class GBRINTLBONDDETDetailType {

        @XmlElement(name = "mBRINTLBONDDETDetailType")
        protected List<BRINTLBONDDETType.GBRINTLBONDDETDetailType.MBRINTLBONDDETDetailType> mbrintlbonddetDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbrintlbonddetDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbrintlbonddetDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBRINTLBONDDETDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BRINTLBONDDETType.GBRINTLBONDDETDetailType.MBRINTLBONDDETDetailType }
         * 
         * 
         */
        public List<BRINTLBONDDETType.GBRINTLBONDDETDetailType.MBRINTLBONDDETDetailType> getMBRINTLBONDDETDetailType() {
            if (mbrintlbonddetDetailType == null) {
                mbrintlbonddetDetailType = new ArrayList<BRINTLBONDDETType.GBRINTLBONDDETDetailType.MBRINTLBONDDETDetailType>();
            }
            return this.mbrintlbonddetDetailType;
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
         *         &lt;element name="LastPurchase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AveragePurchasePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TotalInvestments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Coupon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InterestFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NextPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MarketValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MarketPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MarketValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InvestmentCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MarketValueonUSDcurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TotalInvestmentsinUSDcurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="UnrealisedPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "lastPurchase",
            "averagePurchasePrice",
            "totalInvestments",
            "coupon",
            "interestFrequency",
            "maturityDate",
            "nextPayment",
            "marketValueDate",
            "marketPrice",
            "paymentAmount",
            "marketValue",
            "investmentCurrency",
            "marketValueonUSDcurrency",
            "totalInvestmentsinUSDcurrency",
            "unrealisedPL",
            "title"
        })
        public static class MBRINTLBONDDETDetailType {

            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "NominalValue")
            protected String nominalValue;
            @XmlElement(name = "Units")
            protected String units;
            @XmlElement(name = "LastPurchase")
            protected String lastPurchase;
            @XmlElement(name = "AveragePurchasePrice")
            protected String averagePurchasePrice;
            @XmlElement(name = "TotalInvestments")
            protected String totalInvestments;
            @XmlElement(name = "Coupon")
            protected String coupon;
            @XmlElement(name = "InterestFrequency")
            protected String interestFrequency;
            @XmlElement(name = "MaturityDate")
            protected String maturityDate;
            @XmlElement(name = "NextPayment")
            protected String nextPayment;
            @XmlElement(name = "MarketValueDate")
            protected String marketValueDate;
            @XmlElement(name = "MarketPrice")
            protected String marketPrice;
            @XmlElement(name = "PaymentAmount")
            protected String paymentAmount;
            @XmlElement(name = "MarketValue")
            protected String marketValue;
            @XmlElement(name = "InvestmentCurrency")
            protected String investmentCurrency;
            @XmlElement(name = "MarketValueonUSDcurrency")
            protected String marketValueonUSDcurrency;
            @XmlElement(name = "TotalInvestmentsinUSDcurrency")
            protected String totalInvestmentsinUSDcurrency;
            @XmlElement(name = "UnrealisedPL")
            protected String unrealisedPL;
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
             * Obtiene el valor de la propiedad lastPurchase.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastPurchase() {
                return lastPurchase;
            }

            /**
             * Define el valor de la propiedad lastPurchase.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastPurchase(String value) {
                this.lastPurchase = value;
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
             * Obtiene el valor de la propiedad coupon.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCoupon() {
                return coupon;
            }

            /**
             * Define el valor de la propiedad coupon.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCoupon(String value) {
                this.coupon = value;
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
             * Obtiene el valor de la propiedad marketValueDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarketValueDate() {
                return marketValueDate;
            }

            /**
             * Define el valor de la propiedad marketValueDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarketValueDate(String value) {
                this.marketValueDate = value;
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
             * Obtiene el valor de la propiedad marketValue.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarketValue() {
                return marketValue;
            }

            /**
             * Define el valor de la propiedad marketValue.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarketValue(String value) {
                this.marketValue = value;
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
             * Obtiene el valor de la propiedad marketValueonUSDcurrency.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarketValueonUSDcurrency() {
                return marketValueonUSDcurrency;
            }

            /**
             * Define el valor de la propiedad marketValueonUSDcurrency.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarketValueonUSDcurrency(String value) {
                this.marketValueonUSDcurrency = value;
            }

            /**
             * Obtiene el valor de la propiedad totalInvestmentsinUSDcurrency.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalInvestmentsinUSDcurrency() {
                return totalInvestmentsinUSDcurrency;
            }

            /**
             * Define el valor de la propiedad totalInvestmentsinUSDcurrency.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalInvestmentsinUSDcurrency(String value) {
                this.totalInvestmentsinUSDcurrency = value;
            }

            /**
             * Obtiene el valor de la propiedad unrealisedPL.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnrealisedPL() {
                return unrealisedPL;
            }

            /**
             * Define el valor de la propiedad unrealisedPL.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnrealisedPL(String value) {
                this.unrealisedPL = value;
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
