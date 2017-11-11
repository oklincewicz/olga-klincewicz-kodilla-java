package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Mentor implements Observer {
    private final String username;
    private int updatecount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(StudensTasks studensTasks) {
            System.out.println(username + ": New topic in course: " + studensTasks.getName() + "\n" + " (total: " + studensTasks.getMessages().size() + " tasks)");
            updatecount++;
        }

    public String getUsername() {
        return username;
    }

    public int getUpdatecount() {
        return updatecount;
    }
}
