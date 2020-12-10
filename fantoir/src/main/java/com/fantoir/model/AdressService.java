package com.fantoir.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdressService {

    @Autowired
    private AdressRepository adressRepository;

    
    public List<Adresse> getByVoieQuery(int numVoie, String nomVoei){
        return adressRepository.findAdressByVoie(numVoie,nomVoei);
    }

    public List<Adresse> getByCommQuery(int numVoie, String nomVoei, String nomCommune){
        return adressRepository.findAdressByComm(numVoie,nomVoei, nomCommune);
    }

    public List<Adresse> getByCodQuery(int numVoie, String nomVoei, String nomCommune, int codPostal){
        return adressRepository.findAdressByCod(numVoie, nomVoei, nomCommune, codPostal);
    }

    public List<Adresse> getByNumQuery(int numVoie){
        return adressRepository.findByNumVoie(numVoie);
    }
    public Adresse getByIdQuery(String id){
        return adressRepository.findByIdVoie(id);
    }
    public List<Adresse> findAll(){
        return  (List<Adresse>) adressRepository.findAll();
    }

    public Adresse getById(String id){
        return adressRepository.findById(id).get();
    }

    public Adresse insertAdress(Adresse adresse){
        return adressRepository.save(adresse);
    }
    
    public void deleteAdress(String id){
        adressRepository.deleteById(id);
    }

}
