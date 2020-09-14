package com.neurone.axon.repositories;

import com.neurone.axon.models.Panier;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PanierRepository extends MongoRepository<Panier,String>{
    
}
