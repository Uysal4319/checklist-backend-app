package com.eutest.eutest;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CheckListRepository extends MongoRepository<CheckItem,Integer> {

}
