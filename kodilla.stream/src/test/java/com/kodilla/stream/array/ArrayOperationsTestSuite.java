package com.kodilla.stream.array;


import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import com.kodilla.stream.array.ArrayOperations;

import java.util.Arrays;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int numbers[] = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;


        //When
        double average = ArrayOperations.getAverage(numbers);


        //Then
        Assert.assertEquals(30, average, 0.01);


    }
}
