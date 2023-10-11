package com.refactoring.automatedrefactoringcasestudyproject.domain.customer;

import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
final public class CustomerRepository {

    private static final String NUMBER_OF_CUSTOMERS_QUERY = "SELECT" +
            "COUNT(*)" +
            "FROM customer";

    public Optional<Customer> findCustomerByLastName(String lastName) {
        return Optional.of(
                new Customer(1, "tester", "test", 10)
        );
    }

    public Optional<Customer> findById(int customerId) {
        return Optional.empty();
    }

    public int countCustomers() {
        return 1;
    }

    public Set<Customer> findAll() {
        return Set.of();
    }
}
