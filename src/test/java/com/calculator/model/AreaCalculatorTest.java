package com.calculator.model;

import com.calculator.utils.CalculatorUtils;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class AreaCalculatorTest {

    private Calculator underTest = new AreaCalculator();

    @Test
    void shouldCalculateCircleArea(){
        double[] values = {2};
        int index = 0;
        double expect = 12.56637;
        try(MockedStatic<CalculatorUtils> mock = mockStatic(CalculatorUtils.class)){
            mock.when(CalculatorUtils::readValue).thenReturn(values[0]);
            double actual = underTest.calculate(index);
            assertEquals(expect, actual);
            verify(mock, times(1)).when(CalculatorUtils::readValue);
        }
    }

    @Test
    void shouldCalculateSquareArea(){
        double[] values = {2,2};
        int index = 1;
        double expect = 4;
        try(MockedStatic<CalculatorUtils> mock = mockStatic(CalculatorUtils.class)){
            mock.when(CalculatorUtils::readValue).thenReturn(values[0]).thenReturn(values[1]);
            double actual = underTest.calculate(index);
            assertEquals(expect, actual);
            verify(mock, times(1)).when(CalculatorUtils::readValue);
        }
    }

    @Test
    void shouldCalculateRectangleArea(){
        double[] values = {2,2};
        int index = 2;
        double expect = 4;
        try(MockedStatic<CalculatorUtils> mock = mockStatic(CalculatorUtils.class)){
            mock.when(CalculatorUtils::readValue).thenReturn(values[0]).thenReturn(values[1]);
            double actual = underTest.calculate(index);
            assertEquals(expect, actual);
            verify(mock, times(1)).when(CalculatorUtils::readValue);
        }
    }

    @Test
    void shouldThrowUnsuportedOperationWhenIndexExceedThenNumberOfOperations(){
        int index = 6;
        assertThrows(UnsupportedOperationException.class, () -> underTest.calculate(index));
    }
    @Test
    void shouldThrowUnsuportedOperationWhenIndexIsLessThenZero(){
        int index = -1;
        assertThrows(UnsupportedOperationException.class, () -> underTest.calculate(index));
    }

}