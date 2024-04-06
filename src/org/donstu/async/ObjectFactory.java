
package org.donstu.async;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.donstu.async package. 
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

    private final static QName _GetFreeComputers_QNAME = new QName("https://donstu.org/reservation", "getFreeComputers");
    private final static QName _GetFreeComputersResponse_QNAME = new QName("https://donstu.org/reservation", "getFreeComputersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.donstu.async
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFreeComputers }
     * 
     */
    public GetFreeComputers createGetFreeComputers() {
        return new GetFreeComputers();
    }

    /**
     * Create an instance of {@link GetFreeComputersResponse }
     * 
     */
    public GetFreeComputersResponse createGetFreeComputersResponse() {
        return new GetFreeComputersResponse();
    }

    /**
     * Create an instance of {@link Computer }
     * 
     */
    public Computer createComputer() {
        return new Computer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFreeComputers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://donstu.org/reservation", name = "getFreeComputers")
    public JAXBElement<GetFreeComputers> createGetFreeComputers(GetFreeComputers value) {
        return new JAXBElement<GetFreeComputers>(_GetFreeComputers_QNAME, GetFreeComputers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFreeComputersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://donstu.org/reservation", name = "getFreeComputersResponse")
    public JAXBElement<GetFreeComputersResponse> createGetFreeComputersResponse(GetFreeComputersResponse value) {
        return new JAXBElement<GetFreeComputersResponse>(_GetFreeComputersResponse_QNAME, GetFreeComputersResponse.class, null, value);
    }

}
