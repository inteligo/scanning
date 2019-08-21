/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto.sql;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vrojas
 */
@XmlRootElement
public class DetalleTarjetaCredito {
    private String idclie;
    private Date fecpro;
    private String numtar;
    private String strfecpro;
    private String fectra;
    private Double saltar;
    private Double salcon;
    private Double saldis;
    private Double pagmes;
    private Double pagmin;
    private String ultpag;
    private String cierre;
    private String esttit;
    private String esttar;
    private Integer punint;
    private Double lintot;
    private String tiptar;
    private String tippago;
    private String codbloque;
    private String descbloque;        
    private String fecbloque;
    private String fecexpira;
       
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
     * @return the fecpro
     */
    public Date getFecpro() {
        return fecpro;
    }

    /**
     * @param fecpro the fecpro to set
     */
    public void setFecpro(Date fecpro) {
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
     * @return the strfecpro
     */
    public String getStrfecpro() {
        return strfecpro;
    }

    /**
     * @param strfecpro the strfecpro to set
     */
    public void setStrfecpro(String strfecpro) {
        this.strfecpro = strfecpro;
    }

    /**
     * @return the fectra
     */
    public String getFectra() {
        return fectra;
    }

    /**
     * @param fectra the fectra to set
     */
    public void setFectra(String fectra) {
        this.fectra = fectra;
    }

    /**
     * @return the saltar
     */
    public Double getSaltar() {
        return saltar;
    }

    /**
     * @param saltar the saltar to set
     */
    public void setSaltar(Double saltar) {
        this.saltar = saltar;
    }

    /**
     * @return the salcon
     */
    public Double getSalcon() {
        return salcon;
    }

    /**
     * @param salcon the salcon to set
     */
    public void setSalcon(Double salcon) {
        this.salcon = salcon;
    }

    /**
     * @return the saldis
     */
    public Double getSaldis() {
        return saldis;
    }

    /**
     * @param saldis the saldis to set
     */
    public void setSaldis(Double saldis) {
        this.saldis = saldis;
    }

    /**
     * @return the pagmes
     */
    public Double getPagmes() {
        return pagmes;
    }

    /**
     * @param pagmes the pagmes to set
     */
    public void setPagmes(Double pagmes) {
        this.pagmes = pagmes;
    }

    /**
     * @return the pagmin
     */
    public Double getPagmin() {
        return pagmin;
    }

    /**
     * @param pagmin the pagmin to set
     */
    public void setPagmin(Double pagmin) {
        this.pagmin = pagmin;
    }

    /**
     * @return the ultpag
     */
    public String getUltpag() {
        return ultpag;
    }

    /**
     * @param ultpag the ultpag to set
     */
    public void setUltpag(String ultpag) {
        this.ultpag = ultpag;
    }

    /**
     * @return the cierre
     */
    public String getCierre() {
        return cierre;
    }

    /**
     * @param cierre the cierre to set
     */
    public void setCierre(String cierre) {
        this.cierre = cierre;
    }

    /**
     * @return the esttit
     */
    public String getEsttit() {
        return esttit;
    }

    /**
     * @param esttit the esttit to set
     */
    public void setEsttit(String esttit) {
        this.esttit = esttit;
    }

    /**
     * @return the esttar
     */
    public String getEsttar() {
        return esttar;
    }

    /**
     * @param esttar the esttar to set
     */
    public void setEsttar(String esttar) {
        this.esttar = esttar;
    }

    /**
     * @return the punint
     */
    public Integer getPunint() {
        return punint;
    }

    /**
     * @param punint the punint to set
     */
    public void setPunint(Integer punint) {
        this.punint = punint;
    }

    /**
     * @return the lintot
     */
    public Double getLintot() {
        return lintot;
    }

    /**
     * @param lintot the lintot to set
     */
    public void setLintot(Double lintot) {
        this.lintot = lintot;
    }

    /**
     * @return the tiptar
     */
    public String getTiptar() {
        return tiptar;
    }

    /**
     * @param tiptar the tiptar to set
     */
    public void setTiptar(String tiptar) {
        this.tiptar = tiptar;
    }

    /**
     * @return the tippago
     */
    public String getTippago() {
        return tippago;
    }

    /**
     * @param tippago the tippago to set
     */
    public void setTippago(String tippago) {
        this.tippago = tippago;
    }

    /**
     * @return the codbloque
     */
    public String getCodbloque() {
        return codbloque;
    }

    /**
     * @param codbloque the codbloque to set
     */
    public void setCodbloque(String codbloque) {
        this.codbloque = codbloque;
    }

    /**
     * @return the descbloque
     */
    public String getDescbloque() {
        return descbloque;
    }

    /**
     * @param descbloque the descbloque to set
     */
    public void setDescbloque(String descbloque) {
        this.descbloque = descbloque;
    }

    /**
     * @return the fecbloque
     */
    public String getFecbloque() {
        return fecbloque;
    }

    /**
     * @param fecbloque the fecbloque to set
     */
    public void setFecbloque(String fecbloque) {
        this.fecbloque = fecbloque;
    }

    /**
     * @return the fecexpira
     */
    public String getFecexpira() {
        return fecexpira;
    }

    /**
     * @param fecexpira the fecexpira to set
     */
    public void setFecexpira(String fecexpira) {
        this.fecexpira = fecexpira;
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
