package ru.practicum.user;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.practicum.user.model.User;

import java.util.List;
import java.util.Map;

@Repository
public class InMemoryUserRepository implements UserRepository {
    private final Map<Long, User> users;
    private Long currentId = 1L;

    @Autowired
    public InMemoryUserRepository(Map<Long, User> users) {
        this.users = users;
    }

    @Override
    public List<User> findAll() {
        return List.copyOf(users.values());
    }

    @Override
    public User save(@NonNull User user) {
        if (user.getId() == null) {
            user.setId(nextId());
        } else {
            currentId = user.getId();
        }
        if (users.containsKey(user.getId())) {
            throw new RuntimeException();
        }

        return users.put(user.getId(), user);
    }

    private Long nextId() {
        return currentId++;
    }
}
