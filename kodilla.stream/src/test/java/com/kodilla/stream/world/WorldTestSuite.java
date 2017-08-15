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
        Set<Continent> continents = new HashSet<>();
        Set<Country> countriesEurope = new HashSet<>();
        Set<Country> countriesSouthAmerica = new HashSet<>();
        Set<Country> countriesAsia = new HashSet<>();

        Country poland = new Country("Poland", new BigDecimal("38432992"));
        Country france = new Country("France", new BigDecimal("66318000"));
        Country uk = new Country("UK", new BigDecimal("65110000"));
        countriesEurope.add(poland);
        countriesEurope.add(france);
        countriesEurope.add(uk);

        Country chile = new Country("Chile", new BigDecimal("18096847"));
        Country brasil = new Country("Brasil", new BigDecimal("207848000"));
        Country columbia = new Country("Columbia", new BigDecimal("48229000"));
        countriesSouthAmerica.add(chile);
        countriesSouthAmerica.add(brasil);
        countriesSouthAmerica.add(columbia);

        Country china = new Country("China", new BigDecimal("1360720000"));
        Country japan = new Country("Japan", new BigDecimal("127110047"));
        Country southKorea = new Country("South Korea", new BigDecimal("50801405"));
        Country thailand = new Country("Thailand", new BigDecimal("67091089"));
        countriesAsia.add(china);
        countriesAsia.add(japan);
        countriesAsia.add(southKorea);
        countriesAsia.add(thailand);

        continents.add(new Continent("Europe", countriesEurope));
        continents.add(new Continent("South America", countriesSouthAmerica));
        continents.add(new Continent("Asia", countriesAsia));

        World world = new World(continents);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("2049757380");
        Assert.assertEquals(expectedPeople, totalPeople);
    }
}
