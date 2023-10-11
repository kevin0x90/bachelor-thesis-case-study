package com.refactoring.automatedrefactoringcasestudyproject.domain.customer;

import jakarta.annotation.Nonnull;

final public class Customer {

    private final int id;

    private final @Nonnull String firstName;

    private final @Nonnull String lastName;

    private final int age;

    public Customer(
            final int id,
            final @Nonnull String firstName,
            final @Nonnull String lastName,
            final int age
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Customer)) {
            return false;
        }

        final var other = (Customer) obj;

        return id == other.id;
    }

    @Override
    public String toString() {
        return "Customer(" +
                "id=" + id + "," +
                "firstName=" + firstName + "," +
                "lastName=" + lastName + "," +
                "age=" + age + ")";

    }
}
