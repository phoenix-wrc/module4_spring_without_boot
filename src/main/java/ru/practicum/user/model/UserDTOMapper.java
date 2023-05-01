package ru.practicum.user.model;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserDTOMapper {
    public static User toUser(UserDTO dto) {
        User out = new User();
        out.setId(dto.getId());
        out.setFirstName(dto.getFirstName());
        out.setLastName(dto.getLastName());
        out.setEmail(dto.getEmail());
        out.setState(dto.getState());
        return out;
    }

    public static UserDTO toUserDTO(User user) {
        String regData = DateTimeFormatter
                .ofPattern("yyyy.MM.dd hh.mm.ss")
                .withZone(ZoneOffset.UTC)
                .format(user.getRegistrationDate());
        return new UserDTO(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(),
                regData, user.getState());
    }

    public static List<UserDTO> mapToUserDto(Iterable<User> users) {
        List<UserDTO> out = new ArrayList<>();
        for (User user: users
             ) {
            out.add(toUserDTO(user));
        }
        return out;
    }
}













