package com.calculadora.calculadora;

import org.junit.jupiter.api.Test;

import static com.calculadora.constants.MathOperation.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraAreaTest {

    private final Calculadora calculadora = new CalculadoraArea();

    @Test
    void deveCalcularAreaCirculo(){
        double[] values = {2};
        double expected = 12.56637;
        double actual = calculadora.calcular(AREA_CIRCULO, values);
        assertEquals(expected, actual);
    }
    @Test
    void deveCalcularAreaQuadrado(){
        double[] values = {2,2};
        double expected = 4;
        double actual = calculadora.calcular(AREA_QUADRADO, values);
        assertEquals(expected, actual);
    }
    @Test
    void deveCalcularAreaRetangulo(){
        double[] values = {2,2};
        double expected = 4;
        double actual = calculadora.calcular(AREA_RETANGULO, values);
        assertEquals(expected, actual);
    }

    @Test
    void deveLancarErroEmOperacaoNaoSuportada(){
        double[] values = {2,2};
        String expectedMessage = "Operação não suportada.";
        String actualMessage = assertThrows(IllegalArgumentException.class,
                () -> calculadora.calcular(IMC, values)).getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}
