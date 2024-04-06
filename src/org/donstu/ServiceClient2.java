package org.donstu;

import org.donstu.clienttwo.ReservationService;
import org.donstu.clienttwo.ReservationService_Service;
import org.donstu.clienttwo.Computer;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class ServiceClient2 {
    private static final QName FQDN = new QName("https://donstu.org/reservation", "ReservationService");

    private static URL getWsdlUrl(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return url;
    }

    public void processFreePlaces(URL url) {
        ReservationService_Service svc = new ReservationService_Service(url, FQDN);
        ReservationService port = svc.getReservationPort();
        List<Computer> freePlaces = port.getFreeComputers();
        freePlaces.forEach(place -> System.out.println("Place{" +
                "room='" + place.getRoom() + '\'' +
                ", row=" + place.getRow() +
                ", computer=" + place.getComputer() +
                '}'));
    }

    public static void main(String[] args) {
        URL wsdlUrl = getWsdlUrl("http://127.0.0.1:8080/reservation?wsdl");
        ServiceClient2 client = new ServiceClient2();
        client.processFreePlaces(wsdlUrl);
    }
}
