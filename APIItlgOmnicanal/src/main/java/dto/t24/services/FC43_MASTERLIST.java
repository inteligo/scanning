package dto.t24.services;

public class FC43_MASTERLIST {
    
    private String  CodigodeProducto;
    private String  ISIN;
    private String  Cusip;
    private String  Name ;
    private Integer  SubAssetType ;
    private Integer  AssetType   ;
    
    private String errcod;
    private String detcod;
    private String defcod;
    
    /**
     * @return the CodigodeProducto
     */
    public String getCodigodeProducto() {
        return CodigodeProducto;
    }

    /**
     * @param CodigodeProducto the CodigodeProducto to set
     */
    public void setCodigodeProducto(String CodigodeProducto) {
        this.CodigodeProducto = CodigodeProducto;
    }

    /**
     * @return the ISIN
     */
    public String getISIN() {
        return ISIN;
    }

    /**
     * @param ISIN the ISIN to set
     */
    public void setISIN(String ISIN) {
        this.ISIN = ISIN;
    }

    /**
     * @return the Cusip
     */
    public String getCusip() {
        return Cusip;
    }

    /**
     * @param Cusip the Cusip to set
     */
    public void setCusip(String Cusip) {
        this.Cusip = Cusip;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the SubAssetType
     */
    public Integer getSubAssetType() {
        return SubAssetType;
    }

    /**
     * @param SubAssetType the SubAssetType to set
     */
    public void setSubAssetType(Integer SubAssetType) {
        this.SubAssetType = SubAssetType;
    }

    /**
     * @return the AssetType
     */
    public Integer getAssetType() {
        return AssetType;
    }

    /**
     * @param AssetType the AssetType to set
     */
    public void setAssetType(Integer AssetType) {
        this.AssetType = AssetType;
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
