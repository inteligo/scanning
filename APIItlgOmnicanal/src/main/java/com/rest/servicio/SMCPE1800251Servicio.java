package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.CalendarioPagoBonoImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//SERVICIO MULTICANAL PRODUCTOS PORTAFOLIO - CRONOGRAMA PAGO BONOS PROYECTADO
@Path("/SMCPE1800251")
public class SMCPE1800251Servicio {
            
    CalendarioPagoBonoImpl calendariobono= new CalendarioPagoBonoImpl(); 
    Logger LOG = LogManager.getLogger(SMCPE1800251Servicio.class);

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getCalendarioPagoBonoId(@HeaderParam("codpro") String codpro) 
    {        
        
        try
        {               
            LOG.info( " codpro: " + codpro);             
            String strRespuesta =calendariobono.ConsultaCalendarioPagoBono(codpro);     
            LOG.info("Respuesta:" + strRespuesta );
           
            return Response.ok(strRespuesta).build();
          }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();

        }
    }
}
