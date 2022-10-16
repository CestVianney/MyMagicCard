package com.swagger.swaggerApi.domain.service.impl;

import com.swagger.swaggerApi.adapters.db.daoAdapter.*;
import com.swagger.swaggerApi.adapters.db.entity.*;
import com.swagger.swaggerApi.adapters.db.mapper.*;
import com.swagger.swaggerApi.domain.enumeration.ErrorEnum;
import com.swagger.swaggerApi.domain.exceptions.NotFoundException;
import com.swagger.swaggerApi.domain.model.CarteParam;
import com.swagger.swaggerApi.domain.model.Deck;
import com.swagger.swaggerApi.domain.model.Edition;
import com.swagger.swaggerApi.domain.model.User;
import com.swagger.swaggerApi.domain.service.CartesAppService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CartesAppServiceImpl implements CartesAppService {

    private CarteParamDbMapper carteParamDbMapper;

    private UserDbMapper userDbMapper;

    private EditionDbMapper editionDbMapper;

    private DeckDbMapper deckDbMapper;

    private CartesParamDbDaoAdapter cartesParamDbDaoAdapter;

    private CarteDbDaoAdapter carteDbDaoAdapter;

    private UserDbDaoAdapter userDbDaoAdapter;

    private EditionDbDaoAdapter editionDbDaoAdapter;

    private DeckDbDaoAdapter deckDbDaoAdapter;

    @Override
    public CarteParamEntity postCartesToDb(CarteParam carteParam) {
        return this.cartesParamDbDaoAdapter.save(carteParamDbMapper.mapToEntity(carteParam));
    }

    @Override
    public EditionEntity postEditionToDb(Edition edition) {
        return this.editionDbDaoAdapter.save(editionDbMapper.mapToEntity(edition));
    }

    @Override
    public UserEntity postUserToDb(User user){
        return this.userDbDaoAdapter.save(userDbMapper.mapToEntity(user));
    }

    @Override
    public DeckEntity postDeckToDb(Deck deck) {
        return this.deckDbDaoAdapter.save(this.deckDbMapper.mapToEntity(deck));
    }

    @Override
    public CarteEntity postCarteToDeckDb(Integer deckId, Integer idCarte) {
        Optional<DeckEntity> optDeckDb = deckDbDaoAdapter.findById(deckId);
        if(optDeckDb.isPresent()) {
            DeckEntity deckDb = optDeckDb.get();
            CarteParamEntity carteDb = getCarteById(idCarte);
            if(carteDb != null) {
                CarteEntity carteEntity = new CarteEntity();
                carteEntity.setName(carteDb.getName());
                carteEntity.setDeck(deckDb);
                return this.carteDbDaoAdapter.save(carteEntity);
            }
        }
        return null;
    }

    @Override
    public List<CarteParam> getCartes() {

        return  carteParamDbMapper.mapsToModel(cartesParamDbDaoAdapter.findFirst100());
    }

    @Override
    public List<CarteParam> getCartesBeginningWith(String name) {
        return  carteParamDbMapper.mapsToModel(cartesParamDbDaoAdapter.findByNameContaining(name));
    }

    @Override
    public User getUserDecks(String username) {
        UserEntity userFound = this.userDbDaoAdapter.findByName(username);
        if(null == userFound) {
            throw new NotFoundException(ErrorEnum.USER_NOT_FOUND, username);
        } else {
            return userDbMapper.mapToModel(userFound);
        }

    }

    @Override
    public Deck getDeckCartes(Integer deckId) {
        Optional<DeckEntity> optDeck = deckDbDaoAdapter.findById(deckId);
        return optDeck.map(deckEntity -> deckDbMapper.mapToModel(deckEntity)).orElse(null);
    }

    @Override
    public boolean getUserAuth(String pseudo, String password) {
        UserEntity userFound = this.userDbDaoAdapter.findByNameAndPassword(pseudo, password);
        if(null == userFound) {
            throw new NotFoundException(ErrorEnum.USER_NOT_FOUND, pseudo);
        } else {
            return true;
        }
    }

    @Override
    public List<String> getUserList() {
        return userDbDaoAdapter.findAll().stream().map(UserEntity::getName).collect(Collectors.toList());
    }


    private CarteParamEntity getCarteById(Integer id) {
        Optional<CarteParamEntity> optCarteParam = cartesParamDbDaoAdapter.findById(id);
        return optCarteParam.orElse(null);
    }


}
