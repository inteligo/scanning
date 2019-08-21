
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
 * <p>Clase Java para ITLGINTSECMASTLISTType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ITLGINTSECMASTLISTType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gITLGINTSECMASTLISTDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mITLGINTSECMASTLISTDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="IHDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SecName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Isin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CoDom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SecDom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SecCcy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PriceCcy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LastPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DtLastPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SATDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Pricetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PriceUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="IntRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Maturity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TradingUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MarginRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CusipNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AssetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ITLGINTSECMASTLISTType", propOrder = {
    "gitlgintsecmastlistDetailType"
})
public class ITLGINTSECMASTLISTType {

    @XmlElement(name = "gITLGINTSECMASTLISTDetailType")
    protected ITLGINTSECMASTLISTType.GITLGINTSECMASTLISTDetailType gitlgintsecmastlistDetailType;

    /**
     * Obtiene el valor de la propiedad gitlgintsecmastlistDetailType.
     * 
     * @return
     *     possible object is
     *     {@link ITLGINTSECMASTLISTType.GITLGINTSECMASTLISTDetailType }
     *     
     */
    public ITLGINTSECMASTLISTType.GITLGINTSECMASTLISTDetailType getGITLGINTSECMASTLISTDetailType() {
        return gitlgintsecmastlistDetailType;
    }

    /**
     * Define el valor de la propiedad gitlgintsecmastlistDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link ITLGINTSECMASTLISTType.GITLGINTSECMASTLISTDetailType }
     *     
     */
    public void setGITLGINTSECMASTLISTDetailType(ITLGINTSECMASTLISTType.GITLGINTSECMASTLISTDetailType value) {
        this.gitlgintsecmastlistDetailType = value;
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
     *         &lt;element name="mITLGINTSECMASTLISTDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="IHDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SecName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Isin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CoDom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SecDom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SecCcy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PriceCcy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LastPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DtLastPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SATDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Pricetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PriceUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="IntRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Maturity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TradingUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MarginRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CusipNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AssetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mitlgintsecmastlistDetailType"
    })
    public static class GITLGINTSECMASTLISTDetailType {

        @XmlElement(name = "mITLGINTSECMASTLISTDetailType")
        protected List<ITLGINTSECMASTLISTType.GITLGINTSECMASTLISTDetailType.MITLGINTSECMASTLISTDetailType> mitlgintsecmastlistDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mitlgintsecmastlistDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mitlgintsecmastlistDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMITLGINTSECMASTLISTDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ITLGINTSECMASTLISTType.GITLGINTSECMASTLISTDetailType.MITLGINTSECMASTLISTDetailType }
         * 
         * 
         */
        public List<ITLGINTSECMASTLISTType.GITLGINTSECMASTLISTDetailType.MITLGINTSECMASTLISTDetailType> getMITLGINTSECMASTLISTDetailType() {
            if (mitlgintsecmastlistDetailType == null) {
                mitlgintsecmastlistDetailType = new ArrayList<ITLGINTSECMASTLISTType.GITLGINTSECMASTLISTDetailType.MITLGINTSECMASTLISTDetailType>();
            }
            return this.mitlgintsecmastlistDetailType;
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
         *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="IHDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SecName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Isin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CoDom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SecDom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SecCcy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PriceCcy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LastPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DtLastPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SATDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Pricetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PriceUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="IntRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Maturity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TradingUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MarginRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CusipNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AssetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "id",
            "ihdr",
            "secName",
            "isin",
            "coDom",
            "secDom",
            "secCcy",
            "priceCcy",
            "lastPrice",
            "dtLastPrice",
            "sat",
            "satDesc",
            "pricetype",
            "priceUpdate",
            "bs",
            "intRate",
            "maturity",
            "tradingUnits",
            "marginRate",
            "cusipNO",
            "assetType"
        })
        public static class MITLGINTSECMASTLISTDetailType {

            @XmlElement(name = "Id")
            protected String id;
            @XmlElement(name = "IHDR")
            protected String ihdr;
            @XmlElement(name = "SecName")
            protected String secName;
            @XmlElement(name = "Isin")
            protected String isin;
            @XmlElement(name = "CoDom")
            protected String coDom;
            @XmlElement(name = "SecDom")
            protected String secDom;
            @XmlElement(name = "SecCcy")
            protected String secCcy;
            @XmlElement(name = "PriceCcy")
            protected String priceCcy;
            @XmlElement(name = "LastPrice")
            protected String lastPrice;
            @XmlElement(name = "DtLastPrice")
            protected String dtLastPrice;
            @XmlElement(name = "SAT")
            protected String sat;
            @XmlElement(name = "SATDesc")
            protected String satDesc;
            @XmlElement(name = "Pricetype")
            protected String pricetype;
            @XmlElement(name = "PriceUpdate")
            protected String priceUpdate;
            @XmlElement(name = "BS")
            protected String bs;
            @XmlElement(name = "IntRate")
            protected String intRate;
            @XmlElement(name = "Maturity")
            protected String maturity;
            @XmlElement(name = "TradingUnits")
            protected String tradingUnits;
            @XmlElement(name = "MarginRate")
            protected String marginRate;
            @XmlElement(name = "CusipNO")
            protected String cusipNO;
            @XmlElement(name = "AssetType")
            protected String assetType;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

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
             * Obtiene el valor de la propiedad secName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecName() {
                return secName;
            }

            /**
             * Define el valor de la propiedad secName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecName(String value) {
                this.secName = value;
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
             * Obtiene el valor de la propiedad coDom.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCoDom() {
                return coDom;
            }

            /**
             * Define el valor de la propiedad coDom.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCoDom(String value) {
                this.coDom = value;
            }

            /**
             * Obtiene el valor de la propiedad secDom.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecDom() {
                return secDom;
            }

            /**
             * Define el valor de la propiedad secDom.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecDom(String value) {
                this.secDom = value;
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
             * Obtiene el valor de la propiedad lastPrice.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastPrice() {
                return lastPrice;
            }

            /**
             * Define el valor de la propiedad lastPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastPrice(String value) {
                this.lastPrice = value;
            }

            /**
             * Obtiene el valor de la propiedad dtLastPrice.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDtLastPrice() {
                return dtLastPrice;
            }

            /**
             * Define el valor de la propiedad dtLastPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDtLastPrice(String value) {
                this.dtLastPrice = value;
            }

            /**
             * Obtiene el valor de la propiedad sat.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSAT() {
                return sat;
            }

            /**
             * Define el valor de la propiedad sat.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSAT(String value) {
                this.sat = value;
            }

            /**
             * Obtiene el valor de la propiedad satDesc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSATDesc() {
                return satDesc;
            }

            /**
             * Define el valor de la propiedad satDesc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSATDesc(String value) {
                this.satDesc = value;
            }

            /**
             * Obtiene el valor de la propiedad pricetype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPricetype() {
                return pricetype;
            }

            /**
             * Define el valor de la propiedad pricetype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPricetype(String value) {
                this.pricetype = value;
            }

            /**
             * Obtiene el valor de la propiedad priceUpdate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPriceUpdate() {
                return priceUpdate;
            }

            /**
             * Define el valor de la propiedad priceUpdate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPriceUpdate(String value) {
                this.priceUpdate = value;
            }

            /**
             * Obtiene el valor de la propiedad bs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBS() {
                return bs;
            }

            /**
             * Define el valor de la propiedad bs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBS(String value) {
                this.bs = value;
            }

            /**
             * Obtiene el valor de la propiedad intRate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIntRate() {
                return intRate;
            }

            /**
             * Define el valor de la propiedad intRate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIntRate(String value) {
                this.intRate = value;
            }

            /**
             * Obtiene el valor de la propiedad maturity.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaturity() {
                return maturity;
            }

            /**
             * Define el valor de la propiedad maturity.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaturity(String value) {
                this.maturity = value;
            }

            /**
             * Obtiene el valor de la propiedad tradingUnits.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTradingUnits() {
                return tradingUnits;
            }

            /**
             * Define el valor de la propiedad tradingUnits.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTradingUnits(String value) {
                this.tradingUnits = value;
            }

            /**
             * Obtiene el valor de la propiedad marginRate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarginRate() {
                return marginRate;
            }

            /**
             * Define el valor de la propiedad marginRate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarginRate(String value) {
                this.marginRate = value;
            }

            /**
             * Obtiene el valor de la propiedad cusipNO.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCusipNO() {
                return cusipNO;
            }

            /**
             * Define el valor de la propiedad cusipNO.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCusipNO(String value) {
                this.cusipNO = value;
            }

            /**
             * Obtiene el valor de la propiedad assetType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssetType() {
                return assetType;
            }

            /**
             * Define el valor de la propiedad assetType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssetType(String value) {
                this.assetType = value;
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
