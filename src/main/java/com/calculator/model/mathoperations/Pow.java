package com.calculator.model.mathoperations;

import lombok.Getter;

@Getter
public class Pow implements MathOperation{

    private final String name = "pow";

    @Override
    public double execute(double[] values) {
        return Math.pow(values[0], values[1]);
    }
}
