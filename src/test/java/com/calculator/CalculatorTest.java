package com.calculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double error = 1e-5;
    Calculator calculator = new Calculator();

    @Test
    public void squareRootTrue(){
        assertEquals("Square root of 0", 0, calculator.squareRoot(0), error);
        assertEquals("Square root of a perfect square", 2, calculator.squareRoot(4), error);
        assertEquals("Square root of a natural number", 2.23606, calculator.squareRoot(5), error);
        assertEquals("Square root of a decimal number", 1.49534, calculator.squareRoot(2.23606), error);
        assertEquals("Square root of a negative number", Double.NaN, calculator.squareRoot(-2), error);
    }

    @Test
    public void squareRootFalse(){
        assertNotEquals("Square root of 0", 0.0001, calculator.squareRoot(0), error);
        assertNotEquals("Square root of a perfect square", 1.99, calculator.squareRoot(4), error);
        assertNotEquals("Square root of a natural number", 2.23605, calculator.squareRoot(5), error);
        assertNotEquals("Square root of a decimal number", 1.49533, calculator.squareRoot(2.23606), error);
        assertNotEquals("Square root of a negative number", 0, calculator.squareRoot(-2), error);
    }

    @Test
    public void factorialTrue(){
        assertEquals("Factorial of 0", 1, calculator.factorial(0), error);
        assertEquals("Factorial of 1", 1, calculator.factorial(1), error);
        assertEquals("Factorial of 2", 2, calculator.factorial(2), error);
        assertNull("Factorial of negative number", calculator.factorial(-1));
        assertEquals("Factorial of 20", 2.43290200817664E18, calculator.factorial(20), error);
    }

    @Test
    public void factorialFalse(){
        assertNotEquals("Factorial of 0", 0, calculator.factorial(0), error);
        assertNotEquals("Factorial of 1", 0, calculator.factorial(1), error);
        assertNotEquals("Factorial of negative number", 1, calculator.factorial(5), error);
        assertNotNull("Factorial of 5", calculator.factorial(5));
        assertNotEquals("Factorial of 20", 2.43290200817665E18, calculator.factorial(20), error);
    }

    @Test
    public void naturalLogTrue(){
        assertEquals("Natural Log of 0", Double.NEGATIVE_INFINITY, calculator.naturalLog(0), error);
        assertEquals("Natural Log of a negative number", Double.NaN, calculator.naturalLog(-1), error);
        assertEquals("Natural Log of a fraction", -9.21034, calculator.naturalLog(1e-4), error);
        assertEquals("Natural Log of a decimal number", 1.43508, calculator.naturalLog(4.2), error);
        assertEquals("Natural Log of e", 1, calculator.naturalLog(Math.E), error);
    }

    @Test
    public void naturalLogFalse(){
        assertNotEquals("Natural Log of 0", 0, calculator.naturalLog(0), error);
        assertNotEquals("Natural Log of a negative number", Double.NEGATIVE_INFINITY, calculator.naturalLog(-1), error);
        assertNotEquals("Natural Log of a fraction", -9.21033, calculator.naturalLog(1e-4), error);
        assertNotEquals("Natural Log of a decimal number", 1.43507, calculator.naturalLog(4.2), error);
        assertNotEquals("Natural Log of e", 1.00001, calculator.naturalLog(Math.E), error);
    }
}
