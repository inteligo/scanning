package dto.t24.services;

public class FCDeposito {
    
    private String  IdClient;
    private String  Cliente;
    private String  DepositNumber ;
    private String  Currency ;
    private Double  AccountingBalance ;
    private Double  Rate ;
    private String  StartDate ;    
    private String  MaturityDate ;
    private String  TermDays ;
    private String  InterestFrequency   ;
    private String  NextPayment ;
    private Double  PaymentAmount   ;
    private Double  AccruedInterest ;
    private Double  GuaranteedAccountingBalance ;
    private String  InstructionsAtMaturity ;
    private String  DrawdownAccount;
    private String  IdPortafolio;
    private Double  AccountingBalanceUSD ;
    private String  NombreMoneda ;
    private String  SimboloMoneda ;
    private String  TipoDeposito ;
    private String  estitu ;
    
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
     * @return the StartDate
     */
    public String getStartDate() {
        return StartDate;
    }

    /**
     * @param StartDate the StartDate to set
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
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
     * @return the TermDays
     */
    public String getTermDays() {
        return TermDays;
    }

    /**
     * @param TermDays the TermDays to set
     */
    public void setTermDays(String TermDays) {
        this.TermDays = TermDays;
    }

    /**
     * @return the InterestFrequency
     */
    public String getInterestFrequency() {
        return InterestFrequency;
    }

    /**
     * @param InterestFrequency the InterestFrequency to set
     */
    public void setInterestFrequency(String InterestFrequency) {
        this.InterestFrequency = InterestFrequency;
    }

    /**
     * @return the NextPayment
     */
    public String getNextPayment() {
        return NextPayment;
    }

    /**
     * @param NextPayment the NextPayment to set
     */
    public void setNextPayment(String NextPayment) {
        this.NextPayment = NextPayment;
    }

    /**
     * @return the PaymentAmount
     */
    public Double getPaymentAmount() {
        return PaymentAmount;
    }

    /**
     * @param PaymentAmount the PaymentAmount to set
     */
    public void setPaymentAmount(Double PaymentAmount) {
        this.PaymentAmount = PaymentAmount;
    }

    /**
     * @return the AccruedInterest
     */
    public Double getAccruedInterest() {
        return AccruedInterest;
    }

    /**
     * @param AccruedInterest the AccruedInterest to set
     */
    public void setAccruedInterest(Double AccruedInterest) {
        this.AccruedInterest = AccruedInterest;
    }

    /**
     * @return the GuaranteedAccountingBalance
     */
    public Double getGuaranteedAccountingBalance() {
        return GuaranteedAccountingBalance;
    }

    /**
     * @param GuaranteedAccountingBalance the GuaranteedAccountingBalance to set
     */
    public void setGuaranteedAccountingBalance(Double GuaranteedAccountingBalance) {
        this.GuaranteedAccountingBalance = GuaranteedAccountingBalance;
    }

    /**
     * @return the InstructionsAtMaturity
     */
    public String getInstructionsAtMaturity() {
        return InstructionsAtMaturity;
    }

    /**
     * @param InstructionsAtMaturity the InstructionsAtMaturity to set
     */
    public void setInstructionsAtMaturity(String InstructionsAtMaturity) {
        this.InstructionsAtMaturity = InstructionsAtMaturity;
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
     * @return the IdPortafolio
     */
    public String getIdPortafolio() {
        return IdPortafolio;
    }

    /**
     * @param IdPortafolio the IdPortafolio to set
     */
    public void setIdPortafolio(String IdPortafolio) {
        this.IdPortafolio = IdPortafolio;
    }

    /**
     * @return the AccountingBalanceUSD
     */
    public Double getAccountingBalanceUSD() {
        return AccountingBalanceUSD;
    }

    /**
     * @param AccountingBalanceUSD the AccountingBalanceUSD to set
     */
    public void setAccountingBalanceUSD(Double AccountingBalanceUSD) {
        this.AccountingBalanceUSD = AccountingBalanceUSD;
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
     * @return the TipoDeposito
     */
    public String getTipoDeposito() {
        return TipoDeposito;
    }

    /**
     * @param TipoDeposito the TipoDeposito to set
     */
    public void setTipoDeposito(String TipoDeposito) {
        this.TipoDeposito = TipoDeposito;
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
     * @return the estitu
     */
    public String getEstitu() {
        return estitu;
    }

    /**
     * @param estitu the estitu to set
     */
    public void setEstitu(String estitu) {
        this.estitu = estitu;
    }

  
    
}
