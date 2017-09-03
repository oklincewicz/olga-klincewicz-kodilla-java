package com.kodilla.spring.portfolio;


import com.kodilla.spring.reader.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    @Scope("prototype")
    public TaskList taskToDoList () {
        return new Board().getToDoList();
    }

    @Bean
    @Scope("prototype")
    public TaskList taskInProgressList () {
        return new Board().getInProgressList();
    }

    @Bean
    @Scope("prototype")
    public TaskList taskDoneList () {
        return new Board().getDoneList();
    }

}
