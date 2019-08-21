package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.DetallePrestamoImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//SERVICIO MULTICANAL PRESTAMOS DETALLE Y CALENDARIO PATRIMONIO
@Path("/SMCPE1800220")
public class SMCPE1800220Servicio {
            
    DetallePrestamoImpl detalleprestamo= new DetallePrestamoImpl();   
    Logger LOG = LogManager.getLogger(SMCPE1800220Servicio.class);

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getDetallePrestamoId(@HeaderParam("idclie") String idclie,@HeaderParam("codpre") String codpre,@HeaderParam("idpre") String idpre) 
    {   
        try
        {   
            LOG.info("idclie:" + idclie + " codpre:" + codpre + " idpre: " + idpre);             
            String strRespuesta =detalleprestamo.ConsultaDetallePrestamo(idclie,codpre,idpre);
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();
        }

    }
}
