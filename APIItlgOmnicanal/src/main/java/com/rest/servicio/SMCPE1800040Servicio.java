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


//SERVICIO MULTICANAL DETALLE TARJETAS  
@Path("/SMCPE1800040")
public class SMCPE1800040Servicio {
            
    TarjetaCreditoImpl tarjetacredito= new TarjetaCreditoImpl(); 
    Logger LOG = LogManager.getLogger(SMCPE1800040Servicio.class);

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response  getDetalleTarjetaCredito(@HeaderParam("idclie") String idclie,@HeaderParam("fecpro") String fecpro,@HeaderParam("verbloq") String verbloq)
    {
        try
        {   
            LOG.info("idclie:" + idclie + " fecpro:" + fecpro );             
            String strRespuesta =tarjetacredito.ConsultaDetalleTarjetaCredito(idclie,fecpro,verbloq); 
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }       
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();


        }

    }
}
