package com.calculator.entity.mathoperations;

import lombok.Getter;

@Getter
public class IMC implements MathOperation{

    private final String name = "IMC";

    @Override
    public double execute(double[] values) {
        double value = values[0] / (Math.pow(values[1], 2));
        return Double.parseDouble(String.format("%.1f", value));
    }
}
