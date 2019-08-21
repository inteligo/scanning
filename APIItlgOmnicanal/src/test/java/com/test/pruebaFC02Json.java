package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.t24.services.FC02Tipo1;
import com.t24.services.impl.FC02Tipo1Impl;
import dto.t24.services.FC02_ACCCUST;
import java.util.List;



public class pruebaFC02Json {

    public static void main(String[] args) {
         Gson gson =new GsonBuilder().serializeNulls().create();
        

        String str=null;
       
        
        FC02Tipo1 fc02 = new FC02Tipo1Impl();
        String AccountNo="1000121017";
           
        str= fc02.FC02Str(AccountNo);
        
        List<FC02_ACCCUST> list = null;   
        
        list= fc02.FC02ACCCUST(str, AccountNo);
       
       
        
        String json="";
        json= gson.toJson(list);
        System.out.println("list");   
        System.out.println(json); 

        
// System.out.println("acá terminan la prueba : " + new Date());
//            System.out.println(cadena);
       

        
        
    }
    
}
