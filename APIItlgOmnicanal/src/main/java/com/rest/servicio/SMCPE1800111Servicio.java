package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.ClienteAsesoryJefeCRMImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



//SERVICIO MULTICANAL CLIENTES ASESOR Y JEFE CRM
@Path("/SMCPE18000111")
public class SMCPE1800111Servicio {    
             
    ClienteAsesoryJefeCRMImpl clienteasesoryjefecrm= new ClienteAsesoryJefeCRMImpl(); 
    Logger LOG = LogManager.getLogger(SMCPE1800111Servicio.class);

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getClienteAsesoryJefeCRM(@HeaderParam("idclie") String idclie,@HeaderParam("codase") String codase) 
    {             
        try
        {   
            LOG.info("idclie:" + idclie + " codase:" + codase );             
            String strRespuesta =clienteasesoryjefecrm.ConsultaClienteAsesoryJefeCRM(idclie,codase); 
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();

        }
        
    }
}
