package com.t24.services.impl;

import com.java.Constantes;


public class WebRequestCommonImpl {
    private com.tws.wsdl.WebRequestCommon webRequestCommon=new com.tws.wsdl.WebRequestCommon();
    
    public com.tws.wsdl.WebRequestCommon   Encabezado( )
    {              
        try { 

            webRequestCommon.setUserName(Constantes.TWS_USERNAME);
            webRequestCommon.setPassword(Constantes.TWS_PASSWORD);
            webRequestCommon.setCompany(Constantes.TWS_COMPANY);          
            }
        catch (Exception e) {         
                System.err.println(e.getMessage());  
      }
        return webRequestCommon;
    }
    
}
