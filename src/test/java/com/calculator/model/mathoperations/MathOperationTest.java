package com.calculator.model.mathoperations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathOperationTest {

    private MathOperation underTest;

    @Test
    void shouldSum(){
        underTest = new Sum();
        double[] values = {5,2};
        double expect = 7;
        double actual = underTest.execute(values);
        assertEquals(expect, actual);
    }
    @Test
    void shouldSubtract(){
        underTest = new Subtract();
        double[] values = {5,2};
        double expect = 3;
        double actual = underTest.execute(values);
        assertEquals(expect, actual);
    }
    @Test
    void shouldMultiply(){
        underTest = new Multiply();
        double[] values = {5,2};
        double expect = 10;
        double actual = underTest.execute(values);
        assertEquals(expect, actual);
    }
    @Test
    void shouldDivide(){
        underTest = new Divide();
        double[] values = {5,2};
        double expect = 2.5;
        double actual = underTest.execute(values);
        assertEquals(expect, actual);
    }
    @Test
    void shouldPow(){
        underTest = new Pow();
        double[] values = {5,2};
        double expect = 25;
        double actual = underTest.execute(values);
        assertEquals(expect, actual);
    }
    @Test
    void shouldCalculateIMC(){
        underTest = new IMC();
        double[] values = {85,1.8};
        double expect = 26.2;
        double actual = underTest.execute(values);
        assertEquals(expect, actual);
    }
    @Test
    void shouldCalculateCircleArea(){
        underTest = new CircleArea();
        double[] values = {2};
        double expect = 12.56637;
        double actual = underTest.execute(values);
        assertEquals(expect, actual);
    }
    @Test
    void shouldCalculateSquareArea(){
        underTest = new SquareArea();
        double[] values = {5,2};
        double expect = 10;
        double actual = underTest.execute(values);
        assertEquals(expect, actual);
    }
    @Test
    void shouldCalculateRectangleArea(){
        underTest = new RectangleArea();
        double[] values = {5,2};
        double expect = 10;
        double actual = underTest.execute(values);
        assertEquals(expect, actual);
    }

}