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
public class MovimientoTarjetaCredito {
    private Integer id;    
    private String idclie;
    private String fecpro;
    private String numtar;
    
    private String descri;
    private String fecmov;
    private String descrip;
    private String carabo;
    private Double monto;

    private String errcod;
    private String detcod;
    private String defcod;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

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
     * @return the fecpro
     */
    public String getFecpro() {
        return fecpro;
    }

    /**
     * @param fecpro the fecpro to set
     */
    public void setFecpro(String fecpro) {
        this.fecpro = fecpro;
    }

    /**
     * @return the numtar
     */
    public String getNumtar() {
        return numtar;
    }

    /**
     * @param numtar the numtar to set
     */
    public void setNumtar(String numtar) {
        this.numtar = numtar;
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
     * @return the fecmov
     */
    public String getFecmov() {
        return fecmov;
    }

    /**
     * @param fecmov the fecmov to set
     */
    public void setFecmov(String fecmov) {
        this.fecmov = fecmov;
    }

    /**
     * @return the descrip
     */
    public String getDescrip() {
        return descrip;
    }

    /**
     * @param descrip the descrip to set
     */
    public void setDescrip(String descrip) {
        this.descrip = descrip;
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
