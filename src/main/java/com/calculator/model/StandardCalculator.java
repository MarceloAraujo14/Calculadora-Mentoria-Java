package com.calculator.model;

import com.calculator.model.mathoperations.*;
import lombok.Getter;

import java.util.List;

@Getter
public class StandardCalculator implements Calculator {

    private final String name = "STANDARD CALCULATOR";

    private final List<MathOperation> operations = List.of(new Sum(), new Subtraction(), new Multiply(), new Divide(), new Pow());

    @Override
    public double calculate(int operationIndex, double[] values) {
        try {
            MathOperation operation = this.operations.get(operationIndex);
            return operation.execute(values);
        }catch (IndexOutOfBoundsException e){
            throw new UnsupportedOperationException("Unsuported operation.");
        }
    }
}
