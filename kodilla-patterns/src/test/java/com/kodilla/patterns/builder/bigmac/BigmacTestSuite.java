package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testNewBimac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .setRoll("z sezamem")
                .setBurgers(2)
                .setSauce("majonezowy")
                .setIngredients("pomidor")
                .setIngredients("ser żółty")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(2, howManyIngredients);
    }
}
