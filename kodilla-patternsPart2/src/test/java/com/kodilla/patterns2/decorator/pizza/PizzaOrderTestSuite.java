package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with cheese + tomato sauce", description);
    }

    @Test
    public void testTheBestPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new TunaDecorator(theOrder);
        theOrder = new CornDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ExtraGarlicSauceDecorator(theOrder);
        theOrder = new ExtraTomatoSauceDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(33), theCost);
    }

    @Test
    public void testTheBestPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new TunaDecorator(theOrder);
        theOrder = new CornDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ExtraGarlicSauceDecorator(theOrder);
        theOrder = new ExtraTomatoSauceDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with cheese + tomato sauce + mushrooms + tuna + corn + extra cheese + extra garlic sauce + extra tomato sauce", description);
    }
}
