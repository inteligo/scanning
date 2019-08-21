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
public class CalendarioAlerta {


    private String idclie;
    private String codpor;
    private String codpro;
    private Integer totpag;
    private Integer numpag;  
    private String fecpag;
    private Integer intfecpag;
    private Integer diasres;
    
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

   
    
    
}
