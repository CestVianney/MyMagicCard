package com.swagger.swaggerApi.adapters.db.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "carteseditionsrelation")
public class CarteEditionAssociationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cerelat_id")
    private Integer id;

    @Column(name = "fk_cerelat_edi")
    private String edition;

    @Column(name = "fk_cerelat_card")
    private Integer idCarte;
}