
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
 * <p>Clase Java para BRINTLSHAREDETType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BRINTLSHAREDETType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZERODISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gBRINTLSHAREDETDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBRINTLSHAREDETDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Productname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InvestmentCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LastPurchase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AvgPurchasePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TotalInvestmentsoriginalcurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TotalInvestmentsinUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MarketValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MarketPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MarketValueoriginalcurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Pledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="UnrealisedPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MarketValueonUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BRINTLSHAREDETType", propOrder = {
    "title",
    "zerodisplay",
    "gbrintlsharedetDetailType"
})
public class BRINTLSHAREDETType {

    @XmlElement(name = "TITLE")
    protected String title;
    @XmlElement(name = "ZERODISPLAY")
    protected String zerodisplay;
    @XmlElement(name = "gBRINTLSHAREDETDetailType")
    protected BRINTLSHAREDETType.GBRINTLSHAREDETDetailType gbrintlsharedetDetailType;

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
     * Obtiene el valor de la propiedad gbrintlsharedetDetailType.
     * 
     * @return
     *     possible object is
     *     {@link BRINTLSHAREDETType.GBRINTLSHAREDETDetailType }
     *     
     */
    public BRINTLSHAREDETType.GBRINTLSHAREDETDetailType getGBRINTLSHAREDETDetailType() {
        return gbrintlsharedetDetailType;
    }

    /**
     * Define el valor de la propiedad gbrintlsharedetDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link BRINTLSHAREDETType.GBRINTLSHAREDETDetailType }
     *     
     */
    public void setGBRINTLSHAREDETDetailType(BRINTLSHAREDETType.GBRINTLSHAREDETDetailType value) {
        this.gbrintlsharedetDetailType = value;
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
     *         &lt;element name="mBRINTLSHAREDETDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Productname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InvestmentCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LastPurchase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AvgPurchasePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TotalInvestmentsoriginalcurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TotalInvestmentsinUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MarketValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MarketPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MarketValueoriginalcurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Pledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="UnrealisedPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MarketValueonUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbrintlsharedetDetailType"
    })
    public static class GBRINTLSHAREDETDetailType {

        @XmlElement(name = "mBRINTLSHAREDETDetailType")
        protected List<BRINTLSHAREDETType.GBRINTLSHAREDETDetailType.MBRINTLSHAREDETDetailType> mbrintlsharedetDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbrintlsharedetDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbrintlsharedetDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBRINTLSHAREDETDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BRINTLSHAREDETType.GBRINTLSHAREDETDetailType.MBRINTLSHAREDETDetailType }
         * 
         * 
         */
        public List<BRINTLSHAREDETType.GBRINTLSHAREDETDetailType.MBRINTLSHAREDETDetailType> getMBRINTLSHAREDETDetailType() {
            if (mbrintlsharedetDetailType == null) {
                mbrintlsharedetDetailType = new ArrayList<BRINTLSHAREDETType.GBRINTLSHAREDETDetailType.MBRINTLSHAREDETDetailType>();
            }
            return this.mbrintlsharedetDetailType;
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
         *         &lt;element name="Productname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InvestmentCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LastPurchase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AvgPurchasePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TotalInvestmentsoriginalcurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TotalInvestmentsinUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MarketValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MarketPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MarketValueoriginalcurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Pledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="UnrealisedPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MarketValueonUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "productname",
            "investmentCurrency",
            "units",
            "lastPurchase",
            "avgPurchasePrice",
            "totalInvestmentsoriginalcurrency",
            "totalInvestmentsinUSD",
            "marketValueDate",
            "marketPrice",
            "marketValueoriginalcurrency",
            "pledge",
            "unrealisedPL",
            "marketValueonUSD"
        })
        public static class MBRINTLSHAREDETDetailType {

            @XmlElement(name = "Productname")
            protected String productname;
            @XmlElement(name = "InvestmentCurrency")
            protected String investmentCurrency;
            @XmlElement(name = "Units")
            protected String units;
            @XmlElement(name = "LastPurchase")
            protected String lastPurchase;
            @XmlElement(name = "AvgPurchasePrice")
            protected String avgPurchasePrice;
            @XmlElement(name = "TotalInvestmentsoriginalcurrency")
            protected String totalInvestmentsoriginalcurrency;
            @XmlElement(name = "TotalInvestmentsinUSD")
            protected String totalInvestmentsinUSD;
            @XmlElement(name = "MarketValueDate")
            protected String marketValueDate;
            @XmlElement(name = "MarketPrice")
            protected String marketPrice;
            @XmlElement(name = "MarketValueoriginalcurrency")
            protected String marketValueoriginalcurrency;
            @XmlElement(name = "Pledge")
            protected String pledge;
            @XmlElement(name = "UnrealisedPL")
            protected String unrealisedPL;
            @XmlElement(name = "MarketValueonUSD")
            protected String marketValueonUSD;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad productname.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductname() {
                return productname;
            }

            /**
             * Define el valor de la propiedad productname.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductname(String value) {
                this.productname = value;
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
             * Obtiene el valor de la propiedad avgPurchasePrice.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAvgPurchasePrice() {
                return avgPurchasePrice;
            }

            /**
             * Define el valor de la propiedad avgPurchasePrice.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAvgPurchasePrice(String value) {
                this.avgPurchasePrice = value;
            }

            /**
             * Obtiene el valor de la propiedad totalInvestmentsoriginalcurrency.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalInvestmentsoriginalcurrency() {
                return totalInvestmentsoriginalcurrency;
            }

            /**
             * Define el valor de la propiedad totalInvestmentsoriginalcurrency.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalInvestmentsoriginalcurrency(String value) {
                this.totalInvestmentsoriginalcurrency = value;
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
             * Obtiene el valor de la propiedad marketValueoriginalcurrency.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarketValueoriginalcurrency() {
                return marketValueoriginalcurrency;
            }

            /**
             * Define el valor de la propiedad marketValueoriginalcurrency.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarketValueoriginalcurrency(String value) {
                this.marketValueoriginalcurrency = value;
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
             * Obtiene el valor de la propiedad marketValueonUSD.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarketValueonUSD() {
                return marketValueonUSD;
            }

            /**
             * Define el valor de la propiedad marketValueonUSD.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarketValueonUSD(String value) {
                this.marketValueonUSD = value;
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
