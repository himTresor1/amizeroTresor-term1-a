package rca.tresor.v1.serviceImpls;

import org.springframework.stereotype.Service;
import rca.tresor.v1.exceptions.InvalidOperationException;
import rca.tresor.v1.services.IMathOperator;

@Service
public class MathOperatorImpl implements IMathOperator {

    public double calculate(double operand1, double operand2, String operation) throws InvalidOperationException {
        if ("/".equals(operation) && operand2 == (double) 0) {
            throw new InvalidOperationException("Cannot divide by 0");
        }

        return switch (operation) {
            case "*" -> operand1 * operand2;
            case "/" -> operand1 / operand2;
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            default -> throw new RuntimeException("Unknown Operation");
        };
    }

    @Override
    public double doMath(double operand1, double operand2, String operation) throws InvalidOperationException {
        return 0;
    }
}
