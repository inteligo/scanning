package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.CuentaNombreClienteImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//SERVICIO MULTICANAL LISTADO CUENTAS
@Path("/SMCPE1800021")
public class SMCPE1800021Servicio {
            
    CuentaNombreClienteImpl cuentanombrecliente= new CuentaNombreClienteImpl();   
    Logger LOG = LogManager.getLogger(SMCPE1800021Servicio.class);

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getCuentaNombreCliente(@HeaderParam("idcta") String idcta) 
    {          
        try
        {   
            LOG.info("idcta:" + idcta );            
            String strRespuesta =cuentanombrecliente.DetalleCuenta(idcta);  
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();
        }
    }
}
