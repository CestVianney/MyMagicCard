--liquibase formatted sql
--changeset projet:4
--comment Creation de la table decks & cartes associées aux decks
CREATE TABLE decks (
    deck_id SERIAL PRIMARY KEY,
    deck_name VARCHAR(20),
    deck_user VARCHAR(20) REFERENCES users(user_name) NOT NULL
);

CREATE TABLE cartes (
    card_id SERIAL PRIMARY KEY,
    card_name VARCHAR(1000),
    card_deck SERIAL REFERENCES decks(deck_id) NOT NULL
);
