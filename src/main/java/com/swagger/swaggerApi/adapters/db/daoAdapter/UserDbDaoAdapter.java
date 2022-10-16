package com.swagger.swaggerApi.adapters.db.daoAdapter;

import com.swagger.swaggerApi.adapters.db.entity.UserEntity;
import com.swagger.swaggerApi.domain.ports.db.UserDbPort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDbDaoAdapter extends UserDbPort, JpaRepository<UserEntity, Integer> {

    @Query
    UserEntity findByNameAndPassword(String name, String password);

    @Query
    UserEntity findByName(String name);

}
