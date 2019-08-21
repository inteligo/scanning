
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
 * <p>Clase Java para BRINTBPORTDETType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BRINTBPORTDETType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZEROREC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gBRINTBPORTDETDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBRINTBPORTDETDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AssetClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SecurityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CurrentBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RealDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BRINTBPORTDETType", propOrder = {
    "zerorec",
    "gbrintbportdetDetailType"
})
public class BRINTBPORTDETType {

    @XmlElement(name = "ZEROREC")
    protected String zerorec;
    @XmlElement(name = "gBRINTBPORTDETDetailType")
    protected BRINTBPORTDETType.GBRINTBPORTDETDetailType gbrintbportdetDetailType;

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
     * Obtiene el valor de la propiedad gbrintbportdetDetailType.
     * 
     * @return
     *     possible object is
     *     {@link BRINTBPORTDETType.GBRINTBPORTDETDetailType }
     *     
     */
    public BRINTBPORTDETType.GBRINTBPORTDETDetailType getGBRINTBPORTDETDetailType() {
        return gbrintbportdetDetailType;
    }

    /**
     * Define el valor de la propiedad gbrintbportdetDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link BRINTBPORTDETType.GBRINTBPORTDETDetailType }
     *     
     */
    public void setGBRINTBPORTDETDetailType(BRINTBPORTDETType.GBRINTBPORTDETDetailType value) {
        this.gbrintbportdetDetailType = value;
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
     *         &lt;element name="mBRINTBPORTDETDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AssetClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SecurityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CurrentBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RealDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbrintbportdetDetailType"
    })
    public static class GBRINTBPORTDETDetailType {

        @XmlElement(name = "mBRINTBPORTDETDetailType")
        protected List<BRINTBPORTDETType.GBRINTBPORTDETDetailType.MBRINTBPORTDETDetailType> mbrintbportdetDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbrintbportdetDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbrintbportdetDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBRINTBPORTDETDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BRINTBPORTDETType.GBRINTBPORTDETDetailType.MBRINTBPORTDETDetailType }
         * 
         * 
         */
        public List<BRINTBPORTDETType.GBRINTBPORTDETDetailType.MBRINTBPORTDETDetailType> getMBRINTBPORTDETDetailType() {
            if (mbrintbportdetDetailType == null) {
                mbrintbportdetDetailType = new ArrayList<BRINTBPORTDETType.GBRINTBPORTDETDetailType.MBRINTBPORTDETDetailType>();
            }
            return this.mbrintbportdetDetailType;
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
         *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AssetClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SecurityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CurrentBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RealDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "group",
            "productType",
            "assetClass",
            "sector",
            "region",
            "currency",
            "securityId",
            "productName",
            "currentBalance",
            "realDist"
        })
        public static class MBRINTBPORTDETDetailType {

            @XmlElement(name = "Group")
            protected String group;
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
            @XmlElement(name = "SecurityId")
            protected String securityId;
            @XmlElement(name = "ProductName")
            protected String productName;
            @XmlElement(name = "CurrentBalance")
            protected String currentBalance;
            @XmlElement(name = "RealDist")
            protected String realDist;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad group.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroup() {
                return group;
            }

            /**
             * Define el valor de la propiedad group.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroup(String value) {
                this.group = value;
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
             * Obtiene el valor de la propiedad securityId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecurityId() {
                return securityId;
            }

            /**
             * Define el valor de la propiedad securityId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecurityId(String value) {
                this.securityId = value;
            }

            /**
             * Obtiene el valor de la propiedad productName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductName() {
                return productName;
            }

            /**
             * Define el valor de la propiedad productName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductName(String value) {
                this.productName = value;
            }

            /**
             * Obtiene el valor de la propiedad currentBalance.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrentBalance() {
                return currentBalance;
            }

            /**
             * Define el valor de la propiedad currentBalance.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrentBalance(String value) {
                this.currentBalance = value;
            }

            /**
             * Obtiene el valor de la propiedad realDist.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRealDist() {
                return realDist;
            }

            /**
             * Define el valor de la propiedad realDist.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRealDist(String value) {
                this.realDist = value;
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
