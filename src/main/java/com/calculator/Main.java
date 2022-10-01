package com.calculator;

import com.calculator.entity.Calculator;
import com.calculator.entity.StandardCalculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new StandardCalculator();
        String name = calculator.getOperations().get(1).getName();
        System.out.println(name);
    }
}
