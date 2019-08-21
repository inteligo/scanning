package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.CalendarioEventoClienteImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//SERVICIO MULTICANAL CONSULTA SUMATORIA EVENTOS POR CLIENTE
@Path("/SMCPE1800130")
public class SMCPE1800130Servicio {
            
    CalendarioEventoClienteImpl calendarioeventocliente= new CalendarioEventoClienteImpl();   
    Logger LOG = LogManager.getLogger(SMCPE1800130Servicio.class);

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getCalendarioEventoClienteId(@HeaderParam("idclie") String idclie,@HeaderParam("tipomov") String tipomov,@HeaderParam("anio") Integer anio,@HeaderParam("mes") Integer mes,@HeaderParam("estitu") String estitu) 
    {    
        try
        {   
            LOG.info("idclie:" + idclie + " tipomov:" + tipomov + " anio: " + anio + " mes: " + mes + " estitu: " + estitu);             
            String strRespuesta =calendarioeventocliente.ConsultaCalendarioEventoCliente(idclie,tipomov,anio,mes,estitu);
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();

        }
    }
}
