package com.example.longestcommonsubstring.repository;

import com.example.longestcommonsubstring.model.Substring;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LcsRepository extends MongoRepository<Substring,String>{

}