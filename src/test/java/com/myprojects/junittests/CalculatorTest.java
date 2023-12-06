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
}
