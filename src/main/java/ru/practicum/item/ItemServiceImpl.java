package ru.practicum.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    ItemRepository repository;
    @Override
    public List<ItemDTO> getItems(Long userId) {
        return ItemDTOMapper.mapToItemDto(repository.findByUserId(userId));
    }

    @Override
    public ItemDTO addNewItem(Long userId, ItemDTO itemDTO) {
        itemDTO.setUserId(userId);
        return ItemDTOMapper.toItemDto(repository.save(ItemDTOMapper.toItem(itemDTO)));
    }

    @Override
    public void deleteItem(Long userId, Long itemId) {
        repository.deleteByUserIdAndItemId(userId, itemId);
    }
}
