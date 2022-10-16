package com.mymagiccard.adapters.api.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EditionResponse {

    private String diminutif;
    private String name;
    private String setType;
    private LocalDate releaseDate;

}
