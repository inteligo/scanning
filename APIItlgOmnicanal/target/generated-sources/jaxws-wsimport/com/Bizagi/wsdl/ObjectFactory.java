
package com.Bizagi.wsdl;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.Bizagi.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Response_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfRegistroTransfe", "Response");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _CrearSecurityMasterParametroXml_QNAME = new QName("http://tempuri.org/", "parametroXml");
    private final static QName _BorrarGlobalResponseBorrarGlobalResult_QNAME = new QName("http://tempuri.org/", "BorrarGlobalResult");
    private final static QName _ConsultarClienteResponseConsultarClienteResult_QNAME = new QName("http://tempuri.org/", "ConsultarClienteResult");
    private final static QName _AutorizarGlobalResponseAutorizarGlobalResult_QNAME = new QName("http://tempuri.org/", "AutorizarGlobalResult");
    private final static QName _RegistrarTransferenciaResponseRegistrarTransferenciaResult_QNAME = new QName("http://tempuri.org/", "RegistrarTransferenciaResult");
    private final static QName _CrearSecurityMasterResponseCrearSecurityMasterResult_QNAME = new QName("http://tempuri.org/", "CrearSecurityMasterResult");
    private final static QName _RegistrarTransferenciaFC3ResponseRegistrarTransferenciaFC3Result_QNAME = new QName("http://tempuri.org/", "RegistrarTransferenciaFC3Result");
    private final static QName _RegistrarTransferenciaInputXML_QNAME = new QName("http://tempuri.org/", "InputXML");
    private final static QName _AprobarFundMasterResponseAprobarFundMasterResult_QNAME = new QName("http://tempuri.org/", "AprobarFundMasterResult");
    private final static QName _ResponseErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfRegistroTransfe", "ErrorMessage");
    private final static QName _ResponseRespuesta_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfRegistroTransfe", "Respuesta");
    private final static QName _ResponseErrorCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfRegistroTransfe", "ErrorCode");
    private final static QName _ConsultarCashFlowResponseConsultarCashFlowResult_QNAME = new QName("http://tempuri.org/", "ConsultarCashFlowResult");
    private final static QName _AprobarSecurityMasterResponseAprobarSecurityMasterResult_QNAME = new QName("http://tempuri.org/", "AprobarSecurityMasterResult");
    private final static QName _CrearFundMasterResponseCrearFundMasterResult_QNAME = new QName("http://tempuri.org/", "CrearFundMasterResult");
    private final static QName _RegistrarGlobalResponseRegistrarGlobalResult_QNAME = new QName("http://tempuri.org/", "RegistrarGlobalResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.Bizagi.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AprobarSecurityMaster }
     * 
     */
    public AprobarSecurityMaster createAprobarSecurityMaster() {
        return new AprobarSecurityMaster();
    }

    /**
     * Create an instance of {@link RegistrarGlobalResponse }
     * 
     */
    public RegistrarGlobalResponse createRegistrarGlobalResponse() {
        return new RegistrarGlobalResponse();
    }

    /**
     * Create an instance of {@link CrearFundMasterResponse }
     * 
     */
    public CrearFundMasterResponse createCrearFundMasterResponse() {
        return new CrearFundMasterResponse();
    }

    /**
     * Create an instance of {@link RegistrarTransferenciaResponse }
     * 
     */
    public RegistrarTransferenciaResponse createRegistrarTransferenciaResponse() {
        return new RegistrarTransferenciaResponse();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link AprobarSecurityMasterResponse }
     * 
     */
    public AprobarSecurityMasterResponse createAprobarSecurityMasterResponse() {
        return new AprobarSecurityMasterResponse();
    }

    /**
     * Create an instance of {@link ConsultarCashFlowResponse }
     * 
     */
    public ConsultarCashFlowResponse createConsultarCashFlowResponse() {
        return new ConsultarCashFlowResponse();
    }

    /**
     * Create an instance of {@link CrearFundMaster }
     * 
     */
    public CrearFundMaster createCrearFundMaster() {
        return new CrearFundMaster();
    }

    /**
     * Create an instance of {@link RegistrarTransferencia }
     * 
     */
    public RegistrarTransferencia createRegistrarTransferencia() {
        return new RegistrarTransferencia();
    }

    /**
     * Create an instance of {@link BorrarGlobal }
     * 
     */
    public BorrarGlobal createBorrarGlobal() {
        return new BorrarGlobal();
    }

    /**
     * Create an instance of {@link CrearSecurityMasterResponse }
     * 
     */
    public CrearSecurityMasterResponse createCrearSecurityMasterResponse() {
        return new CrearSecurityMasterResponse();
    }

    /**
     * Create an instance of {@link RegistrarTransferenciaFC3Response }
     * 
     */
    public RegistrarTransferenciaFC3Response createRegistrarTransferenciaFC3Response() {
        return new RegistrarTransferenciaFC3Response();
    }

    /**
     * Create an instance of {@link AprobarFundMaster }
     * 
     */
    public AprobarFundMaster createAprobarFundMaster() {
        return new AprobarFundMaster();
    }

    /**
     * Create an instance of {@link RegistrarGlobal }
     * 
     */
    public RegistrarGlobal createRegistrarGlobal() {
        return new RegistrarGlobal();
    }

    /**
     * Create an instance of {@link BorrarGlobalResponse }
     * 
     */
    public BorrarGlobalResponse createBorrarGlobalResponse() {
        return new BorrarGlobalResponse();
    }

    /**
     * Create an instance of {@link ConsultarClienteResponse }
     * 
     */
    public ConsultarClienteResponse createConsultarClienteResponse() {
        return new ConsultarClienteResponse();
    }

    /**
     * Create an instance of {@link AprobarFundMasterResponse }
     * 
     */
    public AprobarFundMasterResponse createAprobarFundMasterResponse() {
        return new AprobarFundMasterResponse();
    }

    /**
     * Create an instance of {@link RegistrarTransferenciaFC3 }
     * 
     */
    public RegistrarTransferenciaFC3 createRegistrarTransferenciaFC3() {
        return new RegistrarTransferenciaFC3();
    }

    /**
     * Create an instance of {@link ConsultarCliente }
     * 
     */
    public ConsultarCliente createConsultarCliente() {
        return new ConsultarCliente();
    }

    /**
     * Create an instance of {@link AutorizarGlobal }
     * 
     */
    public AutorizarGlobal createAutorizarGlobal() {
        return new AutorizarGlobal();
    }

    /**
     * Create an instance of {@link CrearSecurityMaster }
     * 
     */
    public CrearSecurityMaster createCrearSecurityMaster() {
        return new CrearSecurityMaster();
    }

    /**
     * Create an instance of {@link AutorizarGlobalResponse }
     * 
     */
    public AutorizarGlobalResponse createAutorizarGlobalResponse() {
        return new AutorizarGlobalResponse();
    }

    /**
     * Create an instance of {@link ConsultarCashFlow }
     * 
     */
    public ConsultarCashFlow createConsultarCashFlow() {
        return new ConsultarCashFlow();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfRegistroTransfe", name = "Response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parametroXml", scope = CrearSecurityMaster.class)
    public JAXBElement<String> createCrearSecurityMasterParametroXml(String value) {
        return new JAXBElement<String>(_CrearSecurityMasterParametroXml_QNAME, String.class, CrearSecurityMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parametroXml", scope = RegistrarGlobal.class)
    public JAXBElement<String> createRegistrarGlobalParametroXml(String value) {
        return new JAXBElement<String>(_CrearSecurityMasterParametroXml_QNAME, String.class, RegistrarGlobal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parametroXml", scope = AprobarFundMaster.class)
    public JAXBElement<String> createAprobarFundMasterParametroXml(String value) {
        return new JAXBElement<String>(_CrearSecurityMasterParametroXml_QNAME, String.class, AprobarFundMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BorrarGlobalResult", scope = BorrarGlobalResponse.class)
    public JAXBElement<String> createBorrarGlobalResponseBorrarGlobalResult(String value) {
        return new JAXBElement<String>(_BorrarGlobalResponseBorrarGlobalResult_QNAME, String.class, BorrarGlobalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarClienteResult", scope = ConsultarClienteResponse.class)
    public JAXBElement<String> createConsultarClienteResponseConsultarClienteResult(String value) {
        return new JAXBElement<String>(_ConsultarClienteResponseConsultarClienteResult_QNAME, String.class, ConsultarClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parametroXml", scope = AprobarSecurityMaster.class)
    public JAXBElement<String> createAprobarSecurityMasterParametroXml(String value) {
        return new JAXBElement<String>(_CrearSecurityMasterParametroXml_QNAME, String.class, AprobarSecurityMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AutorizarGlobalResult", scope = AutorizarGlobalResponse.class)
    public JAXBElement<String> createAutorizarGlobalResponseAutorizarGlobalResult(String value) {
        return new JAXBElement<String>(_AutorizarGlobalResponseAutorizarGlobalResult_QNAME, String.class, AutorizarGlobalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parametroXml", scope = ConsultarCliente.class)
    public JAXBElement<String> createConsultarClienteParametroXml(String value) {
        return new JAXBElement<String>(_CrearSecurityMasterParametroXml_QNAME, String.class, ConsultarCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegistrarTransferenciaResult", scope = RegistrarTransferenciaResponse.class)
    public JAXBElement<Response> createRegistrarTransferenciaResponseRegistrarTransferenciaResult(Response value) {
        return new JAXBElement<Response>(_RegistrarTransferenciaResponseRegistrarTransferenciaResult_QNAME, Response.class, RegistrarTransferenciaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CrearSecurityMasterResult", scope = CrearSecurityMasterResponse.class)
    public JAXBElement<String> createCrearSecurityMasterResponseCrearSecurityMasterResult(String value) {
        return new JAXBElement<String>(_CrearSecurityMasterResponseCrearSecurityMasterResult_QNAME, String.class, CrearSecurityMasterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegistrarTransferenciaFC3Result", scope = RegistrarTransferenciaFC3Response.class)
    public JAXBElement<String> createRegistrarTransferenciaFC3ResponseRegistrarTransferenciaFC3Result(String value) {
        return new JAXBElement<String>(_RegistrarTransferenciaFC3ResponseRegistrarTransferenciaFC3Result_QNAME, String.class, RegistrarTransferenciaFC3Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InputXML", scope = RegistrarTransferencia.class)
    public JAXBElement<String> createRegistrarTransferenciaInputXML(String value) {
        return new JAXBElement<String>(_RegistrarTransferenciaInputXML_QNAME, String.class, RegistrarTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AprobarFundMasterResult", scope = AprobarFundMasterResponse.class)
    public JAXBElement<String> createAprobarFundMasterResponseAprobarFundMasterResult(String value) {
        return new JAXBElement<String>(_AprobarFundMasterResponseAprobarFundMasterResult_QNAME, String.class, AprobarFundMasterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfRegistroTransfe", name = "ErrorMessage", scope = Response.class)
    public JAXBElement<String> createResponseErrorMessage(String value) {
        return new JAXBElement<String>(_ResponseErrorMessage_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfRegistroTransfe", name = "Respuesta", scope = Response.class)
    public JAXBElement<String> createResponseRespuesta(String value) {
        return new JAXBElement<String>(_ResponseRespuesta_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfRegistroTransfe", name = "ErrorCode", scope = Response.class)
    public JAXBElement<String> createResponseErrorCode(String value) {
        return new JAXBElement<String>(_ResponseErrorCode_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarCashFlowResult", scope = ConsultarCashFlowResponse.class)
    public JAXBElement<String> createConsultarCashFlowResponseConsultarCashFlowResult(String value) {
        return new JAXBElement<String>(_ConsultarCashFlowResponseConsultarCashFlowResult_QNAME, String.class, ConsultarCashFlowResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parametroXml", scope = BorrarGlobal.class)
    public JAXBElement<String> createBorrarGlobalParametroXml(String value) {
        return new JAXBElement<String>(_CrearSecurityMasterParametroXml_QNAME, String.class, BorrarGlobal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AprobarSecurityMasterResult", scope = AprobarSecurityMasterResponse.class)
    public JAXBElement<String> createAprobarSecurityMasterResponseAprobarSecurityMasterResult(String value) {
        return new JAXBElement<String>(_AprobarSecurityMasterResponseAprobarSecurityMasterResult_QNAME, String.class, AprobarSecurityMasterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CrearFundMasterResult", scope = CrearFundMasterResponse.class)
    public JAXBElement<String> createCrearFundMasterResponseCrearFundMasterResult(String value) {
        return new JAXBElement<String>(_CrearFundMasterResponseCrearFundMasterResult_QNAME, String.class, CrearFundMasterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parametroXml", scope = RegistrarTransferenciaFC3 .class)
    public JAXBElement<String> createRegistrarTransferenciaFC3ParametroXml(String value) {
        return new JAXBElement<String>(_CrearSecurityMasterParametroXml_QNAME, String.class, RegistrarTransferenciaFC3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parametroXml", scope = CrearFundMaster.class)
    public JAXBElement<String> createCrearFundMasterParametroXml(String value) {
        return new JAXBElement<String>(_CrearSecurityMasterParametroXml_QNAME, String.class, CrearFundMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parametroXml", scope = AutorizarGlobal.class)
    public JAXBElement<String> createAutorizarGlobalParametroXml(String value) {
        return new JAXBElement<String>(_CrearSecurityMasterParametroXml_QNAME, String.class, AutorizarGlobal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parametroXml", scope = ConsultarCashFlow.class)
    public JAXBElement<String> createConsultarCashFlowParametroXml(String value) {
        return new JAXBElement<String>(_CrearSecurityMasterParametroXml_QNAME, String.class, ConsultarCashFlow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegistrarGlobalResult", scope = RegistrarGlobalResponse.class)
    public JAXBElement<String> createRegistrarGlobalResponseRegistrarGlobalResult(String value) {
        return new JAXBElement<String>(_RegistrarGlobalResponseRegistrarGlobalResult_QNAME, String.class, RegistrarGlobalResponse.class, value);
    }

}
