package com.eu.practise;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface WordRepository extends MongoRepository<WordItem,Integer> {
}
