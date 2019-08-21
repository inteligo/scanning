package com.t24.services.impl;

import com.java.Constantes;
import com.t24.services.FCRetorno;
import dto.t24.services.FCReturn;
import java.io.IOException;
import java.util.List;
import org.jdom2.input.SAXBuilder;
import java.io.StringReader;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.xml.sax.InputSource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class FCRetornoImpl implements FCRetorno  {  
        
    
    @Override
    public List<FCReturn> ListaRetorno (String xmlString) {
       
        String errcod="";
        String detcod="";
        String defcod="";
        
        List<FCReturn> list = null;
        list = new ArrayList<>();
        
        try {                  
                        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
                        DocumentBuilder builderf = factory.newDocumentBuilder(); //el documento        

                        Document dc01 =   builderf.parse( new InputSource( new StringReader( xmlString ) ) ); 
                       
                        // Buscamos una etiqueta dentro del XML  
                        NodeList listaNodos = dc01.getElementsByTagName("returncode");  
                        for(int i=0;i<listaNodos.getLength();i++){  
                           Node nodo = listaNodos.item(i);  
                           if (nodo instanceof Element){  
                              errcod=nodo.getTextContent().trim();  
                           }  
                        }  

                        NodeList listaNodos2 = dc01.getElementsByTagName("returndesc");  
                        for(int i=0;i<listaNodos2.getLength();i++){  
                           Node nodo = listaNodos2.item(i);  
                           if (nodo instanceof Element){  
                              detcod=nodo.getTextContent().trim();  
                           }  
                        }  

                        NodeList listaNodos3 = dc01.getElementsByTagName("message");  
                        for(int i=0;i<listaNodos3.getLength();i++){  
                           Node nodo = listaNodos3.item(i);  
                           if (nodo instanceof Element){  
                              defcod=nodo.getTextContent().trim();  
                           }  
                        }  
                        
                        if    (errcod.equals(Constantes.RETORNO_NODATAINTEGRADOR.toString()))
                                {
                                     errcod=Constantes.RETORNO_NODATASQL.toString();
                                     detcod=Constantes.MENSAJE_NODATASQL_DET;
                                     defcod  =Constantes.MENSAJE_NODATASQL_DEF;       
                                }                                
                      
                        FCReturn lista = new FCReturn();

                        lista.setErrcod(errcod);
                        lista.setDetcod(detcod);
                        lista.setDefcod(defcod);     

                        list.add(lista);    
                         
            }

        catch (IOException | ParserConfigurationException | DOMException | SAXException e) {
                System.err.println(e.getMessage());    
                FCReturn lista = new FCReturn();

                lista.setErrcod(Constantes.HTTP_RESPUESTA_BADREQUEST.toString());
                lista.setDetcod(e.getCause().toString());
                lista.setDefcod(e.getMessage());     

                list.add(lista);    
        
      }
        return list;
    }
   
      
}
