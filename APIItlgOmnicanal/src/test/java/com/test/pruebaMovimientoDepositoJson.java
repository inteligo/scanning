
package com.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dao.sql.DaoMovimientoDeposito;
import dao.sql.impl.DaoMovimientoDepositoImpl;
import dto.sql.MovimientoDeposito;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jdom2.JDOMException;


public class pruebaMovimientoDepositoJson {

    public static void main(String[] args) throws IOException, JDOMException  {
        // TODO code application logic here
        
        Gson gson =new GsonBuilder().serializeNulls().create();     
        String json="";
       
        
        DaoMovimientoDeposito movimientodeposito = new DaoMovimientoDepositoImpl();
        String id="MM1500103617";
        
        List<MovimientoDeposito> list = null;
        list = new ArrayList<>();
        
        list=movimientodeposito.movimientodepositoQry(id);
        
//        jsonObjeto=fc01.FC01List2(CustomerNo);

        json= gson.toJson(list); 
//        System.out.println(str);        
        
//        str2= fc01.FC01ACList(str);
//        System.out.println(str2);       

        
// System.out.println("acá terminan la prueba : " + new Date());
            System.out.println(json);
       

        
        
    }
    
}
