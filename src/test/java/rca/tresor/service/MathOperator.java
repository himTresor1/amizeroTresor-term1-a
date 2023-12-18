package rca.tresor.service;

import rca.tresor.v1.exceptions.InvalidOperationException;

public interface MathOperator {
    double calculate(double operand1, double operand2, String operation) throws InvalidOperationException;
}
