package com.calculator.entity;

import com.calculator.entity.mathoperations.MathOperation;

import java.util.List;

public interface Calculator {

    double calculate(int operationIndex, double[] values);

    List<MathOperation> getOperations();
}
