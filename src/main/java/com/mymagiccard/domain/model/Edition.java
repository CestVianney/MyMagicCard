package com.mymagiccard.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class Edition {

    private String diminutif;
    private String name;
    private String setType;
    private LocalDate releaseDate;
    private List<CarteParam> carteParams;

}
