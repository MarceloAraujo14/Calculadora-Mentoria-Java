package com.calculator.controller;

import com.calculator.model.AreaCalculator;
import com.calculator.model.Calculator;
import com.calculator.model.IMCCalculator;
import com.calculator.model.StandardCalculator;
import com.calculator.model.mathoperations.MathOperation;
import com.calculator.service.CalculatorService;

import java.util.List;
import java.util.Scanner;

import static com.calculator.generator.MenuGenerator.*;


public class CalculatorController {

    private final CalculatorService calculatorService = new CalculatorService();

    public void run(){
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            mainMenu();
            option = scanner.nextInt();
            setCalculator(option);
            if (option != 3){
                calculatorMenu();
            }
        }while (option != 3);
        System.out.println("Thank you!");
        scanner.close();
    }

    private void mainMenu(){

        List<String> menu = List.of(new StandardCalculator().getName(), new IMCCalculator().getName(), new AreaCalculator().getName());
        System.out.println();
        System.out.println(buildHeaderWithTitle("CALCULATOR"));
        System.out.println(buildMenuOptions(menu));
        System.out.print("Select your calculator: ");

    }

    private void setCalculator(int option){
        if(option == 3) return;
        if (option == 0) calculatorService.setCalculator(new StandardCalculator());
        if (option == 1) calculatorService.setCalculator(new IMCCalculator());
        if (option == 2) calculatorService.setCalculator(new AreaCalculator());
    }

    private void calculatorMenu(){
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = calculatorService.getCalculator();
        List<MathOperation> operations = calculator.getOperations();

        int option;
        do {
            System.out.println();
            System.out.println(buildHeaderWithTitle(calculator.getName()));
            System.out.println(buildOperationOptions(operations));
            System.out.print("Select the operation: ");
            option = scanner.nextInt();
            if(option < operations.size()){
                setOperation(option);
            }
        }while (option != operations.size());
    }

    private void setOperation(int operation){
        // TODO document why this method is empty
    }
}
