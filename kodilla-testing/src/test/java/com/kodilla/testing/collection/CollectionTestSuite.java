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
        ArrayList<Integer> result = numbersList.exterminate(emptyList);
        //Then
        Assert.assertTrue(result.isEmpty());
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
        ArrayList<Integer> result = numbersList.exterminate(normalList);
        //Then
        Assert.assertTrue(result.size() == 5);
        Assert.assertEquals(10, result.get(0).intValue());
        Assert.assertEquals(12, result.get(1).intValue());
        Assert.assertEquals(6, result.get(2).intValue());
        Assert.assertEquals(8, result.get(3).intValue());
        Assert.assertEquals(22, result.get(4).intValue());

    }
}
