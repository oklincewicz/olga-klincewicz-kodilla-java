package com.kodilla.good.patterns.flights;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchFlight {

    private String cityOne = "WAW";

    public void cityFrom() {
        System.out.println("Flights from " + cityOne + " ...");
        try {
            FlightList flightList = new FlightList();
            flightList.getFlights().stream()
                    .filter(x -> x.getFlightFrom().equals(cityOne))
                    .forEach(System.out::println);
        } catch (NullPointerException e) {
            System.out.println("There are no flights from a given city");
        }
        System.out.println("...Search completed");
    }

    public void cityTo() {
        System.out.println("Flights to " + cityOne + " ...");
        try {
            FlightList flightList = new FlightList();
            flightList.getFlights().stream()
                    .filter(x -> x.getFlightTo().equals(cityOne))
                    .forEach(System.out::println);
        } catch (NullPointerException e) {
            System.out.println("There are no flights from a given city");
        }
        System.out.println("...Search completed");
    }

    public void cityConnection() {
        System.out.println("Flights with connection " + cityOne + " ...");
        try {
            FlightList flightList = new FlightList();
            List<Flight> theResultFlightsFrom = flightList.getFlights().stream()
                    .filter(x -> x.getFlightFrom().equals(cityOne))
                    .collect(Collectors.toList());
            List<Flight> theResultFlightsTo = flightList.getFlights().stream()
                    .filter(x -> x.getFlightTo().equals(cityOne))
                    .collect(Collectors.toList());

                for(int i = 0; i < theResultFlightsTo.size(); i++) {
                    Flight resultTo = theResultFlightsTo.get(i);
                    for (int n = 0; n < theResultFlightsFrom.size(); n++) {
                        Flight resultFrom = theResultFlightsFrom.get(n);
                        if (resultTo.getFlightFrom() != resultFrom.getFlightTo()) {
                            System.out.println(resultTo + " - " + resultFrom);
                        }
                    }
                }

//            theResultFlights.stream()
//                    .filter(x -> x.getFlightFrom() != x.getFlightTo())
//                    .forEach(System.out::println);
        } catch (NullPointerException e) {
            System.out.println("There are no flights from a given city");
        }
        System.out.println("...Search completed");
    }

}
