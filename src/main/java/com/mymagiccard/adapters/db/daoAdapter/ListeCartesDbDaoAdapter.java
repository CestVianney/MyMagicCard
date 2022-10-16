package com.mymagiccard.adapters.db.daoAdapter;


import com.mymagiccard.adapters.db.entity.ListeCartesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListeCartesDbDaoAdapter extends JpaRepository<ListeCartesEntity, String> {
}
