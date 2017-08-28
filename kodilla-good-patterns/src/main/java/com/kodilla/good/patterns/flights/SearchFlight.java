package com.kodilla.good.patterns.flights;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchFlight {

    FlightList flightList = new FlightList();

    public List<Flight> cityFrom() {
        try {
            List<Flight> cityListFrom = flightList.getFlights().stream()
                    .filter(x -> x.getFlightFrom().equals("WAW"))
                    .collect(Collectors.toList());
            System.out.println(cityListFrom);
            return cityListFrom;
        } catch (NullPointerException e) {
            System.out.println("There are no flights from a given city");
        }
        return null;
    }

}
