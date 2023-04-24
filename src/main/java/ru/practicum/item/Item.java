package ru.practicum.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "items", schema = "public")
@Getter
@Setter
class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "owner")
    private Long userId;

    @Column(nullable=false, unique=true)
    private String url;
}