package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSiute {
    @Test
    public void testTasksUpdate() {
        //Given
        StudensTasks studentOla = new StudentOla();
        StudensTasks studentNorbert = new StudentNorbert();
        StudensTasks studentMel = new StudentMel();
        StudensTasks studentMatylda = new StudentMatylda();
        Mentor johnSmith = new Mentor("John Smith");
        Mentor bobKovalsky = new Mentor("Bob Kovalsky");
        studentMatylda.registerObserver(johnSmith);
        studentOla.registerObserver(johnSmith);
        studentMel.registerObserver(johnSmith);
        studentNorbert.registerObserver(bobKovalsky);
        //When
        studentMatylda.addTask("Task from Modul 20.1");
        studentMel.addTask("Task from Modul 20.2");
        studentOla.addTask("Task from Modul 20.3");
        studentOla.addTask("Task from Modul 20.4");
        studentNorbert.addTask("Task from Modul 20.4");
        studentNorbert.addTask("Task from Modul 20.5");
        //Then
        assertEquals(4, johnSmith.getUpdatecount());
        assertEquals(2, bobKovalsky.getUpdatecount());

    }
}
