package ru.practicum.item;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ItemDTOMapper {
    public static Item toItem(ItemDTO dto) {
        Item out = new Item();
        out.setUserId(dto.getUserId());
        out.setUrl(dto.getUrl());
        out.setTags(dto.getTags());
        return out;
    }

    public static ItemDTO toItemDto(Item item) {
        return new ItemDTO(item.getId(), item.getUserId(), item.getUrl(), new HashSet<>(item.getTags()));
    }

    public static List<ItemDTO> mapToItemDto(Iterable<Item> items) {
        List<ItemDTO> dtos = new ArrayList<>();
        for (Item i: items             ) {
            dtos.add(toItemDto(i));
        }
        return dtos;
    }
}




































