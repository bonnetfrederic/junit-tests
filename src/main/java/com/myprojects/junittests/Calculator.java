package com.myprojects.junittests;

public class Calculator {
    
    public Integer sum(Integer a, Integer b) {
        return a + b;
    }

    public Integer substract(Integer a, Integer b) {
        return a - b;
    }

    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    public float divide(Integer a, Integer b) {
        if (b == 0) {
            System.out.println("Division par 0 impossible !");
            return 0;
        }
        float res = a / b;
        return res;
    }
}
