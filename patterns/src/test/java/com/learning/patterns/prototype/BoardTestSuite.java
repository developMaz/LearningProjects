package com.learning.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BoardTestSuite {

    @Test
    public void testToString() {
        //given
        TaskList listToDo = new TaskList("To Do Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To Do Task number " + n)));

        TaskList listInProgress = new TaskList("In progress");
        IntStream.iterate(1, n -> n +1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In Progress Tasks number " + n)));

        TaskList listDone   = new TaskList("Completed");
        IntStream.iterate(1, n -> n +1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("Done Tasks number " + n)));

        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);
        System.out.println(board);

        //shallow copy
        Board clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep copy
        Board deepClonedBoard = null;
        try {
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        //When
        //board.getLists().remove(listToDo);
        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);
        Assert.assertEquals(3, board.getLists().size());
        Assert.assertEquals(3, clonedBoard.getLists().size());
        Assert.assertEquals(3, deepClonedBoard.getLists().size());
        Assert.assertEquals(clonedBoard.getLists(), board.getLists());
        Assert.assertNotEquals(deepClonedBoard.getLists(), board.getLists());
    }
}
