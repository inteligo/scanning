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
public class VencimientoPrestamo {


    private String idclie;
    private String estitu;
    private String codpro;
    private String startdate;
    private String maturitydate;
    private Integer diasres;
    private String cuenta;
    private String loantype;
    private Double monto;
    private String moneda;
    private String tipocliente;
             
    private String errcod;
    private String detcod;
    private String defcod;

    /**
     * @return the idclie
     */
    public String getIdclie() {
        return idclie;
    }

    /**
     * @param idclie the idclie to set
     */
    public void setIdclie(String idclie) {
        this.idclie = idclie;
    }

    /**
     * @return the estitu
     */
    public String getEstitu() {
        return estitu;
    }

    /**
     * @param estitu the estitu to set
     */
    public void setEstitu(String estitu) {
        this.estitu = estitu;
    }

    /**
     * @return the codpro
     */
    public String getCodpro() {
        return codpro;
    }

    /**
     * @param codpro the codpro to set
     */
    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    /**
     * @return the startdate
     */
    public String getStartdate() {
        return startdate;
    }

    /**
     * @param startdate the startdate to set
     */
    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    /**
     * @return the maturitydate
     */
    public String getMaturitydate() {
        return maturitydate;
    }

    /**
     * @param maturitydate the maturitydate to set
     */
    public void setMaturitydate(String maturitydate) {
        this.maturitydate = maturitydate;
    }

    /**
     * @return the diasres
     */
    public Integer getDiasres() {
        return diasres;
    }

    /**
     * @param diasres the diasres to set
     */
    public void setDiasres(Integer diasres) {
        this.diasres = diasres;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the loantype
     */
    public String getLoantype() {
        return loantype;
    }

    /**
     * @param loantype the loantype to set
     */
    public void setLoantype(String loantype) {
        this.loantype = loantype;
    }

    /**
     * @return the monto
     */
    public Double getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(Double monto) {
        this.monto = monto;
    }

    /**
     * @return the moneda
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * @param moneda the moneda to set
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    /**
     * @return the tipocliente
     */
    public String getTipocliente() {
        return tipocliente;
    }

    /**
     * @param tipocliente the tipocliente to set
     */
    public void setTipocliente(String tipocliente) {
        this.tipocliente = tipocliente;
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
