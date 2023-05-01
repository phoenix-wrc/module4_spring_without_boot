package ru.practicum.item;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ItemRepositoryImpl implements ItemRepository {
    private final Map<Long, List<Item>> storage = new HashMap<>();

    @Override
    public List<Item> findByUserId(long userId) {
        return storage.getOrDefault(userId, Collections.emptyList());
    }

    @Override
    public Item save(Item item) {
        item.setId(getId());
        if (storage.containsKey(item.getUserId())) {
            storage.get(item.getUserId()).add(item);
        } else {
            storage.put(item.getUserId(), new ArrayList<>(List.of(item)));
        }
        return item;
    }

    @Override
    public void deleteByUserIdAndItemId(long userId, long itemId) {
        if (storage.containsKey(userId)) {
            storage.get(userId).removeIf(i -> i.getId().equals(itemId));
        }
    }

    private long getId() {
        long lastId = storage.values()
                .stream()
                .flatMap(Collection::stream)
                .mapToLong(Item::getId)
                .max()
                .orElse(0);
        return lastId + 1;
    }
}
