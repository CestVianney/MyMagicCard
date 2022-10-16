package com.mymagiccard.adapters.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "editions")
public class EditionEntity {

    @Id
    @Column(name = "edi_diminutif")
    private String diminutif;

    @Column(name = "edi_name")
    private String name;

    @Column(name = "edi_type")
    private String setType;

    @Column(name = "edi_date")
    private Date releaseDate;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "editions")
    private List<CarteParamEntity> cartes;
}
