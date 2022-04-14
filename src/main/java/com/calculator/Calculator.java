package com.calculator;

public class Calculator {

    public double squareRoot(double input) {
        System.out.println("Computing square root of " + input + "...");
        return Math.sqrt(input);
    }
    public Long factorial(int input) {
        System.out.println("Computing factorial of " + input + "...");
        if (input < 0)
            return null;
        long ans = 1;
        for (int i=0; i<input; i++) {
            ans *= input - i;
        }
        return ans;
    }

    public double naturalLog(double input) {
        System.out.println("Computing natural log of " + input + "...");
        return Math.log(input);
    }

    public double power(double input, double exponent) {
        System.out.println("Computing " + input + " power " + exponent + "...");
        return Math.pow(input, exponent);
    }
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

    }
}