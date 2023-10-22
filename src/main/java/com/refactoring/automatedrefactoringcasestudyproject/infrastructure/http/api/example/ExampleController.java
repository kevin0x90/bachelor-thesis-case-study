package com.refactoring.automatedrefactoringcasestudyproject.infrastructure.http.api.example;

import com.refactoring.automatedrefactoringcasestudyproject.domain.customer.CustomerRepository;
import com.refactoring.automatedrefactoringcasestudyproject.infrastructure.http.api.example.response.CustomerResponseDto;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
final public class ExampleController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers/{customerId}")
    public ResponseEntity<CustomerResponseDto> getCustomer(
            @PathVariable("customerId") int customerId
    ) {
        var foundCustomer = customerRepository.findById(customerId);

        if (!foundCustomer.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        var customer = foundCustomer.get();
        return ResponseEntity.ok(CustomerResponseDto.builder()
                .id(customer.getId())
                .age(customer.getAge())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .build()
        );
    }

    @GetMapping("/customers")
    public ResponseEntity<List<CustomerResponseDto>> listCustomers() {
        var customers = customerRepository.findAll();

        var resultList = new ArrayList<CustomerResponseDto>();
        for (var customer : customers) {
            resultList.add(CustomerResponseDto.builder()
                    .id(customer.getId())
                    .firstName(customer.getFirstName())
                    .lastName(customer.getLastName())
                    .age(customer.getAge())
                    .build());
        }

        return ResponseEntity.ok(resultList);
    }
}
