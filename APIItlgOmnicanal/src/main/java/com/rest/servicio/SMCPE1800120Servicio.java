package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.DetalleActivosPorClaseImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


//SERVICIO MULTICANAL DETALLE ACTIVOS POR CLASE
@Path("/SMCPE1800120")
public class SMCPE1800120Servicio {
            
    DetalleActivosPorClaseImpl detalleactivosporclase= new DetalleActivosPorClaseImpl();   
    Logger LOG = LogManager.getLogger(SMCPE1800120Servicio.class);

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getDetalleActivosPorClaseId(@HeaderParam("idclie") String idclie,@HeaderParam("numpor") String numpor)
    {          
        try
            {   
                LOG.info("idclie:" + idclie + " numpor:" + numpor );             
                String strRespuesta =detalleactivosporclase.ConsultaDetalleActivosPorClase(idclie,numpor);
                LOG.info("Respuesta:" + strRespuesta );
                return Response.ok(strRespuesta).build();
            }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();
        }

    }
}
