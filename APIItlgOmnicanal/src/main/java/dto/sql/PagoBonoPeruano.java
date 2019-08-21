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
public class PagoBonoPeruano {

    private String customer;
    private String sector;
    private String portafolio;
    private String desctrans;
    private String idactivo;
    private String isin;
    private String nombreactivo;
    private String moneda;
    private Double nominal;
    private Double montopago;
    private String fechapago;
    private String nrodiario;  
     
    private String errcod;
    private String detcod;
    private String defcod;

    /**
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * @return the sector
     */
    public String getSector() {
        return sector;
    }

    /**
     * @param sector the sector to set
     */
    public void setSector(String sector) {
        this.sector = sector;
    }

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

    /**
     * @return the desctrans
     */
    public String getDesctrans() {
        return desctrans;
    }

    /**
     * @param desctrans the desctrans to set
     */
    public void setDesctrans(String desctrans) {
        this.desctrans = desctrans;
    }

    /**
     * @return the idactivo
     */
    public String getIdactivo() {
        return idactivo;
    }

    /**
     * @param idactivo the idactivo to set
     */
    public void setIdactivo(String idactivo) {
        this.idactivo = idactivo;
    }

    /**
     * @return the isin
     */
    public String getIsin() {
        return isin;
    }

    /**
     * @param isin the isin to set
     */
    public void setIsin(String isin) {
        this.isin = isin;
    }

    /**
     * @return the nombreactivo
     */
    public String getNombreactivo() {
        return nombreactivo;
    }

    /**
     * @param nombreactivo the nombreactivo to set
     */
    public void setNombreactivo(String nombreactivo) {
        this.nombreactivo = nombreactivo;
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
     * @return the nominal
     */
    public Double getNominal() {
        return nominal;
    }

    /**
     * @param nominal the nominal to set
     */
    public void setNominal(Double nominal) {
        this.nominal = nominal;
    }

    /**
     * @return the montopago
     */
    public Double getMontopago() {
        return montopago;
    }

    /**
     * @param montopago the montopago to set
     */
    public void setMontopago(Double montopago) {
        this.montopago = montopago;
    }

    /**
     * @return the fechapago
     */
    public String getFechapago() {
        return fechapago;
    }

    /**
     * @param fechapago the fechapago to set
     */
    public void setFechapago(String fechapago) {
        this.fechapago = fechapago;
    }

    /**
     * @return the nrodiario
     */
    public String getNrodiario() {
        return nrodiario;
    }

    /**
     * @param nrodiario the nrodiario to set
     */
    public void setNrodiario(String nrodiario) {
        this.nrodiario = nrodiario;
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
