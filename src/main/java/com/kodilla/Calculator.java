package com.kodilla;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Calculator {
    public int addAToB(int a, int b) {
        return a + b;
    }
    public int subtractAFromB(int a, int b) {
        return a - b;
    }
    public void someMethod() {
        System.out.println("It works :)");
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.someMethod();
    }
}
