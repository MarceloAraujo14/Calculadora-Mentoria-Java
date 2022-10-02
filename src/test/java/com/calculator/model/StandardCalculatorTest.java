package com.calculator.model;

import com.calculator.utils.ReadUtils;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mockStatic;

class StandardCalculatorTest {

    private Calculator underTest = new StandardCalculator();

    @Test
    void shouldSum(){
        double[] values = {5,2};
        int index = 0;
        double expect = 7;
        try(MockedStatic<ReadUtils> mock = mockStatic(ReadUtils.class)){
            mock.when(ReadUtils::readValue).thenReturn(values[0]).thenReturn(values[1]);
            double actual = underTest.calculate(index);
            assertEquals(expect, actual);
        }
    }
    @Test
    void shouldSubtract(){
        double[] values = {5,2};
        int index = 1;
        double expect = 3;
        try(MockedStatic<ReadUtils> mock = mockStatic(ReadUtils.class)){
            mock.when(ReadUtils::readValue).thenReturn(values[0]).thenReturn(values[1]);
            double actual = underTest.calculate(index);
            assertEquals(expect, actual);
        }
    }
    @Test
    void shouldMultiply(){
        double[] values = {5,2};
        int index = 2;
        double expect = 10;
        try(MockedStatic<ReadUtils> mock = mockStatic(ReadUtils.class)){
            mock.when(ReadUtils::readValue).thenReturn(values[0]).thenReturn(values[1]);
            double actual = underTest.calculate(index);
            assertEquals(expect, actual);
        }
    }
    @Test
    void shouldDivide(){
        double[] values = {5,2};
        int index = 3;
        double expect = 2.5;
        try(MockedStatic<ReadUtils> mock = mockStatic(ReadUtils.class)){
            mock.when(ReadUtils::readValue).thenReturn(values[0]).thenReturn(values[1]);
            double actual = underTest.calculate(index);
            assertEquals(expect, actual);
        }
    }
    @Test
    void shouldPow(){
        double[] values = {5,2};
        int index = 4;
        double expect = 25;
        try(MockedStatic<ReadUtils> mock = mockStatic(ReadUtils.class)){
            mock.when(ReadUtils::readValue).thenReturn(values[0]).thenReturn(values[1]);
            double actual = underTest.calculate(index);
            assertEquals(expect, actual);
        }
    }
    @Test
    void shouldThrowUnsuportedOperationWhenIndexExceedThenNumberOfOperations(){
        int index = 15;
        assertThrows(UnsupportedOperationException.class, () -> underTest.calculate(index));
    }

    @Test
    void shouldThrowUnsuportedOperationWhenIndexIsLessThenZero(){
        int index = -1;
        assertThrows(UnsupportedOperationException.class, () -> underTest.calculate(index));
    }

}