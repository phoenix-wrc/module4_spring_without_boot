package ru.practicum.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor @AllArgsConstructor
public class UserDTO {
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String registrationDate;

    private UserState state;
}