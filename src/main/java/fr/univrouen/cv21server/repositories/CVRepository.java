package fr.univrouen.cv21server.repositories;

//import fr.univrouen.cv21server.model.CVCollection;
import fr.univrouen.cv21server.model.CV;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CVRepository extends MongoRepository<CV, Long> {
    List<CV> findAll();
}