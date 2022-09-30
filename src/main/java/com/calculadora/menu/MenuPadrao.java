package com.calculadora.menu;

import static com.calculadora.util.ReadUtil.readOption;
import static com.calculadora.util.ReadUtil.readValue;

public class MenuPadrao extends IMenu {

    @Override
    public void callMenu(){

        System.out.println("===== CALCULADORA PADRÃO ======\n");
        System.out.println("[1] ====================== SOMA");
        System.out.println("[2] ================= SUBTRAÇÃO");
        System.out.println("[3] =================== DIVISÃO");
        System.out.println("[4] ============= MULTIPLICAÇÃO");
        System.out.println("[5] =============== POTENCIAÇÃO");
        System.out.print("\nSelecione o tipo de operação desejada: ");

        int operation = readOption();
        double[] values = getValues();

        switch (operation) {
            case (1) -> showResult("soma", calculadora.calcular("SOMA", values));
            case (2) -> showResult("subtracao", calculadora.calcular("SUBTRAÇÃO", values));
            case (3) -> showResult("divisao", calculadora.calcular("DIVISÃO", values));
            case (4) -> showResult("multiplicacao", calculadora.calcular("MULTIPLICAÇÃO", values));
            case (5) -> showResult("potenciação", calculadora.calcular("POTENCIAÇÃO", values));
            default -> {
                System.out.println("Selecione uma opção válida.");
                callMenu();
            }
        }
    }

    private void showResult(String operation, double result){
        System.out.println("O resultado da " + operation + " é: " + result);
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
