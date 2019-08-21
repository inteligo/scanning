package dto.t24.services;

public class FCResponse {
    
    private String successIndicator;
    private String zerorec;
    private String messages;
    private String exception;

    /**
     * @return the successIndicator
     */
    public String getSuccessIndicator() {
        return successIndicator;
    }

    /**
     * @param successIndicator the successIndicator to set
     */
    public void setSuccessIndicator(String successIndicator) {
        this.successIndicator = successIndicator;
    }

    /**
     * @return the zerorec
     */
    public String getZerorec() {
        return zerorec;
    }

    /**
     * @param zerorec the zerorec to set
     */
    public void setZerorec(String zerorec) {
        this.zerorec = zerorec;
    }

    /**
     * @return the messages
     */
    public String getMessages() {
        return messages;
    }

    /**
     * @param messages the messages to set
     */
    public void setMessages(String messages) {
        this.messages = messages;
    }

    /**
     * @return the exception
     */
    public String getException() {
        return exception;
    }

    /**
     * @param exception the exception to set
     */
    public void setException(String exception) {
        this.exception = exception;
    }

  
    
}
