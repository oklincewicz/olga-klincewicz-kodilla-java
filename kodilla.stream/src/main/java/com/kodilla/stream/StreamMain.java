package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("life is beautiful", text -> text.substring(0, 7));
        poemBeautifier.beautify("life is beautiful", text -> text.toUpperCase());
        poemBeautifier.beautify("life is beautiful", text -> text.replaceFirst("life", "life with love"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}