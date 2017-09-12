package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        Assert.assertEquals("Computer", shopping.getTaskName());
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        Assert.assertEquals("Livingroom", painting.getTaskName());
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertEquals("Friday evening", driving.getTaskName());
        Assert.assertTrue(driving.isTaskExecuted());
    }
}
