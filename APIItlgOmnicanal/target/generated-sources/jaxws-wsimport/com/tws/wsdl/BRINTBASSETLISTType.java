
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
 * <p>Clase Java para BRINTBASSETLISTType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BRINTBASSETLISTType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZERREC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gBRINTBASSETLISTDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBRINTBASSETLISTDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BRINTBASSETLISTType", propOrder = {
    "zerrec",
    "gbrintbassetlistDetailType"
})
public class BRINTBASSETLISTType {

    @XmlElement(name = "ZERREC")
    protected String zerrec;
    @XmlElement(name = "gBRINTBASSETLISTDetailType")
    protected BRINTBASSETLISTType.GBRINTBASSETLISTDetailType gbrintbassetlistDetailType;

    /**
     * Obtiene el valor de la propiedad zerrec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZERREC() {
        return zerrec;
    }

    /**
     * Define el valor de la propiedad zerrec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZERREC(String value) {
        this.zerrec = value;
    }

    /**
     * Obtiene el valor de la propiedad gbrintbassetlistDetailType.
     * 
     * @return
     *     possible object is
     *     {@link BRINTBASSETLISTType.GBRINTBASSETLISTDetailType }
     *     
     */
    public BRINTBASSETLISTType.GBRINTBASSETLISTDetailType getGBRINTBASSETLISTDetailType() {
        return gbrintbassetlistDetailType;
    }

    /**
     * Define el valor de la propiedad gbrintbassetlistDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link BRINTBASSETLISTType.GBRINTBASSETLISTDetailType }
     *     
     */
    public void setGBRINTBASSETLISTDetailType(BRINTBASSETLISTType.GBRINTBASSETLISTDetailType value) {
        this.gbrintbassetlistDetailType = value;
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
     *         &lt;element name="mBRINTBASSETLISTDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbrintbassetlistDetailType"
    })
    public static class GBRINTBASSETLISTDetailType {

        @XmlElement(name = "mBRINTBASSETLISTDetailType")
        protected List<BRINTBASSETLISTType.GBRINTBASSETLISTDetailType.MBRINTBASSETLISTDetailType> mbrintbassetlistDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbrintbassetlistDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbrintbassetlistDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBRINTBASSETLISTDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BRINTBASSETLISTType.GBRINTBASSETLISTDetailType.MBRINTBASSETLISTDetailType }
         * 
         * 
         */
        public List<BRINTBASSETLISTType.GBRINTBASSETLISTDetailType.MBRINTBASSETLISTDetailType> getMBRINTBASSETLISTDetailType() {
            if (mbrintbassetlistDetailType == null) {
                mbrintbassetlistDetailType = new ArrayList<BRINTBASSETLISTType.GBRINTBASSETLISTDetailType.MBRINTBASSETLISTDetailType>();
            }
            return this.mbrintbassetlistDetailType;
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
         *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "reference",
            "description",
            "balance"
        })
        public static class MBRINTBASSETLISTDetailType {

            @XmlElement(name = "Group")
            protected String group;
            @XmlElement(name = "Reference")
            protected String reference;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "Balance")
            protected String balance;
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
             * Obtiene el valor de la propiedad balance.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBalance() {
                return balance;
            }

            /**
             * Define el valor de la propiedad balance.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBalance(String value) {
                this.balance = value;
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
