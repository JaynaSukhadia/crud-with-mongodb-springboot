package com.mongodb.mongodbcrud.repository;

import com.mongodb.mongodbcrud.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer> {
}
