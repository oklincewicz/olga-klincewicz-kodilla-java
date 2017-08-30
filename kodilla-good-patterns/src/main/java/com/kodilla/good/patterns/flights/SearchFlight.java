package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class SearchFlight {

    private String cityFrom;
    private String cityTo;
    FlightList flightList = new FlightList();


    public SearchFlight(String cityFrom, String cityTo) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
    }

    public void fromCity() {
        System.out.println("Flights from " + cityFrom + " ...");

        List<Flight> theResultFrom = flightList.getFlights().stream()
                .filter(x -> x.getFlightFrom().equals(cityFrom))
                .collect(Collectors.toList());
        if (theResultFrom.size() > 0) {
            theResultFrom.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("There are no flights from a given city");
        }
        System.out.println("...Search completed");
    }

    public void toCity() {
        System.out.println("Flights to " + cityTo + " ...");

        List<Flight> theResultTo = flightList.getFlights().stream()
                .filter(x -> x.getFlightTo().equals(cityTo))
                .collect(Collectors.toList());
        if (theResultTo.size() > 0) {
            theResultTo.stream()
                    .forEach(System.out::println);
        } else  {
            System.out.println("There are no flights to a given city");
        }
        System.out.println("...Search completed");
    }

    public void fromCityToCity() {
        System.out.println("Flights from " + cityFrom + " to " + cityTo + " ...");

        List<Flight> theResultFlights = flightList.getFlights().stream()
                .filter(x -> x.getFlightFrom().equals(cityFrom) && x.getFlightTo().equals(cityTo))
                .collect(Collectors.toList());

        if(theResultFlights.size() > 0) {
            theResultFlights.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("There are no flights from - to a given cities");
        }
        System.out.println("...Search completed");
    }


    public void fromCityToCityWithConnection() {
        System.out.println("Flights with connection from " + cityFrom + " to " + cityTo + " ...");

        List<Flight> theResultFlightsFrom = flightList.getFlights().stream()
                .filter(x -> x.getFlightFrom().equals(cityFrom))
                .collect(Collectors.toList());
        List<Flight> theResultFlightsTo = flightList.getFlights().stream()
                .filter(x -> x.getFlightTo().equals(cityTo))
                .collect(Collectors.toList());

        if(theResultFlightsFrom.size() > 0 && theResultFlightsTo.size() > 0) {
            for(int i = 0; i < theResultFlightsFrom.size(); i++) {
                Flight resultFrom = theResultFlightsFrom.get(i);
                for (int n = 0; n < theResultFlightsTo.size(); n++) {
                    Flight resultTo = theResultFlightsTo.get(n);
                    if (resultTo.getFlightFrom().equals(resultFrom.getFlightTo())) {
                        System.out.println(resultFrom + " - " + resultTo);
                    }
                }
            }
        } else {
            System.out.println("There are no flights from - to a given cities with connection");
        }
        System.out.println("...Search completed");
    }
}
