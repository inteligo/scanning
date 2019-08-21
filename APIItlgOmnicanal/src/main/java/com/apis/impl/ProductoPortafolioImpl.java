package com.apis.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import static com.java.Convierte.DatetoStr;
import com.java.Formatea;
import com.java.GeneraUUID;
import com.java.LeerDataProperties;
import com.sql.services.impl.CWServiceListaBonoPeruanoHiloImpl;
import com.t24.services.FC13Tipo2;
import com.t24.services.FC43Tipo2;

import com.t24.services.impl.CWServiceListaMonedasHiloImpl;
import com.t24.services.impl.CWServiceTWS_Tipo2HiloImpl;
import com.t24.services.impl.FC13Tipo2Impl;
import com.t24.services.impl.FC43Tipo2Impl;
import com.t24.services.impl.InputCollectionTipo2Impl;
import com.t24.services.input.Body;
import com.t24.services.input.Head;
import com.t24.services.input.IbaQuery;
import com.t24.services.input.InputCollection;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;
import dto.t24.services.FC13_INVTASSETDETS;
import dto.t24.services.FC43_MASTERLIST;
import dto.t24.services.FCProducto;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProductoPortafolioImpl {
    
    private static final Logger LOG = LogManager.getLogger(ProductoPortafolioImpl.class);
    
    public String ConsultaProductoPortafolio (String CustomerNo,String PortafolioNo,String Product) {
      
        com.tws.wsdl.EnquiryInput enquiryInput13=new com.tws.wsdl.EnquiryInput();
        com.tws.wsdl.EnquiryInput enquiryInput43=new com.tws.wsdl.EnquiryInput();
                 
        FC13Tipo2 fc13= new FC13Tipo2Impl();        
        FC43Tipo2 fc43= new FC43Tipo2Impl();      
        
        
        DaoListaMoneda lista= new DaoListaMonedaImpl();
        List<dto.sql.Moneda> listMonedas =null;   
        List<dto.sql.BonoPeruano> listBonoPeruano =null;   


        
        String errcod="";
        String detcod="";
        String defcod="";
        
        JSONObject JOTotalProducto =new JSONObject();        
        JSONObject JOTotalError =new JSONObject();
        JSONObject JOListaProducto =new JSONObject(); 
        
        JSONObject JORaiz =new JSONObject();
        
        String json="";             
        Gson gson =new GsonBuilder().serializeNulls().create();    
        int cantidadDatosLista=0;
   
        try
        {
                        
           
        // ESTO ES NUEVO ------ HILOS
                
            IbaQuery ibaguid1 = new IbaQuery();
            IbaQuery ibaguid2 = new IbaQuery();
            Head hd1 = new Head();
            Body bd1 = new Body();
            Head hd2 = new Head();
            Body bd2 = new Body();

            hd1.setIbaguid(GeneraUUID.CodigoUUID());

            hd1.setFunctioncode(Constantes.INTEGRADOR_FC13);
            hd1.setChannel(Constantes.INTEGRADOR_CHANNEL);
            hd1.setAgentId(Constantes.INTEGRADOR_AGENTID);   
            hd1.setCustomerNo(CustomerNo);       

            ibaguid1.setHead(hd1);
            bd1.setCustomerNo(CustomerNo);
            bd1.setPortfolioNo(PortafolioNo);
            bd1.setProduct(Product);
            ibaguid1.setBody(bd1);


            hd2.setIbaguid(GeneraUUID.CodigoUUID());

            hd2.setFunctioncode(Constantes.INTEGRADOR_FC43);
            hd2.setChannel(Constantes.INTEGRADOR_CHANNEL);
            hd2.setAgentId(Constantes.INTEGRADOR_AGENTID);   
            hd2.setCustomerNo(CustomerNo);       

            ibaguid2.setHead(hd2);
            bd2.setCodigodeProducto(Product);
            ibaguid2.setBody(bd2);
            
            InputCollection ic13tipo2 =new InputCollection();
            InputCollectionTipo2Impl ic13tipo2impl=new InputCollectionTipo2Impl();

            ic13tipo2.setCUSTOMERID(CustomerNo);
            ic13tipo2.setPORTFOLIOID(PortafolioNo);
            ic13tipo2.setPRODUCTID(Product);            
            enquiryInput13=ic13tipo2impl.Input(ic13tipo2);
        
            InputCollection ic43tipo2 =new InputCollection();
            InputCollectionTipo2Impl ic43tipo2impl=new InputCollectionTipo2Impl();
            
            ic43tipo2.setID(Product);           
            enquiryInput43=ic43tipo2impl.Input(ic43tipo2);

            String strFC_return1=null;
            String strFC_return2=null; 

          

            CWServiceTWS_Tipo2HiloImpl servicio1= new CWServiceTWS_Tipo2HiloImpl(Constantes.INTEGRADOR_FC13,enquiryInput13);         
            CWServiceTWS_Tipo2HiloImpl servicio2= new CWServiceTWS_Tipo2HiloImpl(Constantes.INTEGRADOR_FC43,enquiryInput43);      
            CWServiceListaMonedasHiloImpl servicio4 = new CWServiceListaMonedasHiloImpl();
            CWServiceListaBonoPeruanoHiloImpl servicio5 = new CWServiceListaBonoPeruanoHiloImpl();

            Thread hilo4 = servicio4;
            hilo4.start();

            Thread hilo5 = servicio5;
            hilo5.start();

            Thread hilo1 = servicio1;
            hilo1.start();

            Thread hilo2 = servicio2;
            hilo2.start();

             while (hilo1.isAlive() || hilo2.isAlive() || hilo4.isAlive() || hilo5.isAlive())
               {
                   listMonedas=servicio4.getResult();
                   listBonoPeruano=servicio5.getResult();
                   strFC_return1=servicio1.getResult();
                   strFC_return2=servicio2.getResult(); 
               }  
                  

           

//            System.out.println("acá sale del servicio : " + new Date());

            // FIN NUEVO ------ HILOS     

            List<FCProducto> listDatosProducto = null;
            listDatosProducto = new ArrayList<>();
            
            List<FC13_INVTASSETDETS> listDatProd =null;
            List<FC43_MASTERLIST> listDetProd =null;
            
             
            listDatProd =fc13.INVTASSETDETS(strFC_return1, CustomerNo,Product,listMonedas);           
            listDetProd =fc43.MASTERLIST(strFC_return2, Product);  
                  
      
            
             for (FC13_INVTASSETDETS lpf : listDatProd) 
            {
                errcod= lpf.getErrcod();
                detcod=lpf.getDetcod();
                defcod=lpf.getDefcod();   
            }          
             
             
             
            if (errcod.equals("0"))
            {
                    //SACAMOS SOLO LO QUE ES CASH DE PORTAFOLIOS
                   for (FC13_INVTASSETDETS listTmpDatProd : listDatProd) 
                   {               
                       FCProducto lstTmpProducto = new FCProducto();
                       lstTmpProducto.setIdClient(listTmpDatProd.getIdClient());
                       lstTmpProducto.setIdProducto(listTmpDatProd.getIdProduct());
                       lstTmpProducto.setProductType(listTmpDatProd.getProductType());
                       lstTmpProducto.setAssetClass(listTmpDatProd.getAssetClass());
                       lstTmpProducto.setSector(listTmpDatProd.getSector());
                       lstTmpProducto.setRegion(listTmpDatProd.getRegion());
                       lstTmpProducto.setCurrency(listTmpDatProd.getCurrency());
                       lstTmpProducto.setProducto(listTmpDatProd.getProducto());
                       lstTmpProducto.setValorNominal(listTmpDatProd.getValorNominal());
                       lstTmpProducto.setUnits(listTmpDatProd.getUnits());
                       lstTmpProducto.setLastPurchaseDate(listTmpDatProd.getLastPurchaseDate());
                       lstTmpProducto.setAvgPurchasePrice(listTmpDatProd.getAvgPurchasePrice());
                       lstTmpProducto.setTotalInvestment(listTmpDatProd.getTotalInvestment());
                       lstTmpProducto.setOriginalCurrency(listTmpDatProd.getOriginalCurrency());                    
                       lstTmpProducto.setTotalInvOriginalCcy(listTmpDatProd.getTotalInvOriginalCcy());
                       lstTmpProducto.setMarketPrice(listTmpDatProd.getMarketPrice());
                       lstTmpProducto.setMarketValueDate(listTmpDatProd.getMarketValueDate());
                       lstTmpProducto.setMarketValue(listTmpDatProd.getMarketValue());
                       lstTmpProducto.setAccruedInterest(listTmpDatProd.getAccruedInterest());
                       lstTmpProducto.setProfitLoss(listTmpDatProd.getProfitLoss());
                       lstTmpProducto.setProfitLossUSD(listTmpDatProd.getProfitLossUSD());
                       lstTmpProducto.setCoupon(listTmpDatProd.getCoupon());                    
                       lstTmpProducto.setCouponAmount(listTmpDatProd.getCouponAmount());
                       lstTmpProducto.setNextPayment(listTmpDatProd.getNextPayment());
                       lstTmpProducto.setInterestFrequency(listTmpDatProd.getInterestFrequency());
                       lstTmpProducto.setMaturityDate(listTmpDatProd.getMaturityDate());
                       lstTmpProducto.setPledge(listTmpDatProd.getPledge()); 
                       lstTmpProducto.setNombreMoneda(listTmpDatProd.getNombreMoneda()); 
                       lstTmpProducto.setSimboloMoneda(listTmpDatProd.getSimboloMoneda()); 
                       lstTmpProducto.setTotalInvestmentUSD(listTmpDatProd.getTotalInvestmentUSD()); 
                       lstTmpProducto.setMarketPriceUSD(listTmpDatProd.getMarketPriceUSD()); 
                        lstTmpProducto.setMarketValueUSD(listTmpDatProd.getMarketValueUSD()); 
                       
                       for (FC43_MASTERLIST listTmpDetProd : listDetProd) 
                       {
                           if (listTmpDatProd.getIdProduct().trim().equals(listTmpDetProd.getCodigodeProducto().trim()))
                           {    
                               lstTmpProducto.setISIN(listTmpDetProd.getISIN());
                               lstTmpProducto.setCusip(listTmpDetProd.getCusip());
                               lstTmpProducto.setSubAssetType(listTmpDetProd.getSubAssetType());
                               lstTmpProducto.setAssetType(listTmpDetProd.getAssetType());
                               break;
                           }
                       }
                        Integer lvintEsBonoPeruano=0;
                        for (dto.sql.BonoPeruano listaBono : listBonoPeruano) 
                       {
                           lvintEsBonoPeruano=0;
                           if (listTmpDatProd.getIdProduct().trim().equals(listaBono.getId().trim()))
                           {                                  
                               lvintEsBonoPeruano=1;
                               break;
                           }
                       }
                       lstTmpProducto.setBonoPeruano(lvintEsBonoPeruano);   
                       lstTmpProducto.setErrcod(listTmpDatProd.getErrcod());
                       lstTmpProducto.setDetcod(listTmpDatProd.getDetcod());
                       lstTmpProducto.setDefcod(listTmpDatProd.getDefcod());


                       listDatosProducto.add(lstTmpProducto);
                   }   
                   
                   
                      json= gson.toJson(listDatProd);           
                   System.out.println(json);
                   json= gson.toJson(listDatosProducto);      
                     System.out.println("listDatosProducto");
                   System.out.println(json);
               

                   cantidadDatosLista= listDatosProducto.size();

                    if (cantidadDatosLista>0  )
                        {
                            for (FCProducto lpf:listDatosProducto)
                            {     
                                if  (lpf.getProducto().trim().equals(""))
                                    {
                                        JOTotalError.put("errcod", Integer.parseInt(Constantes.RETORNO_NODATASQL.toString()));
                                        JOTotalError.put("detcod", Constantes.MENSAJE_NODATASQL_DET);
                                        JOTotalError.put("defcod", Constantes.MENSAJE_NODATASQL_DEF);  
                                    }
                                else
                                    {
                                        JOListaProducto.put("tippro", Convierte.NullaVacio(lpf.getProductType()));
                                        JOListaProducto.put("despro", Convierte.NullaVacio(lpf.getProducto()));                                                          
                                        JOListaProducto.put("desmon", Convierte.NullaVacio(lpf.getNombreMoneda()));                                                           
                                        JOListaProducto.put("acrmon", Convierte.NullaVacio(lpf.getOriginalCurrency()));
                                        JOListaProducto.put("simbol", Convierte.NullaVacio(lpf.getSimboloMoneda().trim()));
                                        JOListaProducto.put("isin", Convierte.NullaVacio(lpf.getISIN()));
                                        JOListaProducto.put("valnom", Formatea.Redondear(lpf.getValorNominal(),2));            
                                        JOListaProducto.put("fecult", DatetoStr( lpf.getLastPurchaseDate()));
                                        JOListaProducto.put("prepro", Formatea.Redondear(lpf.getAvgPurchasePrice(),2));
                                        JOListaProducto.put("invtot", Formatea.Redondear(lpf.getTotalInvOriginalCcy(),2));
                                        JOListaProducto.put("invtotusd", Formatea.Redondear(lpf.getTotalInvestment(),2));
                                        JOListaProducto.put("intacu", Formatea.Redondear(lpf.getAccruedInterest(),2));
                                        JOListaProducto.put("premer", Formatea.Redondear(lpf.getMarketPrice(),2));
                                        JOListaProducto.put("premerusd", Formatea.Redondear(lpf.getMarketPriceUSD(),2));
                                        JOListaProducto.put("fecmer", DatetoStr( lpf.getMarketValueDate()));            
                                        JOListaProducto.put("valmer", Formatea.Redondear(lpf.getMarketValue(),2));
                                        JOListaProducto.put("valmerusd", Formatea.Redondear(lpf.getMarketValueUSD(),2));
                                        JOListaProducto.put("bonoper", Convierte.NullaVacio(lpf.getBonoPeruano().toString()));

                                        Double dblGanPerNoRealizada=0.00;
                                        dblGanPerNoRealizada=lpf.getMarketValueUSD()-lpf.getTotalInvestment();

                                        JOListaProducto.put("ganper", Formatea.Redondear(dblGanPerNoRealizada,2));
                                        JOListaProducto.put("ganperusd", Formatea.Redondear(dblGanPerNoRealizada,2));
                                        String ganpersim="";
                                        if (dblGanPerNoRealizada>0.00)
                                        {
                                            ganpersim="+";
                                        }
                                        else if(dblGanPerNoRealizada<0.00)
                                        {
                                            ganpersim="-";
                                        }
                                        else{
                                            ganpersim="";
                                        }

//                                                            String ganpersim="";
//                                                            if (lpf.getProfitLossUSD()>0.00)
//                                                            {
//                                                                ganpersim="+";
//                                                            }
//                                                            else if(lpf.getProfitLossUSD()<0.00)
//                                                            {
//                                                                ganpersim="-";
//                                                            }
//                                                            else{
//                                                                ganpersim="";
//                                                            }
                                        JOListaProducto.put("ganpersim", ganpersim);
//                                                            JOListaProducto.put("ganper", Formatea.Redondear(lpf.getProfitLoss(),2));
//                                                            JOListaProducto.put("ganperusd", Formatea.Redondear(lpf.getProfitLossUSD(),2));
                                        JOListaProducto.put("unidad", Formatea.Redondear(lpf.getUnits(),2)); 

                                        JOListaProducto.put("tasint", Formatea.Redondear(lpf.getCoupon(),3)); 
                                        JOListaProducto.put("freint", Convierte.NullaVacio(lpf.getInterestFrequency())); 
                                        JOListaProducto.put("fecven", Convierte.DatetoStr(lpf.getMaturityDate())); 
                                        JOListaProducto.put("monbon", Formatea.Redondear(lpf.getCouponAmount(),2));
                                        JOListaProducto.put("idpro", lpf.getIdProducto());

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
        catch (Exception e){            
            JOTotalError.put("errcod", Integer.parseInt(Constantes.HTTP_RESPUESTA_BADREQUEST.toString()));
            JOTotalError.put("detcod", e.getCause());
            JOTotalError.put("defcod", e.getMessage());        
            LOG.error( "ERROR: " + e.getMessage());
        }               
        
        JOTotalProducto.put("producto",JOListaProducto); 
        
         JORaiz.put("datos",JOTotalProducto); 
        JORaiz.put("error",JOTotalError); 
                      
        return JORaiz.toJSONString();

     }
    
}
