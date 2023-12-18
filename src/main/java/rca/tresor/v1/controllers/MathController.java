package rca.tresor.v1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rca.tresor.v1.dtos.DoMathRequestDto;
import rca.tresor.v1.dtos.MathResponseDto;
import rca.tresor.v1.exceptions.InvalidOperationException;
import rca.tresor.v1.payload.ApiResponse;
import rca.tresor.v1.serviceImpls.MathOperatorImpl;
import rca.tresor.v1.services.IMathOperator;

@RestController
@RequestMapping("/api/v1/do_math")
public class MathController {
    private final IMathOperator mathOperator;
    @Autowired
    public MathController(IMathOperator iMathOperator) {
        this.mathOperator= iMathOperator;
    }
    @PostMapping("/doMath")
    public MathResponseDto doMath(@RequestBody DoMathRequestDto doMathRequest) throws InvalidOperationException {
        double operand1 = doMathRequest.getOperand1();
        double operand2 = doMathRequest.getOperand2();
        String operation = doMathRequest.getOperation();
        double calcResponse = mathOperator.calculate(operand1, operand2, operation);

        MathResponseDto mathResponse = new MathResponseDto();
        mathResponse.setCalcResponse(calcResponse);

        return mathResponse;
    }


}
