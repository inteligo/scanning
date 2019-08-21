/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto.sql;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vrojas
 */
@XmlRootElement
public class MovimientoDeposito {
    private String Id;
    private Integer Date;
    private String SequenceNo;
    private Integer CurrentNo;
    private String CustomerCode;
    private String FechaValor;
    private String ActionCode;
    private String AdviceCode;
    private String Transaccion;
    private Double Monto;
    
    private String errcod;
    private String detcod;
    private String defcod;

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return the Date
     */
    public Integer getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(Integer Date) {
        this.Date = Date;
    }

    /**
     * @return the SequenceNo
     */
    public String getSequenceNo() {
        return SequenceNo;
    }

    /**
     * @param SequenceNo the SequenceNo to set
     */
    public void setSequenceNo(String SequenceNo) {
        this.SequenceNo = SequenceNo;
    }

    /**
     * @return the CurrentNo
     */
    public Integer getCurrentNo() {
        return CurrentNo;
    }

    /**
     * @param CurrentNo the CurrentNo to set
     */
    public void setCurrentNo(Integer CurrentNo) {
        this.CurrentNo = CurrentNo;
    }

    /**
     * @return the CustomerCode
     */
    public String getCustomerCode() {
        return CustomerCode;
    }

    /**
     * @param CustomerCode the CustomerCode to set
     */
    public void setCustomerCode(String CustomerCode) {
        this.CustomerCode = CustomerCode;
    }

    /**
     * @return the FechaValor
     */
    public String getFechaValor() {
        return FechaValor;
    }

    /**
     * @param FechaValor the FechaValor to set
     */
    public void setFechaValor(String FechaValor) {
        this.FechaValor = FechaValor;
    }

    /**
     * @return the ActionCode
     */
    public String getActionCode() {
        return ActionCode;
    }

    /**
     * @param ActionCode the ActionCode to set
     */
    public void setActionCode(String ActionCode) {
        this.ActionCode = ActionCode;
    }

    /**
     * @return the AdviceCode
     */
    public String getAdviceCode() {
        return AdviceCode;
    }

    /**
     * @param AdviceCode the AdviceCode to set
     */
    public void setAdviceCode(String AdviceCode) {
        this.AdviceCode = AdviceCode;
    }

    /**
     * @return the Transaccion
     */
    public String getTransaccion() {
        return Transaccion;
    }

    /**
     * @param Transaccion the Transaccion to set
     */
    public void setTransaccion(String Transaccion) {
        this.Transaccion = Transaccion;
    }

    /**
     * @return the Monto
     */
    public Double getMonto() {
        return Monto;
    }

    /**
     * @param Monto the Monto to set
     */
    public void setMonto(Double Monto) {
        this.Monto = Monto;
    }

    /**
     * @return the errcod
     */
    public String getErrcod() {
        return errcod;
    }

    /**
     * @param errcod the errcod to set
     */
    public void setErrcod(String errcod) {
        this.errcod = errcod;
    }

    /**
     * @return the detcod
     */
    public String getDetcod() {
        return detcod;
    }

    /**
     * @param detcod the detcod to set
     */
    public void setDetcod(String detcod) {
        this.detcod = detcod;
    }

    /**
     * @return the defcod
     */
    public String getDefcod() {
        return defcod;
    }

    /**
     * @param defcod the defcod to set
     */
    public void setDefcod(String defcod) {
        this.defcod = defcod;
    }

           
    
}
