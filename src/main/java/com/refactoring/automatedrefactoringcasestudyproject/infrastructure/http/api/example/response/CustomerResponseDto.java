package com.refactoring.automatedrefactoringcasestudyproject.infrastructure.http.api.example.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.annotation.Nonnull;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@JsonDeserialize(builder = CustomerResponseDto.CustomerResponseDtoBuilder.class)
public class CustomerResponseDto {

    @JsonProperty("id")
    int id;

    @JsonProperty("firstName")
    @Nonnull
    String firstName;

    @JsonProperty("lastName")
    @Nonnull
    String lastName;

    @JsonProperty("age")
    int age;
}
