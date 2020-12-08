package com.fantoir.projet.service;

import com.fantoir.projet.model.Adresse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.fantoir.projet.dao.AdresseDao;

@Service
public class AdresseService {
    
    private final AdresseDao adresseDao;

    @Autowired
    public AdresseService(@Qualifier("fakeDao") AdresseDao adresseDao) {
        this.adresseDao = adresseDao;
    }

    public int addAdresse(Adresse adresse) {
        return adresseDao.addAdresse(adresse);
    }

}
