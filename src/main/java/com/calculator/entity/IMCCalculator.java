package com.calculator.entity;

import com.calculator.entity.mathoperations.IMC;
import com.calculator.entity.mathoperations.MathOperation;
import lombok.Getter;

import java.util.List;

@Getter
public class IMCCalculator implements Calculator {

    private final List<MathOperation> operations = List.of(new IMC());

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
