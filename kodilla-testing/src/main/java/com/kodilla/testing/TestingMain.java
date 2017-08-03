package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simplyUser = new SimpleUser("theForumUser");

        String result = simplyUser.getUserName();

        if(result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(2, 5);
        int resultSubtract = calculator.subtract(12, 5);

        if (resultAdd == 7 && resultSubtract == 7) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
