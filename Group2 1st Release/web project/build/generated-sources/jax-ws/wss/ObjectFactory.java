
package wss;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wss package. 
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

    private final static QName _FBandGPsignin_QNAME = new QName("http://WSS/", "FBandGPsignin");
    private final static QName _FBandGPsigninResponse_QNAME = new QName("http://WSS/", "FBandGPsigninResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wss
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FBandGPsigninResponse }
     * 
     */
    public FBandGPsigninResponse createFBandGPsigninResponse() {
        return new FBandGPsigninResponse();
    }

    /**
     * Create an instance of {@link FBandGPsignin }
     * 
     */
    public FBandGPsignin createFBandGPsignin() {
        return new FBandGPsignin();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FBandGPsignin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "FBandGPsignin")
    public JAXBElement<FBandGPsignin> createFBandGPsignin(FBandGPsignin value) {
        return new JAXBElement<FBandGPsignin>(_FBandGPsignin_QNAME, FBandGPsignin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FBandGPsigninResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "FBandGPsigninResponse")
    public JAXBElement<FBandGPsigninResponse> createFBandGPsigninResponse(FBandGPsigninResponse value) {
        return new JAXBElement<FBandGPsigninResponse>(_FBandGPsigninResponse_QNAME, FBandGPsigninResponse.class, null, value);
    }

}
