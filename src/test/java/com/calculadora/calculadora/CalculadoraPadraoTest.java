package com.calculadora.calculadora;

import org.junit.jupiter.api.Test;

import static com.calculadora.constants.MathOperations.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraPadraoTest {

    private final Calculadora calculadora = new CalculadoraPadrao();

    @Test
    void deveSomar(){
        double[] values = {5,2};
        double expected = 7;
        double actual = calculadora.calcular(SOMA, values);
        assertEquals(expected, actual);
    }
    @Test
    void deveSubtrair(){
        double[] values = {5,2};
        double expected = 3;
        double actual = calculadora.calcular(SUBTRACAO, values);
        assertEquals(expected, actual);
    }
    @Test
    void deveDividr(){
        double[] values = {5,2};
        double expected = 2.5;
        double actual = calculadora.calcular(DIVISAO, values);
        assertEquals(expected, actual);
    }
    @Test
    void deveMultiplicar(){
        double[] values = {5,2};
        double expected = 10;
        double actual = calculadora.calcular(MULTIPLICACAO, values);
        assertEquals(expected, actual);
    }
    @Test
    void devePotenciar(){
        double[] values = {5,2};
        double expected = 25;
        double actual = calculadora.calcular(POTENCIACAO, values);
        assertEquals(expected, actual);
    }

    @Test
    void deveLanarErroEmCasoDeOperacaoNaoSuportada(){
        double[] values = {5,2};
        String expectedMessage = "Operação não suportada.";
        String actualMessage = assertThrows(IllegalArgumentException.class,
                () -> calculadora.calcular(IMC, values)).getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

}