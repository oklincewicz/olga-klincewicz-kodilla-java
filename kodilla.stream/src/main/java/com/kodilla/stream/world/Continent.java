package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {

    private final Set<Country> countries = new HashSet<>();
    private final Country country;
    private final String continentName;

    public Continent(final String continentName, final Country country) {
        this.continentName = continentName;
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public String getContinentName() {
        return continentName;
    }

   public Set<Country> getCountries() {
       return countries;
    }

}
