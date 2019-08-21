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
public class CalendarioBono {

    private String codpro;
    private Integer totpag;
    private Integer numpag;  
    private String fecpag;    
    private Integer estpag;
   
    
    private String errcod;
    private String detcod;
    private String defcod;

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
