package com.calculadora.menu;

import java.lang.reflect.Array;
import java.util.Arrays;

import static com.calculadora.util.ReadUtil.readOption;
import static com.calculadora.util.ReadUtil.readValue;

public class MenuArea extends IMenu{

    @Override
    public void callMenu() {
        System.out.println("\n======= CALCULADORA ÁREA ========\n");

        System.out.println("[1] =================== CIRCULO");
        System.out.println("[2] ================== QUADRADO");
        System.out.println("[3] ================= RETÂNGULO");

        System.out.print("\nSelecione a forma que deseja calcular a área: ");

        chooseOperation(readOption());
    }

    private void chooseOperation(int operation) {

        switch (operation) {
            case (1) -> {
                System.out.print("Selecione a medida do raio em m: ");
                showResult("CIRCULO", calculadora.calcular("CIRCULO", new double[]{readValue()}));
            }
            case (2) -> calculadora.calcular("QUADRADO", getValues());
            case (3) -> calculadora.calcular("RETÂNGULO", getValues());
            default -> {
                System.out.println("Selecione uma opção válida.");
                callMenu();
            }
        }
    }

    private void showResult(String operation, double result){
        System.out.println("A área do " + operation + " é: " + result + "m²");
    }

    private double[] getValues(){
        double[] values = new double[2];
        System.out.print("Selecione a altura em m: ");
        values[0] = readValue();
        System.out.print("Selecione a largura em m: ");
        values[1] = readValue();
        return values;
    }
}