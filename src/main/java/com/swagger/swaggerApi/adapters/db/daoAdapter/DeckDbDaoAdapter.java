package com.swagger.swaggerApi.adapters.db.daoAdapter;

import com.swagger.swaggerApi.adapters.db.entity.DeckEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckDbDaoAdapter extends JpaRepository<DeckEntity, Integer> {
}
