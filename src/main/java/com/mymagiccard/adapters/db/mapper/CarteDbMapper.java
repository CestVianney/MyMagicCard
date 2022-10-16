package com.mymagiccard.adapters.db.mapper;

import com.mymagiccard.domain.model.Carte;
import com.mymagiccard.adapters.db.entity.CarteEntity;
import org.mapstruct.Mapper;

@Mapper
public interface CarteDbMapper {

    Carte mapToModel(CarteEntity entity);
    CarteEntity mapToEntity(Carte model);

}
