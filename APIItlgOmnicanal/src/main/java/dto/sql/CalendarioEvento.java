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
public class CalendarioEvento {


    private String idclie;
    private String codpor;
    private String codpro;
    private Integer totpag;
    private Integer numpag;
    private Double monto;
    private String fecpag;
    private Integer intfecpag;
    private Integer estpag;
    private Double saldo;
    private String descri;
    private String carabo;
    private String tippro;
    private String idpre;
    private Double monpro;
    private Double monpor;
    private String estitu;
    public String owner;
    
    private String evento;
    private String producto;
    private String Nombre;
    
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
     * @return the codpor
     */
    public String getCodpor() {
        return codpor;
    }

    /**
     * @param codpor the codpor to set
     */
    public void setCodpor(String codpor) {
        this.codpor = codpor;
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
     * @return the totpag
     */
    public Integer getTotpag() {
        return totpag;
    }

    /**
     * @param totpag the totpag to set
     */
    public void setTotpag(Integer totpag) {
        this.totpag = totpag;
    }

    /**
     * @return the numpag
     */
    public Integer getNumpag() {
        return numpag;
    }

    /**
     * @param numpag the numpag to set
     */
    public void setNumpag(Integer numpag) {
        this.numpag = numpag;
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
     * @return the fecpag
     */
    public String getFecpag() {
        return fecpag;
    }

    /**
     * @param fecpag the fecpag to set
     */
    public void setFecpag(String fecpag) {
        this.fecpag = fecpag;
    }

    /**
     * @return the intfecpag
     */
    public Integer getIntfecpag() {
        return intfecpag;
    }

    /**
     * @param intfecpag the intfecpag to set
     */
    public void setIntfecpag(Integer intfecpag) {
        this.intfecpag = intfecpag;
    }

    /**
     * @return the estpag
     */
    public Integer getEstpag() {
        return estpag;
    }

    /**
     * @param estpag the estpag to set
     */
    public void setEstpag(Integer estpag) {
        this.estpag = estpag;
    }

    /**
     * @return the saldo
     */
    public Double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the descri
     */
    public String getDescri() {
        return descri;
    }

    /**
     * @param descri the descri to set
     */
    public void setDescri(String descri) {
        this.descri = descri;
    }

    /**
     * @return the carabo
     */
    public String getCarabo() {
        return carabo;
    }

    /**
     * @param carabo the carabo to set
     */
    public void setCarabo(String carabo) {
        this.carabo = carabo;
    }

    /**
     * @return the tippro
     */
    public String getTippro() {
        return tippro;
    }

    /**
     * @param tippro the tippro to set
     */
    public void setTippro(String tippro) {
        this.tippro = tippro;
    }

    /**
     * @return the idpre
     */
    public String getIdpre() {
        return idpre;
    }

    /**
     * @param idpre the idpre to set
     */
    public void setIdpre(String idpre) {
        this.idpre = idpre;
    }

    /**
     * @return the monpro
     */
    public Double getMonpro() {
        return monpro;
    }

    /**
     * @param monpro the monpro to set
     */
    public void setMonpro(Double monpro) {
        this.monpro = monpro;
    }

    /**
     * @return the monpor
     */
    public Double getMonpor() {
        return monpor;
    }

    /**
     * @param monpor the monpor to set
     */
    public void setMonpor(Double monpor) {
        this.monpor = monpor;
    }

    /**
     * @return the evento
     */
    public String getEvento() {
        return evento;
    }

    /**
     * @param evento the evento to set
     */
    public void setEvento(String evento) {
        this.evento = evento;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
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
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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

  public String getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }            
    
}
