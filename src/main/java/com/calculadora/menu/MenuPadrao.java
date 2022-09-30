package com.calculadora.menu;

import static com.calculadora.constants.MathOperations.*;
import static com.calculadora.constants.MenuConstants.OPTION_ERROR;
import static com.calculadora.util.ReadUtil.readOption;
import static com.calculadora.util.ReadUtil.readValue;

public class MenuPadrao extends Menu {

    @Override
    public String execute(){
        printMenu();
        String result;
        do {
            result = setOperation(readOption());
        }while (result.equals(OPTION_ERROR.getValue()));
        return result;
    }

    private void printMenu() {
        System.out.println("===== CALCULADORA PADRÃO ======\n");
        System.out.println("[1] ====================== SOMA");
        System.out.println("[2] ================= SUBTRAÇÃO");
        System.out.println("[3] =================== DIVISÃO");
        System.out.println("[4] ============= MULTIPLICAÇÃO");
        System.out.println("[5] =============== POTENCIAÇÃO");
        System.out.println("[0] ==================== VOLTAR");
        System.out.print("\nSelecione o tipo de operação desejada: ");
    }

    private String setOperation(int operation) {
        return switch (operation) {
            case (1) -> printResult("soma", calculadora.calcular(SOMA, getValues()));
            case (2) -> printResult("subtracao", calculadora.calcular(SUBTRACAO, getValues()));
            case (3) -> printResult("divisao", calculadora.calcular(DIVISAO, getValues()));
            case (4) -> printResult("multiplicacao", calculadora.calcular(MULTIPLICACAO, getValues()));
            case (5) -> printResult("potenciação", calculadora.calcular(POTENCIACAO, getValues()));
            case (0) -> "";
            default -> OPTION_ERROR.getValue();
        };
    }

    private String printResult(String operation, double result){
       return "O resultado da " + operation + " é: " + result;
    }

    private double[] getValues() {
        double[] values = new double[2];
        System.out.print("Selecione o primeiro valor: ");
        values[0] = readValue();
        System.out.print("Selecione o segundo valor: ");
        values[1] = readValue();
        return values;
    }

}
