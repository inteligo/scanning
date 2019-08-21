package com.apis.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import static com.java.Convierte.DatetoStr;
import com.java.Formatea;
import com.java.GeneraUUID;
import com.java.LeerDataProperties;
import com.t24.services.impl.CWServiceListaMonedasHiloImpl;
import com.t24.services.impl.FC44Tipo2Impl;
import com.t24.services.impl.Ibaguid;
import com.t24.services.input.IbaQuery;
import dao.sql.DaoMovimientoDeposito;
import dao.sql.impl.DaoMovimientoDepositoImpl;
import dto.sql.MovimientoDeposito;
import dto.t24.services.FC44_DEPODETS;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.t24.services.FC44Tipo2;
import com.t24.services.impl.CWServiceTWS_Tipo2HiloImpl;
import com.t24.services.impl.InputCollectionTipo2Impl;
import com.t24.services.input.InputCollection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DetalleDepositoImpl {
    
    private static final Logger LOG = LogManager.getLogger(DetalleDepositoImpl.class);
    
    public String ConsultaDetalleDeposito (String CustomerNo,String DepositoNo) {         
        com.tws.wsdl.EnquiryInput enquiryInput44=new com.tws.wsdl.EnquiryInput();
        FC44Tipo2 fc44=new FC44Tipo2Impl();   
        
        String json=""; 
        

        List<dto.sql.Moneda> listMonedas =null;
        
        Gson gson =new GsonBuilder().serializeNulls().create();   
        int cantidadDatosLista=0;
        
        String errcod="";
        String detcod="";
        String defcod="";
        
        JSONObject JOTotalDeposito =new JSONObject();
        JSONObject JOTotalError =new JSONObject();
        JSONObject JODetDeposito =new JSONObject();        
        JSONArray JADetMovimientos =new JSONArray();    
        
        JSONObject JORaiz =new JSONObject();
        
        //  ------ HILOS
        
        try
        {
            
           
            
            InputCollection ictipo2 =new InputCollection();
            InputCollectionTipo2Impl ictipo2impl=new InputCollectionTipo2Impl();

            ictipo2.setCUSTOMERID(CustomerNo);
            
            enquiryInput44=ictipo2impl.Input(ictipo2);
        
            IbaQuery cabecera1=null;
            Ibaguid ibaguid=new Ibaguid();

            cabecera1=ibaguid.Encabezado(GeneraUUID.CodigoUUID(), Constantes.INTEGRADOR_FC44, CustomerNo,null );  

            String strFC_return1=null;
              
            
            CWServiceTWS_Tipo2HiloImpl servicio1= new CWServiceTWS_Tipo2HiloImpl(Constantes.INTEGRADOR_FC44,enquiryInput44);     
            CWServiceListaMonedasHiloImpl servicio4 = new CWServiceListaMonedasHiloImpl();

            Thread hilo4 = servicio4;
            hilo4.start();

            Thread hilo1 = servicio1;
            hilo1.start();

            while (hilo1.isAlive() || hilo4.isAlive() )
            {
                listMonedas=servicio4.getResult();
                strFC_return1=servicio1.getResult();     

            }   

           

            // FIN  ------ HILOS   

            List<FC44_DEPODETS> listDetDepo =null;
            
            
            listDetDepo =fc44.DEPODETS(strFC_return1,CustomerNo,listMonedas); 
                    

           
            for (FC44_DEPODETS lpf : listDetDepo) 
            {
                errcod= lpf.getErrcod();
                detcod=lpf.getDetcod();
                defcod=lpf.getDefcod();   
            }             

           
            DaoMovimientoDeposito movimientodeposito= new DaoMovimientoDepositoImpl();
            List<MovimientoDeposito> listMovimientoDeposito =movimientodeposito.movimientodepositoQry(DepositoNo);  
            
//             System.out.println( DepositoNo);
             
             if (errcod.equals("0"))
            {
                     List<FC44_DEPODETS> listDetDepoFiltrado = null;
                    listDetDepoFiltrado= new ArrayList<>();   
                   
                        listDetDepoFiltrado = listDetDepo.stream().filter(x -> x.getDepositNumber().toString().trim().equals(DepositoNo.trim())).collect(Collectors.toList());
                  

//                     json= gson.toJson(listDetDepo); 
//                    System.out.println(json); 
//                    
//                    json= gson.toJson(listDetDepoFiltrado); 
//                    System.out.println(json); 

                    cantidadDatosLista= listDetDepoFiltrado.size();

                    if (cantidadDatosLista>0 )
                            {                
                                    for (FC44_DEPODETS lpf:listDetDepoFiltrado)
                                    {    
                                            JODetDeposito.put("desdep", Convierte.NullaVacio(lpf.getDepositNumber()));
                                            JODetDeposito.put("desmon", Convierte.NullaVacio(lpf.getNombreMoneda()));
                                            JODetDeposito.put("acrmon", Convierte.NullaVacio(lpf.getCurrency()));
                                            JODetDeposito.put("simbol", Convierte.NullaVacio(lpf.getSimboloMoneda()));
                                            JODetDeposito.put("mondep", Formatea.Redondear(lpf.getAccountingBalance(),2));
                                            JODetDeposito.put("tasint", Formatea.Redondear(lpf.getRate(),2));
                                            JODetDeposito.put("fecpro",DatetoStr( lpf.getNextPayment()));
                                            JODetDeposito.put("proabo", Formatea.Redondear(lpf.getPaymentAmount(),2));
                                            JODetDeposito.put("fecape",  DatetoStr(lpf.getStartDate()));
                                            JODetDeposito.put("fecven", DatetoStr( lpf.getMaturityDate()));
                                            JODetDeposito.put("feccai", Convierte.NullaVacio(lpf.getInterestFrequency()));
                                            JODetDeposito.put("intacu", Formatea.Redondear(lpf.getAccruedInterest(),2));

                                            JOTotalError.put("errcod",Integer.parseInt(lpf.getErrcod()));
                                            JOTotalError.put("detcod", lpf.getDetcod());
                                            JOTotalError.put("defcod", lpf.getDefcod());
                                    }
                            }
                     else
                        {
                              JOTotalError.put("errcod", Integer.parseInt(Constantes.RETORNO_NODATASQL.toString()));
                               JOTotalError.put("detcod", Constantes.MENSAJE_NODATASQL_DET);
                               JOTotalError.put("defcod", Constantes.MENSAJE_NODATASQL_DEF);       
                        }

                    String carabo=null;

                    for (MovimientoDeposito lpf:listMovimientoDeposito)
                    {     
                        JSONObject JODetMovimientos =new JSONObject(); 
                        JODetMovimientos.put("fecmov", lpf.getFechaValor());
                        JODetMovimientos.put("desmov", lpf.getTransaccion());
                        if (lpf.getMonto()>0.00)
                        {
                            carabo="+";
                        }
                        else if (lpf.getMonto()<0.00)
                        {
                            carabo="-";
                        }
                        else{
                            carabo="";
                        }
                        JODetMovimientos.put("carabo",carabo);           
                        JODetMovimientos.put("monto", Formatea.Redondear(lpf.getMonto(),2));           

                        JADetMovimientos.add(JODetMovimientos);
                    }
            }
             else
             {
                  JOTotalError.put("errcod",Integer.parseInt(errcod));
                  JOTotalError.put("detcod", detcod);
                  JOTotalError.put("defcod", defcod);         
             }
        }     
        catch (NumberFormatException e){
            JOTotalError.put("errcod", Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage());  
            LOG.error( "ERROR: " + e.getMessage());
        }     
        catch ( Exception e){
            JOTotalError.put("errcod", Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage());    
             LOG.error( "ERROR: " + e.getMessage());
        }
        
        JOTotalDeposito.put("deposito",JODetDeposito);
        JOTotalDeposito.put("movimientos",JADetMovimientos); 
        
        JORaiz.put("datos",JOTotalDeposito); 
        JORaiz.put("error",JOTotalError); 

        return JORaiz.toString();
     }
    
}
