package com.swagger.swaggerApi.adapters.db.mapper;

import com.swagger.swaggerApi.adapters.db.entity.DeckEntity;
import com.swagger.swaggerApi.domain.model.Deck;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DeckDbMapper {

    DeckEntity mapToEntity(Deck model);

    @Mapping(target = "user", ignore = true)
    Deck mapToModel(DeckEntity entity);

}
