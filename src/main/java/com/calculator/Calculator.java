package com.calculator;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger calculatorLogger = LogManager.getLogger(Calculator.class);

    public double squareRoot(double input) {
        calculatorLogger.info("Computing square root of " + input);
        System.out.println("Computing square root of " + input + "...");
        return Math.sqrt(input);
    }
    public double factorial(int input) {
        calculatorLogger.info("Computing factorial of " + input);
        System.out.println("Computing factorial of " + input + "...");
        if (input < 0)
            return Double.NaN;
        double ans = 1;
        for (int i=0; i<input; i++) {
            ans *= input - i;
        }
        return ans;
    }
    public double naturalLog(double input) {
        calculatorLogger.info("Computing natural log of " + input);
        System.out.println("Computing natural log of " + input + "...");
        return Math.log(input);
    }
    public double power(double input, double exponent) {
        calculatorLogger.info("Computing " + input + " power " + exponent);
        System.out.println("Computing " + input + " power " + exponent + "...");
        return Math.pow(input, exponent);
    }
    private void displayMenu() {
        calculatorLogger.info("Displaying menu");
        System.out.println("1. Square Root (x)");
        System.out.println("2. Factorial (x) ");
        System.out.println("3. Natural Logarithm (x)");
        System.out.println("4. Power (x, b)");
        System.out.println("0. Exit");

    }
    public static void main(String[] args) {
        calculatorLogger.info("Initiating Calculator");

        Calculator calculator = new Calculator();
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Welcome to the scientific calculator. Select your operation option from the following - ");

        boolean exit = false;
        while (!exit) {
            calculator.displayMenu();
            System.out.print("Enter your operation: ");

            try {
                int option = inputScanner.nextInt();
                calculatorLogger.info("User input of " + option);
                calculatorLogger.info("Option " + option);
                if (option != 0)
                    System.out.print("Enter your number(s): ");

                double arg1, arg2;
                double result = 0;

                switch (option) {
                    default:
                        calculatorLogger.info("Illegal input given");
                        exit = true;
                        System.out.println("Illegal input");
                        break;
                    case 0:
                        exit = true;
                        break;
                    case 1:
                        arg1 = inputScanner.nextDouble();
                        calculatorLogger.info("User input of " + arg1);
                        result = calculator.squareRoot(arg1);
                        break;
                    case 2:
                        arg1 = inputScanner.nextDouble();
                        calculatorLogger.info("User input of " + arg1);
                        result = calculator.factorial((int) arg1);
                        break;
                    case 3:
                        arg1 = inputScanner.nextDouble();
                        calculatorLogger.info("User input of " + arg1);
                        result = calculator.naturalLog(arg1);
                        break;
                    case 4:
                        arg1 = inputScanner.nextDouble();
                        calculatorLogger.info("User input of " + arg1);
                        arg2 = inputScanner.nextDouble();
                        calculatorLogger.info("User input of " + arg2);
                        result = calculator.power(arg1, arg2);
                        break;
                }

                if (!exit){
                    calculatorLogger.info("Operation result " + result);
                    System.out.println("Your result is " + result);
                }
                else {
                    calculatorLogger.info("Exiting");
                }
            }
            catch (Exception e) {
                calculatorLogger.info("Illegal Input");
                System.out.println("Illegal input");
                exit = true;
            }
        }
        calculatorLogger.info("Exited");
    }
}