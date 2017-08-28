package com.kodilla.good.patterns.flights;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchFlight {

    public void cityFrom() {
        try {
            FlightList flightList = new FlightList();
            flightList.getFlights().stream()
                    .filter(x -> x.getFlightFrom().equals("WAW"))
                    .forEach(System.out::println);
        } catch (NullPointerException e) {
            System.out.println("There are no flights from a given city");
        }
        System.out.println("Search completed");
    }

}
