package com.learning.patterns.factory.Task;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;
    private boolean status;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
