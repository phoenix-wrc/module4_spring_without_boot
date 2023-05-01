package ru.practicum.item;

import java.util.List;

public interface ItemService {

    List<Item> getItems(Long userId);

    Item addNewItem(Long userId, ItemDTO item);

    void deleteItem(Long userId, Long itemId);
}
