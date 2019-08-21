package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.ClienteFirmanteImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


//SERVICIO MULTICANAL CLIENTE FIRMANTE
@Path("/SMCPE1800090")
public class SMCPE1800090Servicio {
            
    ClienteFirmanteImpl clientefirmante= new ClienteFirmanteImpl(); 
    Logger LOG = LogManager.getLogger(SMCPE1800090Servicio.class);


    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response  getClienteFirmanteId(@HeaderParam("idclie") String idclie) 
    {
        try
        {   
            LOG.info("idclie:" + idclie);             
            String strRespuesta =clientefirmante.ConsultaClienteFirmante(idclie); 
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();
        }

    }
}
