package com.calculator;

public class Calculator {

    public double squareRoot(double input) {
        System.out.println("Computing square root of " + input + "...");
        return Math.sqrt(input);
    }
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
    }
}