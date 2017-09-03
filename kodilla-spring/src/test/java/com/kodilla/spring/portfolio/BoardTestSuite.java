package com.kodilla.spring.portfolio;

import javafx.beans.binding.When;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        List<String> tasks = new ArrayList<>();

        //When
        tasks.add("ToDo2");
        tasks.add("InProgress2");
        tasks.add("Done2");

        //Then
        // ???
    }
}
