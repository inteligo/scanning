package com.rest.servicio;


import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.apis.impl.TransferenciaCuentaPropiaImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//SERVICIO MULTICANAL TRANSFERENCIAS CUENTAS PROPIAS
@Path("/SMCPE1800410")
public class SMCPE1800410Servicio {
            
    TransferenciaCuentaPropiaImpl transferenciacuentasinteligo= new TransferenciaCuentaPropiaImpl();   
    Logger LOG = LogManager.getLogger(SMCPE1800410Servicio.class);

    @POST
    @Produces (MediaType.APPLICATION_JSON)
    public Response getTransferenciaCuentaPropia(@HeaderParam("guid") String guid,@HeaderParam("canal") String canal,@HeaderParam("idclie") String idclie,
            @HeaderParam("tipotra") String tipotra,@HeaderParam("ctaori") String ctaori,@HeaderParam("tictaori") String tictaori,
            @HeaderParam("monori") String monori,@HeaderParam("ctades") String ctades,@HeaderParam("tictades") String tictades,
            @HeaderParam("mondes") String mondes,@HeaderParam("monto") String monto,@HeaderParam("fectra") String fectra,
            @HeaderParam("flgtit") String flgtit,@HeaderParam("flgter") String flgter) 
    {          
        try
        {    
            LOG.info("guid: " + guid + " canal: " + canal + " idclie: " + idclie +
                    " tipotra: " + tipotra + " ctaori: " + ctaori + " tictaori: " + tictaori +
                    " monori: " + monori + " ctades: " + ctades + " tictades: " + tictades +
                    " mondes: " + mondes + " monto: " + monto + " fectra: " + fectra +
                    " flgtit: " + flgtit + " flgter: " + flgter );             
            String strRespuesta =transferenciacuentasinteligo.TransferenciaCuentaPropia( guid, canal, idclie,  tipotra, ctaori,  tictaori, monori, ctades, 
                                                                                                     tictades,  mondes,  monto,  fectra,  flgtit,  flgter); 
            LOG.info("Respuesta: " + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();
        }
    }
}
