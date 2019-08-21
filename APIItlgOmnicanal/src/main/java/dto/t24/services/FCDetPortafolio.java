package dto.t24.services;

public class FCDetPortafolio {
    
    private String  IdClient;
    private String  IdPortfolio;
    private String  ProductType;
    private String  AssetClass;
    private String  ProductName;
    private Double  CurrentBalance;  
    
    private String errcod;
    private String detcod;
    private String defcod;


    

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
     * @return the IdPortfolio
     */
    public String getIdPortfolio() {
        return IdPortfolio;
    }

    /**
     * @param IdPortfolio the IdPortfolio to set
     */
    public void setIdPortfolio(String IdPortfolio) {
        this.IdPortfolio = IdPortfolio;
    }

    /**
     * @return the ProductType
     */
    public String getProductType() {
        return ProductType;
    }

    /**
     * @param ProductType the ProductType to set
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * @return the AssetClass
     */
    public String getAssetClass() {
        return AssetClass;
    }

    /**
     * @param AssetClass the AssetClass to set
     */
    public void setAssetClass(String AssetClass) {
        this.AssetClass = AssetClass;
    }

    /**
     * @return the ProductName
     */
    public String getProductName() {
        return ProductName;
    }

    /**
     * @param ProductName the ProductName to set
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * @return the CurrentBalance
     */
    public Double getCurrentBalance() {
        return CurrentBalance;
    }

    /**
     * @param CurrentBalance the CurrentBalance to set
     */
    public void setCurrentBalance(Double CurrentBalance) {
        this.CurrentBalance = CurrentBalance;
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
