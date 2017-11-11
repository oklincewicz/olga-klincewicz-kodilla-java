package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private String name;
    private List<Students> students;

    public Students(String name) {
        students = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Students> getStudents() {
        return students;
    }
}
