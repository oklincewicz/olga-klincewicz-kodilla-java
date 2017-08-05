package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public Integer exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        int temporaryValue = 0;
        if(numbers.size() != 0) {
            for (int i = 0; i < numbers.size(); i++) {
                temporaryValue = numbers.get(i);
                if (temporaryValue % 2 == 0) {
                    evenNumbers.add(temporaryValue);
                }
            }
            System.out.println("List is empty");
        }
        return null;
    }
}
