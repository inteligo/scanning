package com.t24.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.Constantes;
import com.java.Convierte;
import dto.t24.services.FC48_STMTDETS;
import dto.t24.services.FCReturn;
import java.util.List;
import org.jdom2.input.SAXBuilder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import com.t24.services.CWServiceTWS_Tipo2;
import com.t24.services.FC48Tipo2;
import com.t24.services.FCResponse;
import com.t24.services.input.InputCollection;
import dao.sql.DaoListaMoneda;
import dao.sql.impl.DaoListaMonedaImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class FC48Tipo2Impl implements FC48Tipo2 {  

    
    @Override
    public String FC48Str(String CustomerNo,String Cuenta, String Fecha)   {
        Gson gson =new GsonBuilder().serializeNulls().create();
         FC48Tipo2 fc48= new FC48Tipo2Impl();
         CWServiceTWS_Tipo2  consumingservice= new CWServiceTWS_Tipo2Impl();
         com.tws.wsdl.EnquiryInputCollection enquiryInputCollection=new com.tws.wsdl.EnquiryInputCollection();  
         com.tws.wsdl.EnquiryInput enquiryInput=new com.tws.wsdl.EnquiryInput();

        String json="";
        String resultado="";

        String respuesta="";

        String Fechas =null;
        String FechaActual=null;      

        Date date = new Date();       
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        FechaActual=dateFormat.format(date);

        Fechas=Fecha +" "+FechaActual;

        InputCollection ic =new InputCollection();
        InputCollectionTipo2Impl icimpl=new InputCollectionTipo2Impl();

        ic.setACCOUNT(Cuenta);
        enquiryInput=icimpl.Input(ic);

        InputCollection ic1 =new InputCollection();             
        ic1.setBOOKINGDATE(Fechas);

        enquiryInput=icimpl.Input(ic1);

        respuesta = consumingservice.CallService(Constantes.INTEGRADOR_FC48,enquiryInput);      

        return respuesta;
        }
    
    @Override
    public List<FC48_STMTDETS> STMTDETS (String jsonstring,String CustomerNo,List<dto.sql.Moneda>  listMonedas) {
        SAXBuilder builder = new SAXBuilder();        
        String errcod="";
        String detcod="";
        String defcod="";
        String strFecha="";
        String moneda="";
        
        FCResponse fcretorno= new FCResponseImpl();
        List list = new ArrayList<>();        
        List<dto.sql.Moneda>  listMoneda=null;        
        DaoListaMoneda listamoneda= new DaoListaMonedaImpl(); 
        
        try { 
          
                    List<FCReturn> listaRetorno =fcretorno.ListaRetorno(jsonstring);       

                    for (FCReturn lpf : listaRetorno) 
                    {
                         errcod= lpf.getErrcod();
                        detcod=lpf.getDetcod();
                        defcod=lpf.getDefcod();      
                    }            
           
                   if (errcod.equals("0"))
                    {               
                        JSONArray jsonObj = new JSONArray(jsonstring);               
                        JSONObject table = jsonObj.optJSONObject(0).optJSONObject("gtmsstmtentbookDetailType");
                        if (table!=null)                        
                        {
                            JSONArray dataArray = (JSONArray) table.get("mtmsstmtentbookDetailType");
                            for (int i = 0; i < dataArray.length(); i++) 
                            {

                                        FC48_STMTDETS lista = new FC48_STMTDETS();
                                        JSONObject rec = dataArray.optJSONObject(i);
                                        String strfecha="";
                                        String customerId="";

                                        customerId= (rec.optString("cliente").trim());    
                                        if (!customerId.equals(""))
                                            {
                                            lista.setIdClient(CustomerNo);
                                            lista.setCliente((String) (rec.optString("cliente").trim()));
                                            lista.setCurrency((String) (rec.optString("currency").trim()));    
                                            lista.setCuenta((String) (rec.optString("cuenta").trim()));                         
                                            strFecha=(Convierte.FecStraDateStr(rec.optString("fecha").trim()));
                                            lista.setFecha(strFecha);   
                                            lista.setIntFecha((Integer) Integer.parseInt(strFecha));     
                                            lista.setDescripcion ((String)(rec.optString("descripcion").trim()));   
                                            lista.setCargo(Convierte.NumStringaDouble(rec.optString("cargo").trim())); 
                                            lista.setAbono(Convierte.NumStringaDouble(rec.optString("abono").trim())); 
                                            lista.setSaldo(Convierte.NumStringaDouble(rec.optString("saldo").trim())); 
                                            lista.setContador(Convierte.aInteger(rec.optString("contador").trim())); 

                                            moneda=(String) rec.optString("currency").trim();
                                            if (!moneda.equals(""))
                                            {
                                                listMoneda=listamoneda.ListaDatosMoneda(listMonedas, moneda);                                          
                                                if (listMoneda.size()>0 )
                                                        {
                                                            lista.setSaldoUSD((Convierte.NumStringaDouble(rec.optString("saldo").trim()))*listMoneda.get(0).getTipocambio());          
                                                            lista.setNombreMoneda(listMoneda.get(0).getMoneda());
                                                            lista.setSimboloMoneda(listMoneda.get(0).getSimbolo());
                                                         }
                                               else{
                                                             lista.setSaldoUSD((Convierte.NumStringaDouble(rec.optString("saldo").trim())));          
                                                            lista.setNombreMoneda("");
                                                            lista.setSimboloMoneda("");                                           
                                                        }
                                            }

                                        lista.setErrcod(errcod);
                                        lista.setDetcod(detcod);
                                        lista.setDefcod(defcod);

                                        list.add(lista);         

                                        }  
                                  
                                }
                            }    
                         else
                                        {
                                              list.addAll(LlenaListaVacia(2,CustomerNo,errcod,detcod,defcod));
                                        }
                        Comparator<FC48_STMTDETS> cmp = Collections.reverseOrder(new IntContadorComparator());          
                        Collections.sort(list, cmp);  
                }
            else
            {   
                 list.addAll(LlenaListaVacia(2,CustomerNo,errcod,detcod,defcod));              
            } 
            

            }

        catch (NumberFormatException | JSONException e) {
                list.addAll(LlenaListaVacia(1,CustomerNo,errcod,e.getMessage(),e.getCause().toString()));               
      }
       
        return list;
    
    }
   
    public List<FC48_STMTDETS> LlenaListaVacia(Integer tipo,String CustomerNo,String errcod,String detcod,String defcod) {  //tipo 1: error;   2: no data
        List<FC48_STMTDETS> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
                FC48_STMTDETS lista = new FC48_STMTDETS();
                lista.setIdClient(CustomerNo);
                lista.setCliente(CustomerNo);
                lista.setCuenta("");
                lista.setFecha("19000101");                
                lista.setDescripcion("");
                lista.setIntFecha(0);     
                lista.setCargo(0.00); 
                lista.setAbono(0.00); 
                lista.setSaldo(0.00);  
                lista.setSaldoUSD(0.00); 
                lista.setContador(0);
                
                lista.setDefcod(defcod);
                lista.setDetcod(detcod);
                   
                if ( tipo.equals(1)) //error
               {
                   lista.setErrcod(Constantes.HTTP_RESPUESTA_NOTFOUND.toString());                 
               }
               else  //sin data
               {  
                   lista.setErrcod(errcod);                 
               }

                list.add(lista);   

        return list;
    }
    
    
     @Override
    public List<FC48_STMTDETS> calcularCuenta(List<FC48_STMTDETS> ls , Double saldoinicial) {
        List<FC48_STMTDETS> listado = new ArrayList<FC48_STMTDETS>();
        Double cargo = 0.0;
        Double abono = 0.0;
        Double saldo = 0.0;
        Double saldonuevo = 0.0;
        Double saldoini = saldoinicial;
        boolean indicador = true ;
        try {

            for (FC48_STMTDETS lit : ls) {
                cargo = lit.getCargo();
                abono = lit.getAbono();
                if(indicador){
                    lit.setSaldo(saldoini);
                }
                if(saldonuevo != 0.0){
                     lit.setSaldo(saldonuevo);
                     indicador = false;
                }
               
                if (lit.getCargo() == 0.0) {
                    saldonuevo = (lit.getSaldo()-(lit.getAbono()));
 
                    indicador = false;
                } else if (lit.getAbono() == 0.0) {
                    saldonuevo =  (lit.getSaldo()-(lit.getCargo()));
 
                    indicador = false;
                }
                System.out.println(saldonuevo);
            }

        } catch (Exception e) {
            e.getMessage();
        }
         return ls;
    }
    
    public class IntContadorComparator implements Comparator {
    
    @Override
    public int compare(Object o1, Object o2) {
        FC48_STMTDETS lista1 = (FC48_STMTDETS)o1;
        FC48_STMTDETS lista2 = (FC48_STMTDETS)o2;
        return lista1.getContador().compareTo(lista2.getContador());
               
    }
    
    }
      
}
