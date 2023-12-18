package rca.tresor.service;

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
        double calcResponse = mathOperatorService.doMath(operand1, operand2, operation);
        // Then
        double expectedcalcResponse = 20.0;
        assertEquals(expectedcalcResponse, calcResponse, 0.001); // Adjust the delta based on your precision requirements
    }

    @Test
    public void testDivision() throws InvalidOperationException {
        // Given
        double operand1 = 15;
        double operand2 = 3;
        String operation = "/";
        // When
        double calcResponse = mathOperatorService.doMath(operand1, operand2, operation);
        // Then
        double expectedcalcResponse = 5.0;
        assertEquals(expectedcalcResponse, calcResponse, 0.001);
    }

    @Test
    public void testAddition() throws InvalidOperationException {
        // Given
        double operand1 = 8;
        double operand2 = 7;
        String operation = "+";
        // When
        double calcResponse = mathOperatorService.doMath(operand1, operand2, operation);
        // Then
        double expectedcalcResponse = 15.0;
        assertEquals(expectedcalcResponse, calcResponse, 0.001);
    }

    @Test
    public void testSubtraction() throws InvalidOperationException {
        // Given
        double operand1 = 10;
        double operand2 = 6;
        String operation = "-";
        // When
        double calcResponse = mathOperatorService.doMath(operand1, operand2, operation);
        // Then
        double expectedcalcResponse = 4.0;
        assertEquals(expectedcalcResponse, calcResponse, 0.001);
    }

}
