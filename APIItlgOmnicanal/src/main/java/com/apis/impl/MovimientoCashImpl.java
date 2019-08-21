
package com.apis.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import static com.java.Convierte.DatetoStr;
import com.java.Formatea;
import com.java.GeneraUUID;
import com.java.LeerDataProperties;
import com.java.OperacionesFecha;
import com.t24.services.CWServiceTWS_Tipo2;
import com.t24.services.FC48Tipo2;
import com.t24.services.FC53Tipo1;

import com.t24.services.impl.CWServiceListaMonedasHiloImpl;
import com.t24.services.impl.CWServiceTWS_Tipo1HiloImpl;
import com.t24.services.impl.CWServiceTWS_Tipo2HiloImpl;
import com.t24.services.impl.CWServiceTWS_Tipo2Impl;
import com.t24.services.impl.FC48Tipo2Impl;
import com.t24.services.impl.FC53Tipo1Impl;
import com.t24.services.impl.Ibaguid;
import com.t24.services.impl.InputCollectionTipo1Impl;
import com.t24.services.impl.InputCollectionTipo2Impl;
import com.t24.services.input.Body;
import com.t24.services.input.Head;
import com.t24.services.input.IbaQuery;
import com.t24.services.input.InputCollection;
import dto.t24.services.FC53_ACCTDETS;
import dto.t24.services.FC48_STMTDETS;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class MovimientoCashImpl {
    
    private static final Logger LOG = LogManager.getLogger(MovimientoCashImpl.class);
    
    public String ConsultaMovimientoCash (String CustomerNo,String Cuenta, Integer numdias) {
         com.tws.wsdl.EnquiryInput enquiryInput48=new com.tws.wsdl.EnquiryInput();
        com.tws.wsdl.EnquiryInput enquiryInput53=new com.tws.wsdl.EnquiryInput();
        
        CWServiceTWS_Tipo2  consumingservice= new CWServiceTWS_Tipo2Impl();
        com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();        
        Gson gson =new GsonBuilder().serializeNulls().create();
        String respuesta="";
         
        String json="";        
        FC48Tipo2 fc48= new FC48Tipo2Impl();        
        FC53Tipo1 fc53 = new FC53Tipo1Impl();       
        
        int cantidadDatosLista=0;
        
//        DaoListaMoneda lista= new DaoListaMonedaImpl();
        List<dto.sql.Moneda> listMonedas =null;   
        
         String errcod="";
        String detcod="";
        String defcod="";
        
        JSONObject JOTotalMovCash =new JSONObject();        
        JSONArray JADetMovimientos =new JSONArray();
        JSONObject JOTotalError =new JSONObject();
        
        JSONObject JORaiz =new JSONObject();
        
        String Fechas =null;
        String FechaActual=null;
        Date FechaInicio=null;
        String strFechaInicio=null;
        
        Double saldo = 0.00;
   
        // ESTO ES NUEVO ------ HILOS
        
//        IbaQuery cabecera=null,cabecera2=null;
//        Ibaguid ibaguid=new Ibaguid();
//        cabecera=ibaguid.Encabezado("FC-13-25380902-TC53", "13", CustomerNo,"");           
//        cabecera2=ibaguid.Encabezado("FC-43-25380902-TC53", "43", CustomerNo,"" ); 
        Date date = new Date();

        //Caso 2: obtener la fecha y salida por pantalla con formato:
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        FechaActual=dateFormat.format(date);
        
        FechaInicio=OperacionesFecha.RestarDias(date, numdias);
        
        strFechaInicio=dateFormat.format(FechaInicio);
        
//        System.out.println(date);
//        System.out.println(FechaInicio);
        
        Fechas=strFechaInicio +" "+FechaActual;
        
        try
        {
                        
           
            
            IbaQuery ibaguid1 = new IbaQuery();
            Head hd1 = new Head();
            Body bd1 = new Body();

            hd1.setIbaguid(GeneraUUID.CodigoUUID());

            hd1.setFunctioncode(Constantes.INTEGRADOR_FC48);
            hd1.setChannel(Constantes.INTEGRADOR_CHANNEL);
            hd1.setAgentId(Constantes.INTEGRADOR_AGENTID);              
            hd1.setCustomerNo(CustomerNo);       
            ibaguid1.setHead(hd1);
            bd1.setCuenta(Cuenta);
            bd1.setFechas(Fechas);
            ibaguid1.setBody(bd1);
            
            IbaQuery cabecera2=null;
            Ibaguid ibaguid=new Ibaguid();
            cabecera2=ibaguid.Encabezado(GeneraUUID.CodigoUUID(), Constantes.INTEGRADOR_FC53, CustomerNo,"" );
            
           InputCollectionTipo1Impl ic53tipo1impl=new InputCollectionTipo1Impl();
           enquiryInput53=ic53tipo1impl.Input("functioncode;" +Constantes.INTEGRADOR_FC53 +"|CustomerNo;"+CustomerNo);       
           
           InputCollection ic =new InputCollection();
            InputCollectionTipo2Impl icimpl=new InputCollectionTipo2Impl();

            ic.setACCOUNT(Cuenta);
            enquiryInput48=icimpl.Input(ic);

            InputCollection ic1 =new InputCollection();             
            ic1.setBOOKINGDATE(Fechas);

            enquiryInput48=icimpl.Input(ic1);         

            String strFC_return1="";
            String strFC_return2="";                  
        
            
           
            CWServiceTWS_Tipo2HiloImpl servicio1 = new CWServiceTWS_Tipo2HiloImpl(Constantes.INTEGRADOR_FC48,enquiryInput48); 
            CWServiceTWS_Tipo1HiloImpl servicio2 = new CWServiceTWS_Tipo1HiloImpl(enquiryInput53);   
            CWServiceListaMonedasHiloImpl servicio4 = new CWServiceListaMonedasHiloImpl();

            Thread hilo4 = servicio4;
            hilo4.start();

            Thread hilo1 = servicio1;
            hilo1.start();

            Thread hilo2 = servicio2;
            hilo2.start();

             while (hilo1.isAlive() || hilo2.isAlive() || hilo4.isAlive())
               {
                   listMonedas=servicio4.getResult();
                   strFC_return1=servicio1.getResult();
                   strFC_return2=servicio2.getResult();         
               }  
                

            // FIN NUEVO ------ HILOS                                     
          
            List<FC48_STMTDETS> listMovCash =null;
            List<FC53_ACCTDETS> listCon = null;
            listCon = new ArrayList<>();
            List<FC48_STMTDETS> listfin = null;
            listfin = new ArrayList<>();
            
            
            listMovCash =fc48.STMTDETS(strFC_return1, CustomerNo,listMonedas);  
            listCon = fc53.ConsultaSaldo(strFC_return2, CustomerNo, Cuenta,listMonedas);
                  
            
            
            for (FC48_STMTDETS lpf : listMovCash) 
             {
                 errcod= lpf.getErrcod();
                 detcod=lpf.getDetcod();
                 defcod=lpf.getDefcod();   
             }                   
           
            
            if (errcod.equals("0"))
            {                   
                   String carabo=null;
                    Double monto=0.00;   
                    
                    if (listCon.size()>0)
                    {
                        saldo = listCon.get(0).getWorkingBal();
                    }
                    
//                     System.out.println("saldo");
//                    System.out.println(saldo);
                    if (!listMovCash.get(0).getCuenta().trim().equals(""))
                    {
                         listfin = fc48.calcularCuenta(listMovCash, saldo);
                    }
                    
                    cantidadDatosLista= listfin.size();


                    if (cantidadDatosLista>0 )
                            {

                                    for (FC48_STMTDETS lpf:listfin)
                                    {       
                                            if  (lpf.getCliente().trim().equals(""))
                                                    {
                                                        JOTotalError.put("errcod", Integer.parseInt(Constantes.RETORNO_NODATASQL.toString()));
                                                        JOTotalError.put("detcod", Constantes.MENSAJE_NODATASQL_DET);
                                                        JOTotalError.put("defcod", Constantes.MENSAJE_NODATASQL_DEF);       

                                                    }
                                            else
                                                {     
                                                    JSONObject JODetMovimientos =new JSONObject(); 

                                                    JODetMovimientos.put("fectra",DatetoStr(lpf.getFecha()));
                                                    JODetMovimientos.put("fecpro",DatetoStr(FechaActual));
                                                    JODetMovimientos.put("descri", Convierte.NullaVacio(lpf.getDescripcion()));          
                                                    if (lpf.getCargo()<0.00)
                                                    {
                                                        carabo="-";
                                                        monto=lpf.getCargo();
                                                    }
                                                    else if (lpf.getAbono()>0.00)
                                                    {
                                                        carabo="+";
                                                        monto=lpf.getAbono();
                                                    }
                                                    else{
                                                        carabo="";
                                                        monto=0.00;
                                                    }
                                                    JODetMovimientos.put("monto", Formatea.Redondear(monto,2));           
                                                    JODetMovimientos.put("carabo",Convierte.NullaVacio(carabo));
                                                    JODetMovimientos.put("saldo",  Formatea.Redondear(lpf.getSaldo(),2));  
                                                    JODetMovimientos.put("contador",  lpf.getContador());  
                                                    
                                                    JADetMovimientos.add(JODetMovimientos);

                                                    JOTotalError.put("errcod", Integer.parseInt(lpf.getErrcod()));
                                                    JOTotalError.put("detcod", lpf.getDetcod());
                                                    JOTotalError.put("defcod", lpf.getDefcod());  
                                                }
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
                     JOTotalError.put("detcod",detcod);
                     JOTotalError.put("defcod", defcod);                
            }
        }
        catch (NumberFormatException e){
            JOTotalError.put("errcod", Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage()); 
            LOG.error( "ERROR: " + e.getMessage());
        }
        catch (Exception e){
            JOTotalError.put("errcod", Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage()); 
            LOG.error( "ERROR: " + e.getMessage());
        }

        JOTotalMovCash.put("detallemovimientocash",JADetMovimientos);
        
        JORaiz.put("datos",JOTotalMovCash);
        JORaiz.put("error",JOTotalError);    

        return JORaiz.toString();
     }
    

    
}
