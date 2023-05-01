package ru.practicum.user;

import ru.practicum.user.model.UserDTO;

import java.util.List;

interface UserService {
    List<UserDTO> getAllUsers();

    UserDTO saveUser(UserDTO user);
}