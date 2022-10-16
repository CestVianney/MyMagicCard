package com.swagger.swaggerApi.adapters.db.daoAdapter;

import com.swagger.swaggerApi.adapters.db.entity.CarteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarteDbDaoAdapter extends JpaRepository<CarteEntity, Integer> {
}
