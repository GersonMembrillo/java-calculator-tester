package org.lessons.java;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CalculatorTest {

    private Calculator calculator;

    public CalculatorTest() {
    	this.calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        float result = calculator.add(10.0f, 10.0f);
        assertEquals(20.0f, result, 0);
    }

    @Test
    public void testSubtraction() {
        float result = calculator.subtract(10.0f, 9.0f);
        assertEquals(1.0f, result, 0);
    }

    @Test
    public void testDivision() {
        float result = calculator.divide(30.0f, 3.0f);
        assertEquals(10.0f, result, 0);
    }

    @Test
    public void testMultiplication() {
        float result = calculator.multiply(10.0f, 5.0f);
        assertEquals(50.0f, result, 0);
    }
}
