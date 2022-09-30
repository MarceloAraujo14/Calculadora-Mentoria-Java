package com.calculadora.calculadora;

import com.calculadora.constants.MathOperations;

public class CalculadoraPadrao implements Calculadora {

    @Override
    public double calcular(MathOperations operacao, double[] values) {

        return switch (operacao){
            case SOMA -> soma(values[0], values[1]);
            case SUBTRACAO -> subtracao(values[0], values[1]);
            case DIVISAO -> divisao(values[0], values[1]);
            case MULTIPLICACAO -> multiplicacao(values[0], values[1]);
            case POTENCIACAO -> potenciacao(values[0], values[1]);
            default -> throw new IllegalArgumentException("Operação não suportada.");
        };
    }

    private double soma(double a, double b){
        return a + b;
    }
    private double subtracao(double a, double b){
        return a - b;
    }
    private double divisao(double a, double b){
        return a / b;
    }
    private double multiplicacao(double a, double b){
        return a * b;
    }
    private double potenciacao(double a, double b){
        return Math.pow(a, b);
    }
}
