package com.calculadora.calculadora;

public class CalculadoraArea implements Calculadora {

    @Override
    public double calcular(String operacao, double[] values) {
        return switch (operacao){
            case ("CIRCULO") -> circulo(values[0]);
            case ("QUADRADO") -> quadrado(values[0], values[1]);
            case ("RETÂNGULO") -> retangulo(values[0], values[1]);
            default -> throw new IllegalArgumentException("Operação não suportada.");
        };
    }

    private double circulo(double a){
        return Math.PI * Math.pow(a, 2);
    }
    private double quadrado(double a, double b){
        return a * b;
    }
    private double retangulo(double a, double b){
        return a * b;
    }
}
