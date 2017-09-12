package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task{

    final String taskName;
    final String color;
    final String whatToBuy;
    boolean executedTask = false;

    public PaintingTask(final String taskName, final String color, final String whatToBuy) {
        this.taskName = taskName;
        this.color = color;
        this.whatToBuy = whatToBuy;
    }

    @Override
    public void executeTask() {
        System.out.println("Task is done");
        executedTask = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executedTask;
    }
}
