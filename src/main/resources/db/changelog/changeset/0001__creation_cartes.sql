--liquibase formatted sql
--changeset projet:1
--comment Creation des tables cartes param, editions, cartesEditions
CREATE TABLE cartes_param (
    cpam_id SERIAL PRIMARY KEY,
    cpam_name VARCHAR(1000),
    cpam_text VARCHAR(1000),
    cpam_cmc int,
    cpam_coloridentity VARCHAR(10),
    cpam_type VARCHAR(1000),
    cpam_maintype VARCHAR(1000),
    cpam_pt VARCHAR(9),
    cpam_layout VARCHAR(1000),
    cpam_rarity VARCHAR(8),
    cpam_manacost VARCHAR(100),
    cpam_num int
);

CREATE TABLE editions (
    edi_diminutif VARCHAR(20) PRIMARY KEY,
    edi_name VARCHAR(5000) NOT NULL,
    edi_type VARCHAR(100) NOT NULL,
    edi_date DATE
);

CREATE TABLE carteseditionsrelation(
    cerelat_id SERIAL PRIMARY KEY,
    fk_cerelat_card INTEGER REFERENCES cartes_param(cpam_id) NOT NULL,
    fk_cerelat_edi VARCHAR(20) REFERENCES editions(edi_diminutif) NOT NULL
);

CREATE TABLE listecartesnoms(
    id SERIAL PRIMARY KEY,
    name VARCHAR(5000)
);
