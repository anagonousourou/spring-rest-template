package com.neurone.axon.repositories;

import com.neurone.axon.models.Client;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client,String>{
    
}
