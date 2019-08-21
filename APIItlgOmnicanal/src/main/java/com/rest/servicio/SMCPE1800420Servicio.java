package com.rest.servicio;

import com.apis.impl.EstadoOperacionImpl;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//SERVICIO MULTICANAL CONSULTA ESTADO DE LA OPERACION
@Path("/SMCPE1800420")
public class SMCPE1800420Servicio {
            
    EstadoOperacionImpl estadooperacion= new EstadoOperacionImpl();  
    Logger LOG = LogManager.getLogger(SMCPE1800420Servicio.class);

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getEstadoOperacion(@HeaderParam("guid") String guid,@HeaderParam("idclie") String idclie) 
    {          
        try
        { 
            LOG.info("guid: " + guid + " idclie:" + idclie );             
            String strRespuesta =estadooperacion.EstadoOperacion( guid);    
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();
        }
    }
}
