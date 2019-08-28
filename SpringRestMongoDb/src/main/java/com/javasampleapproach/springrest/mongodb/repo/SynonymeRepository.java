package com.javasampleapproach.springrest.mongodb.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javasampleapproach.springrest.mongodb.model.synonyme;;

public interface SynonymeRepository extends MongoRepository<synonyme, String>{
	List<synonyme> findByCode(String code);
}
