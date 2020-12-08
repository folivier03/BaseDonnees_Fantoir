package com.fantoir.projet.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Adresse {

    private final UUID id;
    private final String name;

    public Adresse(@JsonProperty("id") UUID id,
                   @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}