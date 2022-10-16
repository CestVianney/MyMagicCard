package com.mymagiccard.adapters.db.daoAdapter;

import com.mymagiccard.adapters.db.entity.CarteEditionAssociationEntity;
import com.mymagiccard.domain.ports.db.CarteEditionAssociationDbPort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarteEditionAssociationDbDaoAdapter extends JpaRepository<CarteEditionAssociationEntity, Integer>, CarteEditionAssociationDbPort {
}
