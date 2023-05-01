package ru.practicum.user;

import ru.practicum.user.model.User;
import ru.practicum.user.model.UserDTO;

import java.util.List;

interface UserService {
    List<User> getAllUsers();
    UserDTO saveUser(UserDTO user);
}