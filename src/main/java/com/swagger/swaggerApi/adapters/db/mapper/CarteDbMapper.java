package com.swagger.swaggerApi.adapters.db.mapper;

import com.swagger.swaggerApi.adapters.db.entity.CarteEntity;
import com.swagger.swaggerApi.domain.model.Carte;
import org.mapstruct.Mapper;

@Mapper
public interface CarteDbMapper {

    Carte mapToModel(CarteEntity entity);
    CarteEntity mapToEntity(Carte model);

}
