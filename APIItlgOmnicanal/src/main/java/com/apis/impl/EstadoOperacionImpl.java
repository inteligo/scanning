package com.apis.impl;

import com.bzgws.services.impl.BzgWSRespuestaImpl;
import com.bzgws.services.impl.ConsumingServiceBzgWSImpl;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import dto.bzg.services.TransferenciaOC;
import java.io.IOException;
import java.util.List;
import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;



public class EstadoOperacionImpl {
    
    private static final Logger LOG = LogManager.getLogger(EstadoOperacionImpl.class);
    
    public  String EstadoOperacion (String guid) 
    {
        Gson gson =new GsonBuilder().serializeNulls().create();
        String json="";       
        BzgWSRespuestaImpl bzgwstcp=new BzgWSRespuestaImpl();   
        int cantidadDatosLista=0;
        
        String errcod="";
        String detcod="";
        String defcod="";        
   
        JSONObject JODatosRespuesta =new JSONObject();   
        JSONObject JOTotalError =new JSONObject();
        JSONObject JORaiz =new JSONObject();
        
        try
        {                    
                ConsumingServiceBzgWSImpl  consumingservice= new ConsumingServiceBzgWSImpl();

                String strFC_return = consumingservice.getEntitiesUsingSchemaAsString(guid);   

                List<TransferenciaOC> listRespuesta =bzgwstcp.tblTransferenciaOCList(strFC_return);        

                for (TransferenciaOC lpf : listRespuesta) 
                {
                    errcod= lpf.getErrcod();
                    detcod=lpf.getDetcod();
                    defcod=lpf.getDefcod();   
                }             

                json= gson.toJson(listRespuesta); 
                System.out.println("listRespuesta"); 
                System.out.println(json); 

                if (errcod.equals("0"))
                {
                    cantidadDatosLista= listRespuesta.size();

                    if (cantidadDatosLista>0 )
                            {
                                    for (TransferenciaOC lpf:listRespuesta)
                                    {   
                                            JODatosRespuesta.put("guid", Convierte.NullaVacio(lpf.getGuidRegistro()));
                                            JODatosRespuesta.put("numope", Convierte.NullaVacio(lpf.getNumeroCaso()));  
                                            JODatosRespuesta.put("comision", lpf.getComision());     
                                            JODatosRespuesta.put("transacciont24", Convierte.NullaVacio(lpf.getTransaccionT24()));     

//                                            JOTotalError.put("errcod", Integer.parseInt(lpf.getCodigoRespuesta().toString()));
//                                            JOTotalError.put("detcod", lpf.getComentarioRespuesta().toString());
//                                            JOTotalError.put("defcod", lpf.getComentarioRespuesta().toString());     
                                            
                                            JOTotalError.put("errcod", errcod);   
                                            JOTotalError.put("detcod", detcod);
                                            JOTotalError.put("defcod", defcod);            
                                   }                
                            }
                    else
                        {
                              JOTotalError.put("errcod", Integer.parseInt(Constantes.RETORNO_NODATASQL.toString()));
                               JOTotalError.put("detcod", Constantes.MENSAJE_NODATASQL_DET);
                               JOTotalError.put("defcod", Constantes.MENSAJE_NODATASQL_DEF);       
                        }
            }
            else
            {
                JOTotalError.put("errcod", Integer.parseInt(errcod));
                JOTotalError.put("detcod", detcod);
                JOTotalError.put("defcod", defcod);
            }
         }
    catch ( NumberFormatException | IOException | SAXException  e){
            JOTotalError.put("errcod", Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage());  
            LOG.error( "ERROR: " + e.getMessage());
        }
    JORaiz.put("datos",JODatosRespuesta);
    JORaiz.put("error",JOTotalError);
        
    return JORaiz.toString();
    }
}
