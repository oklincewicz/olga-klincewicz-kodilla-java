package com.kodilla.good.patterns.flights;

public class AppToSearchFlight {

    public static void main(String[] args) {
        SearchFlight searchFlight = new SearchFlight("WAW", "AMS");

        searchFlight.fromCity();
        searchFlight.toCity();
        searchFlight.fromCityToCity();
        searchFlight.fromCityToCityWithConnection();
    }

}
