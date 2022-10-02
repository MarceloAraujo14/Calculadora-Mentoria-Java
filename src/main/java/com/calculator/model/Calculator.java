package com.calculator.model;

import com.calculator.model.mathoperations.MathOperation;

import java.util.List;

public interface Calculator {

    double calculate(int operationIndex, double[] values);

    List<MathOperation> getOperations();

    String getName();
}
