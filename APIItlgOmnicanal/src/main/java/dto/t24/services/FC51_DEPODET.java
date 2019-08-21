package dto.t24.services;

public class FC51_DEPODET {
    
    private String  IdClient;
    private String  Cliente;
    private String  DepositNumber ;  
    private Double  AccountingBalance ;
    private String  DrawdownAccount;
    
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
     * @return the Cliente
     */
    public String getCliente() {
        return Cliente;
    }

    /**
     * @param Cliente the Cliente to set
     */
    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    /**
     * @return the DepositNumber
     */
    public String getDepositNumber() {
        return DepositNumber;
    }

    /**
     * @param DepositNumber the DepositNumber to set
     */
    public void setDepositNumber(String DepositNumber) {
        this.DepositNumber = DepositNumber;
    }

    /**
     * @return the AccountingBalance
     */
    public Double getAccountingBalance() {
        return AccountingBalance;
    }

    /**
     * @param AccountingBalance the AccountingBalance to set
     */
    public void setAccountingBalance(Double AccountingBalance) {
        this.AccountingBalance = AccountingBalance;
    }

    /**
     * @return the DrawdownAccount
     */
    public String getDrawdownAccount() {
        return DrawdownAccount;
    }

    /**
     * @param DrawdownAccount the DrawdownAccount to set
     */
    public void setDrawdownAccount(String DrawdownAccount) {
        this.DrawdownAccount = DrawdownAccount;
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
