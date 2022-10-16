package com.mymagiccard.domain.service;

import com.mymagiccard.adapters.db.entity.*;
import com.mymagiccard.domain.model.CarteParam;
import com.mymagiccard.domain.model.Deck;
import com.mymagiccard.domain.model.Edition;
import com.mymagiccard.domain.model.User;

import java.util.List;

public interface CartesAppService {
    /*
     * CREATE
     */
    CarteParamEntity postCartesToDb(CarteParam carteParam);

    EditionEntity postEditionToDb(Edition edition);

    void postNamesToDb();

    UserEntity postUserToDb(User user);

    DeckEntity postDeckToDb(Deck deck);

    CarteEntity postCarteToDeckDb(Integer deckId, Integer carte);


    /*
     * READ
     */
    List<CarteParam> getCartesBeginningWith(String name);

    User getUserDecks(String username);

    Deck getDeckCartes(Integer deckId);

    boolean getUserAuth(String pseudo, String password);

    List<String> getUserList();



}
