package com.t24.services.impl;

import com.java.Constantes;
import com.java.GeneraUUID;
import com.t24.services.input.Body;
import com.t24.services.input.Head;
import com.t24.services.input.IbaQuery;

public class Ibaguid {
    
    public IbaQuery Encabezado(String Ibaguid,String Functioncode,String CustomerNo,String PortfolioNo )
    {
        IbaQuery ibaguid = new IbaQuery();
        Head hd = new Head();
        Body bd = new Body();
        
        try { 
            //			hd.setIbaguid(generateIbaGuid(customerNo, accountNo));
            if ((Ibaguid==null) || (Ibaguid==""))
            {
                hd.setIbaguid(GeneraUUID.CodigoUUID());
            }
            else
            {
                hd.setIbaguid(Ibaguid);
            }
           if ((Functioncode==null) || (Functioncode==""))
            {
            }
            else
            {
                hd.setFunctioncode(Functioncode);
            }
            hd.setChannel(Constantes.INTEGRADOR_CHANNEL);
            hd.setAgentId(Constantes.INTEGRADOR_AGENTID);  
            hd.setCustomerNo(CustomerNo);
            ibaguid.setHead(hd);
            bd.setCustomerNo(CustomerNo);
            bd.setPortfolioNo(PortfolioNo);
            ibaguid.setBody(bd);
            }

        catch (Exception e) {         
                System.err.println(e.getMessage());  
      }
        return ibaguid;
    }
    
}
