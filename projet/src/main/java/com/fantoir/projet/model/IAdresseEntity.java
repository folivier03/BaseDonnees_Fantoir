package com.fantoir.projet.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IAdresseEntity extends CrudRepository<Adresse, Long> {

    List<Adresse> selectAllAdresse();

}