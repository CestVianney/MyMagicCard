package com.swagger.swaggerApi.adapters.db.daoAdapter;

import com.swagger.swaggerApi.adapters.db.entity.CarteParamEntity;
import com.swagger.swaggerApi.domain.ports.db.CartesDbPort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartesParamDbDaoAdapter extends CartesDbPort, JpaRepository<CarteParamEntity, Integer> {

    @Query(value = "SELECT * FROM cartes_param LIMIT 100", nativeQuery = true)
    List<CarteParamEntity> findFirst100();

    List<CarteParamEntity> findByNameContaining(@Param(value="name") String name);

}
