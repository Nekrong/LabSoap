
package org.donstu.async;

import java.util.List;
import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ReservationService", targetNamespace = "https://donstu.org/reservation")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReservationService {


    /**
     * 
     * @return
     *     returns javax.xml.ws.Response<org.donstu.async.GetFreeComputersResponse>
     */
    @WebMethod(operationName = "getFreeComputers")
    @RequestWrapper(localName = "getFreeComputers", targetNamespace = "https://donstu.org/reservation", className = "org.donstu.async.GetFreeComputers")
    @ResponseWrapper(localName = "getFreeComputersResponse", targetNamespace = "https://donstu.org/reservation", className = "org.donstu.async.GetFreeComputersResponse")
    public Response<GetFreeComputersResponse> getFreeComputersAsync();

    /**
     * 
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getFreeComputers")
    @RequestWrapper(localName = "getFreeComputers", targetNamespace = "https://donstu.org/reservation", className = "org.donstu.async.GetFreeComputers")
    @ResponseWrapper(localName = "getFreeComputersResponse", targetNamespace = "https://donstu.org/reservation", className = "org.donstu.async.GetFreeComputersResponse")
    public Future<?> getFreeComputersAsync(
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<GetFreeComputersResponse> asyncHandler);

    /**
     * 
     * @return
     *     returns java.util.List<org.donstu.async.Computer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFreeComputers", targetNamespace = "https://donstu.org/reservation", className = "org.donstu.async.GetFreeComputers")
    @ResponseWrapper(localName = "getFreeComputersResponse", targetNamespace = "https://donstu.org/reservation", className = "org.donstu.async.GetFreeComputersResponse")
    @Action(input = "https://donstu.org/reservation/ReservationService/getFreeComputersRequest", output = "https://donstu.org/reservation/ReservationService/getFreeComputersResponse")
    public List<Computer> getFreeComputers();

}
