package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.AlertaPagoBonoPeruanoImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//SERVICIO MULTICANAL ALERTAS PAGO BONO PERUANO
@Path("/SMCPE1800321")
public class SMCPE1800321Servicio {
            
    AlertaPagoBonoPeruanoImpl calendarioalerta= new AlertaPagoBonoPeruanoImpl();  
    Logger LOG = LogManager.getLogger(SMCPE1800320Servicio.class);

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getPagoBonoPeruanoAlerta(@HeaderParam("anio") Integer anio,@HeaderParam("mes") Integer mes) 
    {          
        try
        {   
            LOG.info("anio:" + anio + " mes:" + mes );             
            String strRespuesta =calendarioalerta.ConsultaPagoBonoPeruanoAlerta(anio,mes); 
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();
        }
    }
}
