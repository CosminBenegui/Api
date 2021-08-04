package com.example.repo;



import com.example.repo.model.Tank;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TankRepository extends MongoRepository<Tank,Long> {


}
