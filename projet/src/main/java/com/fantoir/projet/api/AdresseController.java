package com.fantoir.projet.api;

import java.util.List;

import com.fantoir.projet.model.Adresse;
import com.fantoir.projet.service.AdresseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/adresse")
@RestController
public class AdresseController {
    
    private final AdresseService adresseService;

    @Autowired
    public AdresseController(AdresseService adresseService) {
        this.adresseService = adresseService;
    }

    // @PostMapping
    // public void addAdresse(@RequestBody Adresse adresse) {
    //     adresseService.addAdresse(adresse);
    // }

    @GetMapping
    public List<Adresse> getAllPeople() {
        return adresseService.getAllAdresse();
    }
}
