package ru.practicum.item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor @AllArgsConstructor
public class ItemDTO {
    private Long id;

    private Long userId;

    private String url;

    private Set<String> tags = new HashSet<>();
}
