package com.example.springtestingtrainer.service;

import com.example.springtestingtrainer.service.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void canCalculatorAdd() {
        assertEquals(calculator.add(2, 4), 6);
        assertEquals(calculator.substract(6, 5), 1);
        assertNotEquals(calculator.add(5, 6), 7);
    }

    @Test
    public void canCalculatorDivide() {
        assertNull(calculator.divide(5, 0));
        assertNotNull(calculator.divide(10, 5));
    }
}
