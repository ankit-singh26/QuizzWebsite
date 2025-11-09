package com.ankitsingh.examportal.repository;

import com.ankitsingh.examportal.model.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepository extends MongoRepository<Subject, String> {
}
