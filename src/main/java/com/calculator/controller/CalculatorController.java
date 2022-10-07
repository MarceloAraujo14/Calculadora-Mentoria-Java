package com.calculator.controller;

import com.calculator.model.AreaCalculator;
import com.calculator.model.Calculator;
import com.calculator.model.IMCCalculator;
import com.calculator.model.StandardCalculator;
import com.calculator.model.mathoperations.MathOperation;
import com.calculator.view.CalculatorView;
import lombok.Getter;

import java.util.List;
import java.util.Objects;

import static com.calculator.utils.CalculatorUtils.readClose;
import static com.calculator.utils.CalculatorUtils.readOption;

@Getter
public class CalculatorController {

    private Calculator calculator;
    private final CalculatorView calculatorView = new CalculatorView();
    private Integer operationIndex = null;

    private final List<String> calculatorMenu = List.of(
            new StandardCalculator().getName(),
            new IMCCalculator().getName(),
            new AreaCalculator().getName(),
            "EXIT");

    public void execute(){
        int option;
        do {
            calculatorView.buildMainMenu(calculatorMenu);
            option = readOption();
            setCalculator(option);
            if (option == 3) break;
            if(optionIsValid(option)){
                calculatorView.setCalculator(this.calculator);
                setOperationIndex();
            }else {
                System.out.println("Invalid option.");
            }
            if(isOperationValid()){
                calculatorView.showResult(calculate(), operationIndex);
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
            calculatorView.buildOperationsMenu();
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

    private boolean isOperationValid() {
        return Objects.nonNull(operationIndex) &&
                operationIndex != calculator.getOperations().size()
                && operationIndex >= 0;
    }

}
