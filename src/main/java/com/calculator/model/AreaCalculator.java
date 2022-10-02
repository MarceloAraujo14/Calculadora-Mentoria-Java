package com.calculator.model;

import com.calculator.model.mathoperations.CircleArea;
import com.calculator.model.mathoperations.MathOperation;
import com.calculator.model.mathoperations.RectangleArea;
import com.calculator.model.mathoperations.SquareArea;
import lombok.Getter;

import java.util.List;

import static com.calculator.utils.ReadUtils.readValue;

@Getter
public class AreaCalculator implements Calculator {

    private final String name = "AREA CALCULATOR";

    private final List<MathOperation> operations = List.of(new CircleArea(), new SquareArea(), new RectangleArea());

    @Override
    public double calculate(int operationIndex) {
        try {
            MathOperation operation = this.operations.get(operationIndex);
            return operation.execute(readValues(operationIndex));
        }catch (IndexOutOfBoundsException e){
            throw new UnsupportedOperationException("Unsuported operation.");
        }
    }

    private double[] readValues(int operationIndex){
        double[] values = new double[2];
        if (operationIndex == 0){
            System.out.print("Insert the circle radius in meters: ");
            values[0] = readValue();
        }
        else {
            System.out.print("Insert the height in meters: ");
            values[0] = readValue();
            System.out.print("Insert the width in meters: ");
            values[1] = readValue();
        }

        return values;
    }

}
