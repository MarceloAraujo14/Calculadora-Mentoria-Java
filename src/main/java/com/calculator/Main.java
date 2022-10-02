package com.calculator;

import com.calculator.service.CalculatorService;

public class Main {
    public static void main(String[] args) {
        CalculatorService calculator = new CalculatorService();
        calculator.execute();
    }
}
