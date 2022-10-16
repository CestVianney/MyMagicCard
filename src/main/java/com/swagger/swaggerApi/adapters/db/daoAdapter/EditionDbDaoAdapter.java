package com.swagger.swaggerApi.adapters.db.daoAdapter;

import com.swagger.swaggerApi.adapters.db.entity.EditionEntity;
import com.swagger.swaggerApi.domain.ports.db.EditionsDbPort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditionDbDaoAdapter extends JpaRepository<EditionEntity, String>, EditionsDbPort {
}
