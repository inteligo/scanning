
package com.test;

import com.java.GeneraUUID;


public class pruebaGeneraUUID {

    public static void main(String[] args) throws NullPointerException  {
        String guid=null;        
        
        guid=GeneraUUID.CodigoUUID();        
        System.out.println(guid);          
    }
    
}
