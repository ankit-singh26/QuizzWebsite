package com.ankitsingh.examportal.repository;

import com.ankitsingh.examportal.model.Quiz;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuizRepository extends MongoRepository<Quiz, String> {
}
