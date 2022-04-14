package com.calculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double error = 1e-5;
    Calculator calculator = new Calculator();

    @Test
    public void squareRootTrue(){
        assertEquals("Square root of zero", 0, calculator.squareRoot(0), error);
        assertEquals("Square root of a perfect square", 2, calculator.squareRoot(4), error);
        assertEquals("Square root of a natural number", 2.23606, calculator.squareRoot(5), error);
        assertEquals("Square root of a decimal number", 1.49534, calculator.squareRoot(2.23606), error);
        assertEquals("Square root of a negative number", Double.NaN, calculator.squareRoot(-2), error);
    }

    @Test
    public void squareRootFalse(){
        assertNotEquals("Square root of zero", 0.0001, calculator.squareRoot(0), error);
        assertNotEquals("Square root of a perfect square", 1.99, calculator.squareRoot(4), error);
        assertNotEquals("Square root of a natural number", 2.23605, calculator.squareRoot(5), error);
        assertNotEquals("Square root of a decimal number", 1.49533, calculator.squareRoot(2.23606), error);
        assertNotEquals("Square root of a negative number", 0, calculator.squareRoot(-2), error);
    }
}
