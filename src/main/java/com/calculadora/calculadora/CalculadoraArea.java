package com.calculadora.calculadora;

import com.calculadora.constants.MathOperations;

public class CalculadoraArea implements Calculadora {

    @Override
    public double calcular(MathOperations operacao, double[] values) {
        return switch (operacao){
            case AREA_CIRCULO -> circulo(values[0]);
            case AREA_QUADRADO -> quadrado(values[0], values[1]);
            case AREA_RETANGULO -> retangulo(values[0], values[1]);
            default -> throw new IllegalArgumentException("Operação não suportada.");
        };
    }

    private double circulo(double a){

        double value = Math.PI * Math.pow(a, 2);
        return Double.parseDouble(String.format("%.5f", value));
    }
    private double quadrado(double a, double b){
        double value =  a * b;
        return Double.parseDouble(String.format("%.5f", value));
    }
    private double retangulo(double a, double b){
        double value =  a * b;
        return Double.parseDouble(String.format("%.5f", value));
    }
}
