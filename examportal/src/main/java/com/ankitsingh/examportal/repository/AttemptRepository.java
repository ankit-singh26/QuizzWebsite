package com.ankitsingh.examportal.repository;

import com.ankitsingh.examportal.model.Attempt;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface AttemptRepository extends MongoRepository<Attempt, String> {
    List<Attempt> findByUserId(String userId);
}
