package com.t24.services.impl;

import com.java.Constantes;


public class WebRequestCommon360Impl {
    private com.tws360.wsdl.WebRequestCommon webRequestCommon=new com.tws360.wsdl.WebRequestCommon();
    
    public com.tws360.wsdl.WebRequestCommon   Encabezado( )
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
