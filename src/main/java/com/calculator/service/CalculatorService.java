package com.calculator.service;

import com.calculator.model.AreaCalculator;
import com.calculator.model.Calculator;
import com.calculator.model.IMCCalculator;
import com.calculator.model.StandardCalculator;
import com.calculator.model.mathoperations.MathOperation;
import lombok.Getter;

import java.util.List;
import java.util.Objects;

import static com.calculator.generator.MenuGenerator.*;
import static com.calculator.utils.CalculatorUtils.readClose;
import static com.calculator.utils.CalculatorUtils.readOption;

@Getter
public class CalculatorService {

    private Calculator calculator;

    private Integer operationIndex = null;

    private final List<String> calculatorMenu = List.of(
            new StandardCalculator().getName(),
            new IMCCalculator().getName(),
            new AreaCalculator().getName(),
            "EXIT");

    public void execute(){
        int option;
        do {
            buildMainMenu();
            option = readOption();
            setCalculator(option);
            if (option == 3) break;
            if(optionIsValid(option)){
                buildOperationsMenu();
                setOperationIndex();
            }else {
                System.out.println("Option invalid.");
            }
            if(isOperationValid()){
                showResult();
            }
        }while (true);
        System.out.println("Thank you!");
        readClose();
    }

    private boolean optionIsValid(int option) {
        return option >= 0 && option <= calculatorMenu.size();
    }

    private void setCalculator(int option){
        if(option == 3) return;
        if (option == 0) calculator = new StandardCalculator();
        else if (option == 1) calculator = new IMCCalculator();
        else if (option == 2) calculator = new AreaCalculator();
    }

    private void setOperationIndex(){
        List<MathOperation> operations = calculator.getOperations();
        int option;
        do {
            buildOperationsMenu();
            option = readOption();

            if(option <= operations.size() && option >= 0){
                this.operationIndex = option;
                break;
            }
            System.out.print("Select a valid option: ");
        }while (option != operations.size());
    }

    private double calculate(){
        return calculator.calculate(operationIndex);
    }

    private void buildMainMenu(){
        System.out.println();
        System.out.println(buildHeaderWithTitle("CALCULATOR"));
        System.out.println(buildMainMenuOptions(calculatorMenu));
        System.out.print("Select the calculator type: ");
    }

    private void buildOperationsMenu() {
        System.out.println();
        System.out.println(buildHeaderWithTitle(calculator.getName()));
        System.out.println(buildOperationMenuOptions(calculator.getOperations()));
        System.out.print("Select the operation: ");
    }

    private boolean isOperationValid() {
        return Objects.nonNull(operationIndex) &&
                operationIndex != calculator.getOperations().size()
                && operationIndex >= 0;
    }

    private void showResult() {
        double result = calculate();
        System.out.printf("%nThe result of the %s is %s%n%n", calculator.getOperations().get(operationIndex).getName(), result);
    }
}
