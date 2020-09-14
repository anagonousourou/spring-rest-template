package com.neurone.axon.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.neurone.axon.models.Client;

@RepositoryRestResource(path = "people")
public interface PersonRepository extends MongoRepository<Client,String> {

    
}
