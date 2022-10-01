package com.calculator.entity;

import com.calculator.entity.mathoperations.*;
import lombok.Getter;

import java.util.List;

@Getter
public class StandardCalculator implements Calculator {

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
