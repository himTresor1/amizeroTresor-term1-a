package rca.tresor.service;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.junit.MockitoJUnitRunner;
//import rca.tresor.v1.exceptions.InvalidOperationException;
//import rca.tresor.v1.serviceImpls.MathOperatorImpl;
//import static org.assertj.core.api.Assertions.assertThat;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.*;
//
//@RunWith(MockitoJUnitRunner.class)
//public class MathOperatorServiceTest {
//
//    @InjectMocks
//    private MathOperatorImpl mathOperatorService;
//
//    @Test
//    public void should_create_math_operation_success() throws InvalidOperationException {
//        double operator1 = 4;
//        double operator2 = 9;
//        String operation = "+";
//
//        double mathOperation = mathOperatorService.doMath(operator1,operator2, operation);
//        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(mathOperation);
//
//        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);
//
//        assertThat(mathOperation).usingRecursiveComparison().isEqualTo(actualMathOperator);
//    }
//
//}


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import rca.tresor.v1.exceptions.InvalidOperationException;
import rca.tresor.v1.serviceImpls.MathOperatorImpl;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class MathOperatorServiceTest {
    @InjectMocks
    private MathOperatorImpl mathOperatorService;
    @Test
    public void testMultiplication() throws InvalidOperationException {
        // Given
        double operand1 = 4;
        double operand2 = 5;
        String operation = "*";
        // When
        double result = mathOperatorService.doMath(operand1, operand2, operation);
        // Then
        double expectedResult = 20.0;
        assertEquals(expectedResult, result, 0.001); // Adjust the delta based on your precision requirements
    }
    // Add more tests for other operations and edge cases
}