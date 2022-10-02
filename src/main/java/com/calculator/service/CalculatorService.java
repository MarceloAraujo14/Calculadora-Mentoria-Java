package com.calculator.service;

import com.calculator.model.Calculator;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CalculatorService {

    private Calculator calculator;

    public double calculate(int operation, double[] values){
        return calculator.calculate(operation, values);
    }

}
