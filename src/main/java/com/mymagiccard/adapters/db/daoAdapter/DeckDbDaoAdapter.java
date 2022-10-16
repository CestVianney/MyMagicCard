package com.mymagiccard.adapters.db.daoAdapter;

import com.mymagiccard.adapters.db.entity.DeckEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckDbDaoAdapter extends JpaRepository<DeckEntity, Integer> {
}
