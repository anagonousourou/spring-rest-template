package com.neurone.axon.repositories;

import com.neurone.axon.models.Article;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository  extends MongoRepository<Article,String>{
    
}
