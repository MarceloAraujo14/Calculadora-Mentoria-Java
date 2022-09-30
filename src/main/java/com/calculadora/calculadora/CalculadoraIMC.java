package com.calculadora.calculadora;

import com.calculadora.constants.MathOperations;

public class CalculadoraIMC implements Calculadora {

    @Override
    public double calcular(MathOperations operacao, double[] values) {
        return values[0] / (Math.pow(values[1], 2));
    }
}
