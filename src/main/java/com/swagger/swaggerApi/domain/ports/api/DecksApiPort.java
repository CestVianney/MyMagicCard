package com.swagger.swaggerApi.domain.ports.api;

import com.swagger.swaggerApi.adapters.api.response.deck.DeckCartesResponse;

public interface DecksApiPort {

    void postNewDeck(String name, String user);

    void postCartesToDeck(Integer deckId, Integer idCartes);

    DeckCartesResponse getDeckCards(Integer deckId);

}
