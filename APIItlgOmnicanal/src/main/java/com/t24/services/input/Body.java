
package com.t24.services.input;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={})
public class Body {
	
            String customerNo;
            String accountNo;
            String portfolioNo;
            String product;
            String CodigodeProducto;

            String ID;
            String Fecha;
            String DateFrom;
            String DateTo;

            String Cuenta;
            String Fechas;

            //Datos de transferencia
            String transactionType;
            String accountFrom;
            String debitCcy;
            String debitAmt;
            String transDate;
            String payer;
            String accountTo;
            String creditCcy;
            String valueDate;
            String ftId;

            String name;
            //	int customerNoBjson;
            String portafolio ;
        
        	public String getName() {
		return name;
	}
	
	@XmlElement(name="name")
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPortfolioNo() {
		return portfolioNo;
	}
	@XmlElement(name="PortfolioNo")
	public void setPortfolioNo(String portfolioNo) {
		this.portfolioNo = portfolioNo;
	}

	public String getAccountNo() {
		return accountNo;
	}

	@XmlElement(name="AccountNo")
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustomerNo() {
		return customerNo;
	}
	
	@XmlElement(name="CustomerNo")
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
	
        /**
        * @return the product
        */
       public String getProduct() {
           return product;
       }

       /**
        * @param product the product to set
        */
       @XmlElement(name="Product")
       public void setProduct(String product) {
           this.product = product;
       }

        
	//Datos de Transferencia
	public String getTransactionType() {
		return transactionType;
	}
	
	@XmlElement(name="TransactionType")
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getAccountFrom() {
		return accountFrom;
	}
	
	@XmlElement(name="AccountFrom")
	public void setAccountFrom(String accountFrom) {
		this.accountFrom = accountFrom;
	}
	public String getDebitCcy() {
		return debitCcy;
	}
	
	@XmlElement(name="DebitCcy")
	public void setDebitCcy(String debitCcy) {
		this.debitCcy = debitCcy;
	}
	public String getDebitAmt() {
		return debitAmt;
	}
	
	@XmlElement(name="DebitAmt")
	public void setDebitAmt(String debitAmt) {
		this.debitAmt = debitAmt;
	}
	public String getTransDate() {
		return transDate;
	}
	
	@XmlElement(name="TransDate")
	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}
	public String getPayer() {
		return payer;
	}
	
	@XmlElement(name="Payer")
	public void setPayer(String payer) {
		this.payer = payer;
	}
	public String getAccountTo() {
		return accountTo;
	}
	
	@XmlElement(name="AccountTo")
	public void setAccountTo(String accountTo) {
		this.accountTo = accountTo;
	}
	public String getCreditCcy() {
		return creditCcy;
	}
	
	@XmlElement(name="CreditCcy")
	public void setCreditCcy(String creditCcy) {
		this.creditCcy = creditCcy;
	}
	public String getValueDate() {
		return valueDate;
	}
	
	@XmlElement(name="ValueDate")
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	
	@XmlElement(name="FTId")
	public void setFtId(String ftId) {
		this.ftId = ftId;
	}
	public String getFtId() {
		return ftId;
	}

    /**
     * @return the Fecha
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    @XmlElement(name="Fecha")
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the DateFrom
     */
    public String getDateFrom() {
        return DateFrom;
    }

    /**
     * @param DateFrom the DateFrom to set
     */
    @XmlElement(name="DateFrom")
    public void setDateFrom(String DateFrom) {
        this.DateFrom = DateFrom;
    }

    /**
     * @return the DateTo
     */
    public String getDateTo() {
        return DateTo;
    }

    /**
     * @param DateTo the DateTo to set
     */
    @XmlElement(name="DateTo")
    public void setDateTo(String DateTo) {
        this.DateTo = DateTo;
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
    @XmlElement(name="ID")
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the Cuenta
     */
    public String getCuenta() {
        return Cuenta;
    }

    /**
     * @param Cuenta the Cuenta to set
     */
    @XmlElement(name="Cuenta")
    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }

    /**
     * @return the Fechas
     */
    public String getFechas() {
        return Fechas;
    }

    /**
     * @param Fechas the Fechas to set
     */
    @XmlElement(name="Fechas")
    public void setFechas(String Fechas) {
        this.Fechas = Fechas;
    }

    /**
     * @return the CodigodeProducto
     */
    public String getCodigodeProducto() {
        return CodigodeProducto;
    }

    /**
     * @param CodigodeProducto the CodigodeProducto to set
     */
     @XmlElement(name="CodigodeProducto")
    public void setCodigodeProducto(String CodigodeProducto) {
        this.CodigodeProducto = CodigodeProducto;
    }
        
//     public int getCustomerNoBjson() {
//		return customerNoBjson;
//	}
//	
//	@XmlElement(name="customerNoBjson")
//	public void setCustomerNoBjson(int customerNoBjson) {
//		this.customerNoBjson = customerNoBjson;
//	}

    /**
     * @return the portafolio
     */
    public String getPortafolio() {
        return portafolio;
    }

    /**
     * @param portafolio the portafolio to set
     */
    public void setPortafolio(String portafolio) {
        this.portafolio = portafolio;
    }
	
        

    
}