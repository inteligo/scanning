
package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.ProductoPortafolioImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


//SERVICIO MULTICANAL PRODUCTOS PORTAFOLIO
@Path("/SMCPE1800210")
public class SMCPE1800210Servicio {
            
    ProductoPortafolioImpl productoportafolio= new ProductoPortafolioImpl();  
    Logger LOG = LogManager.getLogger(SMCPE1800210Servicio.class);

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getProductoPortafolioId(@HeaderParam("idclie") String idclie,@HeaderParam("numpor") String numpor,@HeaderParam("codpro") String codpro)
    {   
        try
        {   
            LOG.info("idclie:" + idclie + " numpor:" + numpor + " codpro: " + codpro);             
            String strRespuesta =productoportafolio.ConsultaProductoPortafolio(idclie,numpor,codpro);
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
           return Response.noContent().build();

        }
    }
}
