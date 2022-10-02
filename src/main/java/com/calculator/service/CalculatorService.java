package com.calculator.service;

import com.calculator.model.AreaCalculator;
import com.calculator.model.Calculator;
import com.calculator.model.IMCCalculator;
import com.calculator.model.StandardCalculator;
import com.calculator.model.mathoperations.MathOperation;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import static com.calculator.generator.MenuGenerator.*;
import static com.calculator.utils.ReadUtils.readOption;

@Setter
@Getter
public class CalculatorService {

    private Calculator calculator;

    private Integer operationIndex = null;

    public void setCalculator(int option){
        if(option == 3) return;
        if (option == 0) calculator = new StandardCalculator();
        else if (option == 1) calculator = new IMCCalculator();
        else if (option == 2) calculator = new AreaCalculator();
    }

    public void setOperationIndex(){
        List<MathOperation> operations = calculator.getOperations();
        int option;
        do {
            operationsMenu(operations);
            option = readOption();

            if(option <= operations.size() && option >= 0){
                this.operationIndex = option;
                break;
            }
            System.out.print("Select a valid option: ");
        }while (option != operations.size());

    }

    public double calculate(){
        return calculator.calculate(operationIndex);
    }

    public void mainMenu(){
        List<String> menu = List.of(new StandardCalculator().getName(), new IMCCalculator().getName(), new AreaCalculator().getName(), "EXIT");
        System.out.println();
        System.out.println(buildHeaderWithTitle("CALCULATOR"));
        System.out.println(buildMenuOptions(menu));
        System.out.print("Select your calculator: ");
    }

    private void operationsMenu(List<MathOperation> operations) {
        System.out.println();
        System.out.println(buildHeaderWithTitle(calculator.getName()));
        System.out.println(buildOperationOptions(operations));
        System.out.print("Select the operation: ");
    }
}
