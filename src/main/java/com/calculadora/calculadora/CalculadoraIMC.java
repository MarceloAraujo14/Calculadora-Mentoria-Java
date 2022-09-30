package com.calculadora.calculadora;

public class CalculadoraIMC implements Calculadora {

    @Override
    public double calcular(String operacao, double[] values) {
        return values[0] / (Math.pow(values[1], 2));
    }
}
