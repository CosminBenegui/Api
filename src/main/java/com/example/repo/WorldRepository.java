package com.example.repo;

import com.example.repo.model.World;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WorldRepository extends MongoRepository<World, Long> {

}

