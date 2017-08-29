package com.kodilla.good.patterns.flights;

public class AppToSearchFlight {

    public static void main(String[] args) {
        SearchFlight searchFlight = new SearchFlight();

        searchFlight.cityFrom();
        searchFlight.cityTo();
        searchFlight.cityConnection();
        searchFlight.cityFromToWithConnection();

    }

}
