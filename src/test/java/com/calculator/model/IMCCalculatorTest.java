package com.calculator.model;

import com.calculator.utils.CalculatorUtils;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mockStatic;

class IMCCalculatorTest {
    private Calculator underTest = new IMCCalculator();

    @Test
    void shouldCalculateIMC(){
        double[] values = {85,1.8};
        int index = 0;
        double expect = 26.2;
        try(MockedStatic<CalculatorUtils> mock = mockStatic(CalculatorUtils.class)){
            mock.when(CalculatorUtils::readValue).thenReturn(values[0]).thenReturn(values[1]);
            double actual = underTest.calculate(index);
            assertEquals(expect, actual);
        }
    }
    @Test
    void shouldThrowUnsuportedOperationWhenIndexExceedThenNumberOfOperations(){
        int index = 1;
        assertThrows(UnsupportedOperationException.class, () -> underTest.calculate(index));
    }

    @Test
    void shouldThrowUnsuportedOperationWhenIndexIsLessThenZero(){
        int index = -1;
        assertThrows(UnsupportedOperationException.class, () -> underTest.calculate(index));
    }
}