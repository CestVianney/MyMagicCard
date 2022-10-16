package com.mymagiccard.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Deck {

    private Integer id;
    private String name;
    private User user;
    private List<CarteParam> carteList;

}
