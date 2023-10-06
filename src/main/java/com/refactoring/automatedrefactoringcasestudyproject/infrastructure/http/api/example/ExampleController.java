package com.refactoring.automatedrefactoringcasestudyproject.infrastructure.http.api.example;

import com.refactoring.automatedrefactoringcasestudyproject.infrastructure.http.api.example.request.CustomerCreateRequestDto;
import com.refactoring.automatedrefactoringcasestudyproject.infrastructure.http.api.example.response.CustomerResponseDto;
import jakarta.annotation.Nonnull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
final public class ExampleController {

    @GetMapping("customers/{customerId}")
    public ResponseEntity<CustomerResponseDto> getCustomer(
            final int customerId
    ) {
        return ResponseEntity.ok(null);
    }

    @PostMapping("customers")
    public ResponseEntity<CustomerResponseDto> createCustomer(
            final @Nonnull CustomerCreateRequestDto customerCreateRequestDto
    ) {
        return ResponseEntity.ok(null);
    }
}
