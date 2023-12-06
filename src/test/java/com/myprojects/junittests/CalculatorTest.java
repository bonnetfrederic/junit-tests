package com.myprojects.junittests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class CalculatorTest {

    @Test
    public void calculatorSum() {
        Calculator myCalc = new Calculator();
        assertEquals(2, myCalc.sum(1, 1));
    }

    @Test
    public void calculatorSubstract() {
        Calculator myCalc = new Calculator();
        assertEquals(1, myCalc.substract(2, 1));
    }

    @Test
    public void calculatorMultiply() {
        Calculator myCalc = new Calculator();
        assertEquals(10, myCalc.multiply(2, 5));
    }

    @Test
    public void calculatorDivide() {
        Calculator myCalc = new Calculator();
        assertEquals(2, myCalc.divide(10, 5));
    }
}
