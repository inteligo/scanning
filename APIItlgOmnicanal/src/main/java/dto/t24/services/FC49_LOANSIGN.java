package dto.t24.services;


public class FC49_LOANSIGN {
    
    private String  IdClient;
    private String  Cliente;
    private String  LoanNumber;
    private String  Currency;
    private String  LoanType;
    private String  DisbursementDate;
    private Double  CreditAmount ;
    private Double  Rate ;
    private Double  Balance   ; 
    private Double  NextPayment   ;     
    private String NextPaymentDate;
    private String MaturityDate;
    private String FrequencyCapitalInterests;
    private Double  AccruedInterests ;     
    private String ID;
    private String AccountOfficer;
    private String AccountReference;
    private String DisburseAcct;
    private String SignRelation;
    private String SignCondition;
    private String ClientType;
     private Double  BalanceUSD   ; 
     private String  NombreMoneda ;
    private String  SimboloMoneda ;
    
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
     * @return the LoanNumber
     */
    public String getLoanNumber() {
        return LoanNumber;
    }

    /**
     * @param LoanNumber the LoanNumber to set
     */
    public void setLoanNumber(String LoanNumber) {
        this.LoanNumber = LoanNumber;
    }

    /**
     * @return the Currency
     */
    public String getCurrency() {
        return Currency;
    }

    /**
     * @param Currency the Currency to set
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * @return the LoanType
     */
    public String getLoanType() {
        return LoanType;
    }

    /**
     * @param LoanType the LoanType to set
     */
    public void setLoanType(String LoanType) {
        this.LoanType = LoanType;
    }

    /**
     * @return the DisbursementDate
     */
    public String getDisbursementDate() {
        return DisbursementDate;
    }

    /**
     * @param DisbursementDate the DisbursementDate to set
     */
    public void setDisbursementDate(String DisbursementDate) {
        this.DisbursementDate = DisbursementDate;
    }

    /**
     * @return the CreditAmount
     */
    public Double getCreditAmount() {
        return CreditAmount;
    }

    /**
     * @param CreditAmount the CreditAmount to set
     */
    public void setCreditAmount(Double CreditAmount) {
        this.CreditAmount = CreditAmount;
    }

    /**
     * @return the Rate
     */
    public Double getRate() {
        return Rate;
    }

    /**
     * @param Rate the Rate to set
     */
    public void setRate(Double Rate) {
        this.Rate = Rate;
    }

    /**
     * @return the Balance
     */
    public Double getBalance() {
        return Balance;
    }

    /**
     * @param Balance the Balance to set
     */
    public void setBalance(Double Balance) {
        this.Balance = Balance;
    }

    /**
     * @return the NextPayment
     */
    public Double getNextPayment() {
        return NextPayment;
    }

    /**
     * @param NextPayment the NextPayment to set
     */
    public void setNextPayment(Double NextPayment) {
        this.NextPayment = NextPayment;
    }

    /**
     * @return the NextPaymentDate
     */
    public String getNextPaymentDate() {
        return NextPaymentDate;
    }

    /**
     * @param NextPaymentDate the NextPaymentDate to set
     */
    public void setNextPaymentDate(String NextPaymentDate) {
        this.NextPaymentDate = NextPaymentDate;
    }

    /**
     * @return the MaturityDate
     */
    public String getMaturityDate() {
        return MaturityDate;
    }

    /**
     * @param MaturityDate the MaturityDate to set
     */
    public void setMaturityDate(String MaturityDate) {
        this.MaturityDate = MaturityDate;
    }

    /**
     * @return the FrequencyCapitalInterests
     */
    public String getFrequencyCapitalInterests() {
        return FrequencyCapitalInterests;
    }

    /**
     * @param FrequencyCapitalInterests the FrequencyCapitalInterests to set
     */
    public void setFrequencyCapitalInterests(String FrequencyCapitalInterests) {
        this.FrequencyCapitalInterests = FrequencyCapitalInterests;
    }

    /**
     * @return the AccruedInterests
     */
    public Double getAccruedInterests() {
        return AccruedInterests;
    }

    /**
     * @param AccruedInterests the AccruedInterests to set
     */
    public void setAccruedInterests(Double AccruedInterests) {
        this.AccruedInterests = AccruedInterests;
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
     * @return the AccountOfficer
     */
    public String getAccountOfficer() {
        return AccountOfficer;
    }

    /**
     * @param AccountOfficer the AccountOfficer to set
     */
    public void setAccountOfficer(String AccountOfficer) {
        this.AccountOfficer = AccountOfficer;
    }

    /**
     * @return the AccountReference
     */
    public String getAccountReference() {
        return AccountReference;
    }

    /**
     * @param AccountReference the AccountReference to set
     */
    public void setAccountReference(String AccountReference) {
        this.AccountReference = AccountReference;
    }

    /**
     * @return the DisburseAcct
     */
    public String getDisburseAcct() {
        return DisburseAcct;
    }

    /**
     * @param DisburseAcct the DisburseAcct to set
     */
    public void setDisburseAcct(String DisburseAcct) {
        this.DisburseAcct = DisburseAcct;
    }

    /**
     * @return the SignRelation
     */
    public String getSignRelation() {
        return SignRelation;
    }

    /**
     * @param SignRelation the SignRelation to set
     */
    public void setSignRelation(String SignRelation) {
        this.SignRelation = SignRelation;
    }

    /**
     * @return the SignCondition
     */
    public String getSignCondition() {
        return SignCondition;
    }

    /**
     * @param SignCondition the SignCondition to set
     */
    public void setSignCondition(String SignCondition) {
        this.SignCondition = SignCondition;
    }

    /**
     * @return the ClientType
     */
    public String getClientType() {
        return ClientType;
    }

    /**
     * @param ClientType the ClientType to set
     */
    public void setClientType(String ClientType) {
        this.ClientType = ClientType;
    }

    /**
     * @return the BalanceUSD
     */
    public Double getBalanceUSD() {
        return BalanceUSD;
    }

    /**
     * @param BalanceUSD the BalanceUSD to set
     */
    public void setBalanceUSD(Double BalanceUSD) {
        this.BalanceUSD = BalanceUSD;
    }

    /**
     * @return the NombreMoneda
     */
    public String getNombreMoneda() {
        return NombreMoneda;
    }

    /**
     * @param NombreMoneda the NombreMoneda to set
     */
    public void setNombreMoneda(String NombreMoneda) {
        this.NombreMoneda = NombreMoneda;
    }

    /**
     * @return the SimboloMoneda
     */
    public String getSimboloMoneda() {
        return SimboloMoneda;
    }

    /**
     * @param SimboloMoneda the SimboloMoneda to set
     */
    public void setSimboloMoneda(String SimboloMoneda) {
        this.SimboloMoneda = SimboloMoneda;
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
