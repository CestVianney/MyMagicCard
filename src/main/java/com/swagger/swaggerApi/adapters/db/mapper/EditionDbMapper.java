package com.swagger.swaggerApi.adapters.db.mapper;

import com.swagger.swaggerApi.adapters.db.entity.EditionEntity;
import com.swagger.swaggerApi.domain.model.Edition;
import org.mapstruct.Mapper;

@Mapper
public interface EditionDbMapper {

    EditionEntity mapToEntity(Edition model);

    Edition mapToModel(EditionEntity entity);

}
