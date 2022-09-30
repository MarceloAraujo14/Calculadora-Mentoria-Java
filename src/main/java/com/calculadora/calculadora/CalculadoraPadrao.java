package com.calculadora.calculadora;

public class CalculadoraPadrao implements Calculadora {

    @Override
    public double calcular(String operacao, double[] values) {

        return switch (operacao){
            case ("SOMA") -> soma(values[0], values[1]);
            case ("SUBTRAÇÃO") -> subtracao(values[0], values[1]);
            case ("DIVISÃO") -> divisao(values[0], values[1]);
            case ("MULTIPLICAÇÃO") -> multiplicacao(values[0], values[1]);
            case ("POTENCIAÇÃO") -> potenciacao(values[0], values[1]);
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
