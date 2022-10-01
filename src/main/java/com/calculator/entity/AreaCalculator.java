package com.calculator.entity;

import com.calculator.entity.mathoperations.CircleArea;
import com.calculator.entity.mathoperations.MathOperation;
import com.calculator.entity.mathoperations.RectangleArea;
import com.calculator.entity.mathoperations.SquareArea;
import lombok.Getter;

import java.util.List;

@Getter
public class AreaCalculator implements Calculator {

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
