package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.MovimientoPagoCuponImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



//SERVICIO MULTICANAL MOVIMIENTO PAGO CUPON
@Path("/SMCPE18000112")
public class SMCPE1800112Servicio {    
             
    MovimientoPagoCuponImpl movimientopagocupon= new MovimientoPagoCuponImpl();  
    Logger LOG = LogManager.getLogger(SMCPE1800112Servicio.class);

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getMovimientoPagoCupon(@HeaderParam("fechaini") String fechaini,@HeaderParam("fechafin") String fechafin) 
    {             
        try
        {   
            LOG.info("fechaini:" + fechaini + " fechafin:" + fechafin );             
            String strRespuesta =movimientopagocupon.ConsultaPagoCupon(fechaini,fechafin);  
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();

        }
        
    }
}
