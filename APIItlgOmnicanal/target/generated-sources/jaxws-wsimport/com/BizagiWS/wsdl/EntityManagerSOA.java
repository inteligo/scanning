
package com.BizagiWS.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EntityManagerSOA", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://172.18.10.95/bpm/WebServices/EntityManagerSOA.asmx?wsdl")
public class EntityManagerSOA
    extends Service
{

    private final static URL ENTITYMANAGERSOA_WSDL_LOCATION;
    private final static WebServiceException ENTITYMANAGERSOA_EXCEPTION;
    private final static QName ENTITYMANAGERSOA_QNAME = new QName("http://tempuri.org/", "EntityManagerSOA");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://172.18.10.95/bpm/WebServices/EntityManagerSOA.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ENTITYMANAGERSOA_WSDL_LOCATION = url;
        ENTITYMANAGERSOA_EXCEPTION = e;
    }

    public EntityManagerSOA() {
        super(__getWsdlLocation(), ENTITYMANAGERSOA_QNAME);
    }

    public EntityManagerSOA(WebServiceFeature... features) {
        super(__getWsdlLocation(), ENTITYMANAGERSOA_QNAME, features);
    }

    public EntityManagerSOA(URL wsdlLocation) {
        super(wsdlLocation, ENTITYMANAGERSOA_QNAME);
    }

    public EntityManagerSOA(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ENTITYMANAGERSOA_QNAME, features);
    }

    public EntityManagerSOA(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EntityManagerSOA(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EntityManagerSOASoap
     */
    @WebEndpoint(name = "EntityManagerSOASoap")
    public EntityManagerSOASoap getEntityManagerSOASoap() {
        return super.getPort(new QName("http://tempuri.org/", "EntityManagerSOASoap"), EntityManagerSOASoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EntityManagerSOASoap
     */
    @WebEndpoint(name = "EntityManagerSOASoap")
    public EntityManagerSOASoap getEntityManagerSOASoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "EntityManagerSOASoap"), EntityManagerSOASoap.class, features);
    }

    /**
     * 
     * @return
     *     returns EntityManagerSOASoap
     */
    @WebEndpoint(name = "EntityManagerSOASoap12")
    public EntityManagerSOASoap getEntityManagerSOASoap12() {
        return super.getPort(new QName("http://tempuri.org/", "EntityManagerSOASoap12"), EntityManagerSOASoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EntityManagerSOASoap
     */
    @WebEndpoint(name = "EntityManagerSOASoap12")
    public EntityManagerSOASoap getEntityManagerSOASoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "EntityManagerSOASoap12"), EntityManagerSOASoap.class, features);
    }

    /**
     * 
     * @return
     *     returns EntityManagerSOAHttpGet
     */
    @WebEndpoint(name = "EntityManagerSOAHttpGet")
    public EntityManagerSOAHttpGet getEntityManagerSOAHttpGet() {
        return super.getPort(new QName("http://tempuri.org/", "EntityManagerSOAHttpGet"), EntityManagerSOAHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EntityManagerSOAHttpGet
     */
    @WebEndpoint(name = "EntityManagerSOAHttpGet")
    public EntityManagerSOAHttpGet getEntityManagerSOAHttpGet(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "EntityManagerSOAHttpGet"), EntityManagerSOAHttpGet.class, features);
    }

    /**
     * 
     * @return
     *     returns EntityManagerSOAHttpPost
     */
    @WebEndpoint(name = "EntityManagerSOAHttpPost")
    public EntityManagerSOAHttpPost getEntityManagerSOAHttpPost() {
        return super.getPort(new QName("http://tempuri.org/", "EntityManagerSOAHttpPost"), EntityManagerSOAHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EntityManagerSOAHttpPost
     */
    @WebEndpoint(name = "EntityManagerSOAHttpPost")
    public EntityManagerSOAHttpPost getEntityManagerSOAHttpPost(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "EntityManagerSOAHttpPost"), EntityManagerSOAHttpPost.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ENTITYMANAGERSOA_EXCEPTION!= null) {
            throw ENTITYMANAGERSOA_EXCEPTION;
        }
        return ENTITYMANAGERSOA_WSDL_LOCATION;
    }

}
