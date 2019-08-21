package com.t24.services.impl;

import com.java.Constantes;
import com.t24.services.FCResponse;
import dto.t24.services.FCReturn;
import java.util.List;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FCResponseImpl implements FCResponse  {          
    
    @Override
    public List<FCReturn> ListaRetorno (String jsonstring) {
        
        String errcod="";
        String detcod="";
        String defcod="";
        
        List<FCReturn> list = null;
        list = new ArrayList<>();
        
        try {                  
                        JSONArray jsonObj = new JSONArray(jsonstring);                     
                          for (int i = 0; i < jsonObj.length(); i++) 
                                {                                   
                                    JSONObject rec = jsonObj.optJSONObject(i);
                                    if (rec.optString("zerorec").trim().equals(Constantes.HTTP_RESPUESTA_NOTFOUND.toString()))
                                    {
                                         errcod=rec.optString("zerorec").trim();
                                         detcod=rec.optString("messages").trim();
                                         defcod=rec.optString("messages").trim();         
                                        
//                                         errcod=Constantes.HTTP_RESPUESTA_NOTFOUND.toString();
//                                         detcod=Constantes.MENSAJE_ERRORCONEXIONFUNCTIONCODE.toString();
//                                         defcod=Constantes.MENSAJE_ERRORCONEXIONFUNCTIONCODE.toString();
                                    }
                                    else if (rec.optString("zerorec").trim().equals(Constantes.RETORNO_NODATASQL.toString())){
                                         errcod=Constantes.RETORNO_NODATASQL.toString();
                                        detcod=Constantes.MENSAJE_NODATASQL_DET;
                                        defcod=Constantes.MENSAJE_NODATASQL_DEF;
                                    }
                                    else
                                    {
                                        errcod=Constantes.RETORNO_OKSQL.toString();
                                        detcod=Constantes.MENSAJE_OKSQL_DET;
                                        defcod=Constantes.MENSAJE_OKSQL_DEF;
                                        
                                    }
                                    
                                    
//                                    if (rec.optString("zerorec").trim().equals(""))
//                                    {
//                                        errcod=Constantes.RETORNO_OKSQL.toString();
//                                        detcod=Constantes.MENSAJE_OKSQL_DET.toString();
//                                        defcod=Constantes.MENSAJE_OKSQL_DET.toString();
//                                    }
//                                    else if (rec.optString("zerorec").trim().equals(Constantes.HTTP_RESPUESTA_NOTFOUND.toString()))
//                                    {
//                                         errcod=rec.optString("zerorec").trim();
//                                         detcod=rec.optString("messages").trim();
//                                         defcod=rec.optString("messages").trim();
//                                    }
//                                    else
//                                    {
//                                        errcod=Constantes.HTTP_RESPUESTA_NOTFOUND.toString();
//                                        if (rec.optString("messages").trim().equals("")){
//                                             detcod=rec.optString("zerorec").trim();
//                                            defcod=rec.optString("zerorec").trim();
//                                        }
//                                        else{
//                                            detcod=rec.optString("messages").trim();
//                                            defcod=rec.optString("messages").trim();
//                                        }
//                                    }                                     
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

        catch (JSONException e) {
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
