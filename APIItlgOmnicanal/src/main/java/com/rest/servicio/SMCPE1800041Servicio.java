package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.TarjetaCreditoImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


//SERVICIO MULTICANAL TARJETAS BLOQUEADAS  
@Path("/SMCPE1800041")
public class SMCPE1800041Servicio {
            
    TarjetaCreditoImpl tarjetacredito= new TarjetaCreditoImpl(); 
    Logger LOG = LogManager.getLogger(SMCPE1800041Servicio.class);

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response  getTarjetaCreditoBloquedas(@HeaderParam("fecpro") String fecpro)
    {
        try
        {   
            LOG.info(" fecpro:" + fecpro );             
            String strRespuesta =tarjetacredito.ConsultaTarjetaCreditoBloquedas(fecpro); 
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }       
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();


        }

    }
}
