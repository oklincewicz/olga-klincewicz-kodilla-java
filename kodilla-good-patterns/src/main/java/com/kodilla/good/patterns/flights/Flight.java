package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String flightFrom;
    private String flightTo;

    public Flight(String flightFrom, String flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public void setFlightFrom(String flightFrom) {
        this.flightFrom = flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public void setFlightTo(String flightTo) {
        this.flightTo = flightTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (flightFrom != null ? !flightFrom.equals(flight.flightFrom) : flight.flightFrom != null) return false;
        return flightTo != null ? flightTo.equals(flight.flightTo) : flight.flightTo == null;
    }

    @Override
    public int hashCode() {
        int result = flightFrom != null ? flightFrom.hashCode() : 0;
        result = 31 * result + (flightTo != null ? flightTo.hashCode() : 0);
        return result;
    }
}
