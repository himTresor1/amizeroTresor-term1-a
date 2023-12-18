package rca.tresor.v1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rca.tresor.v1.dtos.DoMathRequestDto;
import rca.tresor.v1.dtos.MathResponseDto;
import rca.tresor.v1.exceptions.InvalidOperationException;
import rca.tresor.v1.payload.ApiResponse;
import rca.tresor.v1.serviceImpls.MathOperatorImpl;

@RestController
@RequestMapping("/api/v1/do_math")
public class MathController {
    private final MathOperatorImpl mathOperatorImpl;

    public MathController(MathOperatorImpl mathOperatorImpl) {
        this.mathOperatorImpl = mathOperatorImpl;
    }

//    @PostMapping
//    public ResponseEntity<ApiResponse> create(@RequestBody DoMathRequestDto dto) throws InvalidOperationException {
//        return ResponseEntity.ok(ApiResponse.success(mathOperatorImpl.doMath(dto.getOperand1(), dto.getOperand2(), dto.getOperation())));
//    }
private MathOperatorImpl mathOperator;
    @PostMapping("/doMath")
    public MathResponseDto doMath(@RequestBody DoMathRequestDto doMathRequest) throws InvalidOperationException {
        double operand1 = doMathRequest.getOperand1();
        double operand2 = doMathRequest.getOperand2();
        String operation = doMathRequest.getOperation();
        double result = mathOperator.calculate(operand1, operand2, operation);

        MathResponseDto mathResponse = new MathResponseDto();
        mathResponse.setCalcResponse(result);

        return mathResponse;
    }


}
