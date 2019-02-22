package com.learning.patterns.factory.Task;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String task){
        switch (task){
            case DRIVING:
                return new DrivingTask("New course", "Railway Station", "Bus");
            case PAINTING:
                return new PaintingTask("New painting", "White", "Walls");
            case SHOPPING:
                return new ShoppingTask("Go to shopping", "New pair of shoes", 1);
            default:
                return null;
        }
    }
}

