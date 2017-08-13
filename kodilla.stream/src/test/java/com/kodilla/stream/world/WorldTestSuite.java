package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Set<Continent> continents = new HashSet<>();
        continents.add(new Continent("Europe", (new Country("Poland", new BigDecimal("38432992")))));
        continents.add(new Continent("Europe", (new Country("France", new BigDecimal("66318000")))));
        continents.add(new Continent("Europe", (new Country("UK", new BigDecimal("65110000")))));
        continents.add(new Continent("South America", (new Country("Chile", new BigDecimal("18096847")))));
        continents.add(new Continent("South America", (new Country("Brasil", new BigDecimal("207848000")))));
        continents.add(new Continent("South America", (new Country("Columbia", new BigDecimal("48229000")))));
        continents.add(new Continent("Asia", (new Country("China", new BigDecimal("1360720000")))));
        continents.add(new Continent("Asia", (new Country("Japan", new BigDecimal("127110047")))));
        continents.add(new Continent("Asia", (new Country("South Korea", new BigDecimal("50801405")))));
        continents.add(new Continent("Asia", (new Country("Thailand", new BigDecimal("67091089")))));

        //When
        BigDecimal totalPeople = BigDecimal.ZERO;
        for(Continent people: continents) {
            totalPeople = world.getPeopleQuantity();
        }

        //Then
        BigDecimal expectedPeople = new BigDecimal("2049757380");
        Assert.assertEquals(expectedPeople, totalPeople);
    }
}
