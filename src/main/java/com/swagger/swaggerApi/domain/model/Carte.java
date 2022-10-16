package com.swagger.swaggerApi.domain.model;

import lombok.Data;

@Data
public class Carte {

    private Integer id;
    private String name;
    private Deck deck;

}
