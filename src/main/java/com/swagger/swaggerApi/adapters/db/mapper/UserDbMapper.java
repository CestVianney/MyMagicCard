package com.swagger.swaggerApi.adapters.db.mapper;

import com.swagger.swaggerApi.adapters.db.entity.DeckEntity;
import com.swagger.swaggerApi.adapters.db.entity.UserEntity;
import com.swagger.swaggerApi.domain.model.Deck;
import com.swagger.swaggerApi.domain.model.User;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface UserDbMapper {

    @Mapping(target = "user", ignore = true)
    Deck mapToModel(DeckEntity entity);

    @Mapping(target = "decks", ignore = true)
    User mapToModel(UserEntity entity);

    UserEntity mapToEntity(User model);

    @AfterMapping
    default void mapDecks(@MappingTarget User model, UserEntity entity){
        List<Deck> deckList = entity.getDecks().stream().map(this::mapToModel).collect(Collectors.toList());
        model.setDecks(deckList);
    }

}
