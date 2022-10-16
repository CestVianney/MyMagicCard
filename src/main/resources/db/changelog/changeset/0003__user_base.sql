--liquibase formatted sql
--changeset projet:3
--comment Creation de la table users
CREATE TABLE users (
    user_name VARCHAR(20) PRIMARY KEY,
    user_password VARCHAR(20) NOT NULL
);