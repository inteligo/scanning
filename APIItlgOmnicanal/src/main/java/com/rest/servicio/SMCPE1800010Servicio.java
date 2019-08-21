package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.CuentaPatrimonioImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



//SERVICIO MULTICANAL CONSULTA CUENTAS
@Path("/SMCPE1800010")
public class SMCPE1800010Servicio {    
             
    CuentaPatrimonioImpl cuentaspatrimonio= new CuentaPatrimonioImpl();  
    Logger LOG = LogManager.getLogger(SMCPE1800010Servicio.class);

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getCuentasPatrimonioId(@HeaderParam("idclie") String idclie) 
    {             
        try
        {     
            LOG.info("idclie:" + idclie );  
            
            String strRespuesta =cuentaspatrimonio.ConsultaCuentasPatrimonio(idclie);  
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();

        }
        
    }
}
