package com.fantoir.projet.dao;

import java.util.List;

import com.fantoir.projet.model.Adresse;

import org.springframework.stereotype.Repository;

@Repository("adresseDao")
public class AdresseDataAccessService implements IAdresseDao {
    
    private static List<Adresse> DB = null;

    @Override
    public List<Adresse> selectAllAdresse() {
        return DB;
    }

}
