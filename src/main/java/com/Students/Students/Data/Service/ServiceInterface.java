package com.Students.Students.Data.Service;

import com.Students.Students.Data.Model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ServiceInterface extends MongoRepository<StudentModel, String> {
}
