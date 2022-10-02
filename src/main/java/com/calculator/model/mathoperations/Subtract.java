package com.calculator.model.mathoperations;

import lombok.Getter;

@Getter
public class Subtract implements MathOperation{

    private final String name = "subtraction";

    @Override
    public double execute(double[] values) {
        return values[0] - values[1];
    }
}
