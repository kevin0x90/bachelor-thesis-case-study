package com.refactoring.automatedrefactoringcasestudyproject.infrastructure.http.api.example.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.annotation.Nonnull;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@JsonDeserialize(builder = CustomerCreateRequestDto.CustomerCreateRequestDtoBuilder.class)
public class CustomerCreateRequestDto {

    @JsonProperty("firstName")
    @Nonnull
    String firstName;

    @JsonProperty("lastName")
    @Nonnull
    String lastName;

    @JsonProperty("age")
    int age;
}
