package com.mymagiccard.adapters.db.mapper;

import com.mymagiccard.adapters.db.entity.DeckEntity;
import com.mymagiccard.domain.model.Deck;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DeckDbMapper {

    DeckEntity mapToEntity(Deck model);

    @Mapping(target = "user", ignore = true)
    Deck mapToModel(DeckEntity entity);

}
