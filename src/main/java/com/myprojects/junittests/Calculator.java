package com.myprojects.junittests;

public class Calculator {
    
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    public Integer substract(Integer a, Integer b) {
        return a - b;
    }

    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division par 0 impossible !");
            return -1;
        }
        double res = a / b;
        return res;
    }
}
