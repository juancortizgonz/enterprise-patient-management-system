package com.juancortizgonz.patientservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PatientRequestDTO {
    @NotBlank(message = "{patient.name.required}")
    @Size(max = 100, message = "{patient.name.size}")
    private String name;

    @NotBlank(message = "{patient.email.required}")
    @Email(message = "{patient.email.format}")
    private String email;

    @NotBlank(message = "{patient.address.required}")
    private String address;

    @NotBlank(message = "{patient.dateOfBirth.required}")
    private String dateOfBirth;

    @NotBlank(message = "{patient.registeredDate.required}")
    private String registeredDate;

    public @NotBlank(message = "{patient.name.required}") @Size(max = 100, message = "{patient.name.size}") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "{patient.name.required}") @Size(max = 100, message = "{patient.name.size}") String name) {
        this.name = name;
    }

    public @NotBlank(message = "{patient.email.required}") @Email(message = "{patient.email.format}") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "{patient.email.required}") @Email(message = "{patient.email.format}") String email) {
        this.email = email;
    }

    public @NotBlank(message = "{patient.address.required}") String getAddress() {
        return address;
    }

    public void setAddress(@NotBlank(message = "{patient.address.required}") String address) {
        this.address = address;
    }

    public @NotBlank(message = "{patient.dateOfBirth.required}") String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(@NotBlank(message = "{patient.dateOfBirth.required}") String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public @NotBlank(message = "{patient.registeredDate.required}") String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(@NotBlank(message = "{patient.registeredDate.required}") String registeredDate) {
        this.registeredDate = registeredDate;
    }
}
