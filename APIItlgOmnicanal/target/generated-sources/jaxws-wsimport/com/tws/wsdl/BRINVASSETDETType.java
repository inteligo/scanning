
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
 * <p>Clase Java para BRINVASSETDETType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BRINVASSETDETType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZEROREC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gBRINVASSETDETDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBRINVASSETDETDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AssetClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ValorNominal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LastPurchaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AvgPurchasePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TotalInvestment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OriginalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TotalInvOriginalCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MarketPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MarketValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MarketValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccuredInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProfitLoss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Coupon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CouponAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NextPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InterestFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Pledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BRINVASSETDETType", propOrder = {
    "zerorec",
    "gbrinvassetdetDetailType"
})
public class BRINVASSETDETType {

    @XmlElement(name = "ZEROREC")
    protected String zerorec;
    @XmlElement(name = "gBRINVASSETDETDetailType")
    protected BRINVASSETDETType.GBRINVASSETDETDetailType gbrinvassetdetDetailType;

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
     * Obtiene el valor de la propiedad gbrinvassetdetDetailType.
     * 
     * @return
     *     possible object is
     *     {@link BRINVASSETDETType.GBRINVASSETDETDetailType }
     *     
     */
    public BRINVASSETDETType.GBRINVASSETDETDetailType getGBRINVASSETDETDetailType() {
        return gbrinvassetdetDetailType;
    }

    /**
     * Define el valor de la propiedad gbrinvassetdetDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link BRINVASSETDETType.GBRINVASSETDETDetailType }
     *     
     */
    public void setGBRINVASSETDETDetailType(BRINVASSETDETType.GBRINVASSETDETDetailType value) {
        this.gbrinvassetdetDetailType = value;
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
     *         &lt;element name="mBRINVASSETDETDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AssetClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ValorNominal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LastPurchaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AvgPurchasePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TotalInvestment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OriginalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TotalInvOriginalCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MarketPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MarketValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MarketValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccuredInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProfitLoss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Coupon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CouponAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NextPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InterestFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Pledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbrinvassetdetDetailType"
    })
    public static class GBRINVASSETDETDetailType {

        @XmlElement(name = "mBRINVASSETDETDetailType")
        protected List<BRINVASSETDETType.GBRINVASSETDETDetailType.MBRINVASSETDETDetailType> mbrinvassetdetDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbrinvassetdetDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbrinvassetdetDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBRINVASSETDETDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BRINVASSETDETType.GBRINVASSETDETDetailType.MBRINVASSETDETDetailType }
         * 
         * 
         */
        public List<BRINVASSETDETType.GBRINVASSETDETDetailType.MBRINVASSETDETDetailType> getMBRINVASSETDETDetailType() {
            if (mbrinvassetdetDetailType == null) {
                mbrinvassetdetDetailType = new ArrayList<BRINVASSETDETType.GBRINVASSETDETDetailType.MBRINVASSETDETDetailType>();
            }
            return this.mbrinvassetdetDetailType;
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
         *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AssetClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ValorNominal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LastPurchaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AvgPurchasePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TotalInvestment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OriginalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TotalInvOriginalCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MarketPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MarketValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MarketValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccuredInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProfitLoss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Coupon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CouponAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NextPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InterestFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Pledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "productType",
            "assetClass",
            "sector",
            "region",
            "currency",
            "producto",
            "valorNominal",
            "units",
            "lastPurchaseDate",
            "avgPurchasePrice",
            "totalInvestment",
            "originalCurrency",
            "totalInvOriginalCCY",
            "marketPrice",
            "marketValueDate",
            "marketValue",
            "accuredInterest",
            "profitLoss",
            "coupon",
            "couponAmount",
            "nextPayment",
            "interestFrequency",
            "maturityDate",
            "pledge"
        })
        public static class MBRINVASSETDETDetailType {

            @XmlElement(name = "HDR")
            protected String hdr;
            @XmlElement(name = "ProductType")
            protected String productType;
            @XmlElement(name = "AssetClass")
            protected String assetClass;
            @XmlElement(name = "Sector")
            protected String sector;
            @XmlElement(name = "Region")
            protected String region;
            @XmlElement(name = "Currency")
            protected String currency;
            @XmlElement(name = "Producto")
            protected String producto;
            @XmlElement(name = "ValorNominal")
            protected String valorNominal;
            @XmlElement(name = "Units")
            protected String units;
            @XmlElement(name = "LastPurchaseDate")
            protected String lastPurchaseDate;
            @XmlElement(name = "AvgPurchasePrice")
            protected String avgPurchasePrice;
            @XmlElement(name = "TotalInvestment")
            protected String totalInvestment;
            @XmlElement(name = "OriginalCurrency")
            protected String originalCurrency;
            @XmlElement(name = "TotalInvOriginalCCY")
            protected String totalInvOriginalCCY;
            @XmlElement(name = "MarketPrice")
            protected String marketPrice;
            @XmlElement(name = "MarketValueDate")
            protected String marketValueDate;
            @XmlElement(name = "MarketValue")
            protected String marketValue;
            @XmlElement(name = "AccuredInterest")
            protected String accuredInterest;
            @XmlElement(name = "ProfitLoss")
            protected String profitLoss;
            @XmlElement(name = "Coupon")
            protected String coupon;
            @XmlElement(name = "CouponAmount")
            protected String couponAmount;
            @XmlElement(name = "NextPayment")
            protected String nextPayment;
            @XmlElement(name = "InterestFrequency")
            protected String interestFrequency;
            @XmlElement(name = "MaturityDate")
            protected String maturityDate;
            @XmlElement(name = "Pledge")
            protected String pledge;
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
             * Obtiene el valor de la propiedad productType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductType() {
                return productType;
            }

            /**
             * Define el valor de la propiedad productType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductType(String value) {
                this.productType = value;
            }

            /**
             * Obtiene el valor de la propiedad assetClass.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssetClass() {
                return assetClass;
            }

            /**
             * Define el valor de la propiedad assetClass.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssetClass(String value) {
                this.assetClass = value;
            }

            /**
             * Obtiene el valor de la propiedad sector.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSector() {
                return sector;
            }

            /**
             * Define el valor de la propiedad sector.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSector(String value) {
                this.sector = value;
            }

            /**
             * Obtiene el valor de la propiedad region.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegion() {
                return region;
            }

            /**
             * Define el valor de la propiedad region.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegion(String value) {
                this.region = value;
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
             * Obtiene el valor de la propiedad producto.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProducto() {
                return producto;
            }

            /**
             * Define el valor de la propiedad producto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProducto(String value) {
                this.producto = value;
            }

            /**
             * Obtiene el valor de la propiedad valorNominal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValorNominal() {
                return valorNominal;
            }

            /**
             * Define el valor de la propiedad valorNominal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValorNominal(String value) {
                this.valorNominal = value;
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
             * Obtiene el valor de la propiedad totalInvestment.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalInvestment() {
                return totalInvestment;
            }

            /**
             * Define el valor de la propiedad totalInvestment.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalInvestment(String value) {
                this.totalInvestment = value;
            }

            /**
             * Obtiene el valor de la propiedad originalCurrency.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginalCurrency() {
                return originalCurrency;
            }

            /**
             * Define el valor de la propiedad originalCurrency.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginalCurrency(String value) {
                this.originalCurrency = value;
            }

            /**
             * Obtiene el valor de la propiedad totalInvOriginalCCY.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalInvOriginalCCY() {
                return totalInvOriginalCCY;
            }

            /**
             * Define el valor de la propiedad totalInvOriginalCCY.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalInvOriginalCCY(String value) {
                this.totalInvOriginalCCY = value;
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
             * Obtiene el valor de la propiedad accuredInterest.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccuredInterest() {
                return accuredInterest;
            }

            /**
             * Define el valor de la propiedad accuredInterest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccuredInterest(String value) {
                this.accuredInterest = value;
            }

            /**
             * Obtiene el valor de la propiedad profitLoss.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfitLoss() {
                return profitLoss;
            }

            /**
             * Define el valor de la propiedad profitLoss.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfitLoss(String value) {
                this.profitLoss = value;
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
             * Obtiene el valor de la propiedad couponAmount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCouponAmount() {
                return couponAmount;
            }

            /**
             * Define el valor de la propiedad couponAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCouponAmount(String value) {
                this.couponAmount = value;
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
