package com.calculator.controller;

import com.calculator.model.mathoperations.MathOperation;
import com.calculator.service.CalculatorService;

import java.util.List;

import static com.calculator.utils.ReadUtils.readClose;
import static com.calculator.utils.ReadUtils.readOption;

public class CalculatorController {

    private final CalculatorService calculatorService = new CalculatorService();

    public void run(){
        int option;
        do {
            calculatorService.mainMenu();
            option = readOption();
            calculatorService.setCalculator(option);
            if (option == 3) break;
            calculatorService.setOperationIndex();
            List<MathOperation> operations = calculatorService.getCalculator().getOperations();
            Integer operationIndex = calculatorService.getOperationIndex();
            if(operationIndex != operations.size()) {
                double result = calculatorService.calculate();
                String formatResult = String.format("The result of the %s is %s", operations.get(operationIndex).getName(), result);
                System.out.println(formatResult);
            }
        }while (true);
        System.out.println("Thank you!");
        readClose();
    }
}
