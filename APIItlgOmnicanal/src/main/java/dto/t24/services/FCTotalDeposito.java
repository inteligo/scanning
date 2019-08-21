package dto.t24.services;

public class FCTotalDeposito {
    
    private String  IdPortfolio;
    private String  IdClient;
    private Double  SumaDeposito;

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
     * @return the SumaDeposito
     */
    public Double getSumaDeposito() {
        return SumaDeposito;
    }

    /**
     * @param SumaDeposito the SumaDeposito to set
     */
    public void setSumaDeposito(Double SumaDeposito) {
        this.SumaDeposito = SumaDeposito;
    }

    

   
    
}
