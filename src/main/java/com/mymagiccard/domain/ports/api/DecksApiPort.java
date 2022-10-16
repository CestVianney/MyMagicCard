package com.mymagiccard.domain.ports.api;

import com.mymagiccard.adapters.api.response.deck.DeckCartesResponse;

public interface DecksApiPort {

    void postNewDeck(String name, String user);

    void postCartesToDeck(Integer deckId, Integer idCartes);

    DeckCartesResponse getDeckCards(Integer deckId);

}
