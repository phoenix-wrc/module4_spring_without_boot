package ru.practicum.item;

import java.util.List;

public interface ItemService {

    List<ItemDTO> getItems(Long userId);

    ItemDTO addNewItem(Long userId, ItemDTO item);

    void deleteItem(Long userId, Long itemId);
}
