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
public class ClienteCRM {


    private String idclie;
    private String codigo;
    private String nombre;
    private String apellidos;
    private String sector;
    private String marcaservicio;
    private String email;
    private String direccion;
    private String tipopersona;
    private String nombrecompleto;
    private String segmento;   
    
    private String nomsector;   
    private String apesector;   
    private String fonosector;   
    private String anexosector;   
    private String emailsector;   
    private String apepaterno;
    private String apematerno;
    private int permiso;
    
    
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the sector
     */
    public String getSector() {
        return sector;
    }

    /**
     * @param sector the sector to set
     */
    public void setSector(String sector) {
        this.sector = sector;
    }

    /**
     * @return the marcaservicio
     */
    public String getMarcaservicio() {
        return marcaservicio;
    }

    /**
     * @param marcaservicio the marcaservicio to set
     */
    public void setMarcaservicio(String marcaservicio) {
        this.marcaservicio = marcaservicio;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the tipopersona
     */
    public String getTipopersona() {
        return tipopersona;
    }

    /**
     * @param tipopersona the tipopersona to set
     */
    public void setTipopersona(String tipopersona) {
        this.tipopersona = tipopersona;
    }

    /**
     * @return the nombrecompleto
     */
    public String getNombrecompleto() {
        return nombrecompleto;
    }

    /**
     * @param nombrecompleto the nombrecompleto to set
     */
    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
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
     * @return the nomsector
     */
    public String getNomsector() {
        return nomsector;
    }

    /**
     * @param nomsector the nomsector to set
     */
    public void setNomsector(String nomsector) {
        this.nomsector = nomsector;
    }

    /**
     * @return the apesector
     */
    public String getApesector() {
        return apesector;
    }

    /**
     * @param apesector the apesector to set
     */
    public void setApesector(String apesector) {
        this.apesector = apesector;
    }

    /**
     * @return the fonosector
     */
    public String getFonosector() {
        return fonosector;
    }

    /**
     * @param fonosector the fonosector to set
     */
    public void setFonosector(String fonosector) {
        this.fonosector = fonosector;
    }

    /**
     * @return the anexosector
     */
    public String getAnexosector() {
        return anexosector;
    }

    /**
     * @param anexosector the anexosector to set
     */
    public void setAnexosector(String anexosector) {
        this.anexosector = anexosector;
    }

    /**
     * @return the emailsector
     */
    public String getEmailsector() {
        return emailsector;
    }

    /**
     * @param emailsector the emailsector to set
     */
    public void setEmailsector(String emailsector) {
        this.emailsector = emailsector;
    }

    /**
     * @return the apepaterno
     */
    public String getApepaterno() {
        return apepaterno;
    }

    /**
     * @param apepaterno the apepaterno to set
     */
    public void setApepaterno(String apepaterno) {
        this.apepaterno = apepaterno;
    }

    /**
     * @return the apematerno
     */
    public String getApematerno() {
        return apematerno;
    }

    /**
     * @param apematerno the apematerno to set
     */
    public void setApematerno(String apematerno) {
        this.apematerno = apematerno;
    }

    /**
     * @return the permiso
     */
    public int getPermiso() {
        return permiso;
    }

    /**
     * @param permiso the permiso to set
     */
    public void setPermiso(int permiso) {
        this.permiso = permiso;
    }

    
    
    
    
}
