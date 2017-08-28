package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightList {

    public List<Flight> getFlights() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("KRK", "WAW"));
        flights.add(new Flight("WAW", "AMS"));
        flights.add(new Flight("AMS", "JFK"));
        flights.add(new Flight("GDN", "WAW"));
        flights.add(new Flight("WAW", "BRU"));
        flights.add(new Flight("AMS", "SYD"));
        return new ArrayList<>(flights);
    }

}
