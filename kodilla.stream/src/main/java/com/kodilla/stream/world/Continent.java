package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {

    private final Set<Country> countries;
    private final String continentName;

    public Continent(String continentName, Set<Country> countries ) {
        this.continentName = continentName;
        this.countries = countries;
    }

    public String getContinentName() {
        return continentName;
    }

   public Set<Country> getCountries() {
       return new HashSet<>(countries);
    }

}
