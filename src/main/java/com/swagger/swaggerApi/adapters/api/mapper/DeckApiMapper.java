package com.swagger.swaggerApi.adapters.api.mapper;

import com.swagger.swaggerApi.adapters.api.response.deck.DeckCartesResponse;
import com.swagger.swaggerApi.adapters.api.response.deck.DeckResponse;
import com.swagger.swaggerApi.domain.model.Deck;
import org.mapstruct.Mapper;

@Mapper
public interface DeckApiMapper {

    DeckResponse mapToResponse(Deck model);

    DeckCartesResponse mapDeckCartesToResponse(Deck model);

}
