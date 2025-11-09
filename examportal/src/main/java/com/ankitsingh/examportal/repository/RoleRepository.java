package com.ankitsingh.examportal.repository;
import com.ankitsingh.examportal.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
}