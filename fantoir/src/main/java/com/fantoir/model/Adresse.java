package com.fantoir.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

/**
 * Created by Mohamed 
 * Modified by NicolasM
 */

@Entity
public class Adresse {
    @Id @Column(name="id_voie") @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idVoie;
    @Column(name="num_voie")
    private int numVoie;
    @Column(name="rep_voie")
    private String repVoie;
    @Column(name="nom_voie")
    private String nomVoie;
    @Column(name="cod_postal")
    private String codPostal;
    @Column(name="nom_commune")
    private String nomCommune;
    @Column(name="x")
    private float x;
    @Column(name="y")
    private float y;

    public Adresse(){}

    public Adresse(int idVoie, int numVoie, String repVoie, String nomVoie, String nomCommune, String codPostal, float x, float y) {
        this.idVoie = idVoie;
        this.numVoie = numVoie;
        this.repVoie = repVoie;
        this.nomVoie = nomVoie; 
        this.nomCommune = nomCommune;
        this.codPostal = codPostal;
        this.x = x;
        this.y = y;

    } 
    public int getIdVoie(){
        return idVoie;
    }
    public void setIdVoie(int idVoie){
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
    public String getCodPostal(){
        return codPostal;
    }
    
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }


}
