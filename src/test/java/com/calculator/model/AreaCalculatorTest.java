package com.calculator.model;

import com.calculator.utils.ReadUtils;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mockStatic;

class AreaCalculatorTest {

    private Calculator underTest = new AreaCalculator();

    @Test
    void shouldCalculateCircleArea(){
        double[] values = {2};
        int index = 0;
        double expect = 12.56637;
        try(MockedStatic<ReadUtils> mock = mockStatic(ReadUtils.class)){
            mock.when(ReadUtils::readValue).thenReturn(values[0]);
            double actual = underTest.calculate(index);
            assertEquals(expect, actual);
        }
    }

    @Test
    void shouldCalculateSquareArea(){
        double[] values = {2,2};
        int index = 1;
        double expect = 4;
        try(MockedStatic<ReadUtils> mock = mockStatic(ReadUtils.class)){
            mock.when(ReadUtils::readValue).thenReturn(values[0]).thenReturn(values[1]);
            double actual = underTest.calculate(index);
            assertEquals(expect, actual);
        }
    }

    @Test
    void shouldCalculateRectangleArea(){
        double[] values = {2,2};
        int index = 2;
        double expect = 4;
        try(MockedStatic<ReadUtils> mock = mockStatic(ReadUtils.class)){
            mock.when(ReadUtils::readValue).thenReturn(values[0]).thenReturn(values[1]);
            double actual = underTest.calculate(index);
            assertEquals(expect, actual);
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