package com.bzgws.services.impl;


import com.java.Constantes;
import com.t24.services.FCRetorno;
import com.t24.services.impl.FCRetornoImpl;
import dto.bzg.services.TransferenciaOC;
import dto.t24.services.FCReturn;
import java.io.IOException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.util.List;
import org.jdom2.input.SAXBuilder;
import java.io.StringReader;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


public class BzgWSRespuestaImpl   {  
    
//    @Override
    public String BzgRespuesta(String guid)   {
        ConsumingServiceBzgWSImpl  consumingservice= new ConsumingServiceBzgWSImpl();
        
        String strFC_return = consumingservice.getEntitiesUsingSchemaAsString(guid);
//
        return strFC_return;

        }
    
//    @Override
    public List<TransferenciaOC> tblTransferenciaOCList (String xmlString) throws SAXException, IOException {
        SAXBuilder builder = new SAXBuilder();
        String errcod=null;
        String detcod=null;
        String defcod=null;

        String NumeroCaso="";
        String GuidRegistro="";
        String CodigoRespuesta="";
        String ComentarioRespuesta="";
        String Comision="";
        String TransaccionT24="";

         FCRetorno fcretorno= new FCRetornoImpl();
         List list = new ArrayList<>();        
        
        try {
                   List<FCReturn> listaRetorno =fcretorno.ListaRetorno(xmlString);       

                    for (FCReturn lpf : listaRetorno) 
                    {
                        errcod= lpf.getErrcod();
                        detcod=lpf.getDetcod();
                        defcod=lpf.getDefcod();      
                    }            
           
                   if (errcod.equals(""))
                    {                              
                        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
                        DocumentBuilder builderf = factory.newDocumentBuilder(); //el documento      
                        Document dc01 =   builderf.parse( new InputSource( new StringReader( xmlString ) ) ); 
                        Element elementRaiz = dc01.getDocumentElement();  
                        NodeList hijos = elementRaiz.getChildNodes();  

                        NodeList listaNodos = dc01.getElementsByTagName("NumeroCaso");  
                        for(int i=0;i<listaNodos.getLength();i++)
                        {  
                            Node nodo = listaNodos.item(i);  
                            if (nodo instanceof Element)
                            {  
                                NumeroCaso=nodo.getTextContent().trim();  
                            }  
                        }  

                        NodeList listaNodos2 = dc01.getElementsByTagName("GuidRegistro");  
                        for(int i=0;i<listaNodos2.getLength();i++)
                        {  
                            Node nodo = listaNodos2.item(i);  
                            if (nodo instanceof Element)
                            {  
                               GuidRegistro=nodo.getTextContent().trim();  
                            }  
                        }  

                        NodeList listaNodos3 = dc01.getElementsByTagName("CodigoRespuesta");  
                        for(int i=0;i<listaNodos3.getLength();i++)
                        {  
                            Node nodo = listaNodos3.item(i);  
                            if (nodo instanceof Element)
                            {  
                               CodigoRespuesta=nodo.getTextContent().trim();  
                            }  
                        }  

                        NodeList listaNodos4 = dc01.getElementsByTagName("ComentarioRespuesta");  
                        for(int i=0;i<listaNodos4.getLength();i++)
                        {  
                            Node nodo = listaNodos4.item(i);  
                            if (nodo instanceof Element)
                            {  
                               ComentarioRespuesta=nodo.getTextContent().trim();  
                            }  
                        }  
                        
                       NodeList listaNodos5 = dc01.getElementsByTagName("Comision");  
                        for(int i=0;i<listaNodos5.getLength();i++)
                        {  
                            Node nodo = listaNodos5.item(i);  
                            if (nodo instanceof Element)
                            {  
                               Comision=nodo.getTextContent().trim();  
                            }  
                        }  
                        
                        NodeList listaNodos6 = dc01.getElementsByTagName("TransaccionT24");  
                        for(int i=0;i<listaNodos6.getLength();i++)
                        {  
                            Node nodo = listaNodos6.item(i);  
                            if (nodo instanceof Element)
                            {  
                               TransaccionT24=nodo.getTextContent().trim();  
                            }  
                        }  

                        TransferenciaOC lista = new TransferenciaOC();

                        lista.setNumeroCaso (NumeroCaso);
                        lista.setGuidRegistro(GuidRegistro);
                        lista.setCodigoRespuesta(CodigoRespuesta);
                        lista.setComentarioRespuesta(ComentarioRespuesta);        
                        lista.setComision(Comision);        
                        lista.setTransaccionT24(TransaccionT24);        

                        lista.setErrcod(Constantes.RETORNO_OKSQL.toString());
                        lista.setDefcod(Constantes.MENSAJE_OKSQL_DEF);
                        lista.setDetcod(Constantes.MENSAJE_OKSQL_DET);

                        list.add(lista);  
                    }
                    else
                    {   
                        TransferenciaOC lista = new TransferenciaOC();
                       
                        lista.setErrcod(errcod);
                        lista.setDetcod(detcod);
                        lista.setDefcod(defcod);
                        list.add(lista);   
                    } 
            }

        catch (IOException | ParserConfigurationException | DOMException | SAXException e) {
                System.err.println(e.getMessage()); 
                TransferenciaOC lista = new TransferenciaOC();                     
               
                lista.setErrcod(Constantes.HTTP_RESPUESTA_BADREQUEST.toString());
                lista.setDetcod(e.getCause().toString());
                lista.setDefcod(e.getMessage());  
                
                list.add(lista);                 
        }
        return list;
    }   
      
}
