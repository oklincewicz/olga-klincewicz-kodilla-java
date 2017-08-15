package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {

    private  Set<Continent> continents = new HashSet<>();

    public World( Set<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(people -> people.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

}