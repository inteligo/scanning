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
public class TarjetaCredito {
    private Integer id;    
    private String numtar;    
    private String descri;

    
    
    
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
   
    
            
    
}
