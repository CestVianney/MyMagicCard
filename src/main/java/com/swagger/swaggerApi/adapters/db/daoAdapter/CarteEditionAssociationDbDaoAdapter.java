package com.swagger.swaggerApi.adapters.db.daoAdapter;

import com.swagger.swaggerApi.adapters.db.entity.CarteEditionAssociationEntity;
import com.swagger.swaggerApi.domain.ports.db.CarteEditionAssociationDbPort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarteEditionAssociationDbDaoAdapter extends JpaRepository<CarteEditionAssociationEntity, Integer>, CarteEditionAssociationDbPort {
}
