package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.ClienteAsesorCRMImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;




//SERVICIO MULTICANAL CLIENTES ASESOR CRM
@Path("/SMCPE18000110")
public class SMCPE18000110Servicio {    
             
    ClienteAsesorCRMImpl clienteasesorcrm= new ClienteAsesorCRMImpl(); 
    Logger LOG = LogManager.getLogger(SMCPE18000110Servicio.class); 


    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getClienteAsesorCRM(@HeaderParam("idclie") String idclie) 
    {             
        try
        {   
            LOG.info("idclie:" + idclie );             
            String strRespuesta =clienteasesorcrm.ConsultaClienteAsesorCRM(idclie);
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();

        }        
    }
    
  
}
