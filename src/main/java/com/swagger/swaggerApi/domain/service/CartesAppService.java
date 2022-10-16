package com.swagger.swaggerApi.domain.service;

import com.swagger.swaggerApi.adapters.db.entity.*;
import com.swagger.swaggerApi.domain.model.CarteParam;
import com.swagger.swaggerApi.domain.model.Deck;
import com.swagger.swaggerApi.domain.model.Edition;
import com.swagger.swaggerApi.domain.model.User;

import java.util.List;

public interface CartesAppService {
    /*
     * CREATE
     */
    CarteParamEntity postCartesToDb(CarteParam carteParam);

    EditionEntity postEditionToDb(Edition edition);

    UserEntity postUserToDb(User user);

    DeckEntity postDeckToDb(Deck deck);

    CarteEntity postCarteToDeckDb(Integer deckId, Integer carte);


    /*
     * READ
     */
    List<CarteParam> getCartes();

    List<CarteParam> getCartesBeginningWith(String name);

    User getUserDecks(String username);

    Deck getDeckCartes(Integer deckId);

    boolean getUserAuth(String pseudo, String password);

    List<String> getUserList();



}
