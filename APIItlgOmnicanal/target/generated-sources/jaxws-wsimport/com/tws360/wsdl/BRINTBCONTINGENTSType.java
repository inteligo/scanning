
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
 * <p>Clase Java para BRINTBCONTINGENTSType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BRINTBCONTINGENTSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DCUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUBTOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUBTOTAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LTOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZEROREC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gBRINTBCONTINGENTSDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBRINTBCONTINGENTSDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HDRLINE11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HDRLINE12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GeneralAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ActualAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InitialDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Term" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GuaranteedProducts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BRINTBCONTINGENTSType", propOrder = {
    "dcus",
    "subtot",
    "subtotal",
    "ltot",
    "ttot",
    "zerorec",
    "gbrintbcontingentsDetailType"
})
public class BRINTBCONTINGENTSType {

    @XmlElement(name = "DCUS")
    protected String dcus;
    @XmlElement(name = "SUBTOT")
    protected String subtot;
    @XmlElement(name = "SUBTOTAL")
    protected String subtotal;
    @XmlElement(name = "LTOT")
    protected String ltot;
    @XmlElement(name = "TTOT")
    protected String ttot;
    @XmlElement(name = "ZEROREC")
    protected String zerorec;
    @XmlElement(name = "gBRINTBCONTINGENTSDetailType")
    protected BRINTBCONTINGENTSType.GBRINTBCONTINGENTSDetailType gbrintbcontingentsDetailType;

    /**
     * Obtiene el valor de la propiedad dcus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCUS() {
        return dcus;
    }

    /**
     * Define el valor de la propiedad dcus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCUS(String value) {
        this.dcus = value;
    }

    /**
     * Obtiene el valor de la propiedad subtot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBTOT() {
        return subtot;
    }

    /**
     * Define el valor de la propiedad subtot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBTOT(String value) {
        this.subtot = value;
    }

    /**
     * Obtiene el valor de la propiedad subtotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBTOTAL() {
        return subtotal;
    }

    /**
     * Define el valor de la propiedad subtotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBTOTAL(String value) {
        this.subtotal = value;
    }

    /**
     * Obtiene el valor de la propiedad ltot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTOT() {
        return ltot;
    }

    /**
     * Define el valor de la propiedad ltot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTOT(String value) {
        this.ltot = value;
    }

    /**
     * Obtiene el valor de la propiedad ttot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTOT() {
        return ttot;
    }

    /**
     * Define el valor de la propiedad ttot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTOT(String value) {
        this.ttot = value;
    }

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
     * Obtiene el valor de la propiedad gbrintbcontingentsDetailType.
     * 
     * @return
     *     possible object is
     *     {@link BRINTBCONTINGENTSType.GBRINTBCONTINGENTSDetailType }
     *     
     */
    public BRINTBCONTINGENTSType.GBRINTBCONTINGENTSDetailType getGBRINTBCONTINGENTSDetailType() {
        return gbrintbcontingentsDetailType;
    }

    /**
     * Define el valor de la propiedad gbrintbcontingentsDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link BRINTBCONTINGENTSType.GBRINTBCONTINGENTSDetailType }
     *     
     */
    public void setGBRINTBCONTINGENTSDetailType(BRINTBCONTINGENTSType.GBRINTBCONTINGENTSDetailType value) {
        this.gbrintbcontingentsDetailType = value;
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
     *         &lt;element name="mBRINTBCONTINGENTSDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HDRLINE11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HDRLINE12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GeneralAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ActualAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InitialDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Term" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GuaranteedProducts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbrintbcontingentsDetailType"
    })
    public static class GBRINTBCONTINGENTSDetailType {

        @XmlElement(name = "mBRINTBCONTINGENTSDetailType")
        protected List<BRINTBCONTINGENTSType.GBRINTBCONTINGENTSDetailType.MBRINTBCONTINGENTSDetailType> mbrintbcontingentsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbrintbcontingentsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbrintbcontingentsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBRINTBCONTINGENTSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BRINTBCONTINGENTSType.GBRINTBCONTINGENTSDetailType.MBRINTBCONTINGENTSDetailType }
         * 
         * 
         */
        public List<BRINTBCONTINGENTSType.GBRINTBCONTINGENTSDetailType.MBRINTBCONTINGENTSDetailType> getMBRINTBCONTINGENTSDetailType() {
            if (mbrintbcontingentsDetailType == null) {
                mbrintbcontingentsDetailType = new ArrayList<BRINTBCONTINGENTSType.GBRINTBCONTINGENTSDetailType.MBRINTBCONTINGENTSDetailType>();
            }
            return this.mbrintbcontingentsDetailType;
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
         *         &lt;element name="HDRLINE11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="HDRLINE12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GeneralAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ActualAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InitialDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Term" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GuaranteedProducts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "hdrline11",
            "hdrline12",
            "type",
            "referenceNo",
            "generalAmount",
            "actualAmount",
            "initialDate",
            "maturityDate",
            "term",
            "status",
            "description",
            "guaranteedProducts"
        })
        public static class MBRINTBCONTINGENTSDetailType {

            @XmlElement(name = "HDRLINE11")
            protected String hdrline11;
            @XmlElement(name = "HDRLINE12")
            protected String hdrline12;
            @XmlElement(name = "Type")
            protected String type;
            @XmlElement(name = "ReferenceNo")
            protected String referenceNo;
            @XmlElement(name = "GeneralAmount")
            protected String generalAmount;
            @XmlElement(name = "ActualAmount")
            protected String actualAmount;
            @XmlElement(name = "InitialDate")
            protected String initialDate;
            @XmlElement(name = "MaturityDate")
            protected String maturityDate;
            @XmlElement(name = "Term")
            protected String term;
            @XmlElement(name = "Status")
            protected String status;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "GuaranteedProducts")
            protected String guaranteedProducts;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad hdrline11.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHDRLINE11() {
                return hdrline11;
            }

            /**
             * Define el valor de la propiedad hdrline11.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHDRLINE11(String value) {
                this.hdrline11 = value;
            }

            /**
             * Obtiene el valor de la propiedad hdrline12.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHDRLINE12() {
                return hdrline12;
            }

            /**
             * Define el valor de la propiedad hdrline12.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHDRLINE12(String value) {
                this.hdrline12 = value;
            }

            /**
             * Obtiene el valor de la propiedad type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Define el valor de la propiedad type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Obtiene el valor de la propiedad referenceNo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferenceNo() {
                return referenceNo;
            }

            /**
             * Define el valor de la propiedad referenceNo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferenceNo(String value) {
                this.referenceNo = value;
            }

            /**
             * Obtiene el valor de la propiedad generalAmount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGeneralAmount() {
                return generalAmount;
            }

            /**
             * Define el valor de la propiedad generalAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGeneralAmount(String value) {
                this.generalAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad actualAmount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActualAmount() {
                return actualAmount;
            }

            /**
             * Define el valor de la propiedad actualAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActualAmount(String value) {
                this.actualAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad initialDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInitialDate() {
                return initialDate;
            }

            /**
             * Define el valor de la propiedad initialDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInitialDate(String value) {
                this.initialDate = value;
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
             * Obtiene el valor de la propiedad term.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTerm() {
                return term;
            }

            /**
             * Define el valor de la propiedad term.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTerm(String value) {
                this.term = value;
            }

            /**
             * Obtiene el valor de la propiedad status.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Define el valor de la propiedad status.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

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
             * Obtiene el valor de la propiedad guaranteedProducts.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGuaranteedProducts() {
                return guaranteedProducts;
            }

            /**
             * Define el valor de la propiedad guaranteedProducts.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGuaranteedProducts(String value) {
                this.guaranteedProducts = value;
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
