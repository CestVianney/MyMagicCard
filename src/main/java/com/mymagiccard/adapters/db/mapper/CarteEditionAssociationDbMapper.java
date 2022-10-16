package com.mymagiccard.adapters.db.mapper;

import com.mymagiccard.adapters.db.entity.CarteEditionAssociationEntity;
import com.mymagiccard.domain.model.CarteEditionAssociation;
import org.mapstruct.Mapper;

@Mapper
public interface CarteEditionAssociationDbMapper {

    CarteEditionAssociationEntity mapToEntity(CarteEditionAssociation model);

}
