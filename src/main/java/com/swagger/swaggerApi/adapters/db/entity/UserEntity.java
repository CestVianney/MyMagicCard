package com.swagger.swaggerApi.adapters.db.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @Column(name = "user_name")
    private String name;

    @Column(name = "user_password")
    private String password;

    @OneToMany(mappedBy = "user")
    private List<DeckEntity> decks;

}
