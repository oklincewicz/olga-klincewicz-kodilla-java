package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Paris", false);

        for (Map.Entry<String, Boolean> entry : airports.entrySet()) {
            String key = entry.getKey();
            Boolean value = entry.getValue();

            if(key == flight.getArrivalAirport() && value == true) {
                System.out.println("Have a nice trip");
            } else {
                throw new RouteNotFoundException("You can't flight to this airport");
            }

        }

    }

    public static void main(String[] args) {

        Flight flight = new Flight("Warsaw", "Paris");
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFilght(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Please select another destination for your flight");
        }


    }

}
