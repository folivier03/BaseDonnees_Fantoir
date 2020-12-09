package com.fantoir.projet.dao;

import com.fantoir.projet.model.Adresse;

import java.util.List;

public interface IAdresseDao {
    List<Adresse> selectAllAdresse();
}