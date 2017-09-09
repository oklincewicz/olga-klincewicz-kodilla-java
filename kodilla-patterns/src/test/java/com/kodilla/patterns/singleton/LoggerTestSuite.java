package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLog() {
        //Given
        //When
        Logger.getInstance().log("login");
        //Then
        //do nothing
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("login", result);
    }
}
