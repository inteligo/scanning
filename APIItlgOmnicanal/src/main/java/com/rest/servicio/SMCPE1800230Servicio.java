package com.rest.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.apis.impl.ListaDepositoyMovimientoImpl;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//SERVICIO MULTICANAL DEPÓSITOS DETALLE PATRIMONIO
@Path("/SMCPE1800230")
public class SMCPE1800230Servicio {
            
//    DetalleDepositoImpl detalledeposito= new DetalleDepositoImpl();   
    ListaDepositoyMovimientoImpl listadepositoymovimiento= new ListaDepositoyMovimientoImpl(); 
    Logger LOG = LogManager.getLogger(SMCPE1800230Servicio.class);

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getDetalleDepositoId(@HeaderParam("idclie") String idclie,@HeaderParam("idpres") String idpres)
    {   
        try
        {      
             // SE VA A TRAER LOS DATOS DEL LISTADO DE DEPOSITOS DEL DWH 
            // 19-02-2019 VROJAS
                        
//            String strRespuesta =detalledeposito.ConsultaDetalleDeposito(idclie,idpres);
            LOG.info("idclie:" + idclie + " idpres:" + idpres );             
            String strRespuesta =listadepositoymovimiento.ListaDepositoyMovimiento(idclie,idpres);
            LOG.info("Respuesta:" + strRespuesta );
             
            // FIN
            return Response.ok(strRespuesta).build();
        }
        catch (Exception e) {
            LOG.error("Respuesta: " +Response.noContent().build() + " Message: " + e.getMessage() );
            return Response.noContent().build();

        }

    }
}
