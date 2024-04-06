package org.donstu.service;

import org.donstu.domain2.Computer;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

import static javax.jws.soap.SOAPBinding.ParameterStyle.WRAPPED;
import static javax.jws.soap.SOAPBinding.Style.DOCUMENT;
import static javax.jws.soap.SOAPBinding.Use.LITERAL;

@WebService(serviceName = "ReservationService", portName = "ReservationPort",
    targetNamespace = "https://donstu.org/reservation")
@SOAPBinding(style = DOCUMENT, use = LITERAL, parameterStyle = WRAPPED)
public class ReservationService {

    @WebMethod(operationName = "getFreeComputers")
    public List<Computer> getFreeComputers() {
        List<Computer> result = new ArrayList<>();
        result.add(new Computer("common", 1, 1));
        result.add(new Computer("common", 1, 2));
        result.add(new Computer("common", 2, 1));
        result.add(new Computer("VIP", 3, 1));
        result.add(new Computer("VIP", 6, 2));
        result.add(new Computer("VIP", 7, 17));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
