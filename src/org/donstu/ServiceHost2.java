package org.donstu;

import org.donstu.service.ReservationService;

import javax.xml.ws.Endpoint;

public class ServiceHost2 {
    public static void main(String[] args) {
        System.out.println("Starting Web service...");
        Endpoint.publish("http://127.0.0.1:8080/reservation", new ReservationService());
    }
}