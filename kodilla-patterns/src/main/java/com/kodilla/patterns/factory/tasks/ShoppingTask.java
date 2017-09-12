package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {

    final String taskName;
    final String whatToBuy;
    final double quantity;
    boolean executedTask = false;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
