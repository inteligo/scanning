/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t24.services.input;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={"ibaguid", "functioncode", "channel","agentId","customerNo","portfolioNo"})
//propOrder={"company", "scheme", "agreementNumber"})
public class Head {

	
                    String ibaguid;
                    String functioncode;
                    String channel;
                    String agentId;
                    String customerNo;
                    String portfolioNo;
        
//                    int customerhead;
//                    int customerNoJson;
      	
	
	public String getIbaguid() {
		return ibaguid;
	}
	
	@XmlElement
	public void setIbaguid(String ibaguid) {
		this.ibaguid = ibaguid;
	}
	public String getFunctioncode() {
		return functioncode;
	}
	
	@XmlElement
	public void setFunctioncode(String functioncode) {
		this.functioncode = functioncode;
	}
	public String getChannel() {
		return channel;
	}
	
	@XmlElement
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getAgentId() {
		return agentId;
	}
	
	@XmlElement(name="AgentId")
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getCustomerNo() {
		return customerNo;
	}
	
	@XmlElement(name="CustomerNo")
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

       
        public String getPortfolioNo() {
            return portfolioNo;
        }

        @XmlElement(name="PortfolioNo")
        public void setPortfolioNo(String portfolioNo) {
            this.portfolioNo = portfolioNo;
        }

//         public int getCustomerNoJson() {
//		return customerNoJson;
//	}
//	
//	@XmlElement(name="customerNoJson")
//	public void setCustomerNoJson(int customerNoJson) {
//		this.customerNoJson = customerNoJson;
//	}
//	
//        public int getCustomerhead() {
//		return customerhead;
//	}
//	
//	@XmlElement(name="customerhead")
//	public void setCustomerhead(int customerhead) {
//		this.customerhead = customerhead;
//	}
      	
	
}