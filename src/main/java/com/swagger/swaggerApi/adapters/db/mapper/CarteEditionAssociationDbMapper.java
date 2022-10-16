package com.swagger.swaggerApi.adapters.db.mapper;

import com.swagger.swaggerApi.adapters.db.entity.CarteEditionAssociationEntity;
import com.swagger.swaggerApi.domain.model.CarteEditionAssociation;
import org.mapstruct.Mapper;

@Mapper
public interface CarteEditionAssociationDbMapper {

    CarteEditionAssociationEntity mapToEntity(CarteEditionAssociation model);

}
