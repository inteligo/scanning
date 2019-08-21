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
public class PagoCupon {


    private String tipocliente;
    private String cliente;
    private String currency;
    private String cuenta;
    private String fecha;
    private String descripcion;
    private String reference;
    private String postfecha;
    private Double cargo;
    private Double abono;
    private String bookingdate;  
     
    private String errcod;
    private String detcod;
    private String defcod;

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
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
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
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return the postfecha
     */
    public String getPostfecha() {
        return postfecha;
    }

    /**
     * @param postfecha the postfecha to set
     */
    public void setPostfecha(String postfecha) {
        this.postfecha = postfecha;
    }

    /**
     * @return the cargo
     */
    public Double getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(Double cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the abono
     */
    public Double getAbono() {
        return abono;
    }

    /**
     * @param abono the abono to set
     */
    public void setAbono(Double abono) {
        this.abono = abono;
    }

    /**
     * @return the bookingdate
     */
    public String getBookingdate() {
        return bookingdate;
    }

    /**
     * @param bookingdate the bookingdate to set
     */
    public void setBookingdate(String bookingdate) {
        this.bookingdate = bookingdate;
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
