package com.mymagiccard.adapters.db.daoAdapter;

import com.mymagiccard.adapters.db.entity.UserEntity;
import com.mymagiccard.domain.ports.db.UserDbPort;
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
