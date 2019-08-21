package dao.sql.impl;

import com.java.Constantes;
import com.sql.HikariMsSqlITLGDWH;
import dao.sql.DaoListaDepositosCliente;
import dto.t24.services.FC44_DEPODETS;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;


public class DaoListaDepositosClienteImpl implements DaoListaDepositosCliente {

    private final HikariMsSqlITLGDWH conecta;

    public DaoListaDepositosClienteImpl() {
        this.conecta = new HikariMsSqlITLGDWH();
    }

    @Override
    public List<FC44_DEPODETS> listadepositosclienteQry(String idclie)  {
//        Integer intReturn=1;
        List<FC44_DEPODETS> list = null; 
        list = new ArrayList<>();
        
               
        String sql ="{call uspOmniListaDepositosCliente (?)}";

        Connection cn = conecta.connection();
        if (cn != null) 
            {
                try 
                    {                
                        CallableStatement cs = cn.prepareCall(sql);
                        cs.setString(1, idclie);   
                        
                        boolean results = cs.execute();
                         
                        ResultSet rs = cs.getResultSet(); 
                        
                        if (results==true)
                        {
                            if (!rs.isBeforeFirst())
                                {
                                    list.addAll(LlenaListaVacia(2));  
//                                    throw new DatosNoEncontradosExcepcion("No se encuentra el artículo");
                                }
                            else
                                {
                                    while (rs.next()) 
                                        {  
                                            FC44_DEPODETS p = new FC44_DEPODETS();
                                            p.setDepositNumber(rs.getString(1));
                                            p.setAccountingBalance(rs.getDouble(2));
                                            p.setAccountingBalanceUSD(rs.getDouble(3));
                                            p.setRate(rs.getDouble(4));
                                            p.setStartDate(rs.getString(5));
                                            p.setMaturityDate(rs.getString(6));
                                            p.setTermDays(rs.getString(7));
                                            p.setInterestFrequency(rs.getString(8));
                                            p.setNextPayment(rs.getString(9));
                                            p.setPaymentAmount(rs.getDouble(10));                       
                                            p.setAccruedInterest(rs.getDouble(11));   
                                            p.setGuaranteedAccountingBalance(rs.getDouble(12));   
                                            p.setInstructionsAtMaturity(rs.getString(13));
                                            p.setDrawdownAccount(rs.getString(14));
                                            p.setCurrency(rs.getString(15));
                                            p.setNombreMoneda(rs.getString(16));
                                            p.setSimboloMoneda(rs.getString(17));
                                            p.setIdClient(rs.getString(18));
                                            p.setCliente(rs.getString(18));
                                            p.setTipoDeposito(rs.getString(19));
                                            p.setEstitu(rs.getString(20));
                                            
                                            p.setErrcod(Constantes.RETORNO_OKSQL.toString());
                                            p.setDefcod(Constantes.MENSAJE_OKSQL_DEF);
                                            p.setDetcod(Constantes.MENSAJE_OKSQL_DET);

                                            list.add(p);
                                        }
                                }    
                        }
                        else 
                        { //Hay error en SQL                             
                            list.addAll(LlenaListaVacia(1));
                        }                       
                        cs.close();
                    } catch (SQLException e) {
                         System.out.println("error: "+ e.getMessage());
                    } finally {
                        try {                           
                            cn.close();
//                            System.out.println("error: " );
                            } 
                        catch (SQLException e) {
                    System.out.println("error: " + e.getMessage());
                }
            }
        } 
        else
        {
            list.addAll(LlenaListaVacia(1));
        }        
        return list;
    }

    @Override
    public List<FC44_DEPODETS> LlenaListaVacia(Integer tipo) {  //tipo 1: error;   2: no data
        List<FC44_DEPODETS> list = null; 
        list = new ArrayList<>();
         if (tipo.equals(null)) {  tipo=1; }
        
        FC44_DEPODETS p = new FC44_DEPODETS();
        p.setDepositNumber("");
        p.setAccountingBalance(0.00);
        p.setAccountingBalanceUSD(0.00);
        p.setRate(0.00);
        p.setStartDate("");
        p.setMaturityDate("");
        p.setTermDays("");
        p.setInterestFrequency("");
        p.setNextPayment("");
        p.setPaymentAmount(0.00);                       
        p.setAccruedInterest(0.00);   
        p.setGuaranteedAccountingBalance(0.00);   
        p.setInstructionsAtMaturity("");
        p.setDrawdownAccount("");
        p.setCurrency("");
        p.setNombreMoneda("");
        p.setSimboloMoneda("");
        p.setIdClient("");
        p.setCliente("");
        p.setTipoDeposito("");
        p.setEstitu("");
         if ( tipo.equals(1)) //error
        {
            p.setErrcod(Constantes.RETORNO_ERRORSQL.toString());
            p.setDefcod(Constantes.MENSAJE_ERRORSQL_DEF);
            p.setDetcod(Constantes.MENSAJE_ERRORSQL_DET);
        }
        else  //sin data
        {
            p.setErrcod(Constantes.RETORNO_NODATASQL.toString());
            p.setDefcod(Constantes.MENSAJE_NODATASQL_DEF);
            p.setDetcod(Constantes.MENSAJE_NODATASQL_DET);
            
//            p.setErrcod(Constantes.RETORNO_OKSQL.toString());
//            p.setDefcod(Constantes.MENSAJE_OKSQL_DEF);
//            p.setDetcod(Constantes.MENSAJE_OKSQL_DET);

        }

        list.add(p);

        return list;
    }
    
  
}
