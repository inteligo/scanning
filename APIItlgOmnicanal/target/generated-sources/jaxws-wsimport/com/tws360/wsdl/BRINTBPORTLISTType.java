
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
 * <p>Clase Java para BRINTBPORTLISTType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BRINTBPORTLISTType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZEROREC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gBRINTBPORTLISTDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBRINTBPORTLISTDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PortfolioID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ClientType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BalanceUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="JointHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BRINTBPORTLISTType", propOrder = {
    "zerorec",
    "gbrintbportlistDetailType"
})
public class BRINTBPORTLISTType {

    @XmlElement(name = "ZEROREC")
    protected String zerorec;
    @XmlElement(name = "gBRINTBPORTLISTDetailType")
    protected BRINTBPORTLISTType.GBRINTBPORTLISTDetailType gbrintbportlistDetailType;

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
     * Obtiene el valor de la propiedad gbrintbportlistDetailType.
     * 
     * @return
     *     possible object is
     *     {@link BRINTBPORTLISTType.GBRINTBPORTLISTDetailType }
     *     
     */
    public BRINTBPORTLISTType.GBRINTBPORTLISTDetailType getGBRINTBPORTLISTDetailType() {
        return gbrintbportlistDetailType;
    }

    /**
     * Define el valor de la propiedad gbrintbportlistDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link BRINTBPORTLISTType.GBRINTBPORTLISTDetailType }
     *     
     */
    public void setGBRINTBPORTLISTDetailType(BRINTBPORTLISTType.GBRINTBPORTLISTDetailType value) {
        this.gbrintbportlistDetailType = value;
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
     *         &lt;element name="mBRINTBPORTLISTDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PortfolioID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ClientType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BalanceUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="JointHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbrintbportlistDetailType"
    })
    public static class GBRINTBPORTLISTDetailType {

        @XmlElement(name = "mBRINTBPORTLISTDetailType")
        protected List<BRINTBPORTLISTType.GBRINTBPORTLISTDetailType.MBRINTBPORTLISTDetailType> mbrintbportlistDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbrintbportlistDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbrintbportlistDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBRINTBPORTLISTDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BRINTBPORTLISTType.GBRINTBPORTLISTDetailType.MBRINTBPORTLISTDetailType }
         * 
         * 
         */
        public List<BRINTBPORTLISTType.GBRINTBPORTLISTDetailType.MBRINTBPORTLISTDetailType> getMBRINTBPORTLISTDetailType() {
            if (mbrintbportlistDetailType == null) {
                mbrintbportlistDetailType = new ArrayList<BRINTBPORTLISTType.GBRINTBPORTLISTDetailType.MBRINTBPORTLISTDetailType>();
            }
            return this.mbrintbportlistDetailType;
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
         *         &lt;element name="PortfolioID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ClientType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BalanceUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="JointHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "portfolioID",
            "owner",
            "clientType",
            "description",
            "balanceUS",
            "jointHolder"
        })
        public static class MBRINTBPORTLISTDetailType {

            @XmlElement(name = "PortfolioID")
            protected String portfolioID;
            @XmlElement(name = "Owner")
            protected String owner;
            @XmlElement(name = "ClientType")
            protected String clientType;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "BalanceUS")
            protected String balanceUS;
            @XmlElement(name = "JointHolder")
            protected String jointHolder;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad portfolioID.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPortfolioID() {
                return portfolioID;
            }

            /**
             * Define el valor de la propiedad portfolioID.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPortfolioID(String value) {
                this.portfolioID = value;
            }

            /**
             * Obtiene el valor de la propiedad owner.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwner() {
                return owner;
            }

            /**
             * Define el valor de la propiedad owner.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwner(String value) {
                this.owner = value;
            }

            /**
             * Obtiene el valor de la propiedad clientType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClientType() {
                return clientType;
            }

            /**
             * Define el valor de la propiedad clientType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClientType(String value) {
                this.clientType = value;
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
             * Obtiene el valor de la propiedad balanceUS.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBalanceUS() {
                return balanceUS;
            }

            /**
             * Define el valor de la propiedad balanceUS.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBalanceUS(String value) {
                this.balanceUS = value;
            }

            /**
             * Obtiene el valor de la propiedad jointHolder.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJointHolder() {
                return jointHolder;
            }

            /**
             * Define el valor de la propiedad jointHolder.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJointHolder(String value) {
                this.jointHolder = value;
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
