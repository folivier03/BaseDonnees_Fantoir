package com.fantoir.projet.service;

import com.fantoir.projet.model.Adresse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fantoir.projet.dao.IAdresseDao;

@Service
public class AdresseService {
    
    private final IAdresseDao adresseDao;

    @Autowired
    public AdresseService(@Qualifier("fakeDao") IAdresseDao adresseDao) {
        this.adresseDao = adresseDao;
    }

    public List<Adresse> getAllAdresse() {
        return adresseDao.selectAllAdresse();
    }

}
