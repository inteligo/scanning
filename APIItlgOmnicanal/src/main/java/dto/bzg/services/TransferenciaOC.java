/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto.bzg.services;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


//@XmlRootElement(name="TransferenciaOC")
//@XmlType(propOrder={})
public class TransferenciaOC {
//            @XmlElement(name="NumeroCaso")
            private String NumeroCaso;
//            @XmlElement(name="GuidRegistro")
            private String GuidRegistro;      
//            @XmlElement(name="CodigoRespuesta")
            private String CodigoRespuesta;
//            @XmlElement(name="ComentarioRespuesta")
            private String ComentarioRespuesta;
            
            private String Comision;
            private String TransaccionT24;
            
            private String errcod;
            private String detcod;
            private String defcod;

    /**
     * @return the NumeroCaso
     */
    public String getNumeroCaso() {
        return NumeroCaso;
    }

    /**
     * @param NumeroCaso the NumeroCaso to set
     */
    public void setNumeroCaso(String NumeroCaso) {
        this.NumeroCaso = NumeroCaso;
    }

    /**
     * @return the GuidRegistro
     */
    public String getGuidRegistro() {
        return GuidRegistro;
    }

    /**
     * @param GuidRegistro the GuidRegistro to set
     */
    public void setGuidRegistro(String GuidRegistro) {
        this.GuidRegistro = GuidRegistro;
    }

    /**
     * @return the CodigoRespuesta
     */
    public String getCodigoRespuesta() {
        return CodigoRespuesta;
    }

    /**
     * @param CodigoRespuesta the CodigoRespuesta to set
     */
    public void setCodigoRespuesta(String CodigoRespuesta) {
        this.CodigoRespuesta = CodigoRespuesta;
    }

    /**
     * @return the ComentarioRespuesta
     */
    public String getComentarioRespuesta() {
        return ComentarioRespuesta;
    }

    /**
     * @param ComentarioRespuesta the ComentarioRespuesta to set
     */
    public void setComentarioRespuesta(String ComentarioRespuesta) {
        this.ComentarioRespuesta = ComentarioRespuesta;
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
     * @return the Comision
     */
    public String getComision() {
        return Comision;
    }

    /**
     * @param Comision the Comision to set
     */
    public void setComision(String Comision) {
        this.Comision = Comision;
    }

    /**
     * @return the TransaccionT24
     */
    public String getTransaccionT24() {
        return TransaccionT24;
    }

    /**
     * @param TransaccionT24 the TransaccionT24 to set
     */
    public void setTransaccionT24(String TransaccionT24) {
        this.TransaccionT24 = TransaccionT24;
    }
         
    
    

   
	
}