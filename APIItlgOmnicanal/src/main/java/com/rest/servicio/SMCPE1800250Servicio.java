package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.CalendarioBonoImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//SERVICIO MULTICANAL PRODUCTOS PORTAFOLIO - CRONOGRAMA BONOS
@Path("/SMCPE1800250")
public class SMCPE1800250Servicio {
            
    CalendarioBonoImpl calendariobono= new CalendarioBonoImpl(); 
    Logger LOG = LogManager.getLogger(SMCPE1800250Servicio.class);

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getCalendarioBonoId(@HeaderParam("idclie") String idclie,@HeaderParam("codpor") String codpor,@HeaderParam("codpro") String codpro,@HeaderParam("monbon") String monbon) 
    {         
        Double montobono=0.00;        
        try
        {    
            montobono = new Double (Double.valueOf(monbon).doubleValue());
            LOG.info("idclie:" + idclie + " codpor:" + codpor + " codpro: " + codpro + " monbon: " + monbon);             
            String strRespuesta =calendariobono.ConsultaCalendarioBono(idclie,codpor,codpro,montobono);     
            LOG.info("Respuesta:" + strRespuesta );
           
            return Response.ok(strRespuesta).build();
          }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();

        }
    }
}
