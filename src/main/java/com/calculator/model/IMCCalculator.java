package com.calculator.model;

import com.calculator.model.mathoperations.IMC;
import com.calculator.model.mathoperations.MathOperation;
import lombok.Getter;

import java.util.List;

@Getter
public class IMCCalculator implements Calculator {

    private final String name = "IMC CALCULATOR";

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
