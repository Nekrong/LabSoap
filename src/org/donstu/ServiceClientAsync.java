package org.donstu;

import org.donstu.async.ReservationService;
import org.donstu.async.ReservationService_Service;
import org.donstu.async.GetFreeComputersResponse;
import org.donstu.async.Computer;

import javax.xml.namespace.QName;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ServiceClientAsync {
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

    public void processFreeSeats(URL url) {
        ReservationService_Service svc = new ReservationService_Service(url, FQDN);
        ReservationService port = svc.getReservationPort();
        Response<GetFreeComputersResponse> response = port.getFreeComputersAsync();
        while (!response.isDone()) {
            System.out.println("Async action...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            List<Computer> freeSeats = response.get().getReturn();
            freeSeats.forEach(seat -> System.out.println("Computer{" +
                    "room='" + seat.getRoom() + '\'' +
                    ", row=" + seat.getRow() +
                    ", computer=" + seat.getComputer() +
                    '}'));
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    class SeatsAsyncHandler implements AsyncHandler<GetFreeComputersResponse> {

        @Override
        public void handleResponse(Response<GetFreeComputersResponse> res) {
            System.out.println("Result:");

            try {
                List<Computer> freeSeats = res.get().getReturn();
                freeSeats.forEach(seat -> System.out.println("Computer{" +
                        "room='" + seat.getRoom() + '\'' +
                        ", row=" + seat.getRow() +
                        ", computers=" + seat.getComputer() +
                        '}'));
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void processFreeSeatsCallback(URL url) {
        ReservationService_Service svc = new ReservationService_Service(url, FQDN);
        ReservationService port = svc.getReservationPort();
        SeatsAsyncHandler handler = new SeatsAsyncHandler();
        Future<?> response = port.getFreeComputersAsync(handler);

        try {
            Thread.sleep(3000);
            System.out.println("3 sec passed.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        URL wsdlUrl = getWsdlUrl("http://127.0.0.1:8080/reservation?wsdl");
        ServiceClientAsync client = new ServiceClientAsync();
        client.processFreeSeats(wsdlUrl);
        client.processFreeSeatsCallback(wsdlUrl);
    }
}
