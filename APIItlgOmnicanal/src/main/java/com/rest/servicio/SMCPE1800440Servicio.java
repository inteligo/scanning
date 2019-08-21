package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.CuentaClienteImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//SERVICIO MULTICANAL CONSULTA CUENTAS CLIENTE
@Path("/SMCPE1800440")
public class SMCPE1800440Servicio {
            
    CuentaClienteImpl cuentacliente= new CuentaClienteImpl();   
    Logger LOG = LogManager.getLogger(SMCPE1800440Servicio.class);

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getCuentaCliente(@HeaderParam("idclie") String idclie,@HeaderParam("perfil") String perfil,@HeaderParam("tipotransferencia") String tipotransferencia) 
    {          
        try
        {  
            LOG.info("idclie:" + idclie + " perfil:" + perfil + " tipotransferencia: " + tipotransferencia);                         
            String strRespuesta =cuentacliente.ConsultaCuentaCliente(idclie,perfil,tipotransferencia);     
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();
        }
    }
}
