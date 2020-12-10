package com.fantoir.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Mohamed 
 */

@Entity
public class Adresse {
    @Id
    private String idVoie;
    private int numVoie;
    private String repVoie;
    private String nomVoie;
    private int codPostal;
    private String nomCommune;
    private float x;
    private float y;

    public Adresse(){}

    public Adresse(String idVoie, int numVoie, String repVoie, String nomVoie, String nomCommune, int codPostal, float x, float y) {
        this.idVoie = idVoie;
        this.numVoie = numVoie;
        this.repVoie = repVoie;
        this.nomVoie = nomVoie; 
        this.nomCommune = nomCommune;
        this.codPostal = codPostal;
        this.x = x;
        this.y = y;

    } 
    public String getIdVoie(){
        return idVoie;
    }
    public void setIdVoie(String idVoie){
        this.idVoie = idVoie;
    }
    public int getNumVoie(){
        return numVoie;
    }
    public String getRepVoie(){
        return repVoie;
    }
    public String getNomVoie(){
        return nomVoie;
    }
    public String getNomCommune(){
        return nomCommune;
    }
    public int getCodPostal(){
        return codPostal;
    }
    
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }


}
