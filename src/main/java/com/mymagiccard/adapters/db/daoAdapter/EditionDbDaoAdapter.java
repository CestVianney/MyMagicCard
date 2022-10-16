package com.mymagiccard.adapters.db.daoAdapter;

import com.mymagiccard.adapters.db.entity.EditionEntity;
import com.mymagiccard.domain.ports.db.EditionsDbPort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditionDbDaoAdapter extends JpaRepository<EditionEntity, String>, EditionsDbPort {
}
