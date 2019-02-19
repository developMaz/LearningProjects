package com.learning.spring.portfolio;

import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList(List<String> tasks){
        this.tasks = tasks;
    }

    public List<String> getTaskList(){
        return tasks;
    }

}
