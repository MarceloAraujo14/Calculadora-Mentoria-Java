package com.calculator.model;

import com.calculator.model.mathoperations.IMC;
import com.calculator.model.mathoperations.MathOperation;
import lombok.Getter;

import java.util.List;

import static com.calculator.utils.CalculatorConstants.UNSUPORTED_OPERATION_MSG;
import static com.calculator.utils.CalculatorUtils.readValue;

@Getter
public class IMCCalculator implements Calculator {

    private final String name = "IMC CALCULATOR";

    private final List<MathOperation> operations = List.of(new IMC());

    @Override
    public double calculate(int operationIndex) {
        try {
            MathOperation operation = this.operations.get(operationIndex);
            return operation.execute(readValues());
        }catch (IndexOutOfBoundsException e){
            System.out.println(UNSUPORTED_OPERATION_MSG);
            throw new UnsupportedOperationException(UNSUPORTED_OPERATION_MSG);
        }
    }

    private double[] readValues(){
        double[] values = new double[2];
        System.out.print("Insert your weight in kg: ");
        values[0] = readValue();
        System.out.print("Insert your height in meters: ");
        values[1] = readValue();
        return values;
    }
}
