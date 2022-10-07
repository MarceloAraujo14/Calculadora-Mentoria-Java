package com.calculator.controller;

import com.calculator.model.AreaCalculator;
import com.calculator.model.IMCCalculator;
import com.calculator.model.StandardCalculator;
import com.calculator.utils.CalculatorUtils;
import com.calculator.view.CalculatorView;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CalculatorControllerTest {

    @InjectMocks
    private CalculatorController underTest = new CalculatorController();
    @Mock
    private CalculatorView calculatorView;

    @Test
    void success_select_standardCalculator_operations_sum(){
        int calculatorIndex = 0;
        int operationIndex = 0;
        int exit = 3;
        double[] values = {5,5};
        try(MockedStatic<CalculatorUtils> mock = mockStatic(CalculatorUtils.class)){
            mock.when(CalculatorUtils::readOption).thenReturn(calculatorIndex).thenReturn(operationIndex).thenReturn(exit);
            mock.when(CalculatorUtils::readValue).thenReturn(values[0]).thenReturn(values[1]);
            underTest.execute();
            assertEquals(underTest.getCalculator().getClass(), StandardCalculator.class);
            assertEquals(underTest.getOperationIndex(), operationIndex);
        }
    }

    @Test
    void success_select_IMCCalculator_operations_IMC(){
        int calculatorIndex = 1;
        int operationIndex = 0;
        int exit = 3;
        double[] values = {85,1.8};
        try(MockedStatic<CalculatorUtils> mock = mockStatic(CalculatorUtils.class)){
            mock.when(CalculatorUtils::readOption).thenReturn(calculatorIndex).thenReturn(operationIndex).thenReturn(exit);
            mock.when(CalculatorUtils::readValue).thenReturn(values[0]).thenReturn(values[1]);
            underTest.execute();
            assertEquals(underTest.getCalculator().getClass(), IMCCalculator.class);
            assertEquals(underTest.getOperationIndex(), operationIndex);
        }
    }

    @Test
    void success_select_AreaCalculator_operations_circleArea(){
        int calculatorIndex = 2;
        int operationIndex = 0;
        int exit = 3;
        double[] values = {2};
        try(MockedStatic<CalculatorUtils> mock = mockStatic(CalculatorUtils.class)){
            mock.when(CalculatorUtils::readOption).thenReturn(calculatorIndex).thenReturn(operationIndex).thenReturn(exit);
            mock.when(CalculatorUtils::readValue).thenReturn(values[0]);
            underTest.execute();
            assertEquals(underTest.getCalculator().getClass(), AreaCalculator.class);
            assertEquals(underTest.getOperationIndex(), operationIndex);
        }
    }

    @Test
    void success_select_Exit(){
        int exit = 3;
        try(MockedStatic<CalculatorUtils> mock = mockStatic(CalculatorUtils.class)){
            mock.when(CalculatorUtils::readOption).thenReturn(exit);
            underTest.execute();
            assertNull(underTest.getCalculator());
        }
    }

    @Test
    void success_wrongOption_exit(){
        int wrongOption = 15;
        int exit = 3;
        try(MockedStatic<CalculatorUtils> mock = mockStatic(CalculatorUtils.class)){
            mock.when(CalculatorUtils::readOption).thenReturn(wrongOption).thenReturn(exit);
            underTest.execute();
            assertNull(underTest.getCalculator());
        }
    }

}