
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
 * <p>Clase Java para BRINTBACCMOVEMENTSType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BRINTBACCMOVEMENTSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gBRINTBACCMOVEMENTSDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBRINTBACCMOVEMENTSDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ACCTNOLBL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HCURR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="YCURR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="YINTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CREDITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="YTOTCREDIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DEBITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="YTOTDEBIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SERCHG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="YSRVCHARGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OVERDRAFT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="YOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AVAILBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="YAVAILBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ACCTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="YACCBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LTAVLBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="YLTAVLBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FechadeTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FechadeProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Debito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Credito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SaldoContable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BRINTBACCMOVEMENTSType", propOrder = {
    "gbrintbaccmovementsDetailType"
})
public class BRINTBACCMOVEMENTSType {

    @XmlElement(name = "gBRINTBACCMOVEMENTSDetailType")
    protected BRINTBACCMOVEMENTSType.GBRINTBACCMOVEMENTSDetailType gbrintbaccmovementsDetailType;

    /**
     * Obtiene el valor de la propiedad gbrintbaccmovementsDetailType.
     * 
     * @return
     *     possible object is
     *     {@link BRINTBACCMOVEMENTSType.GBRINTBACCMOVEMENTSDetailType }
     *     
     */
    public BRINTBACCMOVEMENTSType.GBRINTBACCMOVEMENTSDetailType getGBRINTBACCMOVEMENTSDetailType() {
        return gbrintbaccmovementsDetailType;
    }

    /**
     * Define el valor de la propiedad gbrintbaccmovementsDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link BRINTBACCMOVEMENTSType.GBRINTBACCMOVEMENTSDetailType }
     *     
     */
    public void setGBRINTBACCMOVEMENTSDetailType(BRINTBACCMOVEMENTSType.GBRINTBACCMOVEMENTSDetailType value) {
        this.gbrintbaccmovementsDetailType = value;
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
     *         &lt;element name="mBRINTBACCMOVEMENTSDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ACCTNOLBL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HCURR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="YCURR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="YINTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CREDITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="YTOTCREDIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DEBITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="YTOTDEBIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SERCHG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="YSRVCHARGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OVERDRAFT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="YOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AVAILBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="YAVAILBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ACCTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="YACCBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LTAVLBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="YLTAVLBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FechadeTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FechadeProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Debito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Credito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SaldoContable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbrintbaccmovementsDetailType"
    })
    public static class GBRINTBACCMOVEMENTSDetailType {

        @XmlElement(name = "mBRINTBACCMOVEMENTSDetailType")
        protected List<BRINTBACCMOVEMENTSType.GBRINTBACCMOVEMENTSDetailType.MBRINTBACCMOVEMENTSDetailType> mbrintbaccmovementsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbrintbaccmovementsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbrintbaccmovementsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBRINTBACCMOVEMENTSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BRINTBACCMOVEMENTSType.GBRINTBACCMOVEMENTSDetailType.MBRINTBACCMOVEMENTSDetailType }
         * 
         * 
         */
        public List<BRINTBACCMOVEMENTSType.GBRINTBACCMOVEMENTSDetailType.MBRINTBACCMOVEMENTSDetailType> getMBRINTBACCMOVEMENTSDetailType() {
            if (mbrintbaccmovementsDetailType == null) {
                mbrintbaccmovementsDetailType = new ArrayList<BRINTBACCMOVEMENTSType.GBRINTBACCMOVEMENTSDetailType.MBRINTBACCMOVEMENTSDetailType>();
            }
            return this.mbrintbaccmovementsDetailType;
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
         *         &lt;element name="ACCTNOLBL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="HCURR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="YCURR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="YINTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CREDITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="YTOTCREDIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DEBITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="YTOTDEBIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SERCHG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="YSRVCHARGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OVERDRAFT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="YOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AVAILBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="YAVAILBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ACCTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="YACCBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LTAVLBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="YLTAVLBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FechadeTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FechadeProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Debito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Credito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SaldoContable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "acctnolbl",
            "acctno",
            "hcurr",
            "ycurr",
            "intbal",
            "yintbal",
            "credits",
            "ytotcredit",
            "debits",
            "ytotdebit",
            "serchg",
            "ysrvcharge",
            "overdraft",
            "yod",
            "availbal",
            "yavailbal",
            "acctbal",
            "yaccbal",
            "ltavlbal",
            "yltavlbal",
            "fechadeTransaccion",
            "fechadeProceso",
            "descripcion",
            "debito",
            "credito",
            "saldoContable"
        })
        public static class MBRINTBACCMOVEMENTSDetailType {

            @XmlElement(name = "HDR")
            protected String hdr;
            @XmlElement(name = "ACCTNOLBL")
            protected String acctnolbl;
            @XmlElement(name = "ACCTNO")
            protected String acctno;
            @XmlElement(name = "HCURR")
            protected String hcurr;
            @XmlElement(name = "YCURR")
            protected String ycurr;
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
            @XmlElement(name = "OVERDRAFT")
            protected String overdraft;
            @XmlElement(name = "YOD")
            protected String yod;
            @XmlElement(name = "AVAILBAL")
            protected String availbal;
            @XmlElement(name = "YAVAILBAL")
            protected String yavailbal;
            @XmlElement(name = "ACCTBAL")
            protected String acctbal;
            @XmlElement(name = "YACCBAL")
            protected String yaccbal;
            @XmlElement(name = "LTAVLBAL")
            protected String ltavlbal;
            @XmlElement(name = "YLTAVLBAL")
            protected String yltavlbal;
            @XmlElement(name = "FechadeTransaccion")
            protected String fechadeTransaccion;
            @XmlElement(name = "FechadeProceso")
            protected String fechadeProceso;
            @XmlElement(name = "Descripcion")
            protected String descripcion;
            @XmlElement(name = "Debito")
            protected String debito;
            @XmlElement(name = "Credito")
            protected String credito;
            @XmlElement(name = "SaldoContable")
            protected String saldoContable;
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
             * Obtiene el valor de la propiedad hcurr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHCURR() {
                return hcurr;
            }

            /**
             * Define el valor de la propiedad hcurr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHCURR(String value) {
                this.hcurr = value;
            }

            /**
             * Obtiene el valor de la propiedad ycurr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getYCURR() {
                return ycurr;
            }

            /**
             * Define el valor de la propiedad ycurr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setYCURR(String value) {
                this.ycurr = value;
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
             * Obtiene el valor de la propiedad acctbal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCTBAL() {
                return acctbal;
            }

            /**
             * Define el valor de la propiedad acctbal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCTBAL(String value) {
                this.acctbal = value;
            }

            /**
             * Obtiene el valor de la propiedad yaccbal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getYACCBAL() {
                return yaccbal;
            }

            /**
             * Define el valor de la propiedad yaccbal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setYACCBAL(String value) {
                this.yaccbal = value;
            }

            /**
             * Obtiene el valor de la propiedad ltavlbal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLTAVLBAL() {
                return ltavlbal;
            }

            /**
             * Define el valor de la propiedad ltavlbal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLTAVLBAL(String value) {
                this.ltavlbal = value;
            }

            /**
             * Obtiene el valor de la propiedad yltavlbal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getYLTAVLBAL() {
                return yltavlbal;
            }

            /**
             * Define el valor de la propiedad yltavlbal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setYLTAVLBAL(String value) {
                this.yltavlbal = value;
            }

            /**
             * Obtiene el valor de la propiedad fechadeTransaccion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechadeTransaccion() {
                return fechadeTransaccion;
            }

            /**
             * Define el valor de la propiedad fechadeTransaccion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechadeTransaccion(String value) {
                this.fechadeTransaccion = value;
            }

            /**
             * Obtiene el valor de la propiedad fechadeProceso.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechadeProceso() {
                return fechadeProceso;
            }

            /**
             * Define el valor de la propiedad fechadeProceso.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechadeProceso(String value) {
                this.fechadeProceso = value;
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
             * Obtiene el valor de la propiedad debito.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDebito() {
                return debito;
            }

            /**
             * Define el valor de la propiedad debito.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDebito(String value) {
                this.debito = value;
            }

            /**
             * Obtiene el valor de la propiedad credito.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCredito() {
                return credito;
            }

            /**
             * Define el valor de la propiedad credito.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCredito(String value) {
                this.credito = value;
            }

            /**
             * Obtiene el valor de la propiedad saldoContable.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSaldoContable() {
                return saldoContable;
            }

            /**
             * Define el valor de la propiedad saldoContable.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSaldoContable(String value) {
                this.saldoContable = value;
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
