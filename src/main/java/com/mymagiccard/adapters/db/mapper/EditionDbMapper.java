package com.mymagiccard.adapters.db.mapper;

import com.mymagiccard.adapters.db.entity.EditionEntity;
import com.mymagiccard.domain.model.Edition;
import org.mapstruct.Mapper;

@Mapper
public interface EditionDbMapper {

    EditionEntity mapToEntity(Edition model);

    Edition mapToModel(EditionEntity entity);

}
