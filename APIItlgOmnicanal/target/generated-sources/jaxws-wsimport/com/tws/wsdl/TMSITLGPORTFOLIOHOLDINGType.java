
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
 * <p>Clase Java para TMSITLGPORTFOLIOHOLDINGType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMSITLGPORTFOLIOHOLDINGType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gTMSITLGPORTFOLIOHOLDINGDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mTMSITLGPORTFOLIOHOLDINGDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="IHDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccountOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Portfolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SecNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SecurityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Isin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SubAssetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SecCcy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MatDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NominalSecCcy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PriceCcy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MarketPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DateLastPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "TMSITLGPORTFOLIOHOLDINGType", propOrder = {
    "gtmsitlgportfolioholdingDetailType"
})
public class TMSITLGPORTFOLIOHOLDINGType {

    @XmlElement(name = "gTMSITLGPORTFOLIOHOLDINGDetailType")
    protected TMSITLGPORTFOLIOHOLDINGType.GTMSITLGPORTFOLIOHOLDINGDetailType gtmsitlgportfolioholdingDetailType;

    /**
     * Obtiene el valor de la propiedad gtmsitlgportfolioholdingDetailType.
     * 
     * @return
     *     possible object is
     *     {@link TMSITLGPORTFOLIOHOLDINGType.GTMSITLGPORTFOLIOHOLDINGDetailType }
     *     
     */
    public TMSITLGPORTFOLIOHOLDINGType.GTMSITLGPORTFOLIOHOLDINGDetailType getGTMSITLGPORTFOLIOHOLDINGDetailType() {
        return gtmsitlgportfolioholdingDetailType;
    }

    /**
     * Define el valor de la propiedad gtmsitlgportfolioholdingDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSITLGPORTFOLIOHOLDINGType.GTMSITLGPORTFOLIOHOLDINGDetailType }
     *     
     */
    public void setGTMSITLGPORTFOLIOHOLDINGDetailType(TMSITLGPORTFOLIOHOLDINGType.GTMSITLGPORTFOLIOHOLDINGDetailType value) {
        this.gtmsitlgportfolioholdingDetailType = value;
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
     *         &lt;element name="mTMSITLGPORTFOLIOHOLDINGDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="IHDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccountOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Portfolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SecNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SecurityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Isin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SubAssetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SecCcy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MatDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NominalSecCcy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PriceCcy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MarketPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DateLastPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mtmsitlgportfolioholdingDetailType"
    })
    public static class GTMSITLGPORTFOLIOHOLDINGDetailType {

        @XmlElement(name = "mTMSITLGPORTFOLIOHOLDINGDetailType")
        protected List<TMSITLGPORTFOLIOHOLDINGType.GTMSITLGPORTFOLIOHOLDINGDetailType.MTMSITLGPORTFOLIOHOLDINGDetailType> mtmsitlgportfolioholdingDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mtmsitlgportfolioholdingDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtmsitlgportfolioholdingDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTMSITLGPORTFOLIOHOLDINGDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TMSITLGPORTFOLIOHOLDINGType.GTMSITLGPORTFOLIOHOLDINGDetailType.MTMSITLGPORTFOLIOHOLDINGDetailType }
         * 
         * 
         */
        public List<TMSITLGPORTFOLIOHOLDINGType.GTMSITLGPORTFOLIOHOLDINGDetailType.MTMSITLGPORTFOLIOHOLDINGDetailType> getMTMSITLGPORTFOLIOHOLDINGDetailType() {
            if (mtmsitlgportfolioholdingDetailType == null) {
                mtmsitlgportfolioholdingDetailType = new ArrayList<TMSITLGPORTFOLIOHOLDINGType.GTMSITLGPORTFOLIOHOLDINGDetailType.MTMSITLGPORTFOLIOHOLDINGDetailType>();
            }
            return this.mtmsitlgportfolioholdingDetailType;
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
         *         &lt;element name="HDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccountOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Portfolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SecNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SecurityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Isin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SubAssetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SecCcy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MatDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NominalSecCcy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PriceCcy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MarketPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DateLastPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "hdr2",
            "accountOfficer",
            "portfolio",
            "secNo",
            "securityName",
            "isin",
            "subAssetType",
            "secCcy",
            "matDate",
            "nominalSecCcy",
            "priceCcy",
            "marketPrice",
            "dateLastPrice"
        })
        public static class MTMSITLGPORTFOLIOHOLDINGDetailType {

            @XmlElement(name = "IHDR")
            protected String ihdr;
            @XmlElement(name = "HDR2")
            protected String hdr2;
            @XmlElement(name = "AccountOfficer")
            protected String accountOfficer;
            @XmlElement(name = "Portfolio")
            protected String portfolio;
            @XmlElement(name = "SecNo")
            protected String secNo;
            @XmlElement(name = "SecurityName")
            protected String securityName;
            @XmlElement(name = "Isin")
            protected String isin;
            @XmlElement(name = "SubAssetType")
            protected String subAssetType;
            @XmlElement(name = "SecCcy")
            protected String secCcy;
            @XmlElement(name = "MatDate")
            protected String matDate;
            @XmlElement(name = "NominalSecCcy")
            protected String nominalSecCcy;
            @XmlElement(name = "PriceCcy")
            protected String priceCcy;
            @XmlElement(name = "MarketPrice")
            protected String marketPrice;
            @XmlElement(name = "DateLastPrice")
            protected String dateLastPrice;
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
             * Obtiene el valor de la propiedad hdr2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHDR2() {
                return hdr2;
            }

            /**
             * Define el valor de la propiedad hdr2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHDR2(String value) {
                this.hdr2 = value;
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
             * Obtiene el valor de la propiedad portfolio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPortfolio() {
                return portfolio;
            }

            /**
             * Define el valor de la propiedad portfolio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPortfolio(String value) {
                this.portfolio = value;
            }

            /**
             * Obtiene el valor de la propiedad secNo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecNo() {
                return secNo;
            }

            /**
             * Define el valor de la propiedad secNo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecNo(String value) {
                this.secNo = value;
            }

            /**
             * Obtiene el valor de la propiedad securityName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecurityName() {
                return securityName;
            }

            /**
             * Define el valor de la propiedad securityName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecurityName(String value) {
                this.securityName = value;
            }

            /**
             * Obtiene el valor de la propiedad isin.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsin() {
                return isin;
            }

            /**
             * Define el valor de la propiedad isin.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsin(String value) {
                this.isin = value;
            }

            /**
             * Obtiene el valor de la propiedad subAssetType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubAssetType() {
                return subAssetType;
            }

            /**
             * Define el valor de la propiedad subAssetType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubAssetType(String value) {
                this.subAssetType = value;
            }

            /**
             * Obtiene el valor de la propiedad secCcy.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecCcy() {
                return secCcy;
            }

            /**
             * Define el valor de la propiedad secCcy.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecCcy(String value) {
                this.secCcy = value;
            }

            /**
             * Obtiene el valor de la propiedad matDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMatDate() {
                return matDate;
            }

            /**
             * Define el valor de la propiedad matDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMatDate(String value) {
                this.matDate = value;
            }

            /**
             * Obtiene el valor de la propiedad nominalSecCcy.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNominalSecCcy() {
                return nominalSecCcy;
            }

            /**
             * Define el valor de la propiedad nominalSecCcy.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNominalSecCcy(String value) {
                this.nominalSecCcy = value;
            }

            /**
             * Obtiene el valor de la propiedad priceCcy.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPriceCcy() {
                return priceCcy;
            }

            /**
             * Define el valor de la propiedad priceCcy.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPriceCcy(String value) {
                this.priceCcy = value;
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
             * Obtiene el valor de la propiedad dateLastPrice.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateLastPrice() {
                return dateLastPrice;
            }

            /**
             * Define el valor de la propiedad dateLastPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateLastPrice(String value) {
                this.dateLastPrice = value;
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
