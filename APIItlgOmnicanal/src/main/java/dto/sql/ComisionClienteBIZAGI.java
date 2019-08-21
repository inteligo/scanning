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
public class ComisionClienteBIZAGI {


    private String codsegmento;
    private String segmento;
    private String codtipotransferencia;
    private String tipotransferencia;
    private Double montominimo;
    private Double montomaximo;
     
    private String errcod;
    private String detcod;
    private String defcod;

    /**
     * @return the codsegmento
     */
    public String getCodsegmento() {
        return codsegmento;
    }

    /**
     * @param codsegmento the codsegmento to set
     */
    public void setCodsegmento(String codsegmento) {
        this.codsegmento = codsegmento;
    }

    /**
     * @return the segmento
     */
    public String getSegmento() {
        return segmento;
    }

    /**
     * @param segmento the segmento to set
     */
    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    /**
     * @return the codtipotransferencia
     */
    public String getCodtipotransferencia() {
        return codtipotransferencia;
    }

    /**
     * @param codtipotransferencia the codtipotransferencia to set
     */
    public void setCodtipotransferencia(String codtipotransferencia) {
        this.codtipotransferencia = codtipotransferencia;
    }

    /**
     * @return the tipotransferencia
     */
    public String getTipotransferencia() {
        return tipotransferencia;
    }

    /**
     * @param tipotransferencia the tipotransferencia to set
     */
    public void setTipotransferencia(String tipotransferencia) {
        this.tipotransferencia = tipotransferencia;
    }

    /**
     * @return the montominimo
     */
    public Double getMontominimo() {
        return montominimo;
    }

    /**
     * @param montominimo the montominimo to set
     */
    public void setMontominimo(Double montominimo) {
        this.montominimo = montominimo;
    }

    /**
     * @return the montomaximo
     */
    public Double getMontomaximo() {
        return montomaximo;
    }

    /**
     * @param montomaximo the montomaximo to set
     */
    public void setMontomaximo(Double montomaximo) {
        this.montomaximo = montomaximo;
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
