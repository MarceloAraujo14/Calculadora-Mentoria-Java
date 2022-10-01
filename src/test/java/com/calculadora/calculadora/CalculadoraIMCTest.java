package com.calculadora.calculadora;

import org.junit.jupiter.api.Test;

import static com.calculadora.constants.MathOperation.IMC;
import static com.calculadora.constants.MathOperation.SUBTRACTION;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraIMCTest {

    Calculadora calculadora = new CalculadoraIMC();

    @Test
    void deveCalcularIMC(){
        double[] values = {85,1.8};
        double expected = 26.2;
        double actual = calculadora.calcular(IMC, values);
        assertEquals(expected, actual);
    }
    @Test
    void deveLancarErroEmCasoDeOperacaoNaoSuportada(){
        double[] values = {85,1.8};
        String expectedMessage = "Operação não suportada.";
        String actualMessage = assertThrows(IllegalArgumentException.class,
                () -> calculadora.calcular(SUBTRACTION, values)).getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}
