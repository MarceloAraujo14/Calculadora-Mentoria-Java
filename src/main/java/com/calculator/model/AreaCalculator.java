package com.calculator.model;

import com.calculator.model.mathoperations.CircleArea;
import com.calculator.model.mathoperations.MathOperation;
import com.calculator.model.mathoperations.RectangleArea;
import com.calculator.model.mathoperations.SquareArea;
import lombok.Getter;

import java.util.List;

@Getter
public class AreaCalculator implements Calculator {

    private final String name = "AREA CALCULATOR";

    private final List<MathOperation> operations = List.of(new CircleArea(), new SquareArea(), new RectangleArea());

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
