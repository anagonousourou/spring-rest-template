package my.scribe.template.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import my.scribe.template.models.Person;

@RepositoryRestResource(path = "people")
public interface PersonRepository extends MongoRepository<Person,String> {

    
}
