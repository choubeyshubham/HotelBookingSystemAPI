package com.champaranguesthouse.chamapranguesthouseapi.dtos;

import com.champaranguesthouse.chamapranguesthouseapi.enums.UserRole;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationRequest {

    @NotBlank(message = "FirstName is required")
    private String firstName;

    @NotBlank(message = "LastName is required")
    private String lastName;

    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "LastName is required")
    private String phoneNumber;

    private UserRole role; //optional

    @NotBlank(message = "Password is required")
    private String password;
}