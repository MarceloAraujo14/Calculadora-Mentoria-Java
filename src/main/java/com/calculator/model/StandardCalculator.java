package com.calculator.model;

import com.calculator.model.mathoperations.*;
import lombok.Getter;

import java.util.List;

import static com.calculator.utils.ReadUtils.readValue;

@Getter
public class StandardCalculator implements Calculator {

    private final String name = "STANDARD CALCULATOR";

    private final List<MathOperation> operations = List.of(
            new Sum(), new Subtract(), new Multiply(), new Divide(), new Pow());

    @Override
    public double calculate(int operationIndex) {
        try {
            MathOperation operation = this.operations.get(operationIndex);
            return operation.execute(readValues());
        }catch (IndexOutOfBoundsException e){
            throw new UnsupportedOperationException("Unsuported operation.");
        }
    }

    private double[] readValues(){
        double[] values = new double[2];
        System.out.print("Insert the first value: ");
        values[0] = readValue();
        System.out.print("Insert the second value: ");
        values[1] = readValue();
        return values;
    }
}
