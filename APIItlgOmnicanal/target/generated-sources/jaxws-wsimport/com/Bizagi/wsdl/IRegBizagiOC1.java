
package com.Bizagi.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IRegBizagiOC1", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IRegBizagiOC1 {


    /**
     * 
     * @param inputXML
     * @return
     *     returns com.Bizagi.wsdl.Response
     */
    @WebMethod(operationName = "RegistrarTransferencia", action = "http://tempuri.org/IRegBizagiOC1/RegistrarTransferencia")
    @WebResult(name = "RegistrarTransferenciaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RegistrarTransferencia", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.RegistrarTransferencia")
    @ResponseWrapper(localName = "RegistrarTransferenciaResponse", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.RegistrarTransferenciaResponse")
    public Response registrarTransferencia(
        @WebParam(name = "InputXML", targetNamespace = "http://tempuri.org/")
        String inputXML);

    /**
     * 
     * @param parametroXml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConsultarCliente", action = "http://tempuri.org/IRegBizagiOC1/ConsultarCliente")
    @WebResult(name = "ConsultarClienteResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultarCliente", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.ConsultarCliente")
    @ResponseWrapper(localName = "ConsultarClienteResponse", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.ConsultarClienteResponse")
    public String consultarCliente(
        @WebParam(name = "parametroXml", targetNamespace = "http://tempuri.org/")
        String parametroXml);

    /**
     * 
     * @param parametroXml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RegistrarTransferenciaFC3", action = "http://tempuri.org/IRegBizagiOC1/RegistrarTransferenciaFC3")
    @WebResult(name = "RegistrarTransferenciaFC3Result", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RegistrarTransferenciaFC3", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.RegistrarTransferenciaFC3")
    @ResponseWrapper(localName = "RegistrarTransferenciaFC3Response", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.RegistrarTransferenciaFC3Response")
    public String registrarTransferenciaFC3(
        @WebParam(name = "parametroXml", targetNamespace = "http://tempuri.org/")
        String parametroXml);

    /**
     * 
     * @param parametroXml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "AutorizarGlobal", action = "http://tempuri.org/IRegBizagiOC1/AutorizarGlobal")
    @WebResult(name = "AutorizarGlobalResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AutorizarGlobal", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.AutorizarGlobal")
    @ResponseWrapper(localName = "AutorizarGlobalResponse", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.AutorizarGlobalResponse")
    public String autorizarGlobal(
        @WebParam(name = "parametroXml", targetNamespace = "http://tempuri.org/")
        String parametroXml);

    /**
     * 
     * @param parametroXml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "BorrarGlobal", action = "http://tempuri.org/IRegBizagiOC1/BorrarGlobal")
    @WebResult(name = "BorrarGlobalResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "BorrarGlobal", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.BorrarGlobal")
    @ResponseWrapper(localName = "BorrarGlobalResponse", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.BorrarGlobalResponse")
    public String borrarGlobal(
        @WebParam(name = "parametroXml", targetNamespace = "http://tempuri.org/")
        String parametroXml);

    /**
     * 
     * @param parametroXml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RegistrarGlobal", action = "http://tempuri.org/IRegBizagiOC1/RegistrarGlobal")
    @WebResult(name = "RegistrarGlobalResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RegistrarGlobal", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.RegistrarGlobal")
    @ResponseWrapper(localName = "RegistrarGlobalResponse", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.RegistrarGlobalResponse")
    public String registrarGlobal(
        @WebParam(name = "parametroXml", targetNamespace = "http://tempuri.org/")
        String parametroXml);

    /**
     * 
     * @param parametroXml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConsultarCashFlow", action = "http://tempuri.org/IRegBizagiOC1/ConsultarCashFlow")
    @WebResult(name = "ConsultarCashFlowResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultarCashFlow", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.ConsultarCashFlow")
    @ResponseWrapper(localName = "ConsultarCashFlowResponse", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.ConsultarCashFlowResponse")
    public String consultarCashFlow(
        @WebParam(name = "parametroXml", targetNamespace = "http://tempuri.org/")
        String parametroXml);

    /**
     * 
     * @param parametroXml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CrearSecurityMaster", action = "http://tempuri.org/IRegBizagiOC1/CrearSecurityMaster")
    @WebResult(name = "CrearSecurityMasterResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CrearSecurityMaster", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.CrearSecurityMaster")
    @ResponseWrapper(localName = "CrearSecurityMasterResponse", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.CrearSecurityMasterResponse")
    public String crearSecurityMaster(
        @WebParam(name = "parametroXml", targetNamespace = "http://tempuri.org/")
        String parametroXml);

    /**
     * 
     * @param parametroXml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "AprobarSecurityMaster", action = "http://tempuri.org/IRegBizagiOC1/AprobarSecurityMaster")
    @WebResult(name = "AprobarSecurityMasterResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AprobarSecurityMaster", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.AprobarSecurityMaster")
    @ResponseWrapper(localName = "AprobarSecurityMasterResponse", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.AprobarSecurityMasterResponse")
    public String aprobarSecurityMaster(
        @WebParam(name = "parametroXml", targetNamespace = "http://tempuri.org/")
        String parametroXml);

    /**
     * 
     * @param parametroXml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "AprobarFundMaster", action = "http://tempuri.org/IRegBizagiOC1/AprobarFundMaster")
    @WebResult(name = "AprobarFundMasterResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AprobarFundMaster", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.AprobarFundMaster")
    @ResponseWrapper(localName = "AprobarFundMasterResponse", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.AprobarFundMasterResponse")
    public String aprobarFundMaster(
        @WebParam(name = "parametroXml", targetNamespace = "http://tempuri.org/")
        String parametroXml);

    /**
     * 
     * @param parametroXml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CrearFundMaster", action = "http://tempuri.org/IRegBizagiOC1/CrearFundMaster")
    @WebResult(name = "CrearFundMasterResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CrearFundMaster", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.CrearFundMaster")
    @ResponseWrapper(localName = "CrearFundMasterResponse", targetNamespace = "http://tempuri.org/", className = "com.Bizagi.wsdl.CrearFundMasterResponse")
    public String crearFundMaster(
        @WebParam(name = "parametroXml", targetNamespace = "http://tempuri.org/")
        String parametroXml);

}
