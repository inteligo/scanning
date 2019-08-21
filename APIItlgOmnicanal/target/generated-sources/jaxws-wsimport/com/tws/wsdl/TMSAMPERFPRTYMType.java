
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
 * <p>Clase Java para TMSAMPERFPRTYMType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMSAMPERFPRTYMType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LPORTFOLIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LREFCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LBENCHMARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LBEGINMKTVLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LENDMKTVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PORTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LPORTOPENED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LPORTCLOSED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LCALCMETHOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DISPCLOSEDDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gTMSAMPERFPRTYMDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mTMSAMPERFPRTYMDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LYLYPFOLIPERF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DISPPORTFOLIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DISPCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BENCHNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DISPBEGINVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DISPENDVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LCURRENTDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DISPPORTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DISPOPENDDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DISPMETHOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DATETODAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EndMarketValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NetFlow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="YearlyReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CumReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GeoCumReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FeesFlow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DividendAccrual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RecoverableTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BenchReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CumBenchReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AvgInvestment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PortfolioId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PortfolioCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ReportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "TMSAMPERFPRTYMType", propOrder = {
    "lportfolio",
    "lrefccy",
    "lbenchmark",
    "lbeginmktvle",
    "lendmktvalue",
    "portname",
    "lportopened",
    "lportclosed",
    "lcalcmethod",
    "dispcloseddate",
    "gtmsamperfprtymDetailType"
})
public class TMSAMPERFPRTYMType {

    @XmlElement(name = "LPORTFOLIO")
    protected String lportfolio;
    @XmlElement(name = "LREFCCY")
    protected String lrefccy;
    @XmlElement(name = "LBENCHMARK")
    protected String lbenchmark;
    @XmlElement(name = "LBEGINMKTVLE")
    protected String lbeginmktvle;
    @XmlElement(name = "LENDMKTVALUE")
    protected String lendmktvalue;
    @XmlElement(name = "PORTNAME")
    protected String portname;
    @XmlElement(name = "LPORTOPENED")
    protected String lportopened;
    @XmlElement(name = "LPORTCLOSED")
    protected String lportclosed;
    @XmlElement(name = "LCALCMETHOD")
    protected String lcalcmethod;
    @XmlElement(name = "DISPCLOSEDDATE")
    protected String dispcloseddate;
    @XmlElement(name = "gTMSAMPERFPRTYMDetailType")
    protected TMSAMPERFPRTYMType.GTMSAMPERFPRTYMDetailType gtmsamperfprtymDetailType;

    /**
     * Obtiene el valor de la propiedad lportfolio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLPORTFOLIO() {
        return lportfolio;
    }

    /**
     * Define el valor de la propiedad lportfolio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLPORTFOLIO(String value) {
        this.lportfolio = value;
    }

    /**
     * Obtiene el valor de la propiedad lrefccy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLREFCCY() {
        return lrefccy;
    }

    /**
     * Define el valor de la propiedad lrefccy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLREFCCY(String value) {
        this.lrefccy = value;
    }

    /**
     * Obtiene el valor de la propiedad lbenchmark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLBENCHMARK() {
        return lbenchmark;
    }

    /**
     * Define el valor de la propiedad lbenchmark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLBENCHMARK(String value) {
        this.lbenchmark = value;
    }

    /**
     * Obtiene el valor de la propiedad lbeginmktvle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLBEGINMKTVLE() {
        return lbeginmktvle;
    }

    /**
     * Define el valor de la propiedad lbeginmktvle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLBEGINMKTVLE(String value) {
        this.lbeginmktvle = value;
    }

    /**
     * Obtiene el valor de la propiedad lendmktvalue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLENDMKTVALUE() {
        return lendmktvalue;
    }

    /**
     * Define el valor de la propiedad lendmktvalue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLENDMKTVALUE(String value) {
        this.lendmktvalue = value;
    }

    /**
     * Obtiene el valor de la propiedad portname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPORTNAME() {
        return portname;
    }

    /**
     * Define el valor de la propiedad portname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPORTNAME(String value) {
        this.portname = value;
    }

    /**
     * Obtiene el valor de la propiedad lportopened.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLPORTOPENED() {
        return lportopened;
    }

    /**
     * Define el valor de la propiedad lportopened.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLPORTOPENED(String value) {
        this.lportopened = value;
    }

    /**
     * Obtiene el valor de la propiedad lportclosed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLPORTCLOSED() {
        return lportclosed;
    }

    /**
     * Define el valor de la propiedad lportclosed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLPORTCLOSED(String value) {
        this.lportclosed = value;
    }

    /**
     * Obtiene el valor de la propiedad lcalcmethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCALCMETHOD() {
        return lcalcmethod;
    }

    /**
     * Define el valor de la propiedad lcalcmethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCALCMETHOD(String value) {
        this.lcalcmethod = value;
    }

    /**
     * Obtiene el valor de la propiedad dispcloseddate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPCLOSEDDATE() {
        return dispcloseddate;
    }

    /**
     * Define el valor de la propiedad dispcloseddate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPCLOSEDDATE(String value) {
        this.dispcloseddate = value;
    }

    /**
     * Obtiene el valor de la propiedad gtmsamperfprtymDetailType.
     * 
     * @return
     *     possible object is
     *     {@link TMSAMPERFPRTYMType.GTMSAMPERFPRTYMDetailType }
     *     
     */
    public TMSAMPERFPRTYMType.GTMSAMPERFPRTYMDetailType getGTMSAMPERFPRTYMDetailType() {
        return gtmsamperfprtymDetailType;
    }

    /**
     * Define el valor de la propiedad gtmsamperfprtymDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSAMPERFPRTYMType.GTMSAMPERFPRTYMDetailType }
     *     
     */
    public void setGTMSAMPERFPRTYMDetailType(TMSAMPERFPRTYMType.GTMSAMPERFPRTYMDetailType value) {
        this.gtmsamperfprtymDetailType = value;
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
     *         &lt;element name="mTMSAMPERFPRTYMDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LYLYPFOLIPERF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DISPPORTFOLIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DISPCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BENCHNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DISPBEGINVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DISPENDVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LCURRENTDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DISPPORTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DISPOPENDDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DISPMETHOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DATETODAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EndMarketValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NetFlow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="YearlyReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CumReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GeoCumReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FeesFlow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DividendAccrual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RecoverableTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BenchReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CumBenchReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AvgInvestment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PortfolioId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PortfolioCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ReportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mtmsamperfprtymDetailType"
    })
    public static class GTMSAMPERFPRTYMDetailType {

        @XmlElement(name = "mTMSAMPERFPRTYMDetailType")
        protected List<TMSAMPERFPRTYMType.GTMSAMPERFPRTYMDetailType.MTMSAMPERFPRTYMDetailType> mtmsamperfprtymDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mtmsamperfprtymDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtmsamperfprtymDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTMSAMPERFPRTYMDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TMSAMPERFPRTYMType.GTMSAMPERFPRTYMDetailType.MTMSAMPERFPRTYMDetailType }
         * 
         * 
         */
        public List<TMSAMPERFPRTYMType.GTMSAMPERFPRTYMDetailType.MTMSAMPERFPRTYMDetailType> getMTMSAMPERFPRTYMDetailType() {
            if (mtmsamperfprtymDetailType == null) {
                mtmsamperfprtymDetailType = new ArrayList<TMSAMPERFPRTYMType.GTMSAMPERFPRTYMDetailType.MTMSAMPERFPRTYMDetailType>();
            }
            return this.mtmsamperfprtymDetailType;
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
         *         &lt;element name="LYLYPFOLIPERF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DISPPORTFOLIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DISPCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BENCHNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DISPBEGINVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DISPENDVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LCURRENTDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DISPPORTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DISPOPENDDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DISPMETHOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DATETODAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EndMarketValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NetFlow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="YearlyReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CumReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GeoCumReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FeesFlow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DividendAccrual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RecoverableTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BenchReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CumBenchReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AvgInvestment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PortfolioId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PortfolioCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ReportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "lylypfoliperf",
            "dispportfolio",
            "dispccy",
            "benchname",
            "dispbeginval",
            "dispendval",
            "lcurrentdate",
            "dispportname",
            "dispopenddate",
            "dispmethod",
            "datetoday",
            "date",
            "endMarketValue",
            "netFlow",
            "yearlyReturn",
            "cumReturn",
            "geoCumReturn",
            "feesFlow",
            "dividendAccrual",
            "recoverableTax",
            "benchReturn",
            "cumBenchReturn",
            "avgInvestment",
            "portfolioId",
            "portfolioCurrency",
            "reportType"
        })
        public static class MTMSAMPERFPRTYMDetailType {

            @XmlElement(name = "LYLYPFOLIPERF")
            protected String lylypfoliperf;
            @XmlElement(name = "DISPPORTFOLIO")
            protected String dispportfolio;
            @XmlElement(name = "DISPCCY")
            protected String dispccy;
            @XmlElement(name = "BENCHNAME")
            protected String benchname;
            @XmlElement(name = "DISPBEGINVAL")
            protected String dispbeginval;
            @XmlElement(name = "DISPENDVAL")
            protected String dispendval;
            @XmlElement(name = "LCURRENTDATE")
            protected String lcurrentdate;
            @XmlElement(name = "DISPPORTNAME")
            protected String dispportname;
            @XmlElement(name = "DISPOPENDDATE")
            protected String dispopenddate;
            @XmlElement(name = "DISPMETHOD")
            protected String dispmethod;
            @XmlElement(name = "DATETODAY")
            protected String datetoday;
            @XmlElement(name = "Date")
            protected String date;
            @XmlElement(name = "EndMarketValue")
            protected String endMarketValue;
            @XmlElement(name = "NetFlow")
            protected String netFlow;
            @XmlElement(name = "YearlyReturn")
            protected String yearlyReturn;
            @XmlElement(name = "CumReturn")
            protected String cumReturn;
            @XmlElement(name = "GeoCumReturn")
            protected String geoCumReturn;
            @XmlElement(name = "FeesFlow")
            protected String feesFlow;
            @XmlElement(name = "DividendAccrual")
            protected String dividendAccrual;
            @XmlElement(name = "RecoverableTax")
            protected String recoverableTax;
            @XmlElement(name = "BenchReturn")
            protected String benchReturn;
            @XmlElement(name = "CumBenchReturn")
            protected String cumBenchReturn;
            @XmlElement(name = "AvgInvestment")
            protected String avgInvestment;
            @XmlElement(name = "PortfolioId")
            protected String portfolioId;
            @XmlElement(name = "PortfolioCurrency")
            protected String portfolioCurrency;
            @XmlElement(name = "ReportType")
            protected String reportType;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad lylypfoliperf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLYLYPFOLIPERF() {
                return lylypfoliperf;
            }

            /**
             * Define el valor de la propiedad lylypfoliperf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLYLYPFOLIPERF(String value) {
                this.lylypfoliperf = value;
            }

            /**
             * Obtiene el valor de la propiedad dispportfolio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDISPPORTFOLIO() {
                return dispportfolio;
            }

            /**
             * Define el valor de la propiedad dispportfolio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDISPPORTFOLIO(String value) {
                this.dispportfolio = value;
            }

            /**
             * Obtiene el valor de la propiedad dispccy.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDISPCCY() {
                return dispccy;
            }

            /**
             * Define el valor de la propiedad dispccy.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDISPCCY(String value) {
                this.dispccy = value;
            }

            /**
             * Obtiene el valor de la propiedad benchname.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBENCHNAME() {
                return benchname;
            }

            /**
             * Define el valor de la propiedad benchname.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBENCHNAME(String value) {
                this.benchname = value;
            }

            /**
             * Obtiene el valor de la propiedad dispbeginval.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDISPBEGINVAL() {
                return dispbeginval;
            }

            /**
             * Define el valor de la propiedad dispbeginval.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDISPBEGINVAL(String value) {
                this.dispbeginval = value;
            }

            /**
             * Obtiene el valor de la propiedad dispendval.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDISPENDVAL() {
                return dispendval;
            }

            /**
             * Define el valor de la propiedad dispendval.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDISPENDVAL(String value) {
                this.dispendval = value;
            }

            /**
             * Obtiene el valor de la propiedad lcurrentdate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLCURRENTDATE() {
                return lcurrentdate;
            }

            /**
             * Define el valor de la propiedad lcurrentdate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLCURRENTDATE(String value) {
                this.lcurrentdate = value;
            }

            /**
             * Obtiene el valor de la propiedad dispportname.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDISPPORTNAME() {
                return dispportname;
            }

            /**
             * Define el valor de la propiedad dispportname.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDISPPORTNAME(String value) {
                this.dispportname = value;
            }

            /**
             * Obtiene el valor de la propiedad dispopenddate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDISPOPENDDATE() {
                return dispopenddate;
            }

            /**
             * Define el valor de la propiedad dispopenddate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDISPOPENDDATE(String value) {
                this.dispopenddate = value;
            }

            /**
             * Obtiene el valor de la propiedad dispmethod.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDISPMETHOD() {
                return dispmethod;
            }

            /**
             * Define el valor de la propiedad dispmethod.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDISPMETHOD(String value) {
                this.dispmethod = value;
            }

            /**
             * Obtiene el valor de la propiedad datetoday.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATETODAY() {
                return datetoday;
            }

            /**
             * Define el valor de la propiedad datetoday.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATETODAY(String value) {
                this.datetoday = value;
            }

            /**
             * Obtiene el valor de la propiedad date.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDate() {
                return date;
            }

            /**
             * Define el valor de la propiedad date.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDate(String value) {
                this.date = value;
            }

            /**
             * Obtiene el valor de la propiedad endMarketValue.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEndMarketValue() {
                return endMarketValue;
            }

            /**
             * Define el valor de la propiedad endMarketValue.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEndMarketValue(String value) {
                this.endMarketValue = value;
            }

            /**
             * Obtiene el valor de la propiedad netFlow.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNetFlow() {
                return netFlow;
            }

            /**
             * Define el valor de la propiedad netFlow.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNetFlow(String value) {
                this.netFlow = value;
            }

            /**
             * Obtiene el valor de la propiedad yearlyReturn.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getYearlyReturn() {
                return yearlyReturn;
            }

            /**
             * Define el valor de la propiedad yearlyReturn.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setYearlyReturn(String value) {
                this.yearlyReturn = value;
            }

            /**
             * Obtiene el valor de la propiedad cumReturn.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCumReturn() {
                return cumReturn;
            }

            /**
             * Define el valor de la propiedad cumReturn.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCumReturn(String value) {
                this.cumReturn = value;
            }

            /**
             * Obtiene el valor de la propiedad geoCumReturn.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGeoCumReturn() {
                return geoCumReturn;
            }

            /**
             * Define el valor de la propiedad geoCumReturn.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGeoCumReturn(String value) {
                this.geoCumReturn = value;
            }

            /**
             * Obtiene el valor de la propiedad feesFlow.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFeesFlow() {
                return feesFlow;
            }

            /**
             * Define el valor de la propiedad feesFlow.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFeesFlow(String value) {
                this.feesFlow = value;
            }

            /**
             * Obtiene el valor de la propiedad dividendAccrual.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDividendAccrual() {
                return dividendAccrual;
            }

            /**
             * Define el valor de la propiedad dividendAccrual.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDividendAccrual(String value) {
                this.dividendAccrual = value;
            }

            /**
             * Obtiene el valor de la propiedad recoverableTax.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecoverableTax() {
                return recoverableTax;
            }

            /**
             * Define el valor de la propiedad recoverableTax.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRecoverableTax(String value) {
                this.recoverableTax = value;
            }

            /**
             * Obtiene el valor de la propiedad benchReturn.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBenchReturn() {
                return benchReturn;
            }

            /**
             * Define el valor de la propiedad benchReturn.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBenchReturn(String value) {
                this.benchReturn = value;
            }

            /**
             * Obtiene el valor de la propiedad cumBenchReturn.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCumBenchReturn() {
                return cumBenchReturn;
            }

            /**
             * Define el valor de la propiedad cumBenchReturn.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCumBenchReturn(String value) {
                this.cumBenchReturn = value;
            }

            /**
             * Obtiene el valor de la propiedad avgInvestment.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAvgInvestment() {
                return avgInvestment;
            }

            /**
             * Define el valor de la propiedad avgInvestment.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAvgInvestment(String value) {
                this.avgInvestment = value;
            }

            /**
             * Obtiene el valor de la propiedad portfolioId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPortfolioId() {
                return portfolioId;
            }

            /**
             * Define el valor de la propiedad portfolioId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPortfolioId(String value) {
                this.portfolioId = value;
            }

            /**
             * Obtiene el valor de la propiedad portfolioCurrency.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPortfolioCurrency() {
                return portfolioCurrency;
            }

            /**
             * Define el valor de la propiedad portfolioCurrency.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPortfolioCurrency(String value) {
                this.portfolioCurrency = value;
            }

            /**
             * Obtiene el valor de la propiedad reportType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReportType() {
                return reportType;
            }

            /**
             * Define el valor de la propiedad reportType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReportType(String value) {
                this.reportType = value;
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
