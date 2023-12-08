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
    public void testCalculatorSum() {
        assertEquals(2, myCalc.add(1, 1));
    }

    @Test
    public void testCalculatorSubstract() {
        assertEquals(1, myCalc.substract(2, 1));
    }

    @Test
    public void testCalculatorMultiply() {
        assertEquals(10, myCalc.multiply(2, 5));
    }

    @Test
    public void testCalculatorDivide() {
        assertEquals(9.75, myCalc.divide(39, 4));
    }
}
