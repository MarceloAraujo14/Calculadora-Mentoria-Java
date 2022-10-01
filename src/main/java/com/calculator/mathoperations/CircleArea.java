package com.calculator.mathoperations;

import lombok.Getter;

@Getter
public class CircleArea implements MathOperation{

    private final String name = "circle area";

    @Override
    public double execute(double[] values) {
        double value = Math.PI * Math.pow(values[0], 2);
        return Double.parseDouble(String.format("%.5f", value));
    }
}
