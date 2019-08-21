package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.ListaMonedaImpl;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
  

//SERVICIO MULTICANAL LISTA MONEDAS  
@Path("/SMCPE1800000")
public class SMCPE1800000Servicio {
            
   ListaMonedaImpl listamoneda= new ListaMonedaImpl(); 
   Logger LOG = LogManager.getLogger(SMCPE1800000Servicio.class);
   
    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response  getListaMoneda()
    {
        try
        {    
            LOG.info("getListaMoneda" );   
            
            String strRespuesta =listamoneda.ListaMoneda(); 
            
            LOG.info("Respuesta:" + strRespuesta );
            
            return Response.ok(strRespuesta).build();
        }       
        catch (Exception e) {
            
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            
            return Response.noContent().build();


        }

    }
}
