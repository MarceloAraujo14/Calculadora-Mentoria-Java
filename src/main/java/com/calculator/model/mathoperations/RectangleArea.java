package com.calculator.model.mathoperations;

import lombok.Getter;

@Getter
public class RectangleArea implements MathOperation{

    private final String name = "rectangle area";

    @Override
    public double execute(double[] values) {
        double value =  values[0] * values[1];
        return Double.parseDouble(String.format("%.5f", value));
    }
}
