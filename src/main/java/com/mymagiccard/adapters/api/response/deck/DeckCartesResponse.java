package com.mymagiccard.adapters.api.response.deck;

import com.mymagiccard.adapters.api.response.carte.CarteResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DeckCartesResponse {
    private String name;
    private List<CarteResponse> carteList;
}
