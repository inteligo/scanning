package com.rest.servicio;

import com.apis.impl.PagoTarjetaCreditoImpl;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//SERVICIO MULTICANAL PAGO TARJETA DE CREDITO
@Path("/SMCPE1800460")
public class SMCPE1800460Servicio {
            
    PagoTarjetaCreditoImpl pagotarjetacredito= new PagoTarjetaCreditoImpl();  
    Logger LOG = LogManager.getLogger(SMCPE1800460Servicio.class);

    @POST
    @Produces (MediaType.APPLICATION_JSON)
    public Response getPagoTarjetaCredito(@HeaderParam("guid") String guid,@HeaderParam("canal") String canal,@HeaderParam("idclie") String idclie,
                                        @HeaderParam("tipotra") String tipotra, @HeaderParam("ctaori") String ctaori,@HeaderParam("tictaori") String tictaori,
                                        @HeaderParam("monori") String monori, @HeaderParam("ctades") String ctades,@HeaderParam("mondes") String mondes,
                                        @HeaderParam("monto") String monto, @HeaderParam("fectra") String fectra, @HeaderParam("tiptar") String tiptar,
                                        @HeaderParam("taritlg") String taritlg, @HeaderParam("flgtit") String flgtit,@HeaderParam("flgter") String flgter) 
    {          
        try
        {  
             LOG.info("guid: " + guid + " canal: " + canal + " idclie: " + idclie +
                    " tipotra: " + tipotra + " ctaori: " + ctaori + " tictaori: " + tictaori +
                    " monori: " + monori + " ctades: " + ctades + " mondes: " + mondes +
                    " monto: " + monto + " fectra: " + fectra + " tiptar: " + tiptar +
                    " taritlg: " + taritlg + " flgtit: " + flgtit + " flgter: " + flgter );  
            String strRespuesta =pagotarjetacredito.PagoTarjetaCredito(guid, canal, idclie, tipotra, ctaori, tictaori, monori, ctades, mondes, monto,  fectra, tiptar, taritlg, flgtit, flgter);            
            LOG.info("Respuesta:" + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();
        }
    }
}
