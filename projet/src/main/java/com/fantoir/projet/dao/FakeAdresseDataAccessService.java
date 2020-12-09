package com.fantoir.projet.dao;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.fantoir.projet.model.Adresse;

import org.springframework.stereotype.Repository;

@Repository("fakeDao")
public class FakeAdresseDataAccessService implements IAdresseDao {

    private static List<Adresse> DB = Arrays.asList(
        new Adresse(UUID.randomUUID(), "Patrick"),
        new Adresse(UUID.randomUUID(), "Benjamin"),
        new Adresse(UUID.randomUUID(), "Hector"),
        new Adresse(UUID.randomUUID(), "Romain")
    );

    @Override
    public List<Adresse> selectAllAdresse() {
        return DB;
    }

    
    
}
