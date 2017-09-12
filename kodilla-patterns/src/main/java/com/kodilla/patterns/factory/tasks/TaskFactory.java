package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Computer", "New computer", 3499.99);
            case PAINTING:
                return new PaintingTask("Livingroom", "Green", "5 ltr. paint");
            case DRIVING:
                return new DrivingTask("Friday evening", "to friends", "bike");
            default:
                return null;
        }
    }
}
