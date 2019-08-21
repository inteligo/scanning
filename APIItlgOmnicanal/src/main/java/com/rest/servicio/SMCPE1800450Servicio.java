package com.rest.servicio;

import com.apis.impl.OrdenPagoInterbankImpl;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//SERVICIO MULTICANAL ORDEN DE PAGO INTERBANK
@Path("/SMCPE1800450")
public class SMCPE1800450Servicio {
            
    OrdenPagoInterbankImpl odenpagointerbank= new OrdenPagoInterbankImpl();   
    Logger LOG = LogManager.getLogger(SMCPE1800450Servicio.class);

    @POST
    @Produces (MediaType.APPLICATION_JSON)
    public Response getOrdenPagoInterbank(@HeaderParam("guid") String guid,@HeaderParam("canal") String canal,@HeaderParam("idclie") String idclie,
                                        @HeaderParam("tipodoc") String tipodoc,@HeaderParam("nrodoc") String nrodoc, @HeaderParam("ctaori") String ctaori,
                                        @HeaderParam("monori") String monori,@HeaderParam("monto") String monto,@HeaderParam("fectra") String fectra,
                                        @HeaderParam("flgtit") String flgtit,@HeaderParam("flgter") String flgter, @HeaderParam("nomben") String nomben, 
                                        @HeaderParam("apeben") String apeben,@HeaderParam("refer") String refer,@HeaderParam("tipotra") String tipotra) 
    {          
        try
        {   
            LOG.info("guid: " + guid + " canal: " + canal + " idclie: " + idclie +
                    " tipodoc: " + tipodoc + " nrodoc: " + nrodoc + " ctaori: " + ctaori +
                    " monori: " + monori + " monto: " + monto + " fectra: " + fectra +
                    " flgtit: " + flgtit + " flgter: " + flgter + " nomben: " + nomben +
                    " apeben: " + apeben + " refer: " + refer + " tipotra: " + tipotra );             
            
            String strRespuesta =odenpagointerbank.OrdenPagoInterbank( guid, canal, idclie, tipodoc, nrodoc, ctaori,  monori,  monto,  fectra,  flgtit,  flgter,
                                        nomben,apeben,refer,tipotra); 
            LOG.info("Respuesta: " + strRespuesta );
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();
        }
    }
}
