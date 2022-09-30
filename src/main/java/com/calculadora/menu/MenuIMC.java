package com.calculadora.menu;

import static com.calculadora.constants.MathOperations.IMC;
import static com.calculadora.util.ReadUtil.readValue;

public class MenuIMC extends IMenu {

    @Override
    public void callMenu() {
        System.out.println("\n====== CALCULADORA IMC =======");

        System.out.println("\nInsira os dados solicitados:");

        double[] values = getValues();

        showResult(IMC.getName(), calculadora.calcular(IMC, values));
    }

    private double[] getValues() {
        double[] values = new double[2];
        System.out.print("Selecione seu peso em kg: ");
        values[0] = readValue();
        System.out.print("Selecione sua altura em m: ");
        values[1] = readValue();
        return values;
    }

    private void showResult(String operation, double result){
        System.out.printf("O seu %s é: %.2f", operation, result);
    }


}
