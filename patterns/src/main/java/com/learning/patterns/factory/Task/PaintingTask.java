package com.learning.patterns.factory.Task;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPain;
    private boolean status;

    public PaintingTask(String taskName, String color, String whatToPain) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPain = whatToPain;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing task: " + taskName);
        status = true;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return status;
    }


}
