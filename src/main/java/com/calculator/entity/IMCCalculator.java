package com.calculator.entity;

import com.calculator.mathoperations.*;
import lombok.Getter;

import java.util.List;

@Getter
public class IMCCalculator implements Calculator {

    private final List<MathOperation> operations = List.of(new IMC());

    @Override
    public double calculate(int operationIndex, double[] values) {
        MathOperation operation = this.operations.get(operationIndex);
        return operation.execute(values);
    }
}
