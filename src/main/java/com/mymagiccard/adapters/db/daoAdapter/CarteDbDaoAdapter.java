package com.mymagiccard.adapters.db.daoAdapter;

import com.mymagiccard.adapters.db.entity.CarteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarteDbDaoAdapter extends JpaRepository<CarteEntity, Integer> {
}
