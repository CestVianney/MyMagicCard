package com.mymagiccard.domain.model;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User {
    private String name;
    private String password;
    private List<Deck> decks;
}
