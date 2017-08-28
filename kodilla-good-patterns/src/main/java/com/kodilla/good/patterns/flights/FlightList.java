package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public final class FlightList {

    private final List<Flight> flights = new ArrayList<>();

    public FlightList() {
        flights.add(new Flight("KRK", "WAW"));
        flights.add(new Flight("WAW", "AMS"));
        flights.add(new Flight("AMS", "JFK"));
        flights.add(new Flight("GDN", "WAW"));
        flights.add(new Flight("WAW", "BRU"));
        flights.add(new Flight("AMS", "SYD"));
    }

    public List<Flight> getFlights() {
        return new ArrayList<>(flights);
    }

}
