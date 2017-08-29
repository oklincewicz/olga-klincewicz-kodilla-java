package com.kodilla.good.patterns.flights;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchFlight {

    private String cityOne;
    private String cityTwo;
    FlightList flightList = new FlightList();

    public SearchFlight(String cityOne, String cityTwo) {
        this.cityOne = cityOne;
        this.cityTwo = cityTwo;
    }

    public void cityFrom() {
        System.out.println("Flights from " + cityOne + " ...");
        if(flightList.getFlights().size() > 0) {
            flightList.getFlights().stream()
                    .filter(x -> x.getFlightFrom().equals(cityOne))
                    .forEach(System.out::println);
        } else {
            System.out.println("There are no flights from a given city");
        }
        System.out.println("...Search completed");
    }

    public void cityTo() {
        System.out.println("Flights to " + cityOne + " ...");
        if(flightList.getFlights().size() > 0) {
            flightList.getFlights().stream()
                    .filter(x -> x.getFlightTo().equals(cityOne))
                    .forEach(System.out::println);
        } else  {
            System.out.println("There are no flights from a given city");
        }
        System.out.println("...Search completed");
    }

    public void cityConnection() {
        System.out.println("Flights with connection " + cityOne + " ...");
        if(flightList.getFlights().size() > 0) {
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
        } else {
            System.out.println("There are no flights from a given city");
        }
        System.out.println("...Search completed");
    }

    public void cityFromToWithConnection() {
        System.out.println("Flights with connection from " + cityOne + " to " + cityTwo + " ...");
        if(flightList.getFlights().size() > 0) {
            List<Flight> theResultFlightsFrom = flightList.getFlights().stream()
                    .filter(x -> x.getFlightFrom().equals(cityOne))
                    .collect(Collectors.toList());
            List<Flight> theResultFlightsTo = flightList.getFlights().stream()
                    .filter(x -> x.getFlightTo().equals(cityTwo))
                    .collect(Collectors.toList());

            for(int i = 0; i < theResultFlightsFrom.size(); i++) {
                Flight resultFrom = theResultFlightsFrom.get(i);
                for (int n = 0; n < theResultFlightsTo.size(); n++) {
                    Flight resultTo = theResultFlightsTo.get(n);
                    if (resultTo.getFlightFrom() == resultFrom.getFlightTo()) {
                        System.out.println(resultFrom + " - " + resultTo);
                    }
                }
            }
        } else {
            System.out.println("There are no flights from a given city");
        }
        System.out.println("...Search completed");
    }

}
