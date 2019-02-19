package com.learning.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    TaskList taskList;

    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgressList;

    @Autowired
    @Qualifier("doneList")
    TaskList doneList;

    @Bean
    public Board foo(){
        return new Board(taskList, inProgressList, doneList);
    }

    @Bean(name="toDoList")
    @Scope("prototype")
    public TaskList getToDoList(){
        List<String> toDoList = new ArrayList<>();
        toDoList.add("ZeroOne");
        return new TaskList(toDoList);
    }

    @Bean(name="inProgressList")
    @Scope("prototype")
    public TaskList getInProgressList(){
        List<String> inProgressList = new ArrayList<>();
        inProgressList.add("ZeroTwo");
        return new TaskList(inProgressList);
    }

    @Bean(name="doneList")
    @Scope("prototype")
    public TaskList getDoneList(){
        List<String> doneList = new ArrayList<>();
        doneList.add("ZeroThree");
        return new TaskList(doneList);
    }
}
