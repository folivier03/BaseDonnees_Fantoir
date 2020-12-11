package com.fantoir.model;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AdressRepository extends CrudRepository<Adresse, String> {
	
    @Query(value = "select * from Adresse where id_voie = :idVoie LIMIT 10", nativeQuery = true)
    Adresse findByIdVoie(@Param("idVoie") String idVoie);

    @Query(value = "select * from Adresse where num_voie = :numVoie  LIMIT 10", nativeQuery = true)
    List<Adresse> findByNumVoie(@Param("numVoie") int numVoie);

    @Query(value = "select * from Adresse where num_voie = :numVoie and nom_voie = :nomVoie  LIMIT 10", nativeQuery = true)
    List<Adresse> findAdressByVoie(@Param("numVoie") int numVoie, @Param("nomVoie") String nomVoie);

    @Query(value = "select * from Adresse where num_voie = :numVoie and nom_voie = :nomVoie and nom_commune = :nomCommune  LIMIT 10", nativeQuery = true)
    List<Adresse> findAdressByComm(@Param("numVoie") int numVoie, @Param("nomVoie") String nomVoie, @Param("nomCommune") String nomCommune);

    @Query(value = "select * from Adresse where num_voie = :numVoie and nom_voie = :nomVoie and nom_commune = :nomCommune and cod_postal = :codPostal  LIMIT 10", nativeQuery = true)
    List<Adresse> findAdressByCod(@Param("numVoie") int numVoie, @Param("nomVoie") String nomVoie, @Param("nomCommune") String nomCommune, @Param("codPostal") int codPostal);

}
