package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.DetalleCashImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


//SERVICIO MULTICANAL CASH-DETALLE 
@Path("/SMCPE1800070")
public class SMCPE1800070Servicio {
            
    DetalleCashImpl detallecash= new DetalleCashImpl(); 
    Logger LOG = LogManager.getLogger(SMCPE1800070Servicio.class);
    
    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response  getDetalleCashId(@HeaderParam("idclie") String idclie,@HeaderParam("numcta") String numcta) 
    {
        try
        {    
            LOG.info("idclie:" + idclie + " numcta:" + numcta );             
            String strRespuesta =detallecash.ConsultaDetalleCash(idclie,numcta); 
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();

        }

    }
}
