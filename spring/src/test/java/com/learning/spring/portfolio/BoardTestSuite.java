package com.learning.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        String toDoList = board.showToDoList();
        String inProgressList = board.showInPorgressList();
        String doneList = board.showDoneTask();
        //Then
        assertEquals("List: [ZeroOne]", toDoList);
        assertEquals("List: [ZeroTwo]", inProgressList);
        assertEquals("List: [ZeroThree]", doneList);


    }
}
