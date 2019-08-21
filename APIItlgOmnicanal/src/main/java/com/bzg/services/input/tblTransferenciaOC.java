/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bzg.services.input;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
//@XmlType(propOrder={"ibaguid", "functioncode", "channel","agentId","customerNo","portfolioNo"})
//propOrder={"company", "scheme", "agreementNumber"})
public class tblTransferenciaOC {
            private String GuidRegistro;
            private String CodigoCliente;
            private String TipoTransferencia;
            private String CuentaOrigen;
            private String TipoCuentaOrigen;
            private String MonedaOrigen;
            private String CuentaDestino;
            private String TipoCuentaDestino;
            private String MonedaDestino;
            private String Monto;
            private String FechaOperacion;
            private String bMarcaTitular;
            private String bMarcaTercero;
            private String TipoDocumento;
            private String NumeroDocumento;
            private String Nombre;
            private String Apellidos;
            private String Referencia;
            private String TipoTarjeta;
            private String TarjetaITLG;

    /**
     * @return the GuidRegistro
     */
    public String getGuidRegistro() {
        return GuidRegistro;
    }

    /**
     * @param GuidRegistro the GuidRegistro to set
     */
    @XmlElement(name="GuidRegistro")
    public void setGuidRegistro(String GuidRegistro) {
        this.GuidRegistro = GuidRegistro;
    }

    /**
     * @return the CodigoCliente
     */
    public String getCodigoCliente() {
        return CodigoCliente;
    }

    /**
     * @param CodigoCliente the CodigoCliente to set
     */
    @XmlElement(name="CodigoCliente")
    public void setCodigoCliente(String CodigoCliente) {
        this.CodigoCliente = CodigoCliente;
    }

    /**
     * @return the TipoTransferencia
     */
    public String getTipoTransferencia() {
        return TipoTransferencia;
    }

    /**
     * @param TipoTransferencia the TipoTransferencia to set
     */
    @XmlElement(name="TipoTransferencia")
    public void setTipoTransferencia(String TipoTransferencia) {
        this.TipoTransferencia = TipoTransferencia;
    }

    /**
     * @return the CuentaOrigen
     */
    public String getCuentaOrigen() {
        return CuentaOrigen;
    }

    /**
     * @param CuentaOrigen the CuentaOrigen to set
     */
    @XmlElement(name="CuentaOrigen")
    public void setCuentaOrigen(String CuentaOrigen) {
        this.CuentaOrigen = CuentaOrigen;
    }

    /**
     * @return the TipoCuentaOrigen
     */
    public String getTipoCuentaOrigen() {
        return TipoCuentaOrigen;
    }

    /**
     * @param TipoCuentaOrigen the TipoCuentaOrigen to set
     */
    @XmlElement(name="TipoCuentaOrigen")
    public void setTipoCuentaOrigen(String TipoCuentaOrigen) {
        this.TipoCuentaOrigen = TipoCuentaOrigen;
    }

    /**
     * @return the MonedaOrigen
     */
    public String getMonedaOrigen() {
        return MonedaOrigen;
    }

    /**
     * @param MonedaOrigen the MonedaOrigen to set
     */
    @XmlElement(name="MonedaOrigen")
    public void setMonedaOrigen(String MonedaOrigen) {
        this.MonedaOrigen = MonedaOrigen;
    }

    /**
     * @return the CuentaDestino
     */
    public String getCuentaDestino() {
        return CuentaDestino;
    }

    /**
     * @param CuentaDestino the CuentaDestino to set
     */
    @XmlElement(name="CuentaDestino")
    public void setCuentaDestino(String CuentaDestino) {
        this.CuentaDestino = CuentaDestino;
    }

    /**
     * @return the TipoCuentaDestino
     */
    public String getTipoCuentaDestino() {
        return TipoCuentaDestino;
    }

    /**
     * @param TipoCuentaDestino the TipoCuentaDestino to set
     */
    @XmlElement(name="TipoCuentaDestino")
    public void setTipoCuentaDestino(String TipoCuentaDestino) {
        this.TipoCuentaDestino = TipoCuentaDestino;
    }

    /**
     * @return the MonedaDestino
     */
    public String getMonedaDestino() {
        return MonedaDestino;
    }

    /**
     * @param MonedaDestino the MonedaDestino to set
     */
    @XmlElement(name="MonedaDestino")
    public void setMonedaDestino(String MonedaDestino) {
        this.MonedaDestino = MonedaDestino;
    }

    /**
     * @return the Monto
     */
    public String getMonto() {
        return Monto;
    }

    /**
     * @param Monto the Monto to set
     */
    @XmlElement(name="Monto")
    public void setMonto(String Monto) {
        this.Monto = Monto;
    }

    /**
     * @return the FechaOperacion
     */
    public String getFechaOperacion() {
        return FechaOperacion;
    }

    /**
     * @param FechaOperacion the FechaOperacion to set
     */
    @XmlElement(name="FechaOperacion")
    public void setFechaOperacion(String FechaOperacion) {
        this.FechaOperacion = FechaOperacion;
    }

    /**
     * @return the bMarcaTitular
     */
    public String getbMarcaTitular() {
        return bMarcaTitular;
    }

    /**
     * @param bMarcaTitular the bMarcaTitular to set
     */
    @XmlElement(name="bMarcaTitular")
    public void setbMarcaTitular(String bMarcaTitular) {
        this.bMarcaTitular = bMarcaTitular;
    }

    /**
     * @return the bMarcaTercero
     */
    public String getbMarcaTercero() {
        return bMarcaTercero;
    }

    /**
     * @param bMarcaTercero the bMarcaTercero to set
     */
    @XmlElement(name="bMarcaTercero")
    public void setbMarcaTercero(String bMarcaTercero) {
        this.bMarcaTercero = bMarcaTercero;
    }

    /**
     * @return the TipoDocumento
     */
    public String getTipoDocumento() {
        return TipoDocumento;
    }

    /**
     * @param TipoDocumento the TipoDocumento to set
     */
    @XmlElement(name="TipoDocumento")
    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    /**
     * @return the NumeroDocumento
     */
    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    /**
     * @param NumeroDocumento the NumeroDocumento to set
     */
        @XmlElement(name="NumeroDocumento")
    public void setNumeroDocumento(String NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    @XmlElement(name="Nombre")
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * @param Apellidos the Apellidos to set
     */
       @XmlElement(name="Apellidos")
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    /**
     * @return the Referencia
     */
    public String getReferencia() {
        return Referencia;
    }

    /**
     * @param Referencia the Referencia to set
     */
       @XmlElement(name="Referencia")
    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    /**
     * @return the TipoTarjeta
     */
    public String getTipoTarjeta() {
        return TipoTarjeta;
    }

    /**
     * @param TipoTarjeta the TipoTarjeta to set
     */
     @XmlElement(name="TipoTarjeta")
    public void setTipoTarjeta(String TipoTarjeta) {
        this.TipoTarjeta = TipoTarjeta;
    }

    /**
     * @return the TarjetaITLG
     */
    public String getTarjetaITLG() {
        return TarjetaITLG;
    }

    /**
     * @param TarjetaITLG the TarjetaITLG to set
     */
     @XmlElement(name="TarjetaITLG")
    public void setTarjetaITLG(String TarjetaITLG) {
        this.TarjetaITLG = TarjetaITLG;
    }

   
            
            
	
}