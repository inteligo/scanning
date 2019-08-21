package com.apis.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import static com.java.Convierte.DatetoStr;
import com.java.Formatea;
import com.java.GeneraUUID;
import com.java.LeerDataProperties;
import com.t24.services.FC01Tipo1;
import com.t24.services.FC14Tipo2;
import com.t24.services.impl.CWServiceClienteCRMHiloImpl;
import com.t24.services.impl.CWServiceListaMonedasHiloImpl;
import com.t24.services.impl.CWServiceListaTipoDocumentoHiloImpl;
import com.t24.services.impl.CWServiceTWS_Tipo1HiloImpl;
import com.t24.services.impl.CWServiceTWS_Tipo2HiloImpl;
import com.t24.services.impl.FC01Tipo1Impl;
import com.t24.services.impl.FC14Tipo2Impl;
import com.t24.services.impl.Ibaguid;
import com.t24.services.impl.InputCollectionTipo1Impl;
import com.t24.services.impl.InputCollectionTipo2Impl;
import com.t24.services.input.IbaQuery;
import com.t24.services.input.InputCollection;
import dao.sql.DaoClienteCRM;
import dao.sql.DaoComisionClienteBIZAGI;
import dao.sql.DaoTipoDocumentoBIZAGI;
import dao.sql.impl.DaoClienteCRMImpl;
import dao.sql.impl.DaoComisionClienteBIZAGIImpl;
import dao.sql.impl.DaoTipoDocumentoBIZAGIImpl;
import dto.sql.ClienteCRM;
import dto.sql.ClienteCRMyFC;
import dto.sql.ComisionClienteBIZAGI;
import dto.t24.services.FC01_CUSLIST;
import dto.t24.services.FC14_PORTFOLIOLIST;
import dto.t24.services.FCCuenta;
import dto.t24.services.FCDocIdentidad;
import dto.t24.services.FCPortafolio;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CuentaClienteImpl {
    private static final Logger LOG = LogManager.getLogger(CuentaClienteImpl.class);
    
    public  String ConsultaCuentaCliente (String idclie, String perfil,String tipotransferencia ) 
    {       
        com.tws.wsdl.EnquiryInput enquiryInput14=new com.tws.wsdl.EnquiryInput();
        com.tws.wsdl.EnquiryInput enquiryInput1=new com.tws.wsdl.EnquiryInput();
        FC01Tipo1 fc01= new FC01Tipo1Impl();           
        FC14Tipo2 fc14= new FC14Tipo2Impl();       
        Gson gson =new GsonBuilder().serializeNulls().create();
        String json="";
        
//        DaoListaMoneda lista= new DaoListaMonedaImpl();
        List<dto.sql.Moneda> listMonedas =null;  
        List<ClienteCRM> listClienteCRM = null; 
        List<dto.sql.TipoDocumentoBIZAGI>  listaTipoDocBIZAGI=null;      
        List<dto.sql.TipoDocumentoBIZAGI> listtipodocBIZAGI =null;  

        Integer cantidadDatosLista=0;

        String errcod="";
        String detcod="";
        String defcod="";
        String segmento="",doctype="",id="", doctypete="",doctypeib="";


        DaoClienteCRM clientecrm= new DaoClienteCRMImpl();  
        DaoComisionClienteBIZAGI comisionclientebizagi= new DaoComisionClienteBIZAGIImpl();    
        DaoTipoDocumentoBIZAGI tipodocumentobizagi= new DaoTipoDocumentoBIZAGIImpl();       

        JSONObject JOCliente =new JSONObject();        
        JSONArray JADocIdentidad =new JSONArray();
        JSONArray JACuenta =new JSONArray();
        JSONObject JOTotalError =new JSONObject();     

        JSONObject JORaiz =new JSONObject();
        
         // ESTO ES NUEVO ------ HILOS
        try
        {           
                             
               
   
                IbaQuery cabecera1=null,cabecera2=null;
                Ibaguid ibaguid=new Ibaguid();
                
                InputCollection ictipo1 =new InputCollection();
                InputCollectionTipo1Impl ictipo1impl=new InputCollectionTipo1Impl();
                
                InputCollection ictipo2 =new InputCollection();
                InputCollectionTipo2Impl ictipo2impl=new InputCollectionTipo2Impl();

                ictipo2.setCUSTOMERID(idclie);
                enquiryInput14=ictipo2impl.Input(ictipo2);

//            ictipo1.setCUSTOMERID(CustomerNo);
                enquiryInput1=ictipo1impl.Input("functioncode;" +Constantes.INTEGRADOR_FC01 +"|CustomerNo;"+idclie);
                
//                cabecera1=ibaguid.Encabezado(GeneraUUID.CodigoUUID(), "1", idclie,"" );
                cabecera1=ibaguid.Encabezado(GeneraUUID.CodigoUUID(), Constantes.INTEGRADOR_FC01, idclie,"" );
//                cabecera2=ibaguid.Encabezado(GeneraUUID.CodigoUUID(), "14", idclie,"" );  
                 cabecera2=ibaguid.Encabezado(GeneraUUID.CodigoUUID(),Constantes.INTEGRADOR_FC14, idclie,"" );  

                String strFC_return1="";
                String strFC_return2="";       
                
//                  listMonedas =lista.listamonedaQry(); 
              
                                  
                  
                        CWServiceTWS_Tipo1HiloImpl servicio1 = new CWServiceTWS_Tipo1HiloImpl(enquiryInput1);
                        CWServiceTWS_Tipo2HiloImpl servicio2= new CWServiceTWS_Tipo2HiloImpl(Constantes.INTEGRADOR_FC14,enquiryInput14);      
                        CWServiceClienteCRMHiloImpl servicio3 = new CWServiceClienteCRMHiloImpl(idclie);  
                        CWServiceListaMonedasHiloImpl servicio4 = new CWServiceListaMonedasHiloImpl();  
                        CWServiceListaTipoDocumentoHiloImpl servicio5 = new CWServiceListaTipoDocumentoHiloImpl(); 
                       
                        
                        Thread hilo1 = servicio1;
                        hilo1.start();
                        
                        Thread hilo2 = servicio2;
                        hilo2.start();
                        
                        Thread hilo3 = servicio3;
                        hilo3.start();
                        
                        Thread hilo4 = servicio4;
                        hilo4.start();
                        
                        Thread hilo5 = servicio5;
                        hilo5.start();

                         while (hilo1.isAlive() || hilo2.isAlive() || hilo3.isAlive() || hilo4.isAlive() || hilo5.isAlive())
                           {
                               strFC_return1=servicio1.getResult();
                               strFC_return2=servicio2.getResult();    
                               listClienteCRM=servicio3.getResult();    
                               listMonedas=servicio4.getResult();
                               listtipodocBIZAGI=servicio5.getResult();
                              
                           }  
                 

               
                // FIN NUEVO ------ HILOS
                
                List<FCCuenta> CuentayFirma = null;
               
                CuentayFirma =fc01.CuentayFirmaList(strFC_return1,idclie,listMonedas); 
                          
                  
                for (FCCuenta lpf : CuentayFirma) 
                 {
                     errcod= lpf.getErrcod();
                     detcod=lpf.getDetcod();
                     defcod=lpf.getDefcod();   
                 }      
                
                cantidadDatosLista= CuentayFirma.size();
                
                if (!CuentayFirma.get(0).getAccountNo().equals("") )
                    {
                        List<FC14_PORTFOLIOLIST> PortafolioList =null;
                        List<FC01_CUSLIST> listClienteFC =null;
                          
                             
                        PortafolioList =fc14.PORTFOLIOLISTACTIVOS(strFC_return2,idclie);    
                        listClienteFC =fc01.FC01CUSList(strFC_return1,idclie); 
                               

//                        List<ClienteCRM> listClienteCRM =clientecrm.clientecrmQry(idclie); 
                        
                        
                        
//                        json= gson.toJson(listClienteFC);
//                        System.out.println("listClienteFC");           
//                        System.out.println(json); 

                        List<FC01_CUSLIST> listaLimpia =new ArrayList();
                        
                        // quitamos la duplicidad de regitros
                        
                        Map<Integer, FC01_CUSLIST> mapCustList = new HashMap<Integer, FC01_CUSLIST>(listClienteFC.size());
                        
                        for(FC01_CUSLIST lpf:listClienteFC) {
                        mapCustList.put(Integer.parseInt(lpf.getIdClient()), lpf);
                        }
                        
                        for(Entry<Integer, FC01_CUSLIST> p : mapCustList.entrySet()) {
                            listaLimpia.add(p.getValue());
                        }
                        
                        // fin quitamos la duplicidad de regitros
                        
                        
//                         json= gson.toJson(listaLimpia);
//                         System.out.println("listaLimpia");           
//                         System.out.println(json); 
                            
                        for (FC01_CUSLIST lpf:listaLimpia)
                            {              
                                segmento=lpf.getCusSegment();
                                doctype=lpf.getDocType();
                                id=lpf.getID();
                             
                            }   

                        String[] doctypeArray = doctype.split("ý");
                        String[] idArray = id.split("ý");                            

                        List<FCDocIdentidad> listDoc = new ArrayList<FCDocIdentidad>();
                        
                        String tipodoc="";
                            
                       for (int i = 0; i < doctypeArray.length; i++) {
                            FCDocIdentidad list=new FCDocIdentidad();
                            list.setIdclie(idclie);
                            list.setDoctype(doctypeArray[i]);
                            list.setId(idArray[i]);                           
                            
                            tipodoc=idArray[i];
                            if (!tipodoc.equals(""))
                            {
                            listaTipoDocBIZAGI=tipodocumentobizagi.ListaDatosTipoDocumentoBIZAGI(listtipodocBIZAGI, tipodoc);                                          
                            if (listaTipoDocBIZAGI.size()>0 )
                                        {                                                    
                                            list.setDoctypeib(listaTipoDocBIZAGI.get(0).getEquivalenciaib());
                                            list.setDoctypete(listaTipoDocBIZAGI.get(0).getEquivalenciate());
                                        }                                    
                                else{                                                    
                                            list.setDoctypeib(""); 
                                            list.setDoctypete(""); 
                                         }
                            }
                           
                            listDoc.add(list) ;
                            }
                       
                        json= gson.toJson(listDoc);
                        System.out.println("listDoc");           
                        System.out.println(json);  
                        
                         boolean bolEncontrado = false;
//                        double dblComision=0.00;
                        
                        for (FCCuenta cyf : CuentayFirma) 
                        {
                          
                            if (cyf.getAccountType().trim().toUpperCase().contains("EMPLOYEE"))  // Verificamos si el cliente es empleado de Inteligo
                            {
                                bolEncontrado=true;
                                break;
                            } 
                            else 
                            {
                                bolEncontrado=false;                                
                            }                           
                        } 
                        List<ComisionClienteBIZAGI> listComisionClienteBIZAGI=null;
                        if (!bolEncontrado) // SI NO ES EMPLEADO TRAER COMISION
                        {
                            listComisionClienteBIZAGI =comisionclientebizagi.comisionclientebizagiQry(segmento, tipotransferencia, Constantes.ESBANCOLOCAL);  
                        }
                        
                        List<ClienteCRMyFC> listClienteCRMyFC = null;
                        listClienteCRMyFC = new ArrayList<>();
                        
                        List<FCPortafolio> listPortafolio = null;
                        listPortafolio = new ArrayList<>();
                        
                        List<FC14_PORTFOLIOLIST> listPortafolioTodo = null;
                        listPortafolioTodo = new ArrayList<>();   
                        
                        List<FCPortafolio> listPortafolioFirma = null;
                        listPortafolioFirma = new ArrayList<>();
                        
                        for (FCCuenta cyf : CuentayFirma) 
                        {
                            if(cyf.getAccountType().trim().equals(""))
                            {
                                FCPortafolio lstPrt= new FCPortafolio();
                                lstPrt.setIdClient(cyf.getIdClient());
                                lstPrt.setIdPortfolio(cyf.getPortfolio());
                                lstPrt.setAccCustomer(cyf.getAccCustomer());
                                lstPrt.setAccountNo(cyf.getAccountNo());
                                lstPrt.setWorkingBal(cyf.getWorkingBal());
                                lstPrt.setWorkingBalUSD(cyf.getWorkingBalUSD());
                                lstPrt.setNombreMoneda(cyf.getNombreMoneda());
                                lstPrt.setSimboloMoneda(cyf.getSimboloMoneda());
                                lstPrt.setRentabilidad("");
                                listPortafolio.add(lstPrt);
                            }
                        } 
                        
                       

                        for (FC01_CUSLIST lpf:listaLimpia)
                            {   
                                ClienteCRMyFC  list= new ClienteCRMyFC();
                                list.setIdClient(lpf.getIdClient());
                                list.setInactiveCustomer(lpf.getInactiveCustomer());
                                list.setActiveCustomer(lpf.getActiveCustomer());
                                list.setDocType(lpf.getDocType());                              
                                list.setCollateralDeuda(lpf.getCollateralDeuda());
                                list.setCusSegment(lpf.getCusSegment());
                                list.setCusStatus(lpf.getCusStatus());
                                
                                if (!bolEncontrado) // SI NO ES EMPLEADO TRAER COMISION
                                {                                
                                    for (ComisionClienteBIZAGI lpf0:listComisionClienteBIZAGI)
                                        {   
                                            if (lpf.getCusSegment().trim().equals(segmento))
                                            {
                                               list.setComisionminima(lpf0.getMontominimo());
                                               list.setComisionmaxima(lpf0.getMontomaximo());                                           
                                            }                                
                                        }
                                }
                                else
                                {
                                    list.setComisionminima(0.00);
                                    list.setComisionmaxima(0.00);        
                                }
                                
                                for (ClienteCRM lpf1:listClienteCRM)
                                     {   
                                         if (lpf.getIdClient().trim().equals(lpf1.getIdclie().trim()))
                                         {
                                            list.setCodigo(lpf1.getCodigo());
                                            list.setNombre(lpf1.getNombre());
                                            list.setApellidos(lpf1.getApellidos());
                                            list.setSector(lpf1.getSector());
                                            list.setMarcaservicio(lpf1.getMarcaservicio());
                                            list.setEmail(lpf1.getEmail());
                                            list.setDireccion(lpf1.getDireccion());
                                            list.setTipopersona(lpf1.getTipopersona());
                                            list.setNombrecompleto(lpf1.getNombrecompleto());
                                            list.setSegmento(lpf1.getSegmento());
                                         }                                
                                     }
                                list.setErrcod(lpf.getErrcod());
                                list.setDetcod(lpf.getDetcod());
                                list.setDefcod(lpf.getDefcod());

                                listClienteCRMyFC.add(list); 
                            }     
                        
                        
                        
                             for (FCPortafolio lstPrt : listPortafolio) 
                            {
                                for (FC14_PORTFOLIOLIST PortaList : PortafolioList) 
                                {
                                    if (lstPrt.getIdPortfolio().equals(PortaList.getPortfolioID()))
                                    {
                                    FC14_PORTFOLIOLIST lstPorTodo = new FC14_PORTFOLIOLIST();
                                    lstPorTodo.setIdClient(PortaList.getIdClient());
                                    lstPorTodo.setOwner(PortaList.getOwner());
                                    lstPorTodo.setClientType(PortaList.getClientType());
                                    lstPorTodo.setDescription(PortaList.getDescription());
                                    Double balance =PortaList.getBalance() - lstPrt.getWorkingBalUSD();
                                    lstPorTodo.setBalance(balance);
                                    lstPorTodo.setJointHolder(PortaList.getJointHolder());               
                                    lstPorTodo.setPortfolioID(PortaList.getPortfolioID());
                                    listPortafolioTodo.add(lstPorTodo);
                                    }
                                }           
                            }
                             
                            for (FCPortafolio lstPrt : listPortafolio) 
                            {
                                for (FC14_PORTFOLIOLIST PortaList : PortafolioList) 
                                {
                                    if (lstPrt.getIdPortfolio().equals(PortaList.getPortfolioID()))
                                    {
                                    FCPortafolio lstPortaFirma = new FCPortafolio();
                                    lstPortaFirma.setIdClient(PortaList.getIdClient());
                                    lstPortaFirma.setAccCustomer(lstPrt.getAccCustomer());
                                    lstPortaFirma.setAccountNo(lstPrt.getAccountNo());
                                    lstPortaFirma.setFirma(PortaList.getClientType());                
                                    lstPortaFirma.setIdPortfolio(lstPrt.getIdPortfolio());
                                    lstPortaFirma.setRentabilidad(lstPrt.getRentabilidad());               
                                    lstPortaFirma.setWorkingBal(lstPrt.getWorkingBal());
                                    lstPortaFirma.setWorkingBalUSD(lstPrt.getWorkingBalUSD());
                                    lstPortaFirma.setNombreMoneda(lstPrt.getNombreMoneda());
                                    lstPortaFirma.setSimboloMoneda(lstPrt.getSimboloMoneda());
                                    listPortafolioFirma.add(lstPortaFirma);
                                    }
                                }           
                            }
                            
//                            json= gson.toJson(listPortafolio);
//                            System.out.println("listPortafolio");           
//                            System.out.println(json); 
//                            
//                             json= gson.toJson(PortafolioList);
//                            System.out.println("PortafolioList");           
//                            System.out.println(json); 
//                                    
//                            
//                            
//                            json= gson.toJson(listClienteCRMyFC);
//                            System.out.println("listClienteCRMyFC");           
//                            System.out.println(json); 
//                            
//                            json= gson.toJson(CuentayFirma);
//                            System.out.println("CuentayFirma");           
//                            System.out.println(json); 
//                            
//                            json= gson.toJson(listPortafolioFirma);
//                            System.out.println("listPortafolioFirma");           
//                            System.out.println(json); 
                            
                            
                            
                            for (ClienteCRMyFC lpf:listClienteCRMyFC)
                            {                                
                                JOCliente.put("nombre", Convierte.NullaVacio(lpf.getNombre()));
                                JOCliente.put("apelli",Convierte.NullaVacio(lpf.getApellidos()));
                                for (FCDocIdentidad lpf1:listDoc)
                                {
                                    if (lpf.getIdClient().trim().equals(lpf1.getIdclie().trim()))
                                     {
                                            JSONObject JODocIdentidad=new JSONObject(); 
                                            JODocIdentidad.put("tipdoct24", Convierte.NullaVacio(lpf1.getId()));
                                            JODocIdentidad.put("numdoc", Convierte.NullaVacio(lpf1.getDoctype()));    
                                            JODocIdentidad.put("tipdocte", Convierte.NullaVacio(lpf1.getDoctypete()));   
                                            JODocIdentidad.put("tipdoc", Convierte.NullaVacio(lpf1.getDoctypeib()));            
                                            
                                            JADocIdentidad.add(JODocIdentidad);                                         
                                     }                                    
                                }
                                JOCliente.put("listadocumentoordenpago", JADocIdentidad);
                                JOCliente.put("compag",Formatea.Redondear(lpf.getComisionminima(),2));                                
                            }
                            
                             for (FCCuenta lpf:CuentayFirma)
                                     {   
                                         JSONObject JOCuenta =new JSONObject();        
                                        JOCuenta.put("portafolio", Convierte.NullaVacio(lpf.getIdPortfolio()));
                                        JOCuenta.put("numcta",Convierte.NullaVacio(lpf.getAccountNo()));
                                        JOCuenta.put("tipcta",Convierte.NullaVacio(lpf.getAccountType()));
                                        JOCuenta.put("codmoncta",Convierte.NullaVacio(lpf.getCurrency()));
                                        JOCuenta.put("moncta",Convierte.NullaVacio(lpf.getCurrency()));
                                        JOCuenta.put("salcta",lpf.getWorkingBal());
                                        JOCuenta.put("saldispo",lpf.getAcctBal());
                                        JOCuenta.put("cuenta",Convierte.NullaVacio(lpf.getIdPortfolio()));
                                        JOCuenta.put("perfil",Convierte.NullaVacio(lpf.getTitular())); 
                                        String estitun="";
                                        
//                                        for (FCPortafolio lp1:listPortafolioFirma)
//                                        {
//                                           if (lpf.getIdPortfolio().equals(lp1.getIdPortfolio()))
//                                           {                                            
                                            if (lpf.getSignRelation().trim().equals("Secundary"))
                                                 {  
                                                     estitun="T";                                       
                                                 }
//                                             else if (lp1.getFirma().trim().equals("Secundary"))
//                                                 {                                  
//                                                     estitun="F";                                        
//                                                 }
                                             else
                                                 {                                        
                                                     estitun="F";
                                                 }
//                                           }
//                                        }
                                        JOCuenta.put("estitun",Convierte.NullaVacio(estitun));
                                        JOCuenta.put("grufir",Convierte.NullaVacio(lpf.getSignGroup()));
                                        
                                        JOCuenta.put("nivfir",Convierte.NullaVacio(lpf.getSignCondition()));
                                        JOCuenta.put("linsgr",Formatea.Redondear(lpf.getLimitAmtDisp(),2));
                                        JOCuenta.put("fecexp", DatetoStr(lpf.getLimitExpDate()));
                                        JOCuenta.put("refer","");
                                       
                                        JACuenta.add(JOCuenta);   
                                        
                                        JOTotalError.put("errcod", Integer.parseInt(lpf.getErrcod()));
                                        JOTotalError.put("detcod", lpf.getDetcod());
                                        JOTotalError.put("defcod", lpf.getDefcod()); 
                                     }
                             
                             JOCliente.put("listacuentas",JACuenta);

                            }   
                       else
                    {
                          JOTotalError.put("errcod", Integer.parseInt(Constantes.RETORNO_NODATASQL.toString()));
                           JOTotalError.put("detcod", Constantes.MENSAJE_NODATASQL_DET);
                           JOTotalError.put("defcod", Constantes.MENSAJE_NODATASQL_DEF);       
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
        
        JORaiz.put("datos",JOCliente); 
        JORaiz.put("error",JOTotalError); 
        
        return JORaiz.toString();
     }    
}
