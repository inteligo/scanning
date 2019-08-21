package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.MovimientoCashImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


//SERVICIO MULTICANAL CUENTAS - CASH - MOVIMIENTOS
@Path("/SMCPE1800080")
public class SMCPE1800080Servicio {
            
    MovimientoCashImpl movimientocash= new MovimientoCashImpl(); 
    Logger LOG = LogManager.getLogger(SMCPE1800080Servicio.class);


    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response  getMovimientoCashId(@HeaderParam("idclie") String idclie,@HeaderParam("numcta") String numcta,@HeaderParam("numdias") Integer numdias) 
    {
        try
        {   
            LOG.info("idclie:" + idclie + " numcta:" + numcta + " numdias: " + numdias);             
            String strRespuesta =movimientocash.ConsultaMovimientoCash(idclie,numcta,numdias); 
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();
        }

    }
}
