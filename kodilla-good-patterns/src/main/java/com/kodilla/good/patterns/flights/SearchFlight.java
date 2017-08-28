package com.kodilla.good.patterns.flights;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchFlight {

    public void cityFrom() {
        System.out.println("Flights from Warsaw...");
        try {
            FlightList flightList = new FlightList();
            flightList.getFlights().stream()
                    .filter(x -> x.getFlightFrom().equals("WAW"))
                    .forEach(System.out::println);
        } catch (NullPointerException e) {
            System.out.println("There are no flights from a given city");
        }
        System.out.println("...Search completed");
    }

    public void cityTo() {
        System.out.println("Flights to Warsaw...");
        try {
            FlightList flightList = new FlightList();
            flightList.getFlights().stream()
                    .filter(x -> x.getFlightTo().equals("WAW"))
                    .forEach(System.out::println);
        } catch (NullPointerException e) {
            System.out.println("There are no flights from a given city");
        }
        System.out.println("...Search completed");
    }

    public void cityConnection() {
        System.out.println("Flights with connection in Warsaw...");
        try {
            FlightList flightList = new FlightList();
            List<Flight> theResultFlights = flightList.getFlights().stream()
                    .filter(x -> x.getFlightFrom().equals("WAW") || x.getFlightTo().equals("WAW"))
                    .collect(Collectors.toList());
            theResultFlights.stream()
                    .filter(x -> x.getFlightFrom() != x.getFlightTo())
                    .forEach(System.out::println);
        } catch (NullPointerException e) {
            System.out.println("There are no flights from a given city");
        }
        System.out.println("...Search completed");
    }

}
