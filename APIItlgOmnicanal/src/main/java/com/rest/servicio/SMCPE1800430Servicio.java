package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.SaldoCuentasImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//SERVICIO MULTICANAL CONSULTA DE SALDOS CUENTAS CASH
@Path("/SMCPE1800430")
public class SMCPE1800430Servicio {
            
    SaldoCuentasImpl saldocuentas= new SaldoCuentasImpl();   
    Logger LOG = LogManager.getLogger(SMCPE1800430Servicio.class);
       

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getSaldoCuentas(@HeaderParam("idclie") String idclie,@HeaderParam("ctaori") String ctaori,@HeaderParam("ctades") String ctades) 
    {  
       
        try
        {   
            LOG.info("idclie:" + idclie + " ctaori:" + ctaori + " ctades: " + ctades);             
            String strRespuesta =saldocuentas.ConsultaSaldoCuentas(idclie,ctaori,ctades);            
            LOG.info("Respuesta:" + strRespuesta );
            
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();
           
        }
    }
}
