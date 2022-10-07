package com.calculator.view;

import com.calculator.model.Calculator;

import java.util.List;

import static com.calculator.generator.MenuGenerator.*;

public class CalculatorView {

    private Calculator calculator;

    public void buildMainMenu(List<String> calculatorMenu){
        System.out.println();
        System.out.println(buildHeaderWithTitle("CALCULATOR"));
        System.out.println(buildMainMenuOptions(calculatorMenu));
        System.out.print("Select the calculator type: ");
    }

    public void buildOperationsMenu() {
        System.out.println();
        System.out.println(buildHeaderWithTitle(calculator.getName()));
        System.out.println(buildOperationMenuOptions(calculator.getOperations()));
        System.out.print("Select the operation: ");
    }

    public void showResult(double result, int operationIndex) {
        System.out.printf("%nThe result of the %s is %s%n%n", calculator.getOperations().get(operationIndex).getName(), result);
    }

    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }


}
