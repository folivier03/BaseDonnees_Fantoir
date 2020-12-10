package com.fantoir.fantoir.model;

import org.springframework.beans.factory.annotation.Autowired;

// import java.io.File;
// import java.io.IOException;

// import com.fasterxml.jackson.core.JsonGenerationException;
// import com.fasterxml.jackson.databind.JsonMappingException;
// import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
// import com.fantoir.fantoir.model.Adresse;
// import java.util.Dictionary;

@RestController
@RequestMapping(value = "/api/v1/adresse", produces = MediaType.APPLICATION_JSON_VALUE)
public class AdressController {
    
    @Autowired
    private AdressService adressService;

    

    @GetMapping(value = { "", "/" })
    public List<Adresse> getAllAdress() {
        return adressService.findAll();

    }
    
    @GetMapping(value = "/{id}")
    public Adresse getByIdVoieQuery(@PathVariable String id) {

        return adressService.getByIdQuery(id);
    }

    @GetMapping(value = "numero/{numv}")
    public List<Adresse> getByNumVoie(@PathVariable int numv) {

        return adressService.getByNumQuery(numv);
    }
    @GetMapping(value = "voie/{numv}/{nomv}")
    public List<Adresse> getByVoie(@PathVariable int numv, @PathVariable String nomv) {

        return adressService.getByVoieQuery(numv, nomv);

    }

    @GetMapping(value = "commune/{numv}/{nomv}/{nomc}")
    public List<Adresse> getByComm(@PathVariable int numv, @PathVariable String nomv, @PathVariable String nomc) {

        return adressService.getByCommQuery(numv, nomv, nomc);

    }

    @GetMapping(value = "cp/{numv}/{nomv}/{nomc}/{codp}")
    public List<Adresse> getByCod(@PathVariable int numv, @PathVariable String nomv, @PathVariable String nomc, @PathVariable int codp) {

        return adressService.getByCodQuery(numv, nomv, nomc, codp);

    }
    @PostMapping(value = { "", "/" })
    public Adresse createNewAdress(@RequestBody Adresse adress) {
        return adressService.insertAdress(adress);

    }

    // @DeleteMapping(value = "/{id}")
    // public void deleteAdr(@PathVariable String id){
    // adressService.deleteAdress(id);
    // }

}
