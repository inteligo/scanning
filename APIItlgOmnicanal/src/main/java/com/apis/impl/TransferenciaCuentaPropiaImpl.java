package com.apis.impl;

import com.bzg.services.impl.BzgRespuestaTransferenciaImpl;
import com.bzg.services.impl.ConsumingServiceBzgImpl;
import com.bzg.services.input.BizAgiWSParam;
import com.bzg.services.input.Case;
import com.bzg.services.input.Cases;
import com.bzg.services.input.Entities;
import com.bzg.services.input.InputXML;
import com.bzg.services.input.RegistraTransferencia;
import com.bzg.services.input.tblTransferencia;
import com.bzg.services.input.tblTransferenciaOC;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import dto.bzg.services.TransferenciaOC;
import java.io.IOException;
import java.util.List;
import org.json.simple.JSONObject;
import org.xml.sax.SAXException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TransferenciaCuentaPropiaImpl {
    
    private static final Logger LOG = LogManager.getLogger(TransferenciaCuentaPropiaImpl.class);
    
    public  String TransferenciaCuentaPropia (String guid,String canal,String idclie, String tipotra,String ctaori, String tictaori,String monori,String ctades, String tictades, String mondes, String monto, String fectra, String flgtit, String flgter) 
    {
        Gson gson =new GsonBuilder().serializeNulls().create();
        String json="";       
        BzgRespuestaTransferenciaImpl bzgtcp=new BzgRespuestaTransferenciaImpl();   
        int cantidadDatosLista=0;
        
        String errcod="";
        String detcod="";
        String defcod="";        
   
        JSONObject JODatosRespuesta =new JSONObject();   
        JSONObject JOTotalError =new JSONObject();
        JSONObject JORaiz =new JSONObject();
        
        try
        {                    
                ConsumingServiceBzgImpl  consumingservice= new ConsumingServiceBzgImpl();

                String data="";

                RegistraTransferencia registratransferencia  = new RegistraTransferencia();
                InputXML inputxml = new InputXML();
                BizAgiWSParam bizagiwsparam= new BizAgiWSParam();
                Cases cases =new Cases();
                Case case1 =new Case();
                Entities entities =new Entities();
                tblTransferencia  tbltransferencia=new tblTransferencia();
                tblTransferenciaOC  tbltransferenciaoc=new tblTransferenciaOC();

                tbltransferenciaoc.setGuidRegistro(guid);
                tbltransferenciaoc.setCodigoCliente(idclie);
                tbltransferenciaoc.setTipoTransferencia(tipotra);

                tbltransferenciaoc.setCuentaOrigen(ctaori);
                tbltransferenciaoc.setTipoCuentaOrigen(tictaori);
                tbltransferenciaoc.setMonedaOrigen(monori);
                tbltransferenciaoc.setCuentaDestino(ctades);
                tbltransferenciaoc.setTipoCuentaDestino(tictades);

                tbltransferenciaoc.setMonedaDestino(mondes);
                tbltransferenciaoc.setMonto(monto);
                tbltransferenciaoc.setFechaOperacion(fectra);
                tbltransferenciaoc.setbMarcaTitular(flgtit);
                tbltransferenciaoc.setbMarcaTercero(flgter);

                tbltransferencia.setTbltransferenciaoc(tbltransferenciaoc);
                tbltransferencia.setEsAutomaticoTransferOC(Constantes.BZG_ESAUTOMATICOTRANSFEROC);

                entities.setTbltransferencia(tbltransferencia);
                case1.setProcess(Constantes.BZG_CASEPROCESS);
                case1.setEntities(entities);
                cases.setCases(case1);

                bizagiwsparam.setDomain(Constantes.BZG_DOMAIN);
                bizagiwsparam.setUserName(Constantes.BZG_USERNAME);
                bizagiwsparam.setCases(cases);
                
                  json= gson.toJson(bizagiwsparam); 
                System.out.println("bizagiwsparam"); 
                System.out.println(json); 

                String strFC_return = consumingservice.callServiceConverter(bizagiwsparam);   

                List<TransferenciaOC> listRespuesta =bzgtcp.tblTransferenciaOCList(strFC_return);        

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
                                    JODatosRespuesta.put("comision", Convierte.NullaVacio(lpf.getComision()));     
                                    JODatosRespuesta.put("transacciont24", Convierte.NullaVacio(lpf.getTransaccionT24()));

                                    JOTotalError.put("errcod", Integer.parseInt(lpf.getCodigoRespuesta()));
                                    JOTotalError.put("detcod", lpf.getComentarioRespuesta());
                                    JOTotalError.put("defcod", lpf.getComentarioRespuesta());            
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
    catch (IOException | NumberFormatException | SAXException e) {
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
