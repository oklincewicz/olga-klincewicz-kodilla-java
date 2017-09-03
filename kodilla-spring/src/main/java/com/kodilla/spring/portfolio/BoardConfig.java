package com.kodilla.spring.portfolio;


import com.kodilla.spring.reader.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

    @Bean
    @Scope("prototype")
    public TaskList taskToDoList () {
        List<String> tasks = new ArrayList<>();
        tasks.add("ToDo1");
        return new TaskList(tasks);
    }

    @Bean
    @Scope("prototype")
    public TaskList taskInProgressList () {
        List<String> tasks = new ArrayList<>();
        tasks.add("InProgress1");
        return new TaskList(tasks);
    }

    @Bean
    @Scope("prototype")
    public TaskList taskDoneList () {
        List<String> tasks = new ArrayList<>();
        tasks.add("Done1");
        return new TaskList(tasks);
    }

    @Bean
    public Board newBoard() {
        return new Board(taskToDoList(), taskInProgressList(), taskDoneList());
    }

}
