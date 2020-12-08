package com.fantoir.projet.api;

import com.fantoir.projet.model.Adresse;
import com.fantoir.projet.service.AdresseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdresseController {
    
    private final AdresseService adresseService;

    @Autowired
    public AdresseController(AdresseService adresseService) {
        this.adresseService = adresseService;
    }

    @PostMapping
    public void addAdresse(Adresse adresse) {
        adresseService.addAdresse(adresse);
    }
}
