/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;
import java.util.UUID;

public class GeneraUUID {
    
    public static String CodigoUUID() {
        UUID idOne = UUID.randomUUID();
        return idOne.toString();
    }  
    
}
