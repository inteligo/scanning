package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.CalendarioEventoImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//SERVICIO MULTICANAL CONSULTA EVENTOS POR PRODUCTO
@Path("/SMCPE1800310")
public class SMCPE1800310Servicio {
            
    CalendarioEventoImpl calendarioevento= new CalendarioEventoImpl(); 
    Logger LOG = LogManager.getLogger(SMCPE1800310Servicio.class);

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getCalendarioEventoId(@HeaderParam("idclie") String idclie,@HeaderParam("tipomov") String tipomov) 
    {    
        try
        {   
            LOG.info("idclie:" + idclie + " tipomov:" + tipomov );             
            String strRespuesta =calendarioevento.ConsultaCalendarioEvento(idclie,tipomov);
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();

        }
    }
}
