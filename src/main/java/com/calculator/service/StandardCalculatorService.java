package com.calculator.service;

import com.calculator.entity.StandardCalculator;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StandardCalculatorService {

    private final StandardCalculator calculator;

    public double calculate(int operation, double[] values){
        return calculator.calculate(operation, values);
    }

}
