/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.servicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author vrojas
 */
public class EscribirFichero {
    
//    public static void main(String[] args) throws IOException {
      public void main(String[] args) throws IOException {
     try{
        
        String ruta = "./nuevoarchivo.log";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("El fichero de texto ya estaba creado.");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();
        
    }
        catch(IOException e){
        
    }
    }
}
