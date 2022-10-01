package com.calculator.mathoperations;

import lombok.Getter;

@Getter
public class Sum implements MathOperation {

    private final String name = "sum";

    @Override
    public double execute(double[] values) {
        return values[0] + values[1];
    }
}
