package com.myprojects.junittests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {

    static Calculator myCalc;

    @BeforeAll
    public static void initMyCalc() {
        myCalc = new Calculator();
    }

    @Test
    public void calculatorSum() {
        assertEquals(2, myCalc.sum(1, 1));
    }

    @Test
    public void calculatorSubstract() {
        assertEquals(1, myCalc.substract(2, 1));
    }

    @Test
    public void calculatorMultiply() {
        assertEquals(10, myCalc.multiply(2, 5));
    }

    @Test
    public void calculatorDivide() {
        assertEquals(9.75, myCalc.divide(39, 4));
    }
}
