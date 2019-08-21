
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
 * <p>Clase Java para BRINTBACCMOVEMENTType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BRINTBACCMOVEMENTType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZEROREC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gBRINTBACCMOVEMENTDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBRINTBACCMOVEMENTDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ACCTNOLBL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="YINTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CREDITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="YTOTCREDIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DEBITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="YTOTDEBIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SERCHG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="YSRVCHARGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RETBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="YRETBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OVERDRAFT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="YOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AVAILBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="YAVAILBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CCYLABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CCYDATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProcessingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Debit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccountingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BRINTBACCMOVEMENTType", propOrder = {
    "zerorec",
    "gbrintbaccmovementDetailType"
})
public class BRINTBACCMOVEMENTType {

    @XmlElement(name = "ZEROREC")
    protected String zerorec;
    @XmlElement(name = "gBRINTBACCMOVEMENTDetailType")
    protected BRINTBACCMOVEMENTType.GBRINTBACCMOVEMENTDetailType gbrintbaccmovementDetailType;

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
     * Obtiene el valor de la propiedad gbrintbaccmovementDetailType.
     * 
     * @return
     *     possible object is
     *     {@link BRINTBACCMOVEMENTType.GBRINTBACCMOVEMENTDetailType }
     *     
     */
    public BRINTBACCMOVEMENTType.GBRINTBACCMOVEMENTDetailType getGBRINTBACCMOVEMENTDetailType() {
        return gbrintbaccmovementDetailType;
    }

    /**
     * Define el valor de la propiedad gbrintbaccmovementDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link BRINTBACCMOVEMENTType.GBRINTBACCMOVEMENTDetailType }
     *     
     */
    public void setGBRINTBACCMOVEMENTDetailType(BRINTBACCMOVEMENTType.GBRINTBACCMOVEMENTDetailType value) {
        this.gbrintbaccmovementDetailType = value;
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
     *         &lt;element name="mBRINTBACCMOVEMENTDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ACCTNOLBL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="YINTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CREDITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="YTOTCREDIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DEBITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="YTOTDEBIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SERCHG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="YSRVCHARGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RETBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="YRETBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OVERDRAFT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="YOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AVAILBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="YAVAILBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CCYLABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CCYDATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProcessingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Debit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccountingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbrintbaccmovementDetailType"
    })
    public static class GBRINTBACCMOVEMENTDetailType {

        @XmlElement(name = "mBRINTBACCMOVEMENTDetailType")
        protected List<BRINTBACCMOVEMENTType.GBRINTBACCMOVEMENTDetailType.MBRINTBACCMOVEMENTDetailType> mbrintbaccmovementDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbrintbaccmovementDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbrintbaccmovementDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBRINTBACCMOVEMENTDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BRINTBACCMOVEMENTType.GBRINTBACCMOVEMENTDetailType.MBRINTBACCMOVEMENTDetailType }
         * 
         * 
         */
        public List<BRINTBACCMOVEMENTType.GBRINTBACCMOVEMENTDetailType.MBRINTBACCMOVEMENTDetailType> getMBRINTBACCMOVEMENTDetailType() {
            if (mbrintbaccmovementDetailType == null) {
                mbrintbaccmovementDetailType = new ArrayList<BRINTBACCMOVEMENTType.GBRINTBACCMOVEMENTDetailType.MBRINTBACCMOVEMENTDetailType>();
            }
            return this.mbrintbaccmovementDetailType;
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
         *         &lt;element name="ACCTNOLBL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="YINTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CREDITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="YTOTCREDIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DEBITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="YTOTDEBIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SERCHG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="YSRVCHARGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RETBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="YRETBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OVERDRAFT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="YOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AVAILBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="YAVAILBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CCYLABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CCYDATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProcessingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Debit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccountingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "acctnolbl",
            "acctno",
            "intbal",
            "yintbal",
            "credits",
            "ytotcredit",
            "debits",
            "ytotdebit",
            "serchg",
            "ysrvcharge",
            "retbal",
            "yretbal",
            "overdraft",
            "yod",
            "availbal",
            "yavailbal",
            "ccylabel",
            "ccydata",
            "processingDate",
            "valueDate",
            "description",
            "debit",
            "credit",
            "accountingBalance"
        })
        public static class MBRINTBACCMOVEMENTDetailType {

            @XmlElement(name = "ACCTNOLBL")
            protected String acctnolbl;
            @XmlElement(name = "ACCTNO")
            protected String acctno;
            @XmlElement(name = "INTBAL")
            protected String intbal;
            @XmlElement(name = "YINTBAL")
            protected String yintbal;
            @XmlElement(name = "CREDITS")
            protected String credits;
            @XmlElement(name = "YTOTCREDIT")
            protected String ytotcredit;
            @XmlElement(name = "DEBITS")
            protected String debits;
            @XmlElement(name = "YTOTDEBIT")
            protected String ytotdebit;
            @XmlElement(name = "SERCHG")
            protected String serchg;
            @XmlElement(name = "YSRVCHARGE")
            protected String ysrvcharge;
            @XmlElement(name = "RETBAL")
            protected String retbal;
            @XmlElement(name = "YRETBAL")
            protected String yretbal;
            @XmlElement(name = "OVERDRAFT")
            protected String overdraft;
            @XmlElement(name = "YOD")
            protected String yod;
            @XmlElement(name = "AVAILBAL")
            protected String availbal;
            @XmlElement(name = "YAVAILBAL")
            protected String yavailbal;
            @XmlElement(name = "CCYLABEL")
            protected String ccylabel;
            @XmlElement(name = "CCYDATA")
            protected String ccydata;
            @XmlElement(name = "ProcessingDate")
            protected String processingDate;
            @XmlElement(name = "ValueDate")
            protected String valueDate;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "Debit")
            protected String debit;
            @XmlElement(name = "Credit")
            protected String credit;
            @XmlElement(name = "AccountingBalance")
            protected String accountingBalance;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad acctnolbl.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCTNOLBL() {
                return acctnolbl;
            }

            /**
             * Define el valor de la propiedad acctnolbl.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCTNOLBL(String value) {
                this.acctnolbl = value;
            }

            /**
             * Obtiene el valor de la propiedad acctno.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCTNO() {
                return acctno;
            }

            /**
             * Define el valor de la propiedad acctno.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCTNO(String value) {
                this.acctno = value;
            }

            /**
             * Obtiene el valor de la propiedad intbal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINTBAL() {
                return intbal;
            }

            /**
             * Define el valor de la propiedad intbal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINTBAL(String value) {
                this.intbal = value;
            }

            /**
             * Obtiene el valor de la propiedad yintbal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getYINTBAL() {
                return yintbal;
            }

            /**
             * Define el valor de la propiedad yintbal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setYINTBAL(String value) {
                this.yintbal = value;
            }

            /**
             * Obtiene el valor de la propiedad credits.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCREDITS() {
                return credits;
            }

            /**
             * Define el valor de la propiedad credits.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCREDITS(String value) {
                this.credits = value;
            }

            /**
             * Obtiene el valor de la propiedad ytotcredit.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getYTOTCREDIT() {
                return ytotcredit;
            }

            /**
             * Define el valor de la propiedad ytotcredit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setYTOTCREDIT(String value) {
                this.ytotcredit = value;
            }

            /**
             * Obtiene el valor de la propiedad debits.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDEBITS() {
                return debits;
            }

            /**
             * Define el valor de la propiedad debits.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDEBITS(String value) {
                this.debits = value;
            }

            /**
             * Obtiene el valor de la propiedad ytotdebit.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getYTOTDEBIT() {
                return ytotdebit;
            }

            /**
             * Define el valor de la propiedad ytotdebit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setYTOTDEBIT(String value) {
                this.ytotdebit = value;
            }

            /**
             * Obtiene el valor de la propiedad serchg.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSERCHG() {
                return serchg;
            }

            /**
             * Define el valor de la propiedad serchg.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSERCHG(String value) {
                this.serchg = value;
            }

            /**
             * Obtiene el valor de la propiedad ysrvcharge.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getYSRVCHARGE() {
                return ysrvcharge;
            }

            /**
             * Define el valor de la propiedad ysrvcharge.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setYSRVCHARGE(String value) {
                this.ysrvcharge = value;
            }

            /**
             * Obtiene el valor de la propiedad retbal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRETBAL() {
                return retbal;
            }

            /**
             * Define el valor de la propiedad retbal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRETBAL(String value) {
                this.retbal = value;
            }

            /**
             * Obtiene el valor de la propiedad yretbal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getYRETBAL() {
                return yretbal;
            }

            /**
             * Define el valor de la propiedad yretbal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setYRETBAL(String value) {
                this.yretbal = value;
            }

            /**
             * Obtiene el valor de la propiedad overdraft.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOVERDRAFT() {
                return overdraft;
            }

            /**
             * Define el valor de la propiedad overdraft.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOVERDRAFT(String value) {
                this.overdraft = value;
            }

            /**
             * Obtiene el valor de la propiedad yod.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getYOD() {
                return yod;
            }

            /**
             * Define el valor de la propiedad yod.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setYOD(String value) {
                this.yod = value;
            }

            /**
             * Obtiene el valor de la propiedad availbal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAVAILBAL() {
                return availbal;
            }

            /**
             * Define el valor de la propiedad availbal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAVAILBAL(String value) {
                this.availbal = value;
            }

            /**
             * Obtiene el valor de la propiedad yavailbal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getYAVAILBAL() {
                return yavailbal;
            }

            /**
             * Define el valor de la propiedad yavailbal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setYAVAILBAL(String value) {
                this.yavailbal = value;
            }

            /**
             * Obtiene el valor de la propiedad ccylabel.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCCYLABEL() {
                return ccylabel;
            }

            /**
             * Define el valor de la propiedad ccylabel.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCCYLABEL(String value) {
                this.ccylabel = value;
            }

            /**
             * Obtiene el valor de la propiedad ccydata.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCCYDATA() {
                return ccydata;
            }

            /**
             * Define el valor de la propiedad ccydata.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCCYDATA(String value) {
                this.ccydata = value;
            }

            /**
             * Obtiene el valor de la propiedad processingDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProcessingDate() {
                return processingDate;
            }

            /**
             * Define el valor de la propiedad processingDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProcessingDate(String value) {
                this.processingDate = value;
            }

            /**
             * Obtiene el valor de la propiedad valueDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValueDate() {
                return valueDate;
            }

            /**
             * Define el valor de la propiedad valueDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValueDate(String value) {
                this.valueDate = value;
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
             * Obtiene el valor de la propiedad debit.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDebit() {
                return debit;
            }

            /**
             * Define el valor de la propiedad debit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDebit(String value) {
                this.debit = value;
            }

            /**
             * Obtiene el valor de la propiedad credit.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCredit() {
                return credit;
            }

            /**
             * Define el valor de la propiedad credit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCredit(String value) {
                this.credit = value;
            }

            /**
             * Obtiene el valor de la propiedad accountingBalance.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountingBalance() {
                return accountingBalance;
            }

            /**
             * Define el valor de la propiedad accountingBalance.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountingBalance(String value) {
                this.accountingBalance = value;
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
