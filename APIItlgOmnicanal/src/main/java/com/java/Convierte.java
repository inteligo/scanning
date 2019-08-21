package com.java;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Convierte {
    
     /*
* 
* Metodo que corta la cadena json para devolver cadena en formato array
     */
    public String putToObjectJson(String cadena, String iniof, String finof) 
    {
        String resultado = "";
        int iniofinal = 0;
        int finofinal = 0;
        try {
//                   iniof = cadena.indexOf("\"row\"");
//                   finof = cadena.indexOf(",\"columnsCount" );
            iniofinal = cadena.indexOf(iniof);
            finofinal = cadena.indexOf(finof);
            cadena = cadena.substring(iniofinal, finofinal);
            resultado = "{" + cadena + "}";

        } catch (Exception e) {
            resultado="";
        }
        return resultado;
    }

    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
    

    public static Integer aInteger(String s) {
        Integer result = null;

        if (s != null) {
            try {
                result = Integer.valueOf(s);
            } catch (NumberFormatException ex) {
            }
        }

        return result;
    }
    
//    if(strwb != ""){
//                            Double wb = Double.parseDouble( strwb.replace(",","") );
//                            lista.setWorkingBal(wb);
//                    }else{
//                            lista.setWorkingBal(0.00);
//                    }

    public static Double NumStringaDouble(String s) {
        Double result = 0.00;
        
           try {
        
                    if (s.equals(null)){
                        s="0";
                    }

                    if (!s.equals(null)) {
                        try {
                            result = Double.parseDouble( s.replace(",","") );
                        } catch (NumberFormatException ex) 
                        {
                            result = 0.00;
                        }
                    }else if(!s.equals("")){
                        try {
                            result = Double.parseDouble( s.replace(",","") );
                        } catch (NumberFormatException ex) 
                        {
                            result = 0.00;
                        } 
                    }else{           
                           result = 0.00;     
                                }

               } catch (Exception e) {
                        result=0.00;
          }

        return result;
    }

    public static Timestamp aTimestamp(String fechahora) {
        Timestamp result = null;

        SimpleDateFormat sdf
                = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        sdf.setLenient(false);
        
        try {
            java.util.Date ufechahora = sdf.parse(fechahora);
            result = new java.sql.Timestamp(ufechahora.getTime());
        } catch (ParseException ex) {
        }

        return result;
    }
    
     public static Timestamp straDate(String fecha) {
        Timestamp result = null;
        
        if (fecha== null || fecha== "") {
            fecha="19000101";
        }

        SimpleDateFormat sdf
                = new SimpleDateFormat("yyyyMMdd");
        sdf.setLenient(false);
        
        try {
            java.util.Date ufecha = sdf.parse(fecha);
            result = new java.sql.Timestamp(ufecha.getTime());
        } catch (ParseException ex) {
            
            result=null;
        }

        return result;
    }
    
    public static String FecStraDateStr(String fecha) {
        
        String result = "";
        
        String strfecha=null;
        String strdia=null;
        String strmes=null;
        String stranio=null;
        String stranio4digitos=null;
        Integer intlongfecha=null;
        Integer anio=null;
          try {
     
                if (fecha.equals(null) || fecha.equals("") )
                {
                    result="19000101";
                }
                else{
                    strfecha=fecha.trim();

                    intlongfecha=strfecha.length();

                    strdia=strfecha.substring(0,2).trim();
                    strmes=strfecha.substring(3,6).trim();
                    stranio=strfecha.substring(7,intlongfecha).trim();

                    anio=Integer.parseInt(stranio);

                    if (anio<100){
                        anio=anio+2000;
                        stranio4digitos=anio.toString();
                    }
                    else{
                        stranio4digitos=stranio;
                    }

                    String month = null;

                    switch (strmes) {
                        case "JAN":  month = "01";
                                 break;
                        case "FEB":  month = "02";
                                 break;
                        case "MAR":  month = "03";
                                 break;
                        case "APR":  month = "04";
                                 break;
                        case "MAY":  month = "05";
                                 break;
                        case "JUN":  month = "06";
                                 break;
                        case "JUL":  month = "07";
                                 break;
                        case "AUG":  month = "08";
                                 break;
                        case "SEP":  month = "09";
                                 break;
                        case "OCT": month = "10";
                                 break;
                        case "NOV": month = "11";
                                 break;
                        case "DEC": month = "12";
                                 break;
                        default: month = "NN";
                                 break;
                    }

                    result=stranio4digitos+""+month+""+strdia;
                }
                 } catch (NumberFormatException e) {
               result="19000101";
        }
        return result;
    }
    
     public static String NullaVacio(String dato) {
        String result = "";    
        
         try {            
                if (dato.equals(null))
                   {
                     result = "";
                    }
                else
                {
                    result=dato.trim();
                }
          } catch (Exception e) {
                        result="";
          }
       
        return result;
    }
     
      public static String VacioaCadena(Object dato) {
        String result = "";   
        
          try {    
        
                    if (dato.equals(null))
                       {
                         result = "";
                        }
                    else 
                    {
                        if (dato.toString().isEmpty())
                       {
                         result = "";
                        }
                        else{
                             result=dato.toString();
                        }
                    }
                 } catch (Exception e) {
                        result="";
                 }
       
        return result;
    }
     
      public static Double absDouble(Double s) {
        Double result = 0.00;

        if (!s.equals(null)) {
            try {
                result = Math.abs(s);
            } catch (NumberFormatException ex) {
            }
        }

        return result;
    }
      
       public static String DatetoStr(String fecha) {
        String result = "";   
        
            try {           
                    if (fecha.equals("19000101"))
                     {
                         result="";
                     }  
                     else
                     {
                         result=fecha;
                      }   
                } catch (Exception e) {
                        result="";
                 }
           
        return result;
    }
       
    public static boolean isValidDate(String inDate) 
        {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            try {
              dateFormat.parse(inDate.trim());
            } catch (ParseException pe) {
              return false;
        }
    return true;
  }   

    public Convierte() {
    }
    
     public static String CondicionFirma(String grupo, String condicion) {
        String result = condicion;
        String[] lista=null;
        
        try {
        
            if (condicion== null || grupo==null ) {
                result = condicion;
            }    
            
            if(condicion.contains("ý")) {
                lista = condicion.split("ý");
             }
            else if(condicion.contains("@"))
            {
                lista = condicion.split("@");
            }
           
                   
            switch (grupo.toUpperCase()) {
            
                case "GRUPO A":
                    for (int i = 0; i < lista.length; i++) 
                    {                
                       if ("1A".equals(lista[i]))
                       {
                          result="1A";  
                       }               
                    }
                     break;
                case "GRUPO B":
                    for (int i = 0; i < lista.length; i++) 
                    {                
                       if ("1B".equals(lista[i]))
                       {
                          result="1A";  
                       }               
                    }
                     break;
                case "GRUPO C":
                    for (int i = 0; i < lista.length; i++) 
                    {                
                       if ("1C".equals(lista[i]))
                       {
                          result="1A";  
                       }               
                    }
                     break;
                case "GRUPO D":
                    for (int i = 0; i < lista.length; i++) 
                    {                
                       if ("1D".equals(lista[i]))
                       {
                          result="1A";  
                       }               
                    }
                     break;
                case "":
                    result=condicion;
                    break;
            }
           
        } catch (Exception ex) {            
            result=condicion;
        }
        return result;  
    }
     
     public static String TitularoFirmante(String relation) {
        String result = relation;      
        
        try {
        
            if (relation== null  ) {
                result = relation;
            }    
                                       
            switch (relation.toUpperCase()) {            
                case Constantes.T24_RELATIONCODE_SECUNDARY:                    
                     result="T";                      
                     break;
                case Constantes.T24_RELATIONCODE_POWEROFATHOLDER:                   
                     result="F";                      
                     break;
                case Constantes.T24_RELATIONCODE_ASESOREXTERNO:                    
                     result="F";                       
                     break;               
                default:
                    result="F";
                    break;
            }
           
        } catch (Exception ex) {            
            result=relation;
        }
        return result;  
    }
     
     public static String TrusteeoSignatorie(String ItlgCustType, String RelationCode) {
        String result = ItlgCustType;      
        
        try {
        
            if (ItlgCustType== null  ) {
                result = ItlgCustType;
            }    
                                       
            switch (ItlgCustType.toUpperCase()) {            
                case Constantes.T24_ITLG_TRUSTEE:                    
                     result="T";                      
                     break;
                case Constantes.T24_ITLG_SIGNATORIE:                   
                     result="F";                      
                     break;                      
                case "":
                    result=TitularoFirmante(RelationCode);
                    break;
                default:
                    result="F";  
                    break;
            }           
        } catch (Exception ex) {            
            result=ItlgCustType;
        }
        return result;  
    }
     
     public static String EnmascaraNombreTodo(String Name,int startlen, int endlen ) {
        String result = Name;      
        
        try {
        
            if (Name== null  ) {
                result = "";
            }    
                                       
//            long starttime = System.currentTimeMillis();
            int total = Name.length();
           
            int masklen = total-(startlen + endlen) ;
            StringBuilder maskedbuf = new StringBuilder(Name.substring(0,startlen));
            for(int i=0;i<masklen;i++) {
                maskedbuf.append('X');
            }
            maskedbuf.append(Name.substring(startlen+masklen, total));
            String masked = maskedbuf.toString();

            result= masked;
           
        } catch (Exception ex) {            
            result=Name;
        }
        return result;  
    }
     
      public static String EnmascaraNombre(String Name,int startlen, int endlen ) {
        String result = Name;      
        
        try {
        
            if (Name== null  ) {
                result = "";
            }                                           

            int intfin = startlen+endlen;
            String[] items =Name.split(" ");
            String nombre="";
            
            StringBuilder mask= new StringBuilder("");
            
            for(int i=startlen;i<intfin;i++) {
                mask.append('X');
            }
           
           
            for(int i=0;i<items.length;i++) 
            {
                StringBuilder nombreR= new StringBuilder("");
                StringBuilder maskedbuf = new StringBuilder(items[i]);
                if (maskedbuf.length()>intfin)
                    {
                        nombreR = maskedbuf.replace(startlen, intfin,mask.toString());
                    }
                else
                    {
                        nombreR=maskedbuf;
                    }
                nombre=nombre + " " +nombreR;
            }           

            result= nombre;
           
        } catch (Exception ex) {            
            result=Name;
        }
        return result;  
    }
}
