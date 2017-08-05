package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.Test;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        OddNumbersExterminator numbersList = new OddNumbersExterminator();
        //When
        Integer result = numbersList.exterminate(emptyList);
        //Then
        Assert.assertTrue(result % 2 == 0);
    }


    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        normalList.add(5);
        normalList.add(9);
        normalList.add(10);
        normalList.add(12);
        normalList.add(9);
        normalList.add(6);
        normalList.add(8);
        normalList.add(22);
        OddNumbersExterminator numbersList = new OddNumbersExterminator();
        //When
        Integer result = numbersList.exterminate(normalList);
        //Then
        Assert.assertTrue(result % 2 ==0);

    }
}
