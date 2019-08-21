package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.VencimientoPrestamoImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//SERVICIO VENCIMIENTO PRESTAMOS
@Path("/SMCPE1800050")
public class SMCPE1800050Servicio {
            
    VencimientoPrestamoImpl VencPrestamo= new VencimientoPrestamoImpl();  
    Logger LOG = LogManager.getLogger(SMCPE1800320Servicio.class);

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getVencPrestamo(@HeaderParam("fecpro") String fecpro,@HeaderParam("numdias") String numdias) 
    {          
        try
        {   
            LOG.info("fecpro:" + fecpro + " numdias: " + numdias);             
            String strRespuesta =VencPrestamo.ConsultaVencimientoPrestamo(fecpro, numdias); 
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();
        }
    }
}
