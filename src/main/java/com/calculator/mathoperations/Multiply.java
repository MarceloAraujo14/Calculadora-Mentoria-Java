package com.calculator.mathoperations;

import lombok.Getter;

@Getter
public class Multiply implements MathOperation{

    private final String name = "multiply";

    @Override
    public double execute(double[] values) {
        return values[0] * values[1];
    }
}
