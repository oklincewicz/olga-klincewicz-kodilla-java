package com.kodilla.spring.portfolio;

import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String toDoResult = board.getToDoList().getTasks().stream()
                .collect(Collectors.joining());
        String inProgressResult = board.getInProgressList().getTasks().stream()
                .collect(Collectors.joining());
        String doneResult = board.getDoneList().getTasks().stream()
                .collect(Collectors.joining());

        //Then
        Assert.assertEquals("ToDo1", toDoResult);
        Assert.assertEquals("InProgress1", inProgressResult);
        Assert.assertEquals("Done1", doneResult);

    }
}
