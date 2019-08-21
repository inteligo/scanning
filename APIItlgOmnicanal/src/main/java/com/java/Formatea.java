/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author vrojas
 */
public class Formatea {
   
    
    public static String FormatearNumero(Double s,int cantdecimal) {
        String result = "";
        DecimalFormat df;
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        
        String pattern = "#0.00";
        
         try {
       
                    switch (cantdecimal) {
                            case 0: pattern = "#0";
                                     break;
                            case 1: pattern = "#0.0";
                                     break;
                            case 2:  pattern = "#0.00";
                                     break;
                            case 3: pattern = "#0.000";
                                     break;
                            case 4:  pattern = "#0.0000";
                                     break;
                            case 5:  pattern = "#0.00000";
                                     break;
                            case 6:  pattern = "#0.000000";
                                     break;
                            default: pattern = "#0.00";
                                     break;
                        }    

                    df=new DecimalFormat(pattern,simbolos);

                    if (!s.equals( null)) {
                        try {
                            result = df.format(s);
                        } catch (NumberFormatException ex) {
                            result="";
                        }
                    }
                        else{
                                result="0.00";
                                }

                 } catch (Exception e) {
                        result="";
          }

        return result;
    }
    
    public static double Redondear(double numero,int cantdecimal)
    {
        Double num =numero;
        Double result=0.00;
        
        Integer divisor=1;
        
        try {
        
                switch (cantdecimal) {
                        case 0: divisor=1;
                                 break;
                        case 1: divisor=10;
                                 break;
                        case 2:  divisor=100;
                                 break;
                        case 3: divisor=1000;
                                 break;
                        case 4:  divisor=10000;
                                 break;
                        case 5: divisor=100000;
                                 break;
                        case 6:  divisor=1000000;
                                 break;
                        default: divisor=100;
                                 break;
                    }      

                    if (num.equals(null)){
                        result=0.00;
                    }
                    else
                    {
                        result=Math.rint(numero*divisor)/divisor;
                    }
           } catch (Exception e) {
                        result=0.00;
          }

           return result;
    }
    
    public static String FormatearCuenta(String cuenta) {
        String result = "";     
        
        String Trading = "Trading Account";
        String Current = "Current Account";
        
         try {
       
                    switch (cuenta) {
                            case "Trading Account": 
                                    result = Trading;
                                    break;
                            case "Current Account": 
                                    result = Current;
                                    break;
                            case "Current Account Employee":  
                                    result = Current;
                                    break; 
                            default: result = cuenta;
                                     break;
                        }  

                 } catch (Exception e) {
                        result=cuenta;
          }

        return result;
    }
}
