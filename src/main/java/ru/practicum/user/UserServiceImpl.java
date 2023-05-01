package ru.practicum.user;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.practicum.user.model.User;
import ru.practicum.user.model.UserDTO;
import ru.practicum.user.model.UserDTOMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public UserDTO saveUser(UserDTO user) {
        return UserDTOMapper.toUserDTO(repository.save(UserDTOMapper.toUser(user)));
    }
}