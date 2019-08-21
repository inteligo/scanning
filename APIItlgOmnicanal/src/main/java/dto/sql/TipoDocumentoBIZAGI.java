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
public class TipoDocumentoBIZAGI {
    private String codigo;    
    private String descripcion;
    private String equivalenciate;
    private String equivalenciaib;
    
    private String errcod;
    private String detcod;
    private String defcod;    

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
     * @return the equivalenciate
     */
    public String getEquivalenciate() {
        return equivalenciate;
    }

    /**
     * @param equivalenciate the equivalenciate to set
     */
    public void setEquivalenciate(String equivalenciate) {
        this.equivalenciate = equivalenciate;
    }

    /**
     * @return the equivalenciaib
     */
    public String getEquivalenciaib() {
        return equivalenciaib;
    }

    /**
     * @param equivalenciaib the equivalenciaib to set
     */
    public void setEquivalenciaib(String equivalenciaib) {
        this.equivalenciaib = equivalenciaib;
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
