package com.calculator.entity.mathoperations;

import lombok.Getter;

@Getter
public class Subtraction implements MathOperation{

    private final String name = "subtraction";

    @Override
    public double execute(double[] values) {
        return values[0] - values[1];
    }
}
