package com.calculadora.menu;

import static com.calculadora.constants.MathOperations.IMC;
import static com.calculadora.constants.MenuConstants.OPTION_ERROR;
import static com.calculadora.util.ReadUtil.readOption;
import static com.calculadora.util.ReadUtil.readValue;

public class MenuIMC extends Menu {

    @Override
    public String execute() {
        printMenu();
        String result;
        do {
            result = setOperation(readOption());
        }while (result.equals(OPTION_ERROR.getValue()));
        return result;
    }

    private void printMenu() {
        System.out.println("\n====== CALCULADORA IMC =======\n");

        System.out.println("[1] ======================== IMC");
        System.out.println("[0] ===================== VOLTAR");

        System.out.print("\nSelecione o tipo de operação desejada: ");
    }

    private String setOperation(int operation) {
        return switch (operation) {
            case (1) -> printResult(IMC.getName(), calculadora.calcular(IMC, getValues()));
            case (0) -> "";
            default -> OPTION_ERROR.getValue();
        };

    }

    private double[] getValues() {
        double[] values = new double[2];
        System.out.println("\nInsira os dados solicitados:");

        System.out.print("Selecione seu peso em kg: ");
        values[0] = readValue();
        System.out.print("Selecione sua altura em m: ");
        values[1] = readValue();
        return values;
    }

    private String printResult(String operation, double result){
        return String.format("O seu %s é: %f", operation, result);
    }


}
