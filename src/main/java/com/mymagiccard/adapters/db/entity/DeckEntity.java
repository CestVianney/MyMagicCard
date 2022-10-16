package com.mymagiccard.adapters.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "decks")
public class DeckEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deck_id")
    private Integer id;

    @Column(name = "deck_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "deck_user")
    private UserEntity user;

    @OneToMany(mappedBy = "deck")
    private List<CarteEntity> carteList;

}
