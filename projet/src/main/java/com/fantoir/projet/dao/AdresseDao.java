package com.fantoir.projet.dao;

import com.fantoir.projet.model.Adresse;

import java.util.UUID;

public interface AdresseDao {

    int addAdresse(UUID id, Adresse adresse);

    default int addAdresse(Adresse adresse) {
        UUID id = UUID.randomUUID();
        return addAdresse(id, adresse);
    }
}