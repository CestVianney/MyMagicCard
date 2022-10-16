package com.mymagiccard.adapters.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "cartes_param")
public class CarteParamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cpam_id")
    private Integer id;

    @Column(name = "cpam_name")
    private String name;

    @Column(name = "cpam_text")
    private String text;

    @Column(name = "cpam_cmc")
    private int cmc;

    @Column(name = "cpam_type")
    private String type;

    @Column(name = "cpam_maintype")
    private String maintype;

    @Column(name = "cpam_coloridentity")
    private String coloridentity;

    @Column(name = "cpam_pt")
    private String pt;

    @Column(name = "cpam_layout")
    private String layout;

    @Column(name = "cpam_manacost")
    private String manacost;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "carteseditionsrelation",
            joinColumns = @JoinColumn(name = "fk_cerelat_card"),
            inverseJoinColumns = @JoinColumn(name = "fk_cerelat_edi")
    )
    private List<EditionEntity> editions;

    @Column(name = "cpam_rarity")
    private String rarity;

    @Column(name = "cpam_num")
    private int num;
}
