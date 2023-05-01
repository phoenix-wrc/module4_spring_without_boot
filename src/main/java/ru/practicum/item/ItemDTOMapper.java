package ru.practicum.item;

public class ItemDTOMapper {
    public static Item toItem(ItemDTO dto) {
        return new Item(dto.getId(), dto.getUserId(), dto.getUrl(), dto.getTags());
    }

    public static ItemDTO toItemDto(Item item) {
        return new ItemDTO(item.getId(), item.getUserId(), item.getUrl(), item.getTags());
    }
}
