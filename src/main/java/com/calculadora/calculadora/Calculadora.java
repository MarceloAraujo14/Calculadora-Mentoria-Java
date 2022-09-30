package com.calculadora.calculadora;

import com.calculadora.constants.MathOperations;

public interface Calculadora {
    double calcular(MathOperations operacao, double[] values);
}
