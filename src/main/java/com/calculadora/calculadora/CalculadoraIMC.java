package com.calculadora.calculadora;

import com.calculadora.constants.MathOperations;

import static com.calculadora.constants.MathOperations.IMC;

public class CalculadoraIMC implements Calculadora {

    @Override
    public double calcular(MathOperations operacao, double[] values) {
        if (operacao == IMC){
            double value = values[0] / (Math.pow(values[1], 2));
            return Double.parseDouble(String.format("%.1f", value));
        }else {
            throw new IllegalArgumentException("Operação não suportada.");
        }

    }
}
