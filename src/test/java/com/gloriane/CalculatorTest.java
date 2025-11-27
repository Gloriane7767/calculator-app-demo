package com.gloriane;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testAddition() {
        assertEquals(15.0, Calculator.add(new int[]{5, 10}));
        assertEquals(30.0, Calculator.add(new int[]{10, 5, 15}));
        assertEquals(-5.0, Calculator.add(new int[]{-10, 5}));
        assertEquals(0.0, Calculator.add(new int[]{0, 0}));
        assertEquals(0.0, Calculator.add(new int[]{})); // empty array
    }

    @Test
    void testSubtraction() {
        assertEquals(-5.0, Calculator.subtract(new int[]{5, 10}));
        assertEquals(-10.0, Calculator.subtract(new int[]{10, 5, 15}));
        assertEquals(-15.0, Calculator.subtract(new int[]{-10, 5}));
        assertEquals(0.0, Calculator.subtract(new int[]{})); // empty array
        assertEquals(5.0, Calculator.subtract(new int[]{5})); // single number
    }

    @Test
    void testMultiplication() {
        assertEquals(50.0, Calculator.multiply(new int[]{5, 10}));
        assertEquals(750.0, Calculator.multiply(new int[]{10, 5, 15}));
        assertEquals(-50.0, Calculator.multiply(new int[]{-10, 5}));
        assertEquals(0.0, Calculator.multiply(new int[]{})); // empty array
        assertEquals(5.0, Calculator.multiply(new int[]{5})); // single number
        assertEquals(0.0, Calculator.multiply(new int[]{5, 0, 10})); // with zero
    }

    @Test
    void testDivision() {
        assertEquals(2.0, Calculator.divide(10, 5));
        assertEquals(0.5, Calculator.divide(5, 10));
        assertEquals(-2.0, Calculator.divide(-10, 5));
        assertEquals(0.0, Calculator.divide(0, 5)); // zero dividend
        assertTrue(Double.isInfinite(Calculator.divide(5, 0))); // division by zero
    }
}
