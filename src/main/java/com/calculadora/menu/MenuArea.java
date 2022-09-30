package com.calculadora.menu;

import static com.calculadora.constants.MathOperations.*;
import static com.calculadora.constants.MenuConstants.OPTION_ERROR;
import static com.calculadora.util.ReadUtil.readOption;
import static com.calculadora.util.ReadUtil.readValue;

public class MenuArea extends Menu {

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
        System.out.println("\n====== CALCULADORA ÁREA =======\n");

        System.out.println("[1] =================== CIRCULO");
        System.out.println("[2] ================== QUADRADO");
        System.out.println("[3] ================= RETÂNGULO");
        System.out.println("[0] ==================== VOLTAR");

        System.out.print("\nSelecione a forma que deseja calcular a área: ");
    }

    private String setOperation(int operation) {
        return switch (operation) {
            case (1) -> calcularAreaCirculo();
            case (2) -> calcularAreaQuadrado();
            case (3) -> calcularAreaRetangulo();
            case (0) -> "";
            default -> OPTION_ERROR.getValue();
        };
    }

    private String calcularAreaRetangulo() {
        return printResult(AREA_RETANGULO.getName(), calculadora.calcular(AREA_RETANGULO, getValues()));
    }

    private String calcularAreaQuadrado() {
        return printResult(AREA_QUADRADO.getName(), calculadora.calcular(AREA_QUADRADO, getValues()));
    }

    private String calcularAreaCirculo() {
        System.out.print("Selecione a medida do raio em m: ");
        return printResult(AREA_CIRCULO.getName(), calculadora.calcular(AREA_CIRCULO, new double[]{readValue()}));
    }

    private String printResult(String operation, double result){
       return "A área do " + operation + " é: " + result + "m²";
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
