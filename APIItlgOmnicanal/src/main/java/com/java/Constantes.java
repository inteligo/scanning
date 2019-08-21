/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

/**
 *
 * @author vrojas
 */
public class Constantes {
      
    public static final Integer RETORNO_OKSQL = 0;
    public static final Integer RETORNO_ERRORSQL = 404;
    public static final String MENSAJE_ERRORSQL_DEF = "Error en la base de datos";
    public static final String MENSAJE_ERRORSQL_DET =  "Error en la base de datos";
    public static final Integer RETORNO_NODATAINTEGRADOR=142;
    
    public static final Integer RETORNO_NODATASQL = 204;
    public static final String MENSAJE_NODATASQL_DEF = "No existe data";
    public static final String MENSAJE_NODATASQL_DET =  "No existe data";
    
    public static final String MENSAJE_OKSQL_DET = "Exitoso";
    public static final String MENSAJE_OKSQL_DEF = "Exitoso";
    public static final String MENSAJE_ERRORCONEXIONFUNCTIONCODE =  "No se puede conectar a T24";
    public static final Integer DB_CONNECTION_TIMEOUTS_SECONDS=90;
    
    //Hypertext Transfer Protocol -- HTTP/1.1 -Status Code Definitions
    public static final Integer HTTP_RESPUESTA_OK = 200; // Solicitud aceptada;
    public static final Integer HTTP_RESPUESTA_CREATED= 201; //Las operaciones PUT o POST devuelven este código de respuesta e indica que se ha creado un recurso de forma satisfactoria
    public static final Integer HTTP_RESPUESTA_NOCONTENT = 204; //Indica que se ha aceptado la solicitud, pero no había datos para devolver
    public static final Integer HTTP_RESPUESTA_BADREQUEST = 400; //La solicitud no fue válida. Este código se devuelve cuando el servidor ha intentado procesar la solicitud, pero algún aspecto de la solicitud no es válido
    public static final Integer HTTP_RESPUESTA_UNAUTHORIZED = 401; //El servidor de aplicaciones devuelve este código de respuesta cuando está habilitada la seguridad y faltaba la información de autorización en la solicitud.
    public static final Integer HTTP_RESPUESTA_FORBIDDEN = 403; //Indica que el cliente ha intentado acceder a un recurso al que no tiene acceso.
    public static final Integer HTTP_RESPUESTA_NOTFOUND = 404; //Indica que el recurso de destino no existe. Esto podría deberse a que el URI no está bien formado o a que se ha suprimido el recurso.
    public static final Integer HTTP_RESPUESTA_METHODNOTALLOWED= 405; //Se produce cuando el recurso de destino no admite el método HTTP solicitado; por ejemplo, el recurso de funciones solo permite operaciones GET.
    public static final Integer HTTP_RESPUESTA_NOTACCEPTABLE= 406; //El recurso de destino no admite el formato de datos solicitado en la cabecera de Accept o el parámetro accept. 
    public static final Integer HTTP_RESPUESTA_CONFLICT= 409; //Indica que se ha detectado un cambio conflictivo durante un intento de modificación de un recurso. 
    public static final Integer HTTP_RESPUESTA_UNSUPPORTEDMEDIATYPE=415;//El recurso de destino no admite el formato de datos del cuerpo de la solicitud especificado en la cabecera de Content-Type.
    public static final Integer HTTP_RESPUESTA_INTERNALSERVERERROR=500; //Se ha producido un error interno en el servidor. Esto podría indicar un problema con la solicitud o un problema en el código del lado del servidor
//    public static final Integer HTTP_RESPUESTA_SERVICEUNAVAILABLE=503; //El servidor actualmente no puede manejar la solicitud debido a una sobrecarga temporal o mantenimiento del servidor.
    public static final Integer HTTP_RESPUESTA_GATEWAYTIMEOUT=504; //El servidor, mientras actuaba como puerta de enlace o proxy, no recibió una respuesta oportuna del servidor ascendente especificado por el URI
      
    //INTEGRADOR
    public static final String INTEGRADOR_CHANNEL = "BZG";
    public static final String INTEGRADOR_AGENTID = "";
    public static final String INTEGRADOR_FC01 = "1";
    public static final String INTEGRADOR_FC02 = "2";
    public static final String INTEGRADOR_FC10 = "10";
    public static final String INTEGRADOR_FC12 = "12";
    public static final String INTEGRADOR_FC13 = "13";
    public static final String INTEGRADOR_FC14 = "14";
    public static final String INTEGRADOR_FC43 = "43";
    public static final String INTEGRADOR_FC44 = "44";
    public static final String INTEGRADOR_FC45= "45";
    public static final String INTEGRADOR_FC46= "46";
    public static final String INTEGRADOR_FC47 = "47";
    public static final String INTEGRADOR_FC48 = "48";
    public static final String INTEGRADOR_FC49= "49";
    public static final String INTEGRADOR_FC51= "51";
    public static final String INTEGRADOR_FC52= "52";
    public static final String INTEGRADOR_FC53= "53";
    
    public static final String TMNV360ACCOUNTDETAILS= "1";
    public static final String TMNV360TRADINGACCOUNTDETAILS= "2";
  
    public static final String VACIO = "";
    
    public static final String TWS_USERNAME= "TMSINTEGRATOR";
    public static final String TWS_PASSWORD = "A12345%b";
    public static final String TWS_COMPANY=  "BS0010001";
    public static final String TWS_COLUMNAMECHANNEL="CHANNEL";
    public static final String TWS_COLUMNAMEBZG="BZG";
    public static final String TWS_COLUMNAMEDATA="DATA";
    public static final String TWS_OPERAND="EQ";
    
    public static final Integer ESBANCOLOCAL=0;
    
    public static final String BZG_ESAUTOMATICOTRANSFEROC="1";
    public static final String BZG_CASEPROCESS="Transferencia";
    public static final String BZG_DOMAIN="domain";
    public static final String BZG_USERNAME="admon";
    
    public static final String T24_RELATIONCODE_SECUNDARY="10";
    public static final String T24_RELATIONCODE_POWEROFATHOLDER="6";
    public static final String T24_RELATIONCODE_ASESOREXTERNO="30";
    
    public static final String T24_ITLG_TRUSTEE="TRUSTEE";
    public static final String T24_ITLG_SIGNATORIE="SIGNATORIE=";
    
    public static final Integer NAMECLI_STARTLENMASK=1;
    public static final Integer NAMECLI_ENDLENMASK=3;
    
    public static final String INITIAL_CONTEXT_FACTORY="weblogic.jndi.WLInitialContextFactory";
    public static final String PROVIDER_URL="t3://localhost:7001";
    public static final String JNDI_LOOKUP_SERVICE_ITLGDWH="jndi/ITLGDWHPool";
    public static final String JNDI_LOOKUP_SERVICE_BIZAGI="jndi/BIZAGIPool";
    
    
    public static final int MAXIMUN_POOL_SIZE=10;
    public static final int MINIMUN_NUM_IDLE=5;
    
    public static final String DB_SERVER_NAME_DESA= "BNK01TS083\\ITLGDWH";   
    public static final int DB_PORT_NUMBER_DESA = 1433;
    public static final String DB_DATA_BASE_NAME_DESA= "ITLGDWH";    
    public static final String DB_USER_NAME_DESA= "pausrdbdesa"; 
    public static final String DB_PASSWORD_DESA = "Inteligo2015"; 
    
    public static final String DB_SERVER_NAME_CERT= "BNK01TS083\\ITLGDWH";   
    public static final int DB_PORT_NUMBER_CERT= 1433;
    public static final String DB_DATA_BASE_NAME_CERT= "ITLGDWH";    
    public static final String DB_USER_NAME_CERT= "pausrdbdesa"; 
    public static final String DB_PASSWORD_CERT = "Inteligo2015"; 
    
    public static final String DB_SERVER_NAME_PROD= "172.18.10.99\\ITLGDWH_INS";   
    public static final int DB_PORT_NUMBER_PROD = 1433;
    public static final String DB_DATA_BASE_NAME_PROD= "ITLGDWH";    
    public static final String DB_USER_NAME_PROD = "omnicanal"; 
    public static final String DB_PASSWORD_PROD = "Puzrxafhk%y5k1";  
    
    public static final String JDBC_URL= "jdbc:sqlserver://"; 
     
    
    
}
