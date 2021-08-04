package com.example.repo;

import com.example.repo.model.Simulate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimulateRepository extends MongoRepository<Simulate, Long> {


}
