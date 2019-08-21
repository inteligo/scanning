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
public class ClienteCRMyFC {


   
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
    
    private Double comisionminima;
    private Double comisionmaxima;
  
    private String  IdClient;
    private String  InactiveCustomer;
    private String  ActiveCustomer;
    private String  DocType;
    private String  ID;
    private String  CollateralDeuda;
    private String  CusSegment;
    private String  CusStatus;
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
     * @return the InactiveCustomer
     */
    public String getInactiveCustomer() {
        return InactiveCustomer;
    }

    /**
     * @param InactiveCustomer the InactiveCustomer to set
     */
    public void setInactiveCustomer(String InactiveCustomer) {
        this.InactiveCustomer = InactiveCustomer;
    }

    /**
     * @return the ActiveCustomer
     */
    public String getActiveCustomer() {
        return ActiveCustomer;
    }

    /**
     * @param ActiveCustomer the ActiveCustomer to set
     */
    public void setActiveCustomer(String ActiveCustomer) {
        this.ActiveCustomer = ActiveCustomer;
    }

    /**
     * @return the DocType
     */
    public String getDocType() {
        return DocType;
    }

    /**
     * @param DocType the DocType to set
     */
    public void setDocType(String DocType) {
        this.DocType = DocType;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the CollateralDeuda
     */
    public String getCollateralDeuda() {
        return CollateralDeuda;
    }

    /**
     * @param CollateralDeuda the CollateralDeuda to set
     */
    public void setCollateralDeuda(String CollateralDeuda) {
        this.CollateralDeuda = CollateralDeuda;
    }

    /**
     * @return the CusSegment
     */
    public String getCusSegment() {
        return CusSegment;
    }

    /**
     * @param CusSegment the CusSegment to set
     */
    public void setCusSegment(String CusSegment) {
        this.CusSegment = CusSegment;
    }

    /**
     * @return the CusStatus
     */
    public String getCusStatus() {
        return CusStatus;
    }

    /**
     * @param CusStatus the CusStatus to set
     */
    public void setCusStatus(String CusStatus) {
        this.CusStatus = CusStatus;
    }
    
        /**
     * @return the IdClient
     */
    public String getIdClient() {
        return IdClient;
    }

    /**
     * @param IdClient the IdClient to set
     */
    public void setIdClient(String IdClient) {
        this.IdClient = IdClient;
    }

    /**
     * @return the comisionminima
     */
    public Double getComisionminima() {
        return comisionminima;
    }

    /**
     * @param comisionminima the comisionminima to set
     */
    public void setComisionminima(Double comisionminima) {
        this.comisionminima = comisionminima;
    }

    /**
     * @return the comisionmaxima
     */
    public Double getComisionmaxima() {
        return comisionmaxima;
    }

    /**
     * @param comisionmaxima the comisionmaxima to set
     */
    public void setComisionmaxima(Double comisionmaxima) {
        this.comisionmaxima = comisionmaxima;
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
    
    
}
