
package com.t24.services.input;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={})
public class InputCollection {
	
            private String ACCOUNTID;
            private String CUSTOMERID;
            private String ID;
            private String PORTFOLIOID;
            private String PRODUCTID;
            private String ARRANGEMENTID;
            private String ACCOUNT;            
            private String BOOKINGDATE;
            private String SAMNO;
            
            
     /**
     * @return the ACCOUNTID
     */
    public String getACCOUNTID() {
        return ACCOUNTID;
    }

    /**
     * @param ACCOUNTID the ACCOUNTID to set
     */
    @XmlElement(name="ACCOUNT.ID")
    public void setACCOUNTID(String ACCOUNTID) {
        this.ACCOUNTID = ACCOUNTID;
    }

    /**
     * @return the CUSTOMERID
     */
    public String getCUSTOMERID() {
        return CUSTOMERID;
    }

    /**
     * @param CUSTOMERID the CUSTOMERID to set
     */
    @XmlElement(name="CUSTOMER.ID")
    public void setCUSTOMERID(String CUSTOMERID) {
        this.CUSTOMERID = CUSTOMERID;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
     @XmlElement(name="@ID")
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the PORTFOLIOID
     */
    public String getPORTFOLIOID() {
        return PORTFOLIOID;
    }

    /**
     * @param PORTFOLIOID the PORTFOLIOID to set
     */
        @XmlElement(name="PORTFOLIO.ID")
    public void setPORTFOLIOID(String PORTFOLIOID) {
        this.PORTFOLIOID = PORTFOLIOID;
    }

    /**
     * @return the PRODUCTID
     */
    public String getPRODUCTID() {
        return PRODUCTID;
    }

    /**
     * @param PRODUCTID the PRODUCTID to set
     */
            @XmlElement(name="PRODUCT.ID")
    public void setPRODUCTID(String PRODUCTID) {
        this.PRODUCTID = PRODUCTID;
    }

    /**
     * @return the ARRANGEMENTID
     */
    public String getARRANGEMENTID() {
        return ARRANGEMENTID;
    }

    /**
     * @param ARRANGEMENTID the ARRANGEMENTID to set
     */
      @XmlElement(name="ARRANGEMENT.ID")
    public void setARRANGEMENTID(String ARRANGEMENTID) {
        this.ARRANGEMENTID = ARRANGEMENTID;
    }

    /**
     * @return the ACCOUNT
     */
    public String getACCOUNT() {
        return ACCOUNT;
    }

    /**
     * @param ACCOUNT the ACCOUNT to set
     */
    @XmlElement(name="ACCOUNT")
    public void setACCOUNT(String ACCOUNT) {
        this.ACCOUNT = ACCOUNT;
    }

    /**
     * @return the BOOKINGDATE
     */
    public String getBOOKINGDATE() {
        return BOOKINGDATE;
    }

    /**
     * @param BOOKINGDATE the BOOKINGDATE to set
     */
    @XmlElement(name="BOOKING.DATE")
    public void setBOOKINGDATE(String BOOKINGDATE) {
        this.BOOKINGDATE = BOOKINGDATE;
    }            

    /**
     * @return the SAMNO
     */
    public String getSAMNO() {
        return SAMNO;
    }

    /**
     * @param SAMNO the SAMNO to set
     */
    @XmlElement(name="SAM.NO")
    public void setSAMNO(String SAMNO) {
        this.SAMNO = SAMNO;
    }
    
    
    
}