package com.learning.patterns.factory.Task;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quanity;
    private boolean status;

    public ShoppingTask(String taskName, String whatToBuy, double quanity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quanity = quanity;
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
