package com.swagger.swaggerApi.adapters.db.mapper;

import com.swagger.swaggerApi.adapters.db.entity.CarteParamEntity;
import com.swagger.swaggerApi.adapters.db.entity.EditionEntity;
import com.swagger.swaggerApi.domain.model.CarteParam;
import com.swagger.swaggerApi.domain.model.Edition;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface CarteParamDbMapper {

    @Mapping(target = "carteParams", ignore = true)
    Edition mapToModel(EditionEntity entity);

    @Mapping(target = "editions", ignore = true)
    CarteParam mapToModel(CarteParamEntity entity);

    CarteParamEntity mapToEntity(CarteParam model);

    List<CarteParamEntity> mapsToEntity(List<CarteParam> models);

    List<CarteParam> mapsToModel(List<CarteParamEntity> entities);

    @AfterMapping
    default void mapEditions(@MappingTarget CarteParam model, CarteParamEntity entity){
        List<Edition> editionList =  entity.getEditions().stream().map(this::mapToModel).collect(Collectors.toList());
        model.setEditions(editionList);
    }

}
