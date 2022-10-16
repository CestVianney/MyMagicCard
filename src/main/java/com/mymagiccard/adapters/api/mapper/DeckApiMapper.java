package com.mymagiccard.adapters.api.mapper;

import com.mymagiccard.adapters.api.response.deck.DeckCartesResponse;
import com.mymagiccard.domain.model.Deck;
import com.mymagiccard.adapters.api.response.deck.DeckResponse;
import org.mapstruct.Mapper;

@Mapper
public interface DeckApiMapper {

    DeckResponse mapToResponse(Deck model);

    DeckCartesResponse mapDeckCartesToResponse(Deck model);

}
