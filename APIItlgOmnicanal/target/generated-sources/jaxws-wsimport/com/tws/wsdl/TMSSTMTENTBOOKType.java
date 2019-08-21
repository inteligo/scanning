
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
 * <p>Clase Java para TMSSTMTENTBOOKType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMSSTMTENTBOOKType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DORIGTEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DAUTOPAYTEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DORIGACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DAUTOACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORIGACCTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTOPAYCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEUEQUIV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEUCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZERORECORDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gTMSSTMTENTBOOKDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mTMSSTMTENTBOOKDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HDRLINE11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HDRLINE12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HDRLINE21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HDRLINE22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HDRLINE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PRTNM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PostFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Abono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Saldo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Contador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "TMSSTMTENTBOOKType", propOrder = {
    "dacc",
    "cus",
    "dccy",
    "dorigtext",
    "dautopaytext",
    "dorigacct",
    "dautoacct",
    "origacctccy",
    "autopayccy",
    "deuequiv",
    "deuccy",
    "zerorecords",
    "gtmsstmtentbookDetailType"
})
public class TMSSTMTENTBOOKType {

    @XmlElement(name = "DACC")
    protected String dacc;
    @XmlElement(name = "CUS")
    protected String cus;
    @XmlElement(name = "DCCY")
    protected String dccy;
    @XmlElement(name = "DORIGTEXT")
    protected String dorigtext;
    @XmlElement(name = "DAUTOPAYTEXT")
    protected String dautopaytext;
    @XmlElement(name = "DORIGACCT")
    protected String dorigacct;
    @XmlElement(name = "DAUTOACCT")
    protected String dautoacct;
    @XmlElement(name = "ORIGACCTCCY")
    protected String origacctccy;
    @XmlElement(name = "AUTOPAYCCY")
    protected String autopayccy;
    @XmlElement(name = "DEUEQUIV")
    protected String deuequiv;
    @XmlElement(name = "DEUCCY")
    protected String deuccy;
    @XmlElement(name = "ZERORECORDS")
    protected String zerorecords;
    @XmlElement(name = "gTMSSTMTENTBOOKDetailType")
    protected TMSSTMTENTBOOKType.GTMSSTMTENTBOOKDetailType gtmsstmtentbookDetailType;

    /**
     * Obtiene el valor de la propiedad dacc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDACC() {
        return dacc;
    }

    /**
     * Define el valor de la propiedad dacc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDACC(String value) {
        this.dacc = value;
    }

    /**
     * Obtiene el valor de la propiedad cus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUS() {
        return cus;
    }

    /**
     * Define el valor de la propiedad cus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUS(String value) {
        this.cus = value;
    }

    /**
     * Obtiene el valor de la propiedad dccy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCY() {
        return dccy;
    }

    /**
     * Define el valor de la propiedad dccy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCY(String value) {
        this.dccy = value;
    }

    /**
     * Obtiene el valor de la propiedad dorigtext.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDORIGTEXT() {
        return dorigtext;
    }

    /**
     * Define el valor de la propiedad dorigtext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDORIGTEXT(String value) {
        this.dorigtext = value;
    }

    /**
     * Obtiene el valor de la propiedad dautopaytext.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAUTOPAYTEXT() {
        return dautopaytext;
    }

    /**
     * Define el valor de la propiedad dautopaytext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAUTOPAYTEXT(String value) {
        this.dautopaytext = value;
    }

    /**
     * Obtiene el valor de la propiedad dorigacct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDORIGACCT() {
        return dorigacct;
    }

    /**
     * Define el valor de la propiedad dorigacct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDORIGACCT(String value) {
        this.dorigacct = value;
    }

    /**
     * Obtiene el valor de la propiedad dautoacct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAUTOACCT() {
        return dautoacct;
    }

    /**
     * Define el valor de la propiedad dautoacct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAUTOACCT(String value) {
        this.dautoacct = value;
    }

    /**
     * Obtiene el valor de la propiedad origacctccy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGACCTCCY() {
        return origacctccy;
    }

    /**
     * Define el valor de la propiedad origacctccy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGACCTCCY(String value) {
        this.origacctccy = value;
    }

    /**
     * Obtiene el valor de la propiedad autopayccy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTOPAYCCY() {
        return autopayccy;
    }

    /**
     * Define el valor de la propiedad autopayccy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTOPAYCCY(String value) {
        this.autopayccy = value;
    }

    /**
     * Obtiene el valor de la propiedad deuequiv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEUEQUIV() {
        return deuequiv;
    }

    /**
     * Define el valor de la propiedad deuequiv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEUEQUIV(String value) {
        this.deuequiv = value;
    }

    /**
     * Obtiene el valor de la propiedad deuccy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEUCCY() {
        return deuccy;
    }

    /**
     * Define el valor de la propiedad deuccy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEUCCY(String value) {
        this.deuccy = value;
    }

    /**
     * Obtiene el valor de la propiedad zerorecords.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZERORECORDS() {
        return zerorecords;
    }

    /**
     * Define el valor de la propiedad zerorecords.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZERORECORDS(String value) {
        this.zerorecords = value;
    }

    /**
     * Obtiene el valor de la propiedad gtmsstmtentbookDetailType.
     * 
     * @return
     *     possible object is
     *     {@link TMSSTMTENTBOOKType.GTMSSTMTENTBOOKDetailType }
     *     
     */
    public TMSSTMTENTBOOKType.GTMSSTMTENTBOOKDetailType getGTMSSTMTENTBOOKDetailType() {
        return gtmsstmtentbookDetailType;
    }

    /**
     * Define el valor de la propiedad gtmsstmtentbookDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSSTMTENTBOOKType.GTMSSTMTENTBOOKDetailType }
     *     
     */
    public void setGTMSSTMTENTBOOKDetailType(TMSSTMTENTBOOKType.GTMSSTMTENTBOOKDetailType value) {
        this.gtmsstmtentbookDetailType = value;
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
     *         &lt;element name="mTMSSTMTENTBOOKDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HDRLINE11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HDRLINE12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HDRLINE21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HDRLINE22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HDRLINE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PRTNM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PostFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Abono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Saldo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Contador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mtmsstmtentbookDetailType"
    })
    public static class GTMSSTMTENTBOOKDetailType {

        @XmlElement(name = "mTMSSTMTENTBOOKDetailType")
        protected List<TMSSTMTENTBOOKType.GTMSSTMTENTBOOKDetailType.MTMSSTMTENTBOOKDetailType> mtmsstmtentbookDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mtmsstmtentbookDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtmsstmtentbookDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTMSSTMTENTBOOKDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TMSSTMTENTBOOKType.GTMSSTMTENTBOOKDetailType.MTMSSTMTENTBOOKDetailType }
         * 
         * 
         */
        public List<TMSSTMTENTBOOKType.GTMSSTMTENTBOOKDetailType.MTMSSTMTENTBOOKDetailType> getMTMSSTMTENTBOOKDetailType() {
            if (mtmsstmtentbookDetailType == null) {
                mtmsstmtentbookDetailType = new ArrayList<TMSSTMTENTBOOKType.GTMSSTMTENTBOOKDetailType.MTMSSTMTENTBOOKDetailType>();
            }
            return this.mtmsstmtentbookDetailType;
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
         *         &lt;element name="HDRLINE21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="HDRLINE22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="HDRLINE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PRTNM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PostFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Abono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Saldo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Contador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "hdrline21",
            "hdrline22",
            "hdrline3",
            "bacc",
            "prtnm",
            "cliente",
            "currency",
            "cuenta",
            "fecha",
            "descripcion",
            "reference",
            "postFecha",
            "cargo",
            "abono",
            "saldo",
            "contador"
        })
        public static class MTMSSTMTENTBOOKDetailType {

            @XmlElement(name = "HDRLINE11")
            protected String hdrline11;
            @XmlElement(name = "HDRLINE12")
            protected String hdrline12;
            @XmlElement(name = "HDRLINE21")
            protected String hdrline21;
            @XmlElement(name = "HDRLINE22")
            protected String hdrline22;
            @XmlElement(name = "HDRLINE3")
            protected String hdrline3;
            @XmlElement(name = "BACC")
            protected String bacc;
            @XmlElement(name = "PRTNM")
            protected String prtnm;
            @XmlElement(name = "Cliente")
            protected String cliente;
            @XmlElement(name = "Currency")
            protected String currency;
            @XmlElement(name = "Cuenta")
            protected String cuenta;
            @XmlElement(name = "Fecha")
            protected String fecha;
            @XmlElement(name = "Descripcion")
            protected String descripcion;
            @XmlElement(name = "Reference")
            protected String reference;
            @XmlElement(name = "PostFecha")
            protected String postFecha;
            @XmlElement(name = "Cargo")
            protected String cargo;
            @XmlElement(name = "Abono")
            protected String abono;
            @XmlElement(name = "Saldo")
            protected String saldo;
            @XmlElement(name = "Contador")
            protected String contador;
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
             * Obtiene el valor de la propiedad hdrline21.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHDRLINE21() {
                return hdrline21;
            }

            /**
             * Define el valor de la propiedad hdrline21.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHDRLINE21(String value) {
                this.hdrline21 = value;
            }

            /**
             * Obtiene el valor de la propiedad hdrline22.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHDRLINE22() {
                return hdrline22;
            }

            /**
             * Define el valor de la propiedad hdrline22.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHDRLINE22(String value) {
                this.hdrline22 = value;
            }

            /**
             * Obtiene el valor de la propiedad hdrline3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHDRLINE3() {
                return hdrline3;
            }

            /**
             * Define el valor de la propiedad hdrline3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHDRLINE3(String value) {
                this.hdrline3 = value;
            }

            /**
             * Obtiene el valor de la propiedad bacc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBACC() {
                return bacc;
            }

            /**
             * Define el valor de la propiedad bacc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBACC(String value) {
                this.bacc = value;
            }

            /**
             * Obtiene el valor de la propiedad prtnm.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRTNM() {
                return prtnm;
            }

            /**
             * Define el valor de la propiedad prtnm.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRTNM(String value) {
                this.prtnm = value;
            }

            /**
             * Obtiene el valor de la propiedad cliente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCliente() {
                return cliente;
            }

            /**
             * Define el valor de la propiedad cliente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCliente(String value) {
                this.cliente = value;
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
             * Obtiene el valor de la propiedad cuenta.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCuenta() {
                return cuenta;
            }

            /**
             * Define el valor de la propiedad cuenta.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCuenta(String value) {
                this.cuenta = value;
            }

            /**
             * Obtiene el valor de la propiedad fecha.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFecha() {
                return fecha;
            }

            /**
             * Define el valor de la propiedad fecha.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFecha(String value) {
                this.fecha = value;
            }

            /**
             * Obtiene el valor de la propiedad descripcion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescripcion() {
                return descripcion;
            }

            /**
             * Define el valor de la propiedad descripcion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescripcion(String value) {
                this.descripcion = value;
            }

            /**
             * Obtiene el valor de la propiedad reference.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReference() {
                return reference;
            }

            /**
             * Define el valor de la propiedad reference.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReference(String value) {
                this.reference = value;
            }

            /**
             * Obtiene el valor de la propiedad postFecha.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostFecha() {
                return postFecha;
            }

            /**
             * Define el valor de la propiedad postFecha.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostFecha(String value) {
                this.postFecha = value;
            }

            /**
             * Obtiene el valor de la propiedad cargo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCargo() {
                return cargo;
            }

            /**
             * Define el valor de la propiedad cargo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCargo(String value) {
                this.cargo = value;
            }

            /**
             * Obtiene el valor de la propiedad abono.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAbono() {
                return abono;
            }

            /**
             * Define el valor de la propiedad abono.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAbono(String value) {
                this.abono = value;
            }

            /**
             * Obtiene el valor de la propiedad saldo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSaldo() {
                return saldo;
            }

            /**
             * Define el valor de la propiedad saldo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSaldo(String value) {
                this.saldo = value;
            }

            /**
             * Obtiene el valor de la propiedad contador.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContador() {
                return contador;
            }

            /**
             * Define el valor de la propiedad contador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContador(String value) {
                this.contador = value;
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
