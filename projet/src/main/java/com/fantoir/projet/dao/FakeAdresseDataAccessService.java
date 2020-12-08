package com.fantoir.projet.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.fantoir.projet.model.Adresse;

import org.springframework.stereotype.Repository;

@Repository("fakeDao")
public class FakeAdresseDataAccessService implements AdresseDao {

    private static List<Adresse> DB = new ArrayList<>();

    @Override
    public int addAdresse(UUID id, Adresse adresse) {
        DB.add(new Adresse(id, adresse.getName()));
        return 1;
    }
    
}
