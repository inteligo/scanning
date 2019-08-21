/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author vrojas
 */
public class OperacionesFecha {
   
     public static Integer intFechaHoy(){
      Integer intfecha =null;
      Date date=new Date();
      
      SimpleDateFormat sdf
                = new SimpleDateFormat("yyyyMMdd");
        sdf.setLenient(false);
//        
//          GregorianCalendar calendar = new GregorianCalendar();
//      calendar.setGregorianChange(date); 

        String strfecha= sdf.format(new Date());
            
        intfecha = Integer.parseInt(strfecha);
        
//        Timestamp fecha = sdf.parse(date.getTime());
         
    
      
//      fecha=Integer.parseInt(calendar.getTime().toString());

      return intfecha;
   }
    
    public static Date RestarDias(Date date,int dias){
      GregorianCalendar calendar = new GregorianCalendar();
      calendar.setGregorianChange(date); 
      calendar.add(GregorianCalendar.DATE, - dias);      

      return calendar.getTime();
   }
    
     public static Date SumarDias(Date date,int dias){
      GregorianCalendar calendar = new GregorianCalendar();
      calendar.setGregorianChange(date); 
      calendar.add(GregorianCalendar.DATE, + dias);      

      return calendar.getTime();
   }

    
}
