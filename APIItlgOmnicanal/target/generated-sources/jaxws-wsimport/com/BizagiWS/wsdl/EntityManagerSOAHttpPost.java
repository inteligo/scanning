
package com.BizagiWS.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EntityManagerSOAHttpPost", targetNamespace = "http://tempuri.org/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EntityManagerSOAHttpPost {


    /**
     * 
     * @param entitiesInfo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String getEntitiesAsString(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "entitiesInfo")
        String entitiesInfo);

    /**
     * 
     * @param schema
     * @param entitiesInfo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String getEntitiesUsingSchemaAsString(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "entitiesInfo")
        String entitiesInfo,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "schema")
        String schema);

    /**
     * 
     * @param entityInfo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String saveEntityAsString(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "entityInfo")
        String entityInfo);

    /**
     * 
     * @param entityName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String getEntitySchemaStr(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "entityName")
        String entityName);

    /**
     * 
     * @param sxsd
     * @param idCase
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String getCaseDataUsingSchemaLiteAsString(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "idCase")
        String idCase,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sxsd")
        String sxsd);

    /**
     * 
     * @param sxsd
     * @param idCase
     * @param idWorkItem
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String getCaseDataUsingSchemaAsString(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "idCase")
        String idCase,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "idWorkItem")
        String idWorkItem,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sxsd")
        String sxsd);

    /**
     * 
     * @param sXml
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String getCaseDataUsingXPathsAsString(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sXml")
        String sXml);

    /**
     * 
     * @param entityName
     */
    @WebMethod
    public void getEntitySchema(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "entityName")
        String entityName);

    /**
     * 
     * @param entityName
     */
    @WebMethod
    public void replicateEntity(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "entityName")
        String entityName);

    /**
     * 
     */
    @WebMethod
    public void replicateAll();

}
