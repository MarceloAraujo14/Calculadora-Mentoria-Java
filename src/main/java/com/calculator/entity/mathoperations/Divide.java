package com.calculator.entity.mathoperations;

import lombok.Getter;

@Getter
public class Divide implements MathOperation{

    private final String name = "divide";

    @Override
    public double execute(double[] values) {
        return values[0] / values[1];
    }
}
