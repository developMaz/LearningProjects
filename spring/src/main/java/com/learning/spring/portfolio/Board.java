package com.learning.spring.portfolio;

import javafx.concurrent.Task;

public class Board {
    final private TaskList toDoList;
    final private TaskList inProgressList;
    final private TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList,
                 final TaskList doneList){
        this.doneList = doneList;
        this.inProgressList = inProgressList;
        this.toDoList = toDoList;
    }

    public String showToDoList(){
        return ("List: " + toDoList.getTaskList());
    }

    public String showInPorgressList(){
        return ("List: " + inProgressList.getTaskList());
    }

    public String showDoneTask(){
        return ("List: " + doneList.getTaskList());
    }

}
